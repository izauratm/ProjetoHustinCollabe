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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nomecliente` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `datanasc` datetime NOT NULL,
  `email` varchar(25) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `rg` varchar(10) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (7,'Carlos Martins','Rua Carvalho,239','1964-10-09 00:00:00','martins@gmail.com','51977453600','3029294590','13371578054'),(8,'Lea Pacheco Pires','Av. Carlos Mascarenhas, 1200 apto 104','1979-11-03 00:00:00','leapp@yahoo.com.br','51987456782','3719274801','99802303046'),(9,'Valdir Schonner','Trav. Vernal, 09 apto 708','1990-06-18 00:00:00','vsr@gmail.com','51881346778','1423015709','37745690012'),(10,'Fabio Machado Gomes','Rua Plinio Magalhaes, 807 apto 401','1969-05-13 00:00:00','fabinho8@net.com','55881464533','4127907504','4132790750'),(11,'Helena Sperotto Vargas','Vila Mil, 230','1973-10-02 00:00:00','sperottohv@gmail.com','51988220045','1952246410','78860008034'),(12,'Sergio carbenski','Av. Margarida Soares, 56','1986-11-04 00:00:00','scsc@terra.com.br','49882336745','9003458767','62933990059'),(13,'Livia Cabral Kuskoski','Av. Maranhao, 345','1990-12-08 00:00:00','liviack@gmail.com','21891330087','3264279943','26999121079'),(14,'Paulo Garcia','Bc do Escobar, 258 apto 109','1967-05-24 00:00:00','garciapaulo@yahoo.com.br','51999763402','4274383290','64407791098');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-16 20:00:06
