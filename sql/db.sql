create database if not exists waterapi;

use waterapi;

CREATE TABLE IF NOT EXISTS interface_info (
      id BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键' PRIMARY KEY,
      name VARCHAR(256) NOT NULL COMMENT '名称',
      description VARCHAR(256) NULL COMMENT '描述',
      url VARCHAR(512) NOT NULL COMMENT '接口地址',
      requestHeader TEXT NULL COMMENT '请求头',
      responseHeader TEXT NULL COMMENT '响应头',
      status INT DEFAULT 0 NOT NULL COMMENT '接口状态（0-关闭， 1-开启）',
      method VARCHAR(256) NOT NULL COMMENT '请求类型',
      userId BIGINT NOT NULL COMMENT '创建人',
      createTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
      updateTime DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '更新时间',
      idDelete TINYINT DEFAULT 0 NOT NULL COMMENT '是否删除（0-未删， 1-已删）'
) COMMENT '接口信息';


INSERT INTO interface_info(name, description, url, requestHeader, responseHeader, status, method, userId)
VALUES ('许擎与', '薛聪明', 'www.cary-king.net', '潘博韬', '冉崇建', 0, '是玄冥', 123456789);

INSERT INTO interface_info(name, description, url, requestHeader, responseHeader, status, method, userId)
VALUES ('陆红文', '白志强', 'www.leslee-luhn.net', '潘奕选', '马宏泰', 0, '陈俊熙', 456489);

INSERT INTO interface_info(name, description, url, requestHeader, responseHeader, status, method, userId)
VALUES ('彭宇泽', '罗文', 'www.resaria-lilabck.net', '冯子墨', '彭哲瀚', 0, '赵远航', 3238789);
