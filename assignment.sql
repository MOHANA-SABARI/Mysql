create database Bookdb;
use Bookdb;
create table Books (
    title VARCHAR(50),
    author VARCHAR(50),
    genre VARCHAR(50),
    publication_year VARCHAR(50),
    price DECIMAL(5,2)
);
insert into Books values('OnePiece','MOHA','HORROR',2000,100.98);
insert into Books values('Naruto','MILLER','ACTION',2001,199.98);
insert into Books values('Deathnote','VALLAL','THRILLER',2002,299.98);
insert into Books values('Demonslayer','RAKESH','FUNNY',2003,399.98);
insert into Books values('Jujutsukaisan','HARISH','SORROW',2004,499.98);
describe books;
select * from Books;
select * from Books WHERE title='OnePiece';

update Books set price='999.98' where title='Naruto';

delete  from Books WHERE title='Jujutsukaisan';

drop database Bookdb;
drop table Books;
