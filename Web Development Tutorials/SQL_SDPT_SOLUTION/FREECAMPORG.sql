
CREATE DATABASE Music;
USE Music; 

CREATE TABLE Artist (  
	artist_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
	name VARCHAR (255)
);

CREATE TABLE Album ( 
	album_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	title VARCHAR(255), 
	artist_id INT, 

	CONSTRAINT FOREIgn KEY(artist_id) references Artist (artist_id) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE
); 
-- Ang cascade ay parang paghawa, kung magdelete or update ka sa referenece mo pati 
 -- yung table na may foreign key madadamday. 

CREATE TABLE Genre (
	genre_id INT NOT NULL auto_increment primary key, 
	name varchar(255));


create table track 
(	track_id int not null auto_increment primary key,
 	title varchar(255),
 	len int, 
 	rating int,
 	count int, 
	album_id int,
	genre_id int, 
	constraint FOREIGN KEY (album_id) references Album (album_id) 
	ON DELETE CASCADE ON UPDATE CASCADE, 
	constraint foreign key (genre_id) references Genre (genre_id)
	 ON DELETE cascade ON UPDATE CASCADE 
);
INSERT INTO Artist(name) 
VALUES 	('Led Zeppelin'),
	('AC/DC');

INSERT INTO Genre(name) 
VALUES 	('Rock'),
	('Meta');

INSERT INTO Album (title, artist_id) 
VALUES 	('Who Made Who', 2), 
	('IV', 1);   



INSERT INTO track (title, len, rating, count, album_id, genre_id) 
VALUES 	('Black Dog', 297, 5, 0, 2, 1), 
	('Stairway', 482, 5, 0, 2, 1), 
	('About to Rock', 313, 5, 0, 1, 2), 
	('Who Made Who', 207, 5, 0, 1 ,2);


-- JOIN 
SELECT Album.title, Album.artist_id,
	Artist.artist_id, Artist.name from Album 
	JOIN Artist on Album.artist_id = Artist.artist_id; 
 
-- MULTIPLE JOIN
SELECT 
    Track.title AS track_title,
    Album.title AS album_title,
    Genre.name AS genre_name
FROM 
    Track 
JOIN 
    Album ON Track.album_id = Album.album_id 
JOIN 
    Genre ON Track.genre_id = Genre.genre_id;

