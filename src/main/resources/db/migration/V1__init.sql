CREATE TABLE patient(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45),
  `last_name` varchar(45),
  `email` varchar(45),
  `phone1` varchar(15),
  `phone2` varchar(15),
  `birth_date` DATE,
  `blood_type` varchar(3),
  `national_id` varchar(15), 	
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;