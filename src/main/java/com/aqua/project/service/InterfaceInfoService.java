package com.aqua.project.service;

import com.aqua.waterapicommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 70742
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-01-09 12:25:47
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
