package com.example.boottest.service.impl;

import com.example.boottest.dao.MissionDao;
import com.example.boottest.entity.Mission;
import com.example.boottest.service.MissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@Service("missionService")
@Transactional
public class MissionServiceImpl implements MissionService {
    @Resource
    private MissionDao missionDao;

    @Override
    @Transactional(readOnly = true)
    public Mission getMission(Long id) {
        Mission mission = missionDao.selectByPrimaryKey(id);
        Assert.notNull(mission, "没有ID为:" + id + " 的任务");
        return mission;
    }

    @Override
    public void addMission(Mission mission) {
        missionDao.insertSelective(mission);
    }

    @Override
    public void updateMission(Mission mission, Long id) {
        Assert.notNull(mission.getId(), "任务ID不能为空！");
        Assert.isTrue(mission.getId().equals(id), "任务ID不匹配！");
        Assert.notNull(missionDao.selectByPrimaryKey(id), "ID为：" + id + " 的任务不存在");
        missionDao.updateByPrimaryKeySelective(mission);
    }

    @Override
    public void deleteMission(Long id) {
        Assert.notNull(missionDao.selectByPrimaryKey(id), "ID为：" + id + " 的任务不存在");
        missionDao.deleteByPrimaryKey(id);
    }
}