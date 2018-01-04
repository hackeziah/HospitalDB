-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2016 at 02:03 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospitaldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `ID` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `FatherName` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `ContactNo` int(50) NOT NULL,
  `EmailID` varchar(100) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `Specialization` varchar(100) NOT NULL,
  `Gender` text NOT NULL,
  `BloodGroup` text NOT NULL,
  `DATEOFJOIN` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`ID`, `Name`, `FatherName`, `Address`, `ContactNo`, `EmailID`, `Qualification`, `Specialization`, `Gender`, `BloodGroup`, `DATEOFJOIN`) VALUES
('dfsdf', 'dfsdfs', 'dfsdf', 'dfdfgdf', 3222, 'dfsdf', 'sdfgsdfgsdfgs', 'sdfgsdfgsdfgdsf', 'Male', 'B', 'sdfgdfbbbbbbb'),
('gsrg5', 'kevin', 'lamad', 'patay', 9999, 'lasd@gmail', 'okay naman', 'buhay pa', 'Male', 'B', '13/may /2011');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('kevin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `regpat`
--

CREATE TABLE `regpat` (
  `PatientID` varchar(120) NOT NULL,
  `Name` varchar(120) NOT NULL,
  `FatherName` varchar(120) NOT NULL,
  `Address` varchar(120) NOT NULL,
  `ContactNumbers` int(50) NOT NULL,
  `EmailID` varchar(120) NOT NULL,
  `Age` int(50) NOT NULL,
  `Gender` text NOT NULL,
  `BloodGroup` text NOT NULL,
  `Remarks` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regpat`
--

INSERT INTO `regpat` (`PatientID`, `Name`, `FatherName`, `Address`, `ContactNumbers`, `EmailID`, `Age`, `Gender`, `BloodGroup`, `Remarks`) VALUES
('234234', 'kevin', 'adsfasdf', 'asdfasdf1', 213123, 'dsfg', 12, 'Male', 'A', ''),
('234234', 'kevin', 'adsfasdf', 'asdfasdf1', 213123, 'dsfg', 12, 'Male', 'A', 'asdfasdf'),
('test1', 'dcvzv', 'vzxcvz', 'kdfnadf', 7787, 'gdhfg', 13, 'Male', 'O', 'asdfsdf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD UNIQUE KEY `username` (`username`,`password`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
