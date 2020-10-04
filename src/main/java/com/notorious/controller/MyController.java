package com.notorious.controller;

import com.notorious.entity.Student;
import com.notorious.exception.ServiceException;
import com.notorious.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Rui
 * @date 2020/10/4 15:09
 */
@RestController
@RequestMapping("/MyController")
public class MyController {
    @Autowired
    private MyService myService;

    @PostMapping("/test")
    public void test(@Validated @RequestBody Student student) throws ServiceException {
        myService.method1();
    }
}
