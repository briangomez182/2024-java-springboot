--  Creación de la DB
CREATE DATABASE IF NOT EXISTS movies_db;

--  Usando la DB
USE movies_db;

--  Creación de la Tabla Movies
CREATE TABLE IF NOT EXISTS movies (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    rating DOUBLE,
    awards INT,
    release_date DATETIME(6),
    length INT UNSIGNED,
    genre_id INT UNSIGNED
);

--  Insertando datos en la Tabla Movies
INSERT INTO movies (title, rating, awards, release_date, length, genre_id)
VALUES
('El Padrino', 9.2, 3, '1972-03-15 00:00:00', 175, 2),
('El Laberinto del Fauno', 8.2, 3, '2006-02-28 00:00:00', 118, 5),
('Amores Perros', 8.1, 1, '2000-01-15 00:00:00', 154, 4),
('El Secreto de sus Ojos', 8.5, 2, '2009-09-14 00:00:00', 127, 2),
('Volver', 8.0, 1, '2006-05-20 00:00:00', 121, 1);