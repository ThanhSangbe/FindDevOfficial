
use finddevdb;

create table employer(
id int not null auto_increment primary key,
title nvarchar(250),
address nvarchar(250),
country nvarchar(100),
logo nvarchar(100)
);
insert into employer (title,address,country,logo) values ('TIKI','Ho Chi Minh City','Viet Nam','tiki.png');
insert into employer (title,address,country,logo) values ('SHOPEE','Ho Chi Minh City','Viet Nam','shopee.png');
create table job(
id int not null auto_increment primary key,
title nvarchar(100)
);
insert into job(title) values('Back end');
insert into job(title) values('Front end');
insert into job(title) values('Software Enginer');
insert into job(title) values('Full stack');
insert into job(title) values('Android');
insert into job(title) values('Tester');
create table candidate(
id int not null auto_increment primary key,
fullname nvarchar(250),
major nvarchar(250),
email nvarchar(250),
phone varchar(10),
cv nvarchar(250),
address nvarchar(250),
logo nvarchar(100),
id_job int,
constraint fk_em foreign key (id_job) references job(id)
);
insert into candidate(fullname,major,email,phone,address,logo,id_job) values ('Phạm Thanh Sang','Khoa học máy tính','1954112073sang@ou.edu.vn','039295863','Ho Chi Minh City','male',1);
insert into candidate(fullname,major,email,phone,address,logo,id_job) values ('Nguyễn Văn A','Công nghệ thông tin','a.nguyenvan@gmail.com','0796742429','Ha Noi',null,3);

create table tinTuyenDung(
id int not null auto_increment primary key,
title nvarchar(500),
descrip nvarchar(1000),
Skils nvarchar(250),
experience nvarchar(250),
salary bigint,
startdate date,
id_employer int,
id_job int,
constraint fk_emk foreign key (id_employer) references employer(id),
constraint fk_job foreign key (id_job) references job(id)
);
insert into tinTuyenDung(title,descrip,Skils,experience,salary,startdate,id_employer,id_job) values
('Lập trình viên Full stack', 'Phát triển các tính năng hướng tới người dùng mới bằng cách sử dụng Javascript và 
ReactJS để đáp ứng một số lượng lớn người dùng.<br>
Xây dựng các thành phần có thể tái sử dụng và thư viện front-end để sử dụng trong tương lai<br>
Xây dựng ứng dụng web','NodeJS, ReactJS, Java','Fresher',1000,'2021-11-22',1,4);
insert into tinTuyenDung(title,descrip,Skils,experience,salary,startdate,id_employer,id_job) values
('NHÂN VIÊN TESTER', 'Đọc hiểu các tài liệu đặc tả hệ thống, yêu cầu nghiệp vụ, tài liệu thiết kế liên quan.<br>
Xây dựng kịch bản kiểm thử (Testcase).<br>
Thực hiện Test sản phẩm của công ty.<br>
Tham gia lập các bộ tài liệu test: Quy trình test, Testplan, Test Point.<br>
Nghiên cứu và cập nhật các công cụ test và kiến thức mới hỗ trợ cho công việc.<br>
Đề xuất cải tiến quy trình test.<br>
Thực hiện tốt các công việc khác khi được giao.','QA,QC','Junior',1000,'2021-10-10',2,6);
create table donTuyenDung(
id int not null auto_increment primary key,
id_candidate int,
id_employer int,
datestart date,
id_job int,
constraint fk_em_id foreign key (id_employer) references employer(id),
constraint fk_cank foreign key (id_candidate) references candidate(id),
constraint fk_jobk foreign key (id_job) references job(id)
);
use finddevdb; 
update employer set slogan = "Trang mua sắm uy tín - Tiki giao hàng nhanh 2 giờ" where id = 1;
update employer set slogan = "Gì cũng có mua hết ở Shopee" where id = 2;
use finddevdb;
create table accounts(
id int primary key auto_increment,
nickname varchar(150),
pass varchar(150),
category_accounts int
);
alter table candidate add id_acc int;
alter table candidate add constraint fk_idacc foreign key (id_acc) REFERENCES accounts(id);
alter table accounts add constraint cate check(category_accounts>=0 and category_accounts<=1);
