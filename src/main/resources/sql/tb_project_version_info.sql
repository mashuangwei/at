/*
 Navicat Premium Data Transfer

 Source Server         : pc-local
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : 127.0.0.1:3306
 Source Schema         : shiro

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 20/08/2018 23:27:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_project_version_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_project_version_info`;
CREATE TABLE `tb_project_version_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` int(11) NOT NULL,
  `bug_num` int(11) NULL DEFAULT NULL,
  `not_slove` int(11) NULL DEFAULT NULL,
  `highst` int(11) NULL DEFAULT NULL,
  `high` int(11) NULL DEFAULT NULL,
  `medium` int(11) NULL DEFAULT NULL,
  `lower` int(11) NULL DEFAULT NULL,
  `optimize` int(11) NULL DEFAULT NULL,
  `case_num` int(11) NULL DEFAULT NULL,
  `executed_num` int(11) NULL DEFAULT NULL,
  `version` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
