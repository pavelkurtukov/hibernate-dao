create table persons (
  name varchar(50),
  surname varchar(50),
  age int,
  phone_number varchar(12),
  city_of_living varchar(100),
  constraint "pk_persons" primary key ("name", "surname", "age")
);

insert into persons (name, surname, age, phone_number, city_of_living) values ('Иван', 'Иванов', 35, 9112221100, 'Новосибирск');
insert into persons (name, surname, age, phone_number, city_of_living) values ('Семён', 'Петров', 26, 9001115876, 'Краснодар');
insert into persons (name, surname, age, phone_number, city_of_living) values ('John', 'Smith', 29, 9991236548, 'MOSCOW');