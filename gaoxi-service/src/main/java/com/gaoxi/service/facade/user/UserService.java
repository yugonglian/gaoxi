package com.gaoxi.service.facade.user;

import com.gaoxi.service.entity.user.UserEntity;
import com.gaoxi.service.req.user.LoginReq;

/**
 * Function: user service
 *
 * @author longsun
 * @date 2020/12/11
 */
public interface UserService {

    public UserEntity login(LoginReq loginReq);
}
