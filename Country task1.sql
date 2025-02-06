create database Country;
show databases;
use Country;
create TABLE CountryDet(Country_id int,Country_name varchar(15),Region_id varchar(2));
ALTER TABLE CountryDet modify Country_id int unique;
insert into CountryDet values (91,'INDIA','IN');
insert into CountryDet values (61,'SINGAPORE','SI');
insert into CountryDet values (54,'MALAYSIA','MS');
select * from CountryDet;
ALTER TABLE CountryDet ADD COLUMN Country_monsoon varchar(10);
select * from CountryDet;
ALTER TABLE countryDet DROP COLUMN Country_monsoon;
desc CountryDet;
select * from CountryDet;

