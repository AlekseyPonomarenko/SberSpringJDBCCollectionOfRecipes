
drop table IF EXISTS CATEGORYRECEPT;
drop table IF EXISTS RECEPT;
drop table IF EXISTS INGRIDIENT;

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

create table if not exists INGRIDIENT (
    'id' INTEGER PRIMARY KEY AUTOINCREMENT,
    'item' TEXT,
    'count' INTEGER,
    'unit' TEXT,
    'receptId' INTEGER
);







