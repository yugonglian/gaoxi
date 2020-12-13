package com.gaoxi.service.entity.user;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Function: 用户实体
 *
 * @author longsun
 * @date 2020/12/11
 */
@Data
public class UserEntity  implements Serializable {

    /** 主键 */
    private String id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String mail;

    /** 营业执照照片 */
    private String licencePic;

    /** 注册时间 */
    private Timestamp registerTime;
}
