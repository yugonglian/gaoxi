package com.gaoxi.controller.user;

import com.gaoxi.service.req.user.LoginReq;
import com.gaoxi.service.rsp.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Function: con
 *
 * @author longsun
 * @date 2020/12/11
 */
@RestController
public interface UserController {

    /**
     * 登录
     * @param loginReq 登录请求参数
     * @param httpRsp HTTP响应
     * @return 登录是否成功
     */
    @GetMapping("/login")
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
