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
-- Table structure for table `corretor`
--

DROP TABLE IF EXISTS `corretor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `corretor` (
  `idcorretor` int NOT NULL AUTO_INCREMENT,
  `corretornome` varchar(45) NOT NULL,
  `corretorcodigo` varchar(10) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `email` varchar(25) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `rg` varchar(10) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `creci` varchar(15) NOT NULL,
  PRIMARY KEY (`idcorretor`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corretor`
--

LOCK TABLES `corretor` WRITE;
/*!40000 ALTER TABLE `corretor` DISABLE KEYS */;
INSERT INTO `corretor` VALUES (1,'Luiza Vasconcellos','45783','Trav. Verdana, 350','lvll@gmail.com.br','61988784300','2260824408','64780211069','18672019'),(2,'Mario Barnasque','89302','Rua Tamandare, 490 apto 107','mariobq@terra.com.br','61899120966','3192695411','62794603043','20002019'),(3,'Daniela França','45889','Rua Mario Lago, 569 apto 300','danifra@yahoo.com.br','51999211208','4418144554','85874984011','20012016'),(4,'Francisco Teixeira Melo','237891','Av. Beira Rio, 1200','melofran@outlook.com','54878764422','4106150403','40170263037','19992000'),(5,'Marta Lans','78452','Av. Pinheiro Machado, 809 apto 405','marinhalans@gmail.com','51989447832','1561535301','97897935027','20012022');
/*!40000 ALTER TABLE `corretor` ENABLE KEYS */;
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
