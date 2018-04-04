package com.example.boottest.controller;

import com.example.boottest.entity.Mission;
import com.example.boottest.service.MissionService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/mission")
public class MissionController {
    @Resource
    private MissionService missionService;

    @ApiOperation(value = "根据用户ID查询用户", notes = "数据回显")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public Mission findById(@PathVariable Long id) {
        return missionService.getMission(id);
    }

    @PostMapping
    public Object addMission(@Valid @RequestBody Mission mission) {
        missionService.addMission(mission);
        return "任务新增成功";
    }

    @PatchMapping("/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "任务ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "mission", value = "任务实体", required = true, dataType = "Mission")
    })
    @ApiOperation(value = "修改任务")
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