package com.example.boottest;

import com.example.boottest.dao.DealerDao;
import com.example.boottest.dao.MissionDao;
import com.example.boottest.entity.Dealer;
import com.example.boottest.entity.Mission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Resource
    private ValueOperations<String, String> valueOperations;
    @Resource
    private SetOperations<String, Dealer> setOperations;
    @Resource
    private ListOperations<String, Mission> listOperations;
    @Resource
    private HashOperations<String, String, Dealer> hashOperations;
    @Resource
    private ZSetOperations<String, Mission> zSetOperations;
    @Resource
    private DealerDao dealerDao;
    @Resource
    private MissionDao missionDao;

    private static final String STRING_KEY = "testString";
    private static final String SET_KEY = "testSet";
    private static final String LIST_KEY = "testList";
    private static final String HASH_KEY = "testHash";
    private static final String ZSET_KEY = "testZSet";
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRedis.class);

    @Test
    public void testString() {
        valueOperations.set(STRING_KEY, "zhangsan");
        String s = valueOperations.get(STRING_KEY);
        LOGGER.info("新增:" + s);
        valueOperations.set(STRING_KEY, "lisi");
        s = valueOperations.get(STRING_KEY);
        LOGGER.info("修改:" + s);
        redisTemplate.delete(STRING_KEY);
        LOGGER.info(redisTemplate.hasKey(STRING_KEY).toString());
    }

    @Test
    public void testSet() {
        List<Dealer> dealerList = dealerDao.selectAllDealers();
        System.out.println("数据库中数据条数" + dealerList.size());
        dealerList.forEach(dealer -> setOperations.add(SET_KEY, dealer));
        Set<Dealer> members = setOperations.members(SET_KEY);
        System.out.println("redis中数据条数" + members.size());
        members.forEach(System.out::println);
        System.out.println(setOperations.isMember(SET_KEY, dealerList.get(0)));
        setOperations.remove(SET_KEY, dealerList.get(0));
        System.out.println(setOperations.isMember(SET_KEY, dealerList.get(0)));
        redisTemplate.delete(SET_KEY);
    }

    @Test
    public void testList() {
        List<Mission> missionList = missionDao.selectAllMissions();
        listOperations.rightPushAll(LIST_KEY, missionList);
        for (int i = 0; i < missionList.size(); i++) {
            System.out.println(missionList.get(i).getId().equals(listOperations.index(LIST_KEY, i).getId()));
        }
        redisTemplate.delete(LIST_KEY);
    }

    @Test
    public void testMissionList() {
        List<Mission> missionList = missionDao.selectAllMissions();
        List<Mission> missions = listOperations.range(LIST_KEY, 0, missionList.size() - 1);
        System.out.println(missionList.size() == missions.size());
        redisTemplate.expire(LIST_KEY, 10L, TimeUnit.SECONDS);//此处要做期限设置，没有成功
        System.out.println(redisTemplate.getExpire(LIST_KEY));
        redisTemplate.keys("*").forEach(System.out::println);
    }

    @Test
    public void testHash() {
        List<Dealer> dealerList = dealerDao.selectAllDealers();
        dealerList.forEach(dealer -> hashOperations.put(HASH_KEY, dealer.getCode(), dealer));
        Dealer dealer = hashOperations.get(HASH_KEY, dealerList.get(0).getCode());
        System.out.println(dealer);
        hashOperations.delete(HASH_KEY, dealerList.get(0).getCode());
        boolean flag = hashOperations.hasKey(HASH_KEY, dealerList.get(0).getCode());
        System.out.println(flag);
        Map<String, Dealer> dealerMap = hashOperations.entries(HASH_KEY);
        dealerMap.forEach((code, d) -> System.out.println(code + ":" + d.getCode()));
        redisTemplate.delete(HASH_KEY);
    }

    @Test
    public void testZSet() {
        List<Mission> missionList = missionDao.selectAllMissions();
        Assert.notEmpty(missionList, "任务集合不能为空");
        for (Long i = 0L; i < missionList.size(); i++) {
            zSetOperations.add(ZSET_KEY, missionList.get(i.intValue()), i);
        }
        System.out.println(zSetOperations.score(ZSET_KEY, missionList.get(1)));
        redisTemplate.expire(ZSET_KEY, 10L, TimeUnit.SECONDS);
        redisTemplate.delete(HASH_KEY);
    }

    @Test
    public void testDel() {
        List<RedisClientInfo> clientList = redisTemplate.getClientList();
        clientList.forEach(System.out::println);
        Set<String> keys = redisTemplate.keys("*");
        keys.forEach(System.out::println);
        redisTemplate.delete(keys);
    }
}