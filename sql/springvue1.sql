# Host: 127.0.0.1  (Version 8.0.26)
# Date: 2021-09-28 15:59:23
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "easyuser"
#

DROP TABLE IF EXISTS `easyuser`;
CREATE TABLE `easyuser` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `state` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;

#
# Data for table "easyuser"
#

INSERT INTO `easyuser` VALUES (1,'admin','123456','123@qq.com','超级管理员',1),(2,'naughty','888888','456@qq.com','普通管理员',1),(4,'anglybirds','123456','aaaa@163.com','普通用户',1),(7,'admin003','q123456','c@qq.com','普通用户',0),(8,'admin005','123456','cxz@qq.com','普通用户',0),(9,'admin007','123456','rty@qq.com','普通用户',1),(10,'demo','123456','123@qq.com','普通用户',0),(11,'admin1','123456','123456@qq.com','普通用户',1);

#
# Structure for table "mainmenu"
#

DROP TABLE IF EXISTS `mainmenu`;
CREATE TABLE `mainmenu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8mb3;

#
# Data for table "mainmenu"
#

INSERT INTO `mainmenu` VALUES (100,'权限管理','/admin'),(200,'运动平台','/use');

#
# Structure for table "submenu"
#

DROP TABLE IF EXISTS `submenu`;
CREATE TABLE `submenu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `mid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mid` (`mid`),
  CONSTRAINT `submenu_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `mainmenu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8mb3;

#
# Data for table "submenu"
#

INSERT INTO `submenu` VALUES (101,'用户列表','/user',100),(102,'修改权限','/rights',100),(103,' 运动模块','/sport',100),(104,'商品模块','/goods',100),(201,'运动科普','/Introduction',200),(202,'卡路里','/calories',200),(203,'营养配餐','/food',200);
