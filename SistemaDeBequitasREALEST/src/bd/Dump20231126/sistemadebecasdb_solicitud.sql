-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: sistemadebecasdb
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `solicitud`
--

DROP TABLE IF EXISTS `solicitud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitud` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Postulante_ID` int DEFAULT NULL,
  `Beca_ID` int DEFAULT NULL,
  `FechaCreacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `Aprobada` tinyint(1) DEFAULT '0',
  `Estado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Beca_ID` (`Beca_ID`),
  KEY `FK_Postulante_Solicitud` (`Postulante_ID`),
  CONSTRAINT `FK_Postulante_Solicitud` FOREIGN KEY (`Postulante_ID`) REFERENCES `postulante` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `solicitud_ibfk_1` FOREIGN KEY (`Postulante_ID`) REFERENCES `postulante` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `solicitud_ibfk_2` FOREIGN KEY (`Beca_ID`) REFERENCES `beca` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitud`
--

LOCK TABLES `solicitud` WRITE;
/*!40000 ALTER TABLE `solicitud` DISABLE KEYS */;
INSERT INTO `solicitud` VALUES (2,6,2,'2023-11-25 23:27:11',0,'Pendiente'),(3,7,3,'2023-11-25 23:27:20',0,'En revisión'),(4,8,1,'2023-11-25 23:27:28',0,'Aprobado'),(5,9,4,'2023-11-26 00:22:39',0,'En revisión'),(6,10,1,'2023-11-26 00:22:39',0,'Pendiente'),(7,11,3,'2023-11-26 00:22:39',0,'Pendiente'),(8,12,2,'2023-11-26 00:22:39',0,'En revisión'),(9,13,4,'2023-11-26 00:22:39',0,'Pendiente'),(10,14,1,'2023-11-26 00:22:39',0,'En revisión'),(11,15,3,'2023-11-26 00:22:39',0,'Pendiente'),(12,16,2,'2023-11-26 00:22:39',0,'En revisión'),(13,17,NULL,'2023-11-26 00:23:31',0,'Pendiente');
/*!40000 ALTER TABLE `solicitud` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-26  0:34:06
