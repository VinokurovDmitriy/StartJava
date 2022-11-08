CREATE DATABASE jaegers;
connect jaegers
CREATE TABLE jaegers(
id SERIAL PRIMARY KEY,
model_name text,
mark text,
height integer,
weight float,
status text,
origin text,
launch date,
kaiju_kill integer
);

