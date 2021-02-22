
drop table IF EXISTS CATEGORYRECEPT;
drop table IF EXISTS RECEPT;

create table if not exists CATEGORYRECEPT (
    'id' INTEGER PRIMARY KEY AUTOINCREMENT,
    'name' TEXT
);

create table if not exists RECEPT (
    'id' INTEGER PRIMARY KEY AUTOINCREMENT,
    'name' TEXT,
    'categoryReceptID' INTEGER,
    'description' TEXT
);







