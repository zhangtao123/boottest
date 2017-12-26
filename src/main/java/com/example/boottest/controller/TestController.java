package com.example.boottest.controller;

import com.example.boottest.service.GetAllBrand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

import static com.example.boottest.constant.Constants.UPLOAD_FILE_PATH;

@RestController
public class TestController {
    @Resource
    private GetAllBrand getAllBrand;
    private Logger log= LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test")
    public Object getBrands() {
        return getAllBrand.getAll();
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView goHome() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/upFile", method = RequestMethod.POST)
    public Object upFile(@RequestParam("myFile") MultipartFile uploadFile) {
        String fileName = uploadFile.getOriginalFilename();
        File file = new File(UPLOAD_FILE_PATH, fileName);
        try {
            uploadFile.transferTo(file);
            log.info("成功");
            return "success";
        } catch (IOException e) {
            log.error("上传失败",e);
            return "failed";
        }
    }
}