INSERT INTO employee VALUES ();INSERT INTO employee VALUES (9784005009350,'�͂��߂Ă̓N�w',1,'���c����','��g�V��','2021-06-21');


CREATE TABLE stock (book_id int PRIMARY KEY,
  isbn bigint,
  title varchar,
  arrival_date DATE,
  discard_date DATE,
  remarks text);
  
  CREATE TABLE rental (rental_id int PRIMARY KEY,
  user_id int,
  book_id int,
  rental_date DATE,
  fixed_date DATE,
  return_date DATE,
  remarks text);
  
  
   CREATE TABLE manager (manager_id int PRIMARY KEY,
  name varchar,
  role varchar);
  
  
drop table manager_table;


  CREATE TABLE CategoryCode (code int PRIMARY KEY,
  category_name varchar
 );
 
 ALTER TABLE manager
ADD password text NULL;
