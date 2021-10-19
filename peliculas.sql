-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 19-10-2021 a las 05:17:12
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peliculas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `director`
--

DROP TABLE IF EXISTS `director`;
CREATE TABLE IF NOT EXISTS `director` (
  `iddirector` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) NOT NULL,
  `nacionalidad` varchar(30) NOT NULL,
  PRIMARY KEY (`iddirector`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `director`
--

INSERT INTO `director` (`iddirector`, `nombre`, `nacionalidad`) VALUES
(1, 'Chris Columbus', 'Estadounidense'),
(2, 'Lee Daniels', 'Estadounidense'),
(3, 'Terry Gilliam', 'Estadounidense'),
(4, 'Richard LaGravenese', 'Estadounidense'),
(5, 'Eric Bress', 'Estadounidense'),
(6, 'Barry Sonnenfeld', 'Estadounidense'),
(7, 'Anne Fletcher', 'Estadounidense'),
(8, 'Frank Darabont', 'Franc'),
(9, 'Peter Jackson', 'Neozeland'),
(10, 'George Lucas', 'Estadounidense'),
(11, 'Manoj Nelliyattu Shyamalan', 'Ind&uacute;'),
(12, 'Gabriele Muccino', 'Italiano'),
(13, 'Frank Coraci', 'Estadounidense'),
(14, 'Jean-Pierre Dardenne', 'Belga'),
(15, 'Oliver Hirschbiegel', 'Aleman'),
(16, 'Michael Haneke', 'Aleman'),
(17, 'Don Esphuma', 'Salvadoreño');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

DROP TABLE IF EXISTS `genero`;
CREATE TABLE IF NOT EXISTS `genero` (
  `idgenero` int(11) NOT NULL AUTO_INCREMENT,
  `generopelicula` varchar(30) NOT NULL,
  PRIMARY KEY (`idgenero`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`idgenero`, `generopelicula`) VALUES
(1, 'Acción'),
(2, 'Drama'),
(3, 'Aventuras'),
(4, 'Comedia Rom&aacute;ntica'),
(6, 'Musical'),
(7, 'Familiar'),
(8, 'Infantil'),
(9, 'Suspenso'),
(15, 'Thriller');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
CREATE TABLE IF NOT EXISTS `pelicula` (
  `idpelicula` int(11) NOT NULL AUTO_INCREMENT,
  `titulopelicula` varchar(120) NOT NULL,
  `descripcion` text NOT NULL,
  `titulooriginal` varchar(60) NOT NULL,
  `duracion` varchar(25) NOT NULL,
  `idgenero` int(11) NOT NULL,
  `iddirector` int(11) DEFAULT NULL,
  `imgpelicula` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idpelicula`),
  KEY `fk_genero_pelicula` (`idgenero`),
  KEY `fk_director_pelicula` (`iddirector`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`idpelicula`, `titulopelicula`, `descripcion`, `titulooriginal`, `duracion`, `idgenero`, `iddirector`, `imgpelicula`) VALUES
(1, 'Percy Jackson y el Ladrón del Rayo', 'La historia narra la vida de un estudiante que descubre ser hijo\nde Poseidón, a raíz de esto se ve envuelto en una carrera contra el tiempo para impedir que los dioses\ngriegos inicien una guerra que tiene como campo de batalla el continente americano de hoy en día.', 'Percy Jackson & the Olympians: The lightning thief', '119 min', 1, 1, 'img/pelicula.png'),
(2, 'Precious', 'En Harlem, una adolescente analfabeta con sobre peso, quien adem&aacute;s est&aacute;\nembarazada de su segundo hijo es invitada para inscribirse a una escuela alternativa. Este acontecimiento le da\nesperanzas de que su vida pueda girar en una nueva direcci&oacute;n.', 'Precious: Based on the novel\n\"Push\" by Sapphire', '109 min', 2, 2, NULL),
(3, 'El Imaginario Mundo Del Doctor Parnassus', 'El Doctor Parnassus tiene una inexplicable capacidad de poder\nguiar la imaginaci&oacute;n de los dem&aacute;s, pero a su vez &eacute;l guarda un temible secreto. Adicto al juego,\nmuchos a&ntilde;os atr&aacute;s, apost&oacute; con el demonio, Mr. Nick, juego que lo convirti&oacute; en inmortal.\nPero siglos despu&eacute;s el doctor conoce a su amor verdadero, y vuelve a realizar otro pacto con el diablo, esta vez\nintercambiando su inmortalidad por su juventud, con la &uacute;nica condici&oacute;n que cuando su hija llegase a la\nedad de 16 a&ntilde;os, pasar&iacute;a a ser propiedad del diablo.', 'The Imaginarium Of Doctor\nParnassus', '122 min', 3, 10, NULL),
(4, 'PD. Te Amo', 'La vida de Holly (Hilary Swank) se ve truncada cuando su marido, Gerry (Gerard Butler), muere.\nIncapaz de salir adelante por s&iacute; misma, su madre y sus amigos intentan animarla. Un d&iacute;a, despu&eacute;s\nde su 30 cumplea&ntilde;os, Holly recibe una carta de Gerry anim&aacute;ndola a salir, a divertirse, a seguir adelante.\nCada mes recibir&aacute; una carta firmada con un \"Posdata: Te amo\", que le devolver&aacute;n las ganas de vivir.', 'P.S. I love you', '115 min', 4, 4, NULL),
(5, 'El efecto mariposa', 'Evan Treborn, un joven que se est&aacute; esforzando por superar unos dolorosos\nrecuerdos de su infancia, descubre una t&eacute;cnica que le permite viajar atr&aacute;s en el tiempo y ocupar su\ncuerpo de ni&ntilde;o para poder cambiar el curso de su dolorosa historia. Sin embargo tambi&eacute;n descubre que\ncualquier m&iacute;nimo cambio en el pasado altera enormemente su futuro.', 'The Butterfly Effect', '100 min', 9, 12, NULL),
(6, 'Vacaciones en familia', 'Un ejecutivo preocupado por no perderse unas vacaciones con su familia decide\nllevarlos a vacacionar al mismo lugar donde tendrá una importante reunión de trabajo, pero sin decírselos', 'RV', '98 min', 7, 6, NULL),
(7, 'La propuesta', 'Una poderosa editora llamada Margaret (Sandra Bullock) al enfrentarse ante la posibilidad\nde ser deportada a su país de origen, Canadá, decide comprometerse con su asistente Andrew (Ryan Reynolds) con el\npropósito de evitarlo', 'The proposal', '108 min', 4, 13, NULL),
(8, 'Milagros inesperados', 'La película narra la vida de Paul Edgecomb (Tom Hanks), quien siendo un anciano de\n108 años, cuenta su historia como oficial de la Milla Verde, una penitenciaría del estado de Luisiana, durante la década\nde 1930. Edgecomb cuenta que entre sus presos tuvo un personaje con poderes sobrenaturales, capaz de sanar a\npersonas.', 'The Green Mile', '189 min', 2, 8, NULL),
(9, 'El Hijo', 'Olivier (Olivier Gourmet) es un carpintero belga dedicado a enseñar su oficio a adolescentes conflictivos. Un buen día aparece en su clase Francis (Morgan Marinne), un chico recién salido del reformatorio donde ha cumplido cinco años de condena por homicidio. Entre los dos surgirá una relación marcada por el respeto, la distancia y, sobre todo, por un terrible secreto que comparten sin saberlo.', 'Le fils', '103 min', 2, 14, NULL),
(10, 'El experimento', 'Llegaron buscando una forma rápida de ganar dinero fácil. Ahora sólo buscan la manera de seguir vivos. ?El Experimento? es un viaje de emoción y venganza en un entorno simulado de una prisión, donde el precio de una vida es igual a la habilidad de supervivencia. Todo empezó en nombre de la ciencia. 20 hombres, 2 semanas. La recompensa: 2000 dólares. La investigación: el comportamiento agresivo en un ambiente carcelario simulado. Los jugadores: 8 ?guardianes? y 12 ?prisioneros?. El juego: Se encierra a los prisioneros y se les ordena que sigan las órdenes; los guardias deben mantener el orden. Pero dar a un hombre un poco de poder puede tener consecuencias insospechadas?', 'Das Experiment', '120 min', 9, 15, NULL),
(11, 'La pianista', 'Una mujer, profesora de piano en un conservatorio, frecuenta cines porno y tiendas de sexo para escapar de la influencia de su dominante madre. Uno de sus alumnos se propone seducirla.', 'La Pianiste', '129 min', 2, 16, NULL);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD CONSTRAINT `fk_director_pelicula` FOREIGN KEY (`iddirector`) REFERENCES `director` (`iddirector`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_genero_pelicula` FOREIGN KEY (`idgenero`) REFERENCES `genero` (`idgenero`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
