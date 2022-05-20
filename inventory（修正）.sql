create table public.inventory (
  isbn bigint not null
  , title character varying
  , code integer
  , author character varying
  , publisher character varying
  , publish_date date
  , primary key (isbn)
);
