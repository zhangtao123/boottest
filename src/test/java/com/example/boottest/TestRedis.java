package com.example.boottest;

import com.example.boottest.dao.DealerDao;
import com.example.boottest.dao.MissionDao;
import com.example.boottest.entity.Dealer;
import com.example.boottest.entity.Mission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

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
    private DealerDao dealerDao;
    @Resource
    private MissionDao missionDao;
    private static final String STRING_KEY = "testString";
    private static final String SET_KEY = "testSet";
    private static final String LIST_KEY = "testList";

    @Test
    public void testString() {
        valueOperations.set(STRING_KEY, "zhangsan");
        String s = valueOperations.get(STRING_KEY);
        System.out.println("新增:" + s);
        valueOperations.set(STRING_KEY, "lisi");
        s = valueOperations.get(STRING_KEY);
        System.out.println("修改:" + s);
        redisTemplate.delete(STRING_KEY);
        System.out.println(redisTemplate.hasKey(STRING_KEY));
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
    }

    @Test
    public void testList() {
        List<Mission> missionList = missionDao.selectAllMissions();
        listOperations.rightPushAll(LIST_KEY, missionList);
        for (int i = 0; i < missionList.size(); i++) {
            System.out.println(missionList.get(i).getId().equals(listOperations.index(LIST_KEY, i).getId()));
        }
    }
}