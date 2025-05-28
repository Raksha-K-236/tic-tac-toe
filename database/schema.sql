CREATE DATABASE tic_tac_toe;

USE tic_tac_toe;

CREATE TABLE game_results (
    id INT AUTO_INCREMENT PRIMARY KEY,
    player1 VARCHAR(100),
    player2 VARCHAR(100),
    winner VARCHAR(100),
    played_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);