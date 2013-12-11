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
CREATE DATABASE  IF NOT EXISTS `wudangpai`;
CREATE TABLE  IF NOT EXISTS `pre_common_member`(
  `uid` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT 'member id', 
  `email` char(40) NOT NULL DEFAULT '' COMMENT 'email',  
  `username` char(15) NOT NULL DEFAULT '' COMMENT 'username', 
  `password` char(32) NOT NULL DEFAULT '' COMMENT 'password',  
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'user deleted', 
  `emailstatus` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'email verified',
  `avatarstatus` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'user avatar ',
  `adminid` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'operator id', 
  `groupid` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT 'member group id', 
  `groupexpiry` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'user group validity',
  `extgroupids` char(20) NOT NULL DEFAULT '' COMMENT 'expand user group', 
  `regdate` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'registration time',
  `credits` int(10) NOT NULL DEFAULT '0' COMMENT 'total credits', 
  `newpm` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT 'new message number',
  `newprompt` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT 'new prompt number',
  `onlyacceptfriendpm` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'accept friend message only', 
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`),
  KEY `email` (`email`),
  KEY `groupid` (`groupid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Member' 