Sql Fundamentals

create database information;

use information;
create table infos(
	reg int default 1,
    name varchar(30),
    dob varchar(30),
    dept varchar(30)
    );
    
describe info;
select *from infos;

insert into infos values(1,'yk','2002-3-30','ece');
insert into infos values (2,'kumar','2002-4-4','ece'),(3,'sunil','2002-3-7','cse');
alter table info modify name varchar(30) not null;
truncate infos;
alter table info add column phone int;
update  info set phone =93601 where reg=2;
delete  info from  phone;
delete from info where reg=1;
insert into info values(4,'yogesh','2020-3-2','eee',987655432);
select * from info where name like 's%';   
insert into info values(5,'sunil','2002-3-9','cse',987665875);
update  infos set name='yk' where name='345';
show index from info;
create table address(
door int,
street varchar(30),
pincode int);
describe address;
truncate address;
select*from address;
insert into address values (1,'muthur',638106);
insert into address values (2,'thottiya palayam',638144);																																				
insert into address values (3,'tiruppur',638105);
select * from info right join address on info.reg<>address.door;
select info.name,info.dob,info.dept,address.pincode from info left join address on info.reg<>address.pincode;
drop table info;