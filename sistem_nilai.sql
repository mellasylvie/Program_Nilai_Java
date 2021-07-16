-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2019 at 07:37 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistem_nilai`
--

-- --------------------------------------------------------

--
-- Table structure for table `kelas_7`
--

CREATE TABLE `kelas_7` (
  `NIS` varchar(10) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `BAHASA_INDONESIA` decimal(5,0) NOT NULL,
  `IPA` decimal(5,0) NOT NULL,
  `MATEMATIKA` decimal(5,0) NOT NULL,
  `BAHASA_INGGRIS` decimal(5,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas_7`
--

INSERT INTO `kelas_7` (`NIS`, `NAMA`, `BAHASA_INDONESIA`, `IPA`, `MATEMATIKA`, `BAHASA_INGGRIS`) VALUES
('7001', 'Afina', '90', '90', '76', '90'),
('7002', 'Diah', '98', '78', '80', '89'),
('7003', 'santi ', '56', '45', '79', '91'),
('7004', 'Ofi', '90', '95', '90', '90'),
('7005', 'Nando', '67', '78', '89', '93');

-- --------------------------------------------------------

--
-- Table structure for table `kelas_8`
--

CREATE TABLE `kelas_8` (
  `NIS` varchar(10) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `BAHASA_INDONESIA` decimal(5,0) NOT NULL,
  `IPA` decimal(5,0) NOT NULL,
  `MATEMATIKA` decimal(5,0) NOT NULL,
  `BAHASA_INGGRIS` decimal(5,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas_8`
--

INSERT INTO `kelas_8` (`NIS`, `NAMA`, `BAHASA_INDONESIA`, `IPA`, `MATEMATIKA`, `BAHASA_INGGRIS`) VALUES
('8001', 'Nia', '100', '80', '79', '98'),
('8002', 'Sunny', '89', '45', '89', '80'),
('8003', 'Rizal', '87', '89', '85', '79'),
('8004', 'Endi', '78', '87', '95', '67');

-- --------------------------------------------------------

--
-- Table structure for table `kelas_9`
--

CREATE TABLE `kelas_9` (
  `NIS` varchar(10) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `BAHASA_INDONESIA` decimal(5,0) NOT NULL,
  `IPA` decimal(5,0) NOT NULL,
  `MATEMATIKA` decimal(5,0) NOT NULL,
  `BAHASA_INGGRIS` decimal(5,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas_9`
--

INSERT INTO `kelas_9` (`NIS`, `NAMA`, `BAHASA_INDONESIA`, `IPA`, `MATEMATIKA`, `BAHASA_INGGRIS`) VALUES
('9001', 'Abil', '100', '89', '87', '90'),
('9002', 'Bila', '86', '75', '78', '94'),
('9003', 'Daniel', '90', '76', '89', '95'),
('9004', 'Fitriyah', '89', '78', '67', '89');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('sistem', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kelas_7`
--
ALTER TABLE `kelas_7`
  ADD PRIMARY KEY (`NIS`);

--
-- Indexes for table `kelas_8`
--
ALTER TABLE `kelas_8`
  ADD PRIMARY KEY (`NIS`);

--
-- Indexes for table `kelas_9`
--
ALTER TABLE `kelas_9`
  ADD PRIMARY KEY (`NIS`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
