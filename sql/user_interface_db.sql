use waterapi;

CREATE TABLE IF NOT EXISTS user_interface_info (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键' PRIMARY KEY,
    userId bigint not null comment '调用用户id',
    interfaceInfoId bigint not null comment '接口id',
    totalNum int default 0 not null comment '总调用次数',
    leftNum int default 0 not null comment '剩余调用次数',
    status INT DEFAULT 0 NOT NULL COMMENT '接口状态（0-正常， 1-禁用）',
    method VARCHAR(256) NOT NULL COMMENT '请求类型',
    createTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    updateTime DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '更新时间',
    idDelete TINYINT DEFAULT 0 NOT NULL COMMENT '是否删除（0-未删， 1-已删）'
    ) COMMENT '用户调用接口关系';