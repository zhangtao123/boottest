package com.example.boottest.controller;

import com.example.boottest.entity.Mission;
import com.example.boottest.service.MissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mission")
public class MissionController {
    @Resource
    private MissionService missionService;

    @GetMapping("/{id}")
    public Mission findById(@PathVariable Long id) {
        return missionService.getMission(id);
    }

    @PostMapping
    public Object addMission(@RequestBody Mission mission) {
        missionService.addMission(mission);
        return "任务新增成功";
    }

    @PatchMapping("/{id}")
    public Object updateMission(@RequestBody Mission mission, @PathVariable Long id) {
        missionService.updateMission(mission, id);
        return "任务修改成功";
    }

    @DeleteMapping("/{id}")
    public Object deleteMission(@PathVariable Long id) {
        missionService.deleteMission(id);
        return "任务删除成功";
    }
}