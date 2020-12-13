package com.gaoxi.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.service.entity.user.UserEntity;
import com.gaoxi.service.facade.user.UserService;
import com.gaoxi.service.req.user.LoginReq;



/**
 * Function: 用户操作
 *
 * @author longsun
 * @date 2020/12/11
 */

@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {
        // 具体的实现代码
        return null;
    }
}
