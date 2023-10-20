docker --version
docker run hello-world

docker run --name mysql -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mypass --restart unless-stopped mysql:latest
docker run --name mysql -d -p 3307:3306 -e MYSQL_ROOT_PASSWORD=mypass -v mysql:/var/lib/mysql mysql:latest
docker exec -it mysql mysql -p

docker ps -a
docker images
docker stop mysql
docker restart mysql
docker rm mysql
docker rm $(docker ps --filter status=exited -q) 
docker exec -it mysql mysql -u root -p

docker exec -it mysql /bin/bash
mysql -u root -p
show databases
show tables
SELECT host, user FROM mysql.user;
use mysql; 
update user set host='%' where user='root'; flush privileges;

docker run -d --name phpmyadmin --link mysql:db -p 8080:80 phpmyadmin


Question: 
1. consume? produce? How do they work? (in ProductAPI.java)