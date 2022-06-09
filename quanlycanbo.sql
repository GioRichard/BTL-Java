-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2022 at 04:50 PM
-- Server version: 8.0.28
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlycanbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `canbo`
--

CREATE TABLE `canbo` (
  `MaCB` int NOT NULL,
  `HoTen` varchar(50) NOT NULL,
  `NamSinh` year NOT NULL,
  `GioiTinh` varchar(20) NOT NULL,
  `DiaChi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `canbo`
--

INSERT INTO `canbo` (`MaCB`, `HoTen`, `NamSinh`, `GioiTinh`, `DiaChi`) VALUES
(3, 'Lê Hồng Phú', 2001, 'Nam', 'Hai Duong'),
(4, 'Phan Quoc Khanh', 2001, 'Nam', 'Nghe An'),
(5, 'Nguyen Van Manh', 2001, 'Nam', 'Vinh Phuc');

-- --------------------------------------------------------

--
-- Table structure for table `congnhan`
--

CREATE TABLE `congnhan` (
  `MaCongNhan` int NOT NULL,
  `Bac` int NOT NULL,
  `HoTen` varchar(50) NOT NULL,
  `GioiTinh` varchar(20) NOT NULL,
  `DiaChi` varchar(50) NOT NULL,
  `NamSinh` year NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `congnhan`
--

INSERT INTO `congnhan` (`MaCongNhan`, `Bac`, `HoTen`, `GioiTinh`, `DiaChi`, `NamSinh`) VALUES
(1, 4, 'Ha Quoc Phong', 'Nam', 'Vinh Phuc', 2001),
(2, 4, 'Ha Quoc Phong', 'Nam', 'Vinh Phuc', 2001);

-- --------------------------------------------------------

--
-- Table structure for table `kisu`
--

CREATE TABLE `kisu` (
  `MaKiSu` int NOT NULL,
  `LoaiBang` varchar(50) NOT NULL,
  `NganhDT` varchar(50) NOT NULL,
  `NamSinh` year NOT NULL,
  `GioiTinh` varchar(20) NOT NULL,
  `DiaChi` varchar(50) NOT NULL,
  `HoTen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kisu`
--

INSERT INTO `kisu` (`MaKiSu`, `LoaiBang`, `NganhDT`, `NamSinh`, `GioiTinh`, `DiaChi`, `HoTen`) VALUES
(1, 'Ki Su', 'CNTT', 2001, 'Nam', 'NA', 'Nguyen Van Tan'),
(3, 'Ki Su', 'CNTT', 2001, 'Nam', 'Ha Noi', 'Ha Quoc Phong');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` int NOT NULL,
  `CongViec` varchar(20) NOT NULL,
  `HoTen` varchar(50) NOT NULL,
  `NamSinh` year NOT NULL,
  `GioiTinh` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `DiaChi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `CongViec`, `HoTen`, `NamSinh`, `GioiTinh`, `DiaChi`) VALUES
(1, 'Lap trinh web', 'Ha Quoc Huy', 1998, 'Nam', 'Ha Noi'),
(2, 'CNVB', 'Nguyen Hieu', 1992, 'nam', 'Ninh Binh'),
(66, 'ANTT', 'Nguyen Van Manh', 2001, 'Nam', 'VP'),
(67, 'ANTT', 'Nguyen Van Tan', 2001, 'Nam', 'VP');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`username`, `password`) VALUES
('nhom11', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `canbo`
--
ALTER TABLE `canbo`
  ADD PRIMARY KEY (`MaCB`);

--
-- Indexes for table `congnhan`
--
ALTER TABLE `congnhan`
  ADD PRIMARY KEY (`MaCongNhan`);

--
-- Indexes for table `kisu`
--
ALTER TABLE `kisu`
  ADD PRIMARY KEY (`MaKiSu`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNhanVien`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `canbo`
--
ALTER TABLE `canbo`
  MODIFY `MaCB` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `congnhan`
--
ALTER TABLE `congnhan`
  MODIFY `MaCongNhan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `kisu`
--
ALTER TABLE `kisu`
  MODIFY `MaKiSu` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNhanVien` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
