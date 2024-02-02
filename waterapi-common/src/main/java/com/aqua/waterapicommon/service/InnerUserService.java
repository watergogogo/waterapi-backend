package com.aqua.waterapicommon.service;

import com.aqua.waterapicommon.model.entity.User;

/**
 * 用户服务
 * @author water king
 * @time 2024/2/1
 */
public interface InnerUserService {

    /**
     * 数据库找那个查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
