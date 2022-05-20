-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.4.22-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for toneridb
DROP DATABASE IF EXISTS `toneridb`;
CREATE DATABASE IF NOT EXISTS `toneridb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `toneridb`;

-- Dumping structure for table toneridb.printers
DROP TABLE IF EXISTS `printers`;
CREATE TABLE IF NOT EXISTS `printers` (
  `PRINTID` int(11) NOT NULL,
  `IP_ADDRESS` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `MODEL` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MARKA` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `TONER` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `DRIVER` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `POSLEDNJA_PROMENA` date DEFAULT NULL,
  `POSLEDNJI_SERVIS` date DEFAULT NULL,
  `INV_BROJ` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `SLIKA` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `TIP` enum('CrnoBeli','Color') COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `LOKACIJA` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `STATUS` enum('Aktivan','Servis','Otpisan') COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`PRINTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table toneridb.printers: ~0 rows (approximately)
REPLACE INTO `printers` (`PRINTID`, `IP_ADDRESS`, `MODEL`, `MARKA`, `TONER`, `DRIVER`, `POSLEDNJA_PROMENA`, `POSLEDNJI_SERVIS`, `INV_BROJ`, `SLIKA`, `TIP`, `LOKACIJA`, `STATUS`) VALUES
	(1, '10.11.124.222', '451', 'HP', 'CE410A', 'link', '2022-05-20', '2022-02-11', '5488234', 'link', 'Color', 'Prodaja', 'Aktivan');

-- Dumping structure for table toneridb.toneri
DROP TABLE IF EXISTS `toneri`;
CREATE TABLE IF NOT EXISTS `toneri` (
  `TONERID` int(11) NOT NULL,
  `TONER_NAZIV` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `TONER_KOLICINA` int(11) NOT NULL DEFAULT 0,
  `TONER_PREPKOLICINA` int(11) NOT NULL,
  PRIMARY KEY (`TONERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table toneridb.toneri: ~0 rows (approximately)
REPLACE INTO `toneri` (`TONERID`, `TONER_NAZIV`, `TONER_KOLICINA`, `TONER_PREPKOLICINA`) VALUES
	(0, 'CE410A', 1, 2);

-- Dumping structure for table toneridb.usertable
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE IF NOT EXISTS `usertable` (
  `USERID` int(11) NOT NULL,
  `USERNAME` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `USERPASS` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table toneridb.usertable: ~0 rows (approximately)

-- Dumping structure for table toneridb.zamenatoner
DROP TABLE IF EXISTS `zamenatoner`;
CREATE TABLE IF NOT EXISTS `zamenatoner` (
  `ID_ZAMENA` int(11) NOT NULL,
  `ZAMENA_MARKA` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `ZAMENA_MODEL` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `ZAMENA_LOKACIJA` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `ZAMENA_TIP` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `ZAMENA_KOLICINA` int(11) NOT NULL DEFAULT 0,
  `ZAMENA_TONER` int(11) NOT NULL DEFAULT 0,
  `ZAMENA_POSLEDNJAPROMENA` date NOT NULL,
  PRIMARY KEY (`ID_ZAMENA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table toneridb.zamenatoner: ~0 rows (approximately)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
