create table CUSTOMERS(
                          id bigserial,
                          name varchar(255) not null ,
                          surname varchar(255) not null,
                          age int,
                          phonenumber int
);

INSERT into CUSTOMERS(name, surname, age, phonenumber)
values  ('Alex', 'Petrov', 33, 456123789),
        ('Petr', 'Alexanddrov', 33, 456123789),
        ('Semen', 'Rozenbaum', 66, 456123789),
        ('Misha', 'Kabazov', 45, 456123789),
        ('Alexey', 'Anisimov', 19, 456123789),
        ('Alex', 'Kononnov', 18, 456123789),
        ('alexey', 'Sanikov', 21, 456123789),
        ('ALEXEY', 'Petrov', 24, 456123789),
        ('Alexandr', 'Chekmarev', 35, 456123789),
        ('Denis', 'Svetlakov', 31, 456123789);