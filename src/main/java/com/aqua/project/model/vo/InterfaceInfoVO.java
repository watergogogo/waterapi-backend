package com.aqua.project.model.vo;

import com.aqua.waterapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息封装视图
 * @author water king
 * @time 2024/2/1
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 调用次数
     */
    private Integer totalNum;

    public static final long serialVersionUID = 1L;
}
