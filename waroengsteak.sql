-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 20, 2016 at 05:41 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `waroengsteak`
--

-- --------------------------------------------------------

--
-- Table structure for table `dipesan`
--

CREATE TABLE IF NOT EXISTS `dipesan` (
  `dipesan_id` int(3) NOT NULL AUTO_INCREMENT,
  `menu_id` int(3) NOT NULL,
  `pesanan_id` int(10) NOT NULL,
  PRIMARY KEY (`dipesan_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `dipesan`
--

INSERT INTO `dipesan` (`dipesan_id`, `menu_id`, `pesanan_id`) VALUES
(1, 7, 1),
(2, 8, 2),
(3, 5, 3),
(4, 7, 4),
(5, 6, 5);

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
  `menu_id` int(3) NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  `jenis` varchar(10) NOT NULL,
  `harga` int(10) NOT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`menu_id`, `nama`, `status`, `jenis`, `harga`) VALUES
(1, 'Sirloin Double', 1, 'Makanan', 21500),
(2, 'Tenderloin Double', 0, 'Makanan', 21500),
(3, 'Steak Waroeng', 1, 'Makanan', 17500),
(4, 'Steak Cumi', 1, 'Makanan', 15000),
(5, 'Lemon Tea', 1, 'Minuman', 8500),
(6, 'Milkshake Chocolate', 0, 'Minuman', 10000),
(7, 'Chicken Gordon Bleu', 1, 'Makanan', 24000),
(8, 'Steak Waroeng', 1, 'Makanan', 26000);

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE IF NOT EXISTS `pengguna` (
  `pengguna_id` int(10) NOT NULL AUTO_INCREMENT,
  `nama` varchar(30) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`pengguna_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`pengguna_id`, `nama`, `jabatan`, `username`, `password`) VALUES
(1, 'Sucipto Kurniawan', 'Staf Bagian Dapur', 'sucipto', 'dapur'),
(2, 'Kartini Hapsari', 'Staf Bagian Minuman', 'kartini', 'minuman'),
(3, 'Fitri Sulaiman', 'Kasir', 'fitri', 'kasir'),
(4, 'Shandy Winata', 'Staf Bagian Depan', 'shandy', 'depan'),
(5, 'Abdul', 'Manajer Outlet', 'abdul', 'manajer'),
(6, 'Sunarno', 'PJ Bagian Depan', 'sunarno', 'pjdepan'),
(7, 'Ridwan Sadikin', 'PJ Bagian Minuman', 'ridwan', 'pjminuman'),
(8, 'Bambang Sudarmo', 'PJ Bagian Dapur', 'bambang', 'pjdapur'),
(9, 'Kiki Tarumanegara', 'Staf Bagian Dapur', 'kiki', 'dapur'),
(10, 'Agus Gunawan', 'Staf Bagian Minuman', 'agus', 'minuman'),
(11, 'Melia Agustia', 'Kasir', 'melia', 'kasir'),
(12, 'Dirga Kurnia', 'Staf Bagian Depan', 'dirga', 'depan');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE IF NOT EXISTS `pesanan` (
  `pesanan_id` int(10) NOT NULL AUTO_INCREMENT,
  `nomor_meja` int(2) NOT NULL,
  `jumlah` int(3) NOT NULL,
  `status` varchar(255) NOT NULL,
  `waktu` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`pesanan_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`pesanan_id`, `nomor_meja`, `jumlah`, `status`, `waktu`) VALUES
(1, 12, 5, 'Sedang diproses', '2016-04-20 12:13:23'),
(2, 12, 3, 'Sedang diproses', '2016-04-20 12:15:19'),
(3, 12, 1, 'Sedang diproses', '2016-04-20 12:17:34'),
(4, 3, 2, 'Sedang diproses', '2016-04-20 12:18:16'),
(5, 3, 1, 'Sedang diproses', '2016-04-20 12:18:16');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
