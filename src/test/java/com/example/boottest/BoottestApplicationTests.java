package com.example.boottest;

import com.example.boottest.dao.*;
import com.example.boottest.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoottestApplicationTests {
    @Resource
    private MissionMapper missionMapper;
    @Resource
    private MissionSchedualMapper missionSchedualMapper;
    @Resource
    private TemplateMapper templateMapper;
    @Resource
    private TemplateContentMapper templateContentMapper;
    @Resource
    private TemplateContentDetailMapper templateContentDetailMapper;

    @Test
    public void testTemplate() {
        MissionSchedual missionSchedual = missionSchedualMapper.selectByPrimaryKey(1L);
        Mission mission = missionMapper.selectByPrimaryKey(missionSchedual.getMissionId());
        Template template = templateMapper.selectByPrimaryKey(mission.getTemplateId());
        Long templateId = template.getId();
        TemplateContentExample templateContentExample = new TemplateContentExample();
        templateContentExample.createCriteria().andTemplateIdEqualTo(templateId);
        List<TemplateContent> templateContentList = templateContentMapper.selectByExample(templateContentExample);
        List<TemplateContentDetail> templateContentDetailList;
        Map<TemplateContent, List<TemplateContentDetail>> map = new HashMap<>();
        for (TemplateContent templateContent : templateContentList) {
            TemplateContentDetailExample templateContentDetailExample = new TemplateContentDetailExample();
            templateContentDetailExample.createCriteria().andTemplateContentIdEqualTo(templateContent.getId());
            templateContentDetailList = templateContentDetailMapper.selectByExample(templateContentDetailExample);
            map.put(templateContent, templateContentDetailList);
        }
        map.forEach((a, b) -> {
            System.out.println(a);
            b.forEach(System.out::println);
            System.out.println("===========================================");
        });
    }
}