package com.dsl.service.services.Impl;

import com.dsl.service.base.GlobalResult;
import com.dsl.service.mappers.UserMapper;
import com.dsl.service.model.User;
import com.dsl.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author TOPFEEL
 * @Date 2019/4/16 17:13
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public GlobalResult<User> getAllUser() {
        return GlobalResult.success(userMapper.getAll());
    }
}
