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
-- Table structure for table `imovel`
--

DROP TABLE IF EXISTS `imovel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `imovel` (
  `idimovel` int NOT NULL AUTO_INCREMENT,
  `imovelnome` varchar(150) NOT NULL,
  `tipoimovel` varchar(50) NOT NULL,
  `imovelcodigo` varchar(20) NOT NULL,
  `descricao` text NOT NULL,
  `valorimovel` decimal(10,2) NOT NULL,
  `bairro` varchar(20) NOT NULL,
  `condicaovenda` varchar(50) NOT NULL,
  `cliente_idcliente` int NOT NULL,
  `corretor_idcorretor` int NOT NULL,
  PRIMARY KEY (`idimovel`),
  KEY `fk_Imovel_Comprador1_idx` (`cliente_idcliente`),
  KEY `fk_Imovel_Corretor1_idx` (`corretor_idcorretor`),
  CONSTRAINT `fk_Imovel_Comprador1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `fk_Imovel_Corretor1` FOREIGN KEY (`corretor_idcorretor`) REFERENCES `corretor` (`idcorretor`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imovel`
--

LOCK TABLES `imovel` WRITE;
/*!40000 ALTER TABLE `imovel` DISABLE KEYS */;
INSERT INTO `imovel` VALUES (1,'Live','loft','44578','apartamentos de 73 a 100m², 1 Banheiro, 2 Vagas',450000.00,'Alta Vista','entrada, parcelado sem reforço',14,2),(2,'High Garden','apto garden','54899','3 SuÌtes 123 e 143 m², 03 Banheiros, 2 e 3 Vagas',1200000.00,'Altos do Mirante','entrada,parcelado com 4 reforços',7,5),(3,'Tower Park','apto luxo','438750','3 suÌtes 251 a 456m², 3 Banheiros, 3 Vagas',1950000.00,'Santa Clara','entrada, parcelado com 5 reforços',12,1),(4,'LoftLive','condominio residencial','23890','apartamentos de 1 ou 3 dorm, 73 a 101 m²,1 Banheiro 1 ou 2 Vagas',650000.00,'Pinheiros do Sul','entrada, parcelado com 2 reforço',10,2),(5,'Terra Ville','apto luxo','438289','4 SuÌtes 387 e 455 m², até 4 Banheiros, 4 Vagas',2150000.00,'Jardins','entrada, parcelado com 6 reforços',9,3),(6,'Studios Apart','studio','76344','1 dorm 25 m², 1 Banheiro, 1 Vaga',400000.00,'Medianeira','a vista',13,4),(7,'Grand Park','condominio residencial','23891','2 e 3 dorm, 56 a 81 m², 1 e 2 Banheiros, 2 e 3 Vagas',550000.00,'Sao Francisco','entrada, parcelado com 2 reforços,',8,1),(8,'Supreme Live','apto luxo','438001','2 e 3 dorm, 59 a 70 m², 1 e 2 Banheiro, 1 a 2 Vagas',700000.00,'Jardins','entrada, parcelado com 3 reforços',11,3);
/*!40000 ALTER TABLE `imovel` ENABLE KEYS */;
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
