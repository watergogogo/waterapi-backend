package com.aqua.project.service.impl.inner;

import com.aqua.project.common.ErrorCode;
import com.aqua.project.exception.BusinessException;
import com.aqua.project.mapper.UserMapper;
import com.aqua.waterapicommon.model.entity.User;
import com.aqua.waterapicommon.service.InnerUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author water king
 * @time 2024/2/1
 */
@DubboService
public class InnerUserServiceimpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
