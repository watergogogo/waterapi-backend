package com.aqua.waterapicommon.service;

/**
 *
 * @author water king
 * @time 2024/2/1
 */
public interface InnerUserInterfaceInfoService {
    

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
