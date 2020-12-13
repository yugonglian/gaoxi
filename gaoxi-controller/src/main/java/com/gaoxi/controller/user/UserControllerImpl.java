package com.gaoxi.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoxi.service.entity.user.UserEntity;
import com.gaoxi.service.facade.user.UserService;
import com.gaoxi.service.req.user.LoginReq;
import com.gaoxi.service.rsp.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Function: 用户实现
 *
 * @author longsun
 * @date 2020/12/11
 */
@RestController
public class UserControllerImpl implements UserController{

    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {

        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);


        return Result.newSuccessResult(userEntity);
    }
}
