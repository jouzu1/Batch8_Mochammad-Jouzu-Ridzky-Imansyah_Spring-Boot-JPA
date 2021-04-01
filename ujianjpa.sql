-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2021 at 03:39 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ujianjpa`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id_dosen` char(10) NOT NULL,
  `nama_dosen` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `username` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`id_dosen`, `nama_dosen`, `password`, `username`) VALUES
('A1', 'Dadang Surdadang', 'thedunk', 'dadang'),
('A2', 'Dudung Kasbor', 'asep', 'dudung');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` char(8) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `nama_mahasiswa` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `jenis_kelamin`, `nama_mahasiswa`, `password`) VALUES
('123', 'Laki-laki', 'Budi', 'qwerty');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `id_matakuliah` char(10) NOT NULL,
  `nama_matakuliah` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`id_matakuliah`, `nama_matakuliah`) VALUES
('MTK01', 'Matematika Dasar'),
('SISTEL101', 'Sistem Telekomunikasi');

-- --------------------------------------------------------

--
-- Table structure for table `plot_dosen`
--

CREATE TABLE `plot_dosen` (
  `nim` char(8) NOT NULL,
  `id_dosen` char(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `plot_dosen`
--

INSERT INTO `plot_dosen` (`nim`, `id_dosen`) VALUES
('123', 'A1'),
('123', 'A2');

-- --------------------------------------------------------

--
-- Table structure for table `plot_mata_kuliah`
--

CREATE TABLE `plot_mata_kuliah` (
  `nim` char(8) NOT NULL,
  `id_matakuliah` char(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `plot_mata_kuliah`
--

INSERT INTO `plot_mata_kuliah` (`nim`, `id_matakuliah`) VALUES
('123', 'MTK01'),
('123', 'SISTEL101');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id_dosen`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`id_matakuliah`);

--
-- Indexes for table `plot_dosen`
--
ALTER TABLE `plot_dosen`
  ADD KEY `FKchgjim3049ywnf1g2e34mnt3p` (`id_dosen`),
  ADD KEY `FK668ft2l4vrtf8v8qbh0sdime8` (`nim`);

--
-- Indexes for table `plot_mata_kuliah`
--
ALTER TABLE `plot_mata_kuliah`
  ADD KEY `FK2xouaqquvpbajpic1h2e7racj` (`id_matakuliah`),
  ADD KEY `FK3ahsfjp1ps9uxj3ypcf2njgfv` (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
