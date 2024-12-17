CREATE DATABASE  IF NOT EXISTS `hustincollabe` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hustincollabe`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: hustincollabe
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agenda_visita`
--

DROP TABLE IF EXISTS `agenda_visita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agenda_visita` (
  `idAgenda_Visita` int NOT NULL AUTO_INCREMENT,
  `data` datetime NOT NULL,
  `hora` time NOT NULL,
  `nomecliente` varchar(45) NOT NULL,
  `corretorcodigo` varchar(10) NOT NULL,
  `imovelcodigo` varchar(20) NOT NULL,
  `email` varchar(25) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `corretor_idcorretor` int NOT NULL,
  PRIMARY KEY (`idAgenda_Visita`),
  KEY `fk_Agenda_Visita_Corretor1` (`corretor_idcorretor`),
  CONSTRAINT `fk_Agenda_Visita_Corretor1` FOREIGN KEY (`corretor_idcorretor`) REFERENCES `corretor` (`idcorretor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenda_visita`
--

LOCK TABLES `agenda_visita` WRITE;
/*!40000 ALTER TABLE `agenda_visita` DISABLE KEYS */;
INSERT INTO `agenda_visita` VALUES (1,'2021-12-03 00:00:00','14:30:00','Paulo Garcia','89302','44578','garciapaulo@yahoo.com.br','51999763402',2),(2,'2021-11-10 00:00:00','15:30:00','Carlos Martins','78452','54899','martins@gmail.com','51977453600',5),(3,'2021-02-10 00:00:00','17:00:00','Sergio carbenski','89302','438750','scsc@terra.com.br','49882336745',1),(4,'2022-01-19 00:00:00','18:15:00','Fabio Machado Gomes','89302','23890','fabinho8@net.com','55881464533',2),(5,'2021-12-22 00:00:00','13:30:00','Valdir Schonner','45889','438289','vsr@gmail.com','51881346778',3),(6,'2022-05-15 00:00:00','10:30:00','Livia Cabral Kuskoski','237891','76344','liviack@gmail.com','21891330087',4),(7,'2022-04-22 00:00:00','16:30:00','Lea Pacheco Pires','45783','23891','leapp@yahoo.com.br','51987456782',1),(8,'2022-01-27 00:00:00','19:00:00','Helena Sperotto Vargas','45889','438001','sperottohv@gmail.com','51988220045',3);
/*!40000 ALTER TABLE `agenda_visita` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-16 20:00:05
