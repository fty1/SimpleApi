/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50513
Source Host           : localhost:3306
Source Database       : simpleapi

Target Server Type    : MYSQL
Target Server Version : 50513
File Encoding         : 65001

Date: 2018-07-05 10:39:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sci_sys_uri
-- ----------------------------
DROP TABLE IF EXISTS `sci_sys_uri`;
CREATE TABLE `sci_sys_uri` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ctime` datetime DEFAULT NULL,
  `cuuid` bigint(20) DEFAULT NULL,
  `utime` datetime DEFAULT NULL,
  `uuuid` bigint(20) DEFAULT NULL,
  `version` bigint(20) DEFAULT NULL,
  `in` tinytext,
  `out` tinytext,
  `uri` varchar(255) DEFAULT NULL,
  `uri_type` varchar(255) DEFAULT NULL,
  UNIQUE KEY `id` (`id`) USING BTREE,
  UNIQUE KEY `uri` (`uri`) USING BTREE
) ENGINE=InnoDb DEFAULT CHARSET=utf8;
