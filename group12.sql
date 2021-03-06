/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.47 : Database - group12
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`group12` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `group12`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `amdin_id` int(255) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) NOT NULL,
  `admin_pwd` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL COMMENT '管理员密码盐',
  `admin_tel` varchar(255) NOT NULL COMMENT '管理员手机号',
  `admin_email` varchar(255) NOT NULL COMMENT '管理员邮箱',
  PRIMARY KEY (`amdin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `banner` */

DROP TABLE IF EXISTS `banner`;

CREATE TABLE `banner` (
  `banner_id` int(255) NOT NULL AUTO_INCREMENT,
  `banner_pic_path` varchar(255) NOT NULL COMMENT '轮播图片的地址',
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `comments` */

DROP TABLE IF EXISTS `comments`;

CREATE TABLE `comments` (
  `comments_id` int(255) NOT NULL AUTO_INCREMENT,
  `news_id` int(255) NOT NULL,
  `user_id` int(255) NOT NULL,
  `content` text NOT NULL COMMENT '评论内容',
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`comments_id`)
) ENGINE=InnoDB AUTO_INCREMENT=435117 DEFAULT CHARSET=utf8;

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `news_id` int(255) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL COMMENT '新闻标题',
  `content` text NOT NULL COMMENT '新闻内容',
  `create_date` date DEFAULT '2016-12-31' COMMENT '创建时间',
  `author` varchar(255) NOT NULL COMMENT '作者',
  `type` int(255) NOT NULL COMMENT '类型',
  `summary` varchar(255) DEFAULT NULL COMMENT '新闻摘要',
  `hits` int(255) NOT NULL DEFAULT '0' COMMENT '阅读次数',
  `imgURL` varchar(255) DEFAULT NULL COMMENT '新闻图片地址',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19729 DEFAULT CHARSET=utf8;

/*Table structure for table `type` */

DROP TABLE IF EXISTS `type`;

CREATE TABLE `type` (
  `type_id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(255) NOT NULL AUTO_INCREMENT,
  `pwd` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_sex` int(10) NOT NULL,
  `tel` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `pic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `uname` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
