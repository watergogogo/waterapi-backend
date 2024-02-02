package com.aqua.project.constant;

/**
 * 用户常量
 * @author water king
 * @time 2024/1/8
 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "userLoginState";

    /**
     * 系统用户id （虚拟用户）
     */
    long SYSTEM_USER_ID = 0;

    /**
     * 默认权限
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员权限
     */
    String ADMIN_ROLE = "admin";
}
