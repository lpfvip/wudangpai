/*
Navicat MySQL Data Transfer

Source Server         : wudangpai
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : wudangpai

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2013-12-05 14:18:05
*/

CREATE TABLE `pre_common_member` (
  `uid` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '会员id',
  `email` char(40) NOT NULL DEFAULT '' COMMENT '邮箱',
  `username` char(15) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` char(32) NOT NULL DEFAULT '' COMMENT '密码',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '判断用户是否已经删除 需要discuz程序加判断，并增加整体清理的功能。',
  `emailstatus` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'email是否经过验证',
  `avatarstatus` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有头像 ',
  `adminid` tinyint(1) NOT NULL DEFAULT '0' COMMENT '管理员id',
  `groupid` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT '会员组id',
  `groupexpiry` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '用户组有效期',
  `extgroupids` char(20) NOT NULL DEFAULT '' COMMENT '扩展用户组',
  `regdate` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '注册时间',
  `credits` int(10) NOT NULL DEFAULT '0' COMMENT '总积分',
  `newpm` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT '新短消息数量',
  `newprompt` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT '新提醒数目',
  `onlyacceptfriendpm` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否只接收好友短消息',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`),
  KEY `email` (`email`),
  KEY `groupid` (`groupid`),
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='用户主表';


