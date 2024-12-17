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
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `idfuncionario` int NOT NULL AUTO_INCREMENT,
  `funcionarionome` varchar(45) NOT NULL,
  `cargo` varchar(25) NOT NULL,
  `matricula` int NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `datanasc` datetime NOT NULL,
  `email` varchar(25) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `rg` varchar(10) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `usuario_idusuario` int NOT NULL,
  PRIMARY KEY (`idfuncionario`),
  KEY `fk_Funcionario_Usuario_idx` (`usuario_idusuario`),
  CONSTRAINT `fk_Funcionario_Usuario` FOREIGN KEY (`usuario_idusuario`) REFERENCES `usuario` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (9,'Sandro Augusto Venner','gerente',14578,'Rua Wenceslau Brito, 320','1969-07-19 00:00:00','sandrovenner@terra.com.br','56989121344','4002387651','90045783317',1),(10,'Elisabete Horn','secretaria',23705,'Av. Santos Neto, 490 apto 12','2001-06-27 00:00:00','horne@gmail.com','51678346655','3034787800','52257228065',2),(11,'Luiza Vasconcellos','corretor',23655,'Trav.Verdana, 350','1975-02-16 00:00:00','lvll@gmail.com.br','61988784300','2260824408','64780211069',3),(12,'Mario Barnasque','corretor',21177,'Rua Tamandare, 490 apto 107','2000-10-13 00:00:00','mariobq@terra.com.br','61899120966','3192695411','62794603043',4),(13,'Daniela França','corretor',25512,'Rua Mario Lago, 569 apto 300','1987-04-21 00:00:00','danifra@yahoo.com.br','51999211208','4418144554','85874984011',5),(14,'Francisco Teixeira Melo','corretor',14420,'Av. Beira Rio, 1200','1969-11-19 00:00:00','melofran@outlook.com','54878764422','4106150403','40170263037',6),(15,'Marta Lans','corretor',32401,'Av. Pinheiro Machado, 809 apto 405','1982-09-04 00:00:00','marinhalans@gmail.com','51989447832','1561535301','97897935027',7),(16,'Alessandro Gomes','contador',17856,'Av. Bento Saldanha, 89 apto 101','1960-12-07 00:00:00','sandrogomes@yahoo.com.br','55878004002','4067714311','46193440011',8),(17,'Marines Silva','estagiaria',65281,'Rua Castro de Menezes, 01','2007-06-15 00:00:00','mariness@outlook.com','55954181755','4544844487','87574183066',9);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
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
