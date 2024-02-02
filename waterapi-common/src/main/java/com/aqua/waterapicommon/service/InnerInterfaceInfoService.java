package com.aqua.waterapicommon.service;

import com.aqua.waterapicommon.model.entity.InterfaceInfo;

/**
 * @author water king
 * @time 2024/2/1
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在(请求路径、请求方法、请求参数)
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
