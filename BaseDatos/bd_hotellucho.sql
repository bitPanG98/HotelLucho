-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-03-2020 a las 21:09:41
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_hotellucho`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprobante`
--

CREATE TABLE `comprobante` (
  `id_comprobante` int(11) NOT NULL,
  `ruc` int(10) NOT NULL,
  `fecha_venta` varchar(25) NOT NULL,
  `id_huespedes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `comprobante`
--

INSERT INTO `comprobante` (`id_comprobante`, `ruc`, `fecha_venta`, `id_huespedes`) VALUES
(1, 1234567890, '01 - 07 - 2017', 1),
(786767, 1234567890, '22 - 03 - 2020', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consumos`
--

CREATE TABLE `consumos` (
  `Id_consumo` int(11) NOT NULL,
  `fecha_consumo` varchar(25) NOT NULL,
  `concepto_consumo` varchar(50) NOT NULL,
  `descripcion_consumo` varchar(200) NOT NULL,
  `importe_consumo` double NOT NULL,
  `dni_huesped` char(8) NOT NULL,
  `n_habitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `consumos`
--

INSERT INTO `consumos` (`Id_consumo`, `fecha_consumo`, `concepto_consumo`, `descripcion_consumo`, `importe_consumo`, `dni_huesped`, `n_habitacion`) VALUES
(1, '01 - 07 - 2017', 'Productos', 'Condones ', 37.5, '75831041', 1),
(2, '22 - 03 - 2020', 'Productos', 'Cifrut ', 6, '12345678', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_comprobante`
--

CREATE TABLE `detalle_comprobante` (
  `cantidad_dias` int(11) NOT NULL,
  `costo_dia` double NOT NULL,
  `total_pagar` double NOT NULL,
  `id_comprobante` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_comprobante`
--

INSERT INTO `detalle_comprobante` (`cantidad_dias`, `costo_dia`, `total_pagar`, `id_comprobante`) VALUES
(5, 20, 137.5, 1),
(5, 40, 206, 786767);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(11) NOT NULL,
  `nombre_empleado` varchar(50) NOT NULL,
  `apellidos_empleado` varchar(50) NOT NULL,
  `dni_empleado` char(8) NOT NULL,
  `edad_empleado` int(2) NOT NULL,
  `direccion_empleado` varchar(50) NOT NULL,
  `cargo_empleado` varchar(25) NOT NULL,
  `estado_empleado` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `nombre_empleado`, `apellidos_empleado`, `dni_empleado`, `edad_empleado`, `direccion_empleado`, `cargo_empleado`, `estado_empleado`) VALUES
(1, 'Edinson', 'Panta Garcia', '75831041', 18, 'Sullana', 'Administrador', 'Activo'),
(2, 'Roberto', 'Velazquez Herrera', '00000000', 18, 'Trujillo EL alto', 'Recepcionista ', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `numero_habitacion` int(11) NOT NULL,
  `tipo_habitacion` varchar(50) NOT NULL,
  `descripcion_habitacion` varchar(200) NOT NULL,
  `Piso` int(11) NOT NULL,
  `estado_habitacion` varchar(50) NOT NULL,
  `precio_habitacion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`numero_habitacion`, `tipo_habitacion`, `descripcion_habitacion`, `Piso`, `estado_habitacion`, `precio_habitacion`) VALUES
(1, 'Simples', 'una Cama , ducha agua fria , tv scon cable', 1, 'Disponible', 20),
(2, 'Dobles', '2 camas , 2 baños , yaqusi, tv con cable ', 1, 'Disponible', 40),
(3, 'Matrimoniales', '1 cama doble plaza , yaqusi agua fria y caliente,  tv con cable , espejos', 1, 'Ocupada', 60);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `codigo_huesped` int(11) NOT NULL,
  `dni_huesped` char(8) NOT NULL,
  `nombres_huesped` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`codigo_huesped`, `dni_huesped`, `nombres_huesped`) VALUES
(1, '75831041', 'Edinson Panta Garcia'),
(2, '12345678', 'Roberto Velasquez Herrera'),
(5, '555555', 'Kjhj');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `id_huespedes` int(11) NOT NULL,
  `nombre_huesped` varchar(200) NOT NULL,
  `dni_huesped` int(8) NOT NULL,
  `numero_habitacion` int(11) NOT NULL,
  `tipo_habitacion` varchar(50) NOT NULL,
  `precioU_habitacion` float NOT NULL,
  `descripcion_habitacion` varchar(300) NOT NULL,
  `estado_habitacion` varchar(50) NOT NULL,
  `fecha_entrada` varchar(50) NOT NULL,
  `fecha_salida` varchar(50) NOT NULL,
  `dias` int(11) NOT NULL,
  `Pagar_TotalHabitacion` double NOT NULL,
  `estado_pago` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`id_huespedes`, `nombre_huesped`, `dni_huesped`, `numero_habitacion`, `tipo_habitacion`, `precioU_habitacion`, `descripcion_habitacion`, `estado_habitacion`, `fecha_entrada`, `fecha_salida`, `dias`, `Pagar_TotalHabitacion`, `estado_pago`) VALUES
(1, 'Edinson Panta Garcia', 75831041, 1, 'Simples', 20, 'una Cama , ducha agua fria , tv scon cable', 'Ocupada', 'Sat Jul 01 09:08:08 CEST 2017', '06-jul-2017 9:08:07', 5, 100, 'CANCELADO'),
(2, 'Roberto Velasquez Herrera', 12345678, 2, 'Dobles', 40, '2 camas , 2 baños , yaqusi, tv con cable ', 'Ocupada', 'Sat Jul 01 09:08:36 CEST 2017', '06-jul-2017 9:08:35', 5, 200, 'CANCELADO'),
(3, 'Kjhj', 555555, 3, 'Matrimoniales', 60, '1 cama doble plaza , yaqusi agua fria y caliente,  tv con cable , espejos', 'Ocupada', 'Sun Mar 22 15:02:47 COT 2020', '25-mar-2020 15:02:34', 3, 180, ' Por Cancelar ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(10) NOT NULL,
  `nombre_producto` varchar(50) NOT NULL,
  `descripcion_producto` varchar(200) NOT NULL,
  `stock_producto` int(11) NOT NULL,
  `precioU_producto` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre_producto`, `descripcion_producto`, `stock_producto`, `precioU_producto`) VALUES
(1, 'Condones', 'condones piel', 47, 12.5),
(2, 'Cifrut', 'cifrut guarana sabor a naranja', 26, 1.5),
(3, 'Pastillas anticoceptivas', 'Pastillas anticoceptivas', 30, 4.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono`
--

CREATE TABLE `telefono` (
  `numero` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `telefono`
--

INSERT INTO `telefono` (`numero`, `id_empleado`) VALUES
(123456789, 1),
(987654321, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `usuario` varchar(25) NOT NULL,
  `contraseña` varchar(8000) NOT NULL,
  `tipo_usuario` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `usuario`, `contraseña`, `tipo_usuario`) VALUES
(1, 'admin', '44047210810420107506624974438055026627', 'Administrador'),
(2, 'Edinson', '172615877915217560892406575915100721237', 'Administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comprobante`
--
ALTER TABLE `comprobante`
  ADD PRIMARY KEY (`id_comprobante`),
  ADD KEY `id_huespedes` (`id_huespedes`);

--
-- Indices de la tabla `consumos`
--
ALTER TABLE `consumos`
  ADD PRIMARY KEY (`Id_consumo`),
  ADD KEY `dni_huesped` (`dni_huesped`);

--
-- Indices de la tabla `detalle_comprobante`
--
ALTER TABLE `detalle_comprobante`
  ADD KEY `id_comprobante` (`id_comprobante`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`),
  ADD UNIQUE KEY `dni_empleado` (`dni_empleado`),
  ADD UNIQUE KEY `id_empleado` (`id_empleado`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`numero_habitacion`),
  ADD UNIQUE KEY `numero_habitacion` (`numero_habitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`codigo_huesped`),
  ADD UNIQUE KEY `dni_huesped` (`dni_huesped`),
  ADD UNIQUE KEY `codigo_huesped` (`codigo_huesped`);

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`id_huespedes`),
  ADD UNIQUE KEY `numero_habitacion` (`numero_habitacion`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `telefono`
--
ALTER TABLE `telefono`
  ADD UNIQUE KEY `numero` (`numero`),
  ADD UNIQUE KEY `id_empleado` (`id_empleado`),
  ADD UNIQUE KEY `id_empleado_3` (`id_empleado`),
  ADD UNIQUE KEY `id_empleado_4` (`id_empleado`),
  ADD KEY `id_empleado_2` (`id_empleado`),
  ADD KEY `id_empleado_5` (`id_empleado`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comprobante`
--
ALTER TABLE `comprobante`
  MODIFY `id_comprobante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=786768;

--
-- AUTO_INCREMENT de la tabla `consumos`
--
ALTER TABLE `consumos`
  MODIFY `Id_consumo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `numero_habitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `codigo_huesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  MODIFY `id_huespedes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comprobante`
--
ALTER TABLE `comprobante`
  ADD CONSTRAINT `comprobante_ibfk_1` FOREIGN KEY (`id_huespedes`) REFERENCES `huespedes` (`id_huespedes`);

--
-- Filtros para la tabla `detalle_comprobante`
--
ALTER TABLE `detalle_comprobante`
  ADD CONSTRAINT `detalle_comprobante_ibfk_1` FOREIGN KEY (`id_comprobante`) REFERENCES `comprobante` (`id_comprobante`);

--
-- Filtros para la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD CONSTRAINT `huespedes_ibfk_1` FOREIGN KEY (`numero_habitacion`) REFERENCES `habitacion` (`numero_habitacion`);

--
-- Filtros para la tabla `telefono`
--
ALTER TABLE `telefono`
  ADD CONSTRAINT `telefono_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
