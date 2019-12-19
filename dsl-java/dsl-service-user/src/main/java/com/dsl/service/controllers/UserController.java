package com.dsl.service.controllers;

import com.dsl.service.base.BaseController;
import com.dsl.service.model.User;
import com.dsl.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author TOPFEEL
 * @Date 2019/4/16 17:16
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public List<User> getAll(){
        return userService.getAllUser();
    }



    @Override
    public void getErrorLog(String errorMsg) {

    }
}
