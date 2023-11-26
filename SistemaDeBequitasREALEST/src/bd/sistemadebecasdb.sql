CREATE DATABASE IF NOT EXISTS SistemaDeBecasDB;

USE SistemaDeBecasDB;

CREATE TABLE Perfil (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Promedio DECIMAL(4, 2),
    SituacionEconomica VARCHAR(50),
    OrdenDeMerito INT
);

CREATE TABLE Beca (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100)
);

CREATE TABLE Postulante (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Edad INT,
    DNI VARCHAR(20),
    Usuario VARCHAR(50),
    Contra VARCHAR(50),
    Perfil_ID INT,
    FOREIGN KEY (Perfil_ID) REFERENCES Perfil(ID)
);

CREATE TABLE Personal (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Credencial VARCHAR(50) UNIQUE
);

CREATE TABLE Solicitud (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Postulante_ID INT,
    Beca_ID INT,
    FechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    Aprobada BOOLEAN DEFAULT FALSE,
    Estado VARCHAR(50),
    FOREIGN KEY (Postulante_ID) REFERENCES Postulante(ID),
    FOREIGN KEY (Beca_ID) REFERENCES Beca(ID)
);

INSERT INTO Perfil (Promedio, SituacionEconomica, OrdenDeMerito) 
VALUES 
    (15.5, 'Buena', 3),
    (14.2, 'Mala', 8),
    (16.8, 'Regular', 5),
    (13.7, 'Buena', 12);


INSERT INTO Beca (Nombre) 
VALUES 
    ('Beca de Excelencia en Ciencias'),
    ('Beca por bajos recursos'),
    ('Beca de Boxeo'),
    ('Beca de Fútbol');


INSERT INTO Postulante (Nombre, Apellido, Edad, DNI, Usuario, Contra, Perfil_ID) 
VALUES      
    ('Jose', 'Galvez', 20, '12345678', '12345678', '12345', 1),
    ('Ana', 'Flores', 22, '23456789', '23456789', '12345', 2),
    ('Elsa', 'Rodriguez', 25, '34567890', '34567890', '12345', 3),
    ('Pedri', 'Quispe', 18, '45678901', '45678901', '12345', 4);

INSERT INTO Personal (Nombre, Apellido, Credencial) 
VALUES 
    ('Laura', 'García', '72345678'),
    ('Juam', 'Zavaleta', '75845678'),
    ('Jose', 'Campos', '72121258'),
    ('Ana', 'Martinez', '78572963');


