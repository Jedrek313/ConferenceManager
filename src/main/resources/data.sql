INSERT INTO `user` (`username`,`password`, `role`) VALUES ('admin','$2a$04$uSxj0duHoUsvNGL0x8OAoeK/VnLaryA07FJqsWb8kSKPw0nXdTihS','ADMIN');
INSERT INTO `user` (`username`,`password`, `role`) VALUES ('guest','$2a$04$AD39vuLXlHVb1V1qiCJkX.zDADXDthoO83elWa3Un1eQRXIqvnlp.','GUEST');
--INSERT INTO `user_role` (`id`,`username`,`role`) VALUES (1,'admin','ROLE_GUEST');
--INSERT INTO `user_role` (`id`,`username`,`role`) VALUES (2,'admin','ROLE_ADMIN');

INSERT INTO `conference` (`id`,`name`,`start`,`end`) VALUES (1,'First Conference','2018-08-01 15:00:00', '2018-08-11 16:00:00');
INSERT INTO `conference` (`id`,`name`,`start`,`end`) VALUES (2,'Second Conference','2018-09-02 16:00:00', '2018-08-11 16:00:00');

INSERT INTO `event` (`id`,`name`,`conference_id`) VALUES (1,'First Event',1);
INSERT INTO `event` (`id`,`name`,`conference_id`) VALUES (2,'Second Event',1);
INSERT INTO `event` (`id`,`name`,`conference_id`) VALUES (3,'Third Event',2);