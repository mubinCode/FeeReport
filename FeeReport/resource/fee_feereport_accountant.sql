-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: fee
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `feereport_accountant`
--

DROP TABLE IF EXISTS `feereport_accountant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feereport_accountant` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(45) NOT NULL,
  `contact` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feereport_accountant`
--

LOCK TABLES `feereport_accountant` WRITE;
/*!40000 ALTER TABLE `feereport_accountant` DISABLE KEYS */;
INSERT INTO `feereport_accountant` VALUES (1,'prateek','prateek','prateek@gmail.com','','9199291212'),(2,'sonoo','sonoo123','sonoo@gmail.com','','939292932'),(3,'salman','salman','salman@gmail.com','','939929322'),(4,'varun','varun','varun@gmail.com','','9399239239'),(5,'abhi','abhi','abhi@gmail.com','','93923923'),(6,'Roshan','roshan','roshan@gmail.com','','9953030303'),(7,'fkllkjgjhjh','jkojojjnjih','jjbhiijoh','iohiuhgiug','14545'),(8,'amir','123','nkjbjhbjkbhj','highiuohjklvih','1111'),(9,'vjhbjhbv','ghjvhb','bjhbjhbk','bjhbkib','bjhbijhbou'),(10,'hamza','123','hjkbjkbl','bjhbkjln','5469498'),(11,'kllkjlkj','lkjlj','lkjlk','jlkjl','kjlkj');
/*!40000 ALTER TABLE `feereport_accountant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-14 22:04:19
