package com.example.boottest.controller;

import com.example.boottest.entity.Book;
import com.example.boottest.entity.User;
import com.example.boottest.service.BookService;
import com.example.boottest.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

import static com.example.boottest.constant.Constants.UPLOAD_FILE_PATH;

@RestController
public class FirstController {
    @Resource
    private BrandService brandService;
    @Resource
    private BookService bookService;
    private Logger log= LoggerFactory.getLogger(FirstController.class);

    @RequestMapping("/test")
    public Object getBrands() {
        return brandService.getAll();
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
    @RequestMapping("/json")
    public Book testJson(@RequestBody Book book){
        return book;
    }
    @RequestMapping("/addBook")
    public Object addBook(@RequestBody Book book){
        try{
            bookService.addBook(book);
            return "添加成功";
        }catch (Exception e){
            e.printStackTrace();
            log.error(book.toString());
            return "添加失败";
        }
    }

    @RequestMapping("/log")
    public Object log(@RequestBody User user, HttpServletRequest request){
        request.getSession().setAttribute("userName",user.getUserName());
        return "请求成功";
    }
    @RequestMapping("/testSession")
    public Object testSession(HttpServletRequest request){
        return request.getSession().getAttribute("userName");
    }
}