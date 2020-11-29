CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'primary id',
  `gmt_created` TIMESTAMP NOT NULL COMMENT 'creation time',
  `gmt_modified` TIMESTAMP NOT NULL COMMENT 'last update time',
  `username` varchar(50) NOT NULL COMMENT 'username',
  `full_name` varchar(255) NULL COMMENT 'full name',
  `phone_number` bigint(20) NULL COMMENT 'phone number',
  `email` varchar(50) NULL COMMENT 'email',
  `status` varchar(10) NOT NULL COMMENT 'status: ACTIVE, INACTIVE',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT='user'
;


INSERT INTO user (gmt_created, gmt_modified, username, full_name, phone_number, email, status) VALUE (NOW(), NOW(), 'test1', 'test1fn', 1233, 'test1@email.com', 'ACTIVE');
INSERT INTO user (gmt_created, gmt_modified, username, full_name, phone_number, email, status) VALUE (NOW(), NOW(), 'test2', 'test2fn', 1234, 'test2@email.com', 'ACTIVE');
INSERT INTO user (gmt_created, gmt_modified, username, full_name, phone_number, email, status) VALUE (NOW(), NOW(), 'test3', 'test3fn', 1235, 'test3@email.com', 'INACTIVE');
INSERT INTO user (gmt_created, gmt_modified, username, full_name, phone_number, email, status) VALUE (NOW(), NOW(), 'test4', 'test4fn', 1236, 'test4@email.com', 'ACTIVE');
INSERT INTO user (gmt_created, gmt_modified, username, full_name, phone_number, email, status) VALUE (NOW(), NOW(), 'test5', 'test5fn', 1237, 'test5@email.com', 'INACTIVE');