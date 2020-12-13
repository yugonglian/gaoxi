package com.gaoxi.service.req.user;

import lombok.Data;

/**
 * Function: 登录请求
 *
 * @author longsun
 * @date 2020/12/11
 */
@Data
public class LoginReq  extends AbsReq{

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String mail;
}
