 create table user 
    (
    User_Id  Int(11) not null UNIQUE auto_increment, 
    Name Varchar(128),
    user_name varchar(30),
    password varchar(30),
    gender varchar(10), 
    email_id varchar(30),
    address_line1 varchar(30),
    address_line2 varchar(30),
    city varchar(30),
    state varchar(30),
    country varchar(30),
    zipcode int(5),
    mobile int(10)   
    );