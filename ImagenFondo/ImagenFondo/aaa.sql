create DATABASE usuarios;

use usuarios;

# creamos la tabla de tipo_usuario

CREATE TABLE `usuarios`.`tipo_usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

INSERT INTO tipo_usuario (nombre) VALUES ('Administrador'), ('Usuario');

# creamos la tabla de usuarios

CREATE TABLE `usuarios`.`usuario` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombreUsuario` VARCHAR(45) NOT NULL,
    `contrasena` VARCHAR(45) NOT NULL,
    `nombre` VARCHAR(45) NOT NULL,
    `correo` VARCHAR(45) NOT NULL,
    `ultima_sesion` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    `idTipoUsuario` INT NOT NULL,
    PRIMARY KEY (`id`),
    INDEX `idTipoUsuario_idx` (`idTipoUsuario` ASC) VISIBLE,
    CONSTRAINT `idTipoUsuario`
      FOREIGN KEY (`idTipoUsuario`)
      REFERENCES `usuarios`.`tipo_usuario` (`id`)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);


SELECT * FROM tipo_usuario;

SELECT * FROM usuario;