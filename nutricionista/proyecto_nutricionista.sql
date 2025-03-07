-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-03-2025 a las 21:11:36
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_nutricionista`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `idAlimento` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `categoria` varchar(100) DEFAULT NULL,
  `calorias` decimal(6,2) NOT NULL,
  `aptoCeliacos` tinyint(1) DEFAULT 0,
  `bajoLactosa` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `tipo` enum('manual','automatica') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menudiario`
--

CREATE TABLE `menudiario` (
  `idMenuDiario` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `dia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `edad` int(11) DEFAULT NULL,
  `peso` decimal(5,2) DEFAULT NULL,
  `altura` decimal(4,2) DEFAULT NULL,
  `sexo` enum('hombre','mujer') NOT NULL,
  `objetivo` varchar(50) DEFAULT NULL,
  `vegetariano` tinyint(1) DEFAULT 0,
  `celiaco` tinyint(1) DEFAULT 0,
  `intoleranteLactosa` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglonalimento`
--

CREATE TABLE `renglonalimento` (
  `idRenglonAlimento` int(11) NOT NULL,
  `idRenglonMenu` int(11) NOT NULL,
  `idAlimento` int(11) NOT NULL,
  `cantidad` decimal(6,2) NOT NULL,
  `unidadMedida` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglonmenu`
--

CREATE TABLE `renglonmenu` (
  `idRenglonMenu` int(11) NOT NULL,
  `idMenuDiario` int(11) NOT NULL,
  `tipoComida` enum('desayuno','colacion','almuerzo','merienda','cena') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`idAlimento`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD PRIMARY KEY (`idMenuDiario`),
  ADD KEY `idDieta` (`idDieta`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`);

--
-- Indices de la tabla `renglonalimento`
--
ALTER TABLE `renglonalimento`
  ADD PRIMARY KEY (`idRenglonAlimento`),
  ADD KEY `idRenglonMenu` (`idRenglonMenu`),
  ADD KEY `idAlimento` (`idAlimento`);

--
-- Indices de la tabla `renglonmenu`
--
ALTER TABLE `renglonmenu`
  ADD PRIMARY KEY (`idRenglonMenu`),
  ADD KEY `idMenuDiario` (`idMenuDiario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimento`
--
ALTER TABLE `alimento`
  MODIFY `idAlimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  MODIFY `idMenuDiario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `renglonalimento`
--
ALTER TABLE `renglonalimento`
  MODIFY `idRenglonAlimento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `renglonmenu`
--
ALTER TABLE `renglonmenu`
  MODIFY `idRenglonMenu` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD CONSTRAINT `menudiario_ibfk_1` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `renglonalimento`
--
ALTER TABLE `renglonalimento`
  ADD CONSTRAINT `renglonalimento_ibfk_1` FOREIGN KEY (`idRenglonMenu`) REFERENCES `renglonmenu` (`idRenglonMenu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `renglonalimento_ibfk_2` FOREIGN KEY (`idAlimento`) REFERENCES `alimento` (`idAlimento`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `renglonmenu`
--
ALTER TABLE `renglonmenu`
  ADD CONSTRAINT `renglonmenu_ibfk_1` FOREIGN KEY (`idMenuDiario`) REFERENCES `menudiario` (`idMenuDiario`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
