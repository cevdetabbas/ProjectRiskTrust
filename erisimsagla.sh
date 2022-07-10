#!/bin/bash
javac aa.java
java aa $1
chmod 700 aa.txt
./erisimsaglafor15minutes.txt
firewall-cmd --reload
firewall-cmd --list-all
sleep 900

javac bb.java
java bb
chmod 700 bb.txt
./bb.txt
