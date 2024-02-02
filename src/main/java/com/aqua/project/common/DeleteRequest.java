package com.aqua.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author water king
 * @time 2024/1/10
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
