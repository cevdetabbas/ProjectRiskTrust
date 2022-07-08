#!/bin/bash
javac erisimsaglafor15minutes.java
java erisimsaglafor15minutes $1
chmod 700 erisimsaglafor15minutes.txt
./erisimsaglafor15minutes.txt
firewall-cmd --reload
firewall-cmd --list-all
sleep 1900

javac erisimisonlandirattheendofthe15minutes.java
java erisimisonlandirattheendofthe15minutes
chmod 700 erisimisonlandirattheendofthe15minutes.txt
./erisimisonlandirattheendofthe15minutes.txt
firewall-cmd --reload
firewall-cmd --list-all