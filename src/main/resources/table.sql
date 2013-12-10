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
  `uid` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '��Աid',
  `email` char(40) NOT NULL DEFAULT '' COMMENT '����',
  `username` char(15) NOT NULL DEFAULT '' COMMENT '�û���',
  `password` char(32) NOT NULL DEFAULT '' COMMENT '����',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '�ж��û��Ƿ��Ѿ�ɾ�� ��Ҫdiscuz������жϣ���������������Ĺ��ܡ�',
  `emailstatus` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'email�Ƿ񾭹���֤',
  `avatarstatus` tinyint(1) NOT NULL DEFAULT '0' COMMENT '�Ƿ���ͷ�� ',
  `adminid` tinyint(1) NOT NULL DEFAULT '0' COMMENT '����Աid',
  `groupid` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT '��Ա��id',
  `groupexpiry` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '�û�����Ч��',
  `extgroupids` char(20) NOT NULL DEFAULT '' COMMENT '��չ�û���',
  `regdate` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'ע��ʱ��',
  `credits` int(10) NOT NULL DEFAULT '0' COMMENT '�ܻ���',
  `newpm` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT '�¶���Ϣ����',
  `newprompt` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT '��������Ŀ',
  `onlyacceptfriendpm` tinyint(1) NOT NULL DEFAULT '0' COMMENT '�Ƿ�ֻ���պ��Ѷ���Ϣ',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`),
  KEY `email` (`email`),
  KEY `groupid` (`groupid`),
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='�û�����';


