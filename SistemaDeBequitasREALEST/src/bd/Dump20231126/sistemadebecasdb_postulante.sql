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
-- Table structure for table `postulante`
--

DROP TABLE IF EXISTS `postulante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `postulante` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Edad` int DEFAULT NULL,
  `DNI` varchar(20) DEFAULT NULL,
  `Usuario` varchar(50) DEFAULT NULL,
  `Contra` varchar(50) DEFAULT NULL,
  `Perfil_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Perfil_ID` (`Perfil_ID`),
  CONSTRAINT `postulante_ibfk_1` FOREIGN KEY (`Perfil_ID`) REFERENCES `perfil` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postulante`
--

LOCK TABLES `postulante` WRITE;
/*!40000 ALTER TABLE `postulante` DISABLE KEYS */;
INSERT INTO `postulante` VALUES (2,'Ana','Flores',22,'23456789','23456789','12345',2),(3,'Elsa','Rodriguez',25,'34567890','34567890','12345',3),(4,'Pedri','Quispe',18,'45678901','45678901','12345',4),(6,'Carlos','Pérez',23,'67890123','carlos123','password',6),(7,'Luisa','Gómez',20,'78901234','luisa789','contraseña',7),(8,'Mario','Martínez',22,'89012345','mario123','clave',8),(9,'Javier','Hernández',24,'90123456','javier123','password',9),(10,'Carolina','González',21,'01234567','carolina01','clave',10),(11,'Daniel','Ramírez',19,'98765432','daniel98','password',11),(12,'Marcela','Díaz',20,'87654321','marce21','contraseña',12),(13,'Santiago','López',22,'76543210','santiago22','clave',13),(14,'Valentina','Martínez',21,'65432109','vale123','password',14),(15,'Gabriel','Gómez',20,'54321098','gab98','contraseña',15),(16,'Fernanda','Herrera',23,'43210987','fer123','password',16),(17,'Jack','Zavaleta',23,'857693482','diego21','clave',2);
/*!40000 ALTER TABLE `postulante` ENABLE KEYS */;
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
