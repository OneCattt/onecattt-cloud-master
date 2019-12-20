package com.dsl.service.services;

import com.dsl.service.base.GlobalResult;
import com.dsl.service.model.User;

import java.util.List;

/**
 *@ClassName UserService
 *@Description TODO
 *@Author jiangruliang
 *@Date 2019/4/16 17:13
 *@Version 1.0
 */
public interface UserService {
    /**
     * @Author jiangruliang
     * @Description //TODO
     * @Date 17:14 2019/4/16
     * @Param
     * @return
     **/
    GlobalResult<User> getAllUser();
}
