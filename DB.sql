-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: game_db
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `special_rules`
--

DROP TABLE IF EXISTS `special_rules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `special_rules` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `camp_only` bit(1) NOT NULL,
  `cost_add` float NOT NULL,
  `cost_multiply` float NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `special_rules`
--

LOCK TABLES `special_rules` WRITE;
/*!40000 ALTER TABLE `special_rules` DISABLE KEYS */;
INSERT INTO `special_rules` VALUES (2,_binary '\0',0,1,'xoxoxoxoxox','Regeneracja'),(3,_binary '',20,1,'xoxoxoxoxox','Felczer'),(4,_binary '\0',0.05,0.5,'','a'),(6,_binary '\0',0,0.8,'Broń dystansowa z zasada˛ Wymaga przeładowania (X) wymaga wykonania akcji przeładowanie, w ilości określonej przez liczbe˛ w nawiasie, zanim zostanie ponownie użyta.','Wymaga przeładowania (X)'),(7,_binary '\0',20,1.1,'Aby przeprowadzić atak płomieniem, należy przyłożyć szablon płomienia w ˛eższym końcem do kraw ˛edzi podstawki atakuj ˛acego i skierować przeciwny koniec w dowolnie wybranym kierunku. Trafienie w modele znajduj ˛ace si ˛e w polu widzenia atakuj ˛acego i chociaż cz ˛eściowo znajduj ˛ace si ˛e pod szablonem należy rozstrzygn ˛ać według zasad przedstawionych poniżej. Modele poza polem widzenia atakuj ˛acego unikaj ˛a trafienia automatycznie. Modele całkowicie przykryte szablonem zostaj ˛a trafione automatycznie. Modele przykryte cz ˛eściowo musz ˛a wykonać test zr˛eczności i otrzymuj ˛a trafienie w przypadku jego niepowodzenia. Rzut na test zranienia ataku płomieniem należy zmodyfikować o modyfikatory trafienia ataku dystansowego przysługuj ˛ace celom ataku','Atak płomieniem'),(8,_binary '',0.05,0.5,'x','aaa'),(9,_binary '',0.05,2,'2','sdfsdfsdf');
/*!40000 ALTER TABLE `special_rules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weapons`
--

DROP TABLE IF EXISTS `weapons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weapons` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `agility` float NOT NULL,
  `impact` float NOT NULL,
  `reach` float NOT NULL,
  `cost` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=484 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weapons`
--

LOCK TABLES `weapons` WRITE;
/*!40000 ALTER TABLE `weapons` DISABLE KEYS */;
INSERT INTO `weapons` VALUES (2,'','Miecz',1,0,1,6),(3,'','Topór',0,1,1,6),(4,'','Włócznia',0,0,2,8),(5,'Opis miecza','Długi miecz',1,2,1,12),(6,'Opis','Młot',0,3,1,8),(10,'','Kostur',0,0,2,8),(465,'Opis','Młot',0,3,1,15),(466,'','Młot super leszcza',2,2,1,0),(468,'','aaa',2,2,1,0),(469,'','19',1,1,0.5,19),(470,'','asd',1,1,1,8),(471,'','Rembak',0,2,1,8),(472,'','Wielki rembak',-1,3,2,12),(473,'','asddd',2,1,1,10),(474,'','asddd',2,1,1,10),(481,'','Halabarda',0,1,2,10),(482,'','Rozkurwator',5,5,2,28);
/*!40000 ALTER TABLE `weapons` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-21  9:14:59
