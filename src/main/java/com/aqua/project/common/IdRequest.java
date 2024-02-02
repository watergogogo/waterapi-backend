package com.aqua.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author water king
 * @time 2024/1/10
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serivalVersionUID = 1L;
}
