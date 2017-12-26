package com.example.boottest.controller;

import com.example.boottest.service.GetAllBrand;
import com.example.boottest.util.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class Test {
    @Resource
    private GetAllBrand getAllBrand;

    @RequestMapping("/test")
    public Object getBrands() {
        return getAllBrand.getAll();
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView goHome() {
        System.out.println("index");
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/upFile", method = RequestMethod.POST)
    public void upFile(@RequestParam("myFile") MultipartFile file, HttpServletRequest request) {

        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);
        String filePath = request.getSession().getServletContext().getRealPath("file/");
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
       }
    }
}