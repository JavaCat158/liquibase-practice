create table ORDERS(
                       id bigserial,
                       date date,
                       customers_id int not null,
                       product_name varchar(255),
                       amount int
);

insert into ORDERS(date, customers_id, product_name, amount)
values ('25.01.2024', 4, 'car', 11111111),
       ('25.02.2022', 7, 'travel', 22222222),
       ('25.09.2023', 3, 'product', 2000000),
       ('25.09.2022', 3, 'course_neyology', 33333333),
       ('25.02.2024', 6, 'computer', 444444444),
       ('25.06.2023', 8, 'flat', 55555555),
       ('25.05.2023', 4, 'Hotel', 11111111),
       ('25.02.2022', 2, 'game', 44444444),
       ('25.03.2024', 4, 'Pet cat', 77777777),
       ('25.10.2023', 5, 'Cigarets', 200),
       ('25.01.2022', 1, 'Car', 99999999);