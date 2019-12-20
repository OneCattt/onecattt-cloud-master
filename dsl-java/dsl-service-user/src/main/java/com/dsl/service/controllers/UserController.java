package com.dsl.service.controllers;

import com.dsl.service.base.GlobalResult;
import com.dsl.service.model.User;
import com.dsl.service.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author onecattt
 * @Date 2019/4/16 17:16
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    private final static Logger LOG = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public GlobalResult getAll() {
        return userService.getAllUser();
    }


}
