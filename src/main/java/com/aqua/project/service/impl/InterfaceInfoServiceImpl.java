package com.aqua.project.service.impl;

import com.aqua.project.common.ErrorCode;
import com.aqua.project.exception.BusinessException;
import com.aqua.project.mapper.InterfaceInfoMapper;
import com.aqua.waterapicommon.model.entity.InterfaceInfo;
import com.aqua.project.service.InterfaceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 70742
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-01-09 12:25:47
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        //创建时，所有参数必须为空
        if (add) {
            if(StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




