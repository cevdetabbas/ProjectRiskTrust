#!/bin/bash
yum install -y epel-release
yum install -y httpd mariadb mariadb-server php php-mysql phpMyAdmin
yum groupinstall -y "Basic Web Server"
systemctl enable httpd mariadb.service --now
firewall-cmd --permanent --add-service=http
firewall-cmd --permanent --add-service=https
firewall-cmd --permanent --add-service=mysql
firewall-cmd --reload
firewall-cmd --list-all

#mysql_secure_installation
#vim /etc/http/conf.d/phpMyAdmin.conf   u edit et
#database olustur

#/var/www/html in icine
wget https://raw.githubusercontent.com/cevdetabbas/scriptFiles/main/index.html
wget https://raw.githubusercontent.com/cevdetabbas/scriptFiles/main/authentication.php
wget https://raw.githubusercontent.com/cevdetabbas/scriptFiles/main/connection.php