

DROP TABLE IF EXISTS `sci_sys_uri`;
CREATE TABLE `sci_sys_uri` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uri` varchar(255) DEFAULT NULL COMMENT 'uri',
  `uri_type` varchar(255) DEFAULT NULL COMMENT '资源类型',
  `in` varchar(255) DEFAULT NULL COMMENT '入参',
  `out` varchar(255) DEFAULT NULL COMMENT '出参',
  `ctime` datetime NOT NULL,
  `cuuid` bigint(20) NOT NULL,
  `utime` datetime DEFAULT NULL,
  `uuuid` bigint(20) DEFAULT NULL,
  `version` bigint(20) DEFAULT '0',
  UNIQUE KEY `id` (`id`) USING BTREE,
  UNIQUE KEY `uri` (`uri`) USING BTREE
) ENGINE=InnoDb DEFAULT CHARSET=utf8 COMMENT '资源表' ;
