package com.example.boottest.service;

import com.example.boottest.entity.Mission;

public interface MissionService {
    Mission getMission(Long id);

    void addMission(Mission mission);

    void updateMission(Mission mission, Long id);

    void deleteMission(Long id);
}