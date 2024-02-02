package com.aqua.project.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 * @author water king
 * @time 2024/1/11
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
