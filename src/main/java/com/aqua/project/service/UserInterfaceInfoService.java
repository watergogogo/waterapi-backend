package com.aqua.project.service;

import com.aqua.waterapicommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author water king
 * @time 2024/2/1
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
