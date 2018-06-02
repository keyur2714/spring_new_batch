CREATE TABLE `employee_table` (
  `employee_id` int(11) NOT NULL auto_increment,
  `employee_name` varchar(50) default NULL,
  `salary` double default NULL,
  `email` varchar(30) default NULL,
  `gender` varchar(20) default NULL,
  PRIMARY KEY  (`employee_id`)
);

