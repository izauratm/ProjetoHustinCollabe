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
-- Table structure for table `transacao`
--

DROP TABLE IF EXISTS `transacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transacao` (
  `idTransacao` int NOT NULL AUTO_INCREMENT,
  `datavenda` datetime NOT NULL,
  `valor` decimal(10,2) NOT NULL,
  `condicaovenda` varchar(50) NOT NULL,
  `corretor_idcorretor` int NOT NULL,
  `imovel_idimovel` int NOT NULL,
  `comissao` decimal(10,2) NOT NULL,
  `clientenome` varchar(45) NOT NULL,
  PRIMARY KEY (`idTransacao`),
  KEY `fk_Transacao_Corretor1` (`corretor_idcorretor`),
  KEY `idx_imovel` (`imovel_idimovel`),
  CONSTRAINT `fk_Transacao_Corretor1` FOREIGN KEY (`corretor_idcorretor`) REFERENCES `corretor` (`idcorretor`),
  CONSTRAINT `fk_Transacao_Imovel1` FOREIGN KEY (`imovel_idimovel`) REFERENCES `imovel` (`idimovel`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transacao`
--

LOCK TABLES `transacao` WRITE;
/*!40000 ALTER TABLE `transacao` DISABLE KEYS */;
INSERT INTO `transacao` VALUES (1,'2022-01-05 00:00:00',450000.00,'entrada, parcelado sem reforço',2,1,4500.00,'Paulo Garcia'),(2,'2022-03-18 00:00:00',1200000.00,'entrada,parcelado com 4 reforços',5,2,120000.00,'Carlos Martins'),(3,'2022-04-15 00:00:00',1950000.00,'entrada, parcelado com 5 reforços',1,3,195000.00,'Sergio carbenski'),(4,'2022-05-23 00:00:00',650000.00,'entrada, parcelado com 2 reforços',2,4,6500.00,'Fabio Machado Gomes'),(5,'2022-06-04 00:00:00',2150000.00,'entrada, parcelado com 6 reforços',3,5,215000.00,'Valdir Schonner'),(6,'2022-08-25 00:00:00',400000.00,'a vista',4,6,4000.00,'Livia Cabral Kuskoski'),(7,'2022-09-12 00:00:00',550000.00,'entrada, parcelado com 2 reforços',1,7,5500.00,'Lea Pacheco Pires'),(8,'2022-11-19 00:00:00',700000.00,'entrada, parcelado com 3 reforços',3,8,7000.00,'Helena Sperotto Vargas');
/*!40000 ALTER TABLE `transacao` ENABLE KEYS */;
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
