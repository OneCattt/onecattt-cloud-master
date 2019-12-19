package com.dsl.service.mappers;

import com.dsl.service.model.User;

import java.util.List;

/**
 *@ClassName UserService
 *@Description TODO
 *@Author jiangruliang
 *@Date 2019/4/16 17:11
 *@Version 1.0
 */
public interface UserMapper {

    List<User> getAll();
}
