CREATE DATABASE ITicket;
use ITicket;

CREATE TABLE `artista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `artista` VALUES (1,'Bruno Mars'),(2,'Lady GaGa'),(3,'Slipknot');

CREATE TABLE `conciertos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `costo` varchar(9) NOT NULL,     
  `fecha` varchar(11) NOT NULL,       
  `max_personas` varchar(9) NOT NULL,
  `lugar` varchar(75) NOT NULL,
  `artista_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`artista_id`),
  KEY `fk_conciertos_artista_idx` (`artista_id`),
  CONSTRAINT `fk_conciertos_artista` FOREIGN KEY (`artista_id`) REFERENCES `artista` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;

INSERT INTO `conciertos` VALUES (1,'1800000','2023-02-20','500','Estadio Nacional, San José',1);
INSERT INTO `conciertos` VALUES (2,'9035020','2022-11-15','300','Estadio Alejandro Morera Soto, Alajuela',2);

