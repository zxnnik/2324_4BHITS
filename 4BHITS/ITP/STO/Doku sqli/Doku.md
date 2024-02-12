---
tags: ITP
---
https://portswigger.net/web-security/sql-injection öffnen
![[sqli1.png]]
 Dann unter "Examples of SQL Injection" auf "Retrieving hidden data"
 ![[sqli2.png]]
dann hier drauf klicken
![[sqli3.png]]
Dann "Access the lab"
![[sqli4.png]]

Potentiell anmelden, dann kommt die Aufgabenseite:
![[sqli5.png]]


in Burp Suite value vom Parameter category zu '+OR+1=1-- ändern um die Query wie in der Aufgabe beschrieben zu konfigurieren
![[sqli6.png]]
So werden nun auch unreleased Produkte angezeigt
![[sqli7.png]]
