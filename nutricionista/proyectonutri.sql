-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-02-2025 a las 22:24:12
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectonutri`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `categoria` enum('Desayuno','Colación','Almuerzo','Merienda','Cena') NOT NULL,
  `calorias` decimal(6,2) NOT NULL,
  `apto_celiacos` tinyint(1) DEFAULT 0,
  `apto_vegetarianos` tinyint(1) DEFAULT 0,
  `contiene_lactosa` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `id` int(11) NOT NULL,
  `dia_dieta_id` int(11) NOT NULL,
  `tipo` enum('Desayuno','Colación','Almuerzo','Merienda','Cena') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida_alimento`
--

CREATE TABLE `comida_alimento` (
  `id` int(11) NOT NULL,
  `comida_id` int(11) NOT NULL,
  `alimento_id` int(11) NOT NULL,
  `cantidad_gramos` decimal(6,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diadieta`
--

CREATE TABLE `diadieta` (
  `id` int(11) NOT NULL,
  `dieta_id` int(11) NOT NULL,
  `numero_dia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `id` int(11) NOT NULL,
  `paciente_id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `altura` decimal(5,2) DEFAULT NULL,
  `peso` decimal(5,2) DEFAULT NULL,
  `condicion` enum('Ninguna','Celiaquía','Vegetariano','Intolerante a la lactosa') DEFAULT 'Ninguna'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`id`),
  ADD KEY `dia_dieta_id` (`dia_dieta_id`);

--
-- Indices de la tabla `comida_alimento`
--
ALTER TABLE `comida_alimento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `comida_id` (`comida_id`),
  ADD KEY `alimento_id` (`alimento_id`);

--
-- Indices de la tabla `diadieta`
--
ALTER TABLE `diadieta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `dieta_id` (`dieta_id`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `paciente_id` (`paciente_id`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimento`
--
ALTER TABLE `alimento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `comida_alimento`
--
ALTER TABLE `comida_alimento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `diadieta`
--
ALTER TABLE `diadieta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comida`
--
ALTER TABLE `comida`
  ADD CONSTRAINT `comida_ibfk_1` FOREIGN KEY (`dia_dieta_id`) REFERENCES `diadieta` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `comida_alimento`
--
ALTER TABLE `comida_alimento`
  ADD CONSTRAINT `comida_alimento_ibfk_1` FOREIGN KEY (`comida_id`) REFERENCES `comida` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `comida_alimento_ibfk_2` FOREIGN KEY (`alimento_id`) REFERENCES `alimento` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `diadieta`
--
ALTER TABLE `diadieta`
  ADD CONSTRAINT `diadieta_ibfk_1` FOREIGN KEY (`dieta_id`) REFERENCES `dieta` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
