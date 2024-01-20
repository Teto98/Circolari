-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2024 at 03:49 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `circolari`
--

-- --------------------------------------------------------

--
-- Table structure for table `circolare`
--

CREATE TABLE `circolare` (
  `id` int(11) NOT NULL,
  `titolo` text NOT NULL,
  `descrizione` text NOT NULL,
  `data` text NOT NULL,
  `tipo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `circolare`
--

INSERT INTO `circolare` (`id`, `titolo`, `descrizione`, `data`, `tipo`) VALUES
(1, 'Prova', 'provetta', '5 maggio', 'docente'),
(2, 'Prova forse', 'provetta2', '6 maggio', 'docente'),
(4, 'Prova 3', 'ci spero', '7 maggio', 'studente');

-- --------------------------------------------------------

--
-- Table structure for table `utente`
--

CREATE TABLE `utente` (
  `id` int(11) NOT NULL,
  `nome` text NOT NULL,
  `cognome` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `tipo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `utente`
--

INSERT INTO `utente` (`id`, `nome`, `cognome`, `email`, `password`, `tipo`) VALUES
(1, 'Marco', 'Antonio', 'marco.antonio@gmail.com', 'antonio', 'studente'),
(2, 'Stefano', 'Giardina', 'stefano.giardina@gmail.com', 'giardina', 'amministratore'),
(3, 'Mattia', 'Ruo', 'mattia.ruo@gmail.com', 'ruo', 'docente'),
(4, 'Simone', 'Galimberti', 'simone.galimberti@gmail.com', 'galimberti', 'personale_presidenza');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `circolare`
--
ALTER TABLE `circolare`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `circolare`
--
ALTER TABLE `circolare`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `utente`
--
ALTER TABLE `utente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
