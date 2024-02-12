---
tags: INSY
---
Installation von postgresql mittels '<span style='color:#2d98da'>apt install postgresql -y</span>'

Erstellung des superusers mittels '<span style='color:#2d98da'>CREATE ROLE superuser WITH CREATEROLE CREATEDB LOGIN PASSWORD 'password';</span>'

 b) User der Datenbanken anlegen, befüllen und auslesen kann
 Erstellen des Users mittels '<span style='color:#2d98da'>CREATE ROLE crwUser WITH CREATEDB;</span>'
SELECT Rechte für User:
![[Pasted image 20230926125407.png]]
Fürs Schreiben:
![[Pasted image 20230926125607.png]]

c) User der nur in einer Datenbank Daten auslesen kann

![[Pasted image 20230926130020.png]]


-) versuchen Sie unter Windows mit dem psql-Kommando auf Daten unter Linux zuzugreifen

Beim Starten von postgresql: IP-Adresse vom Linux-Server als host angeben:
psql -h 10.0.2.15 -u postgres

-) versuchen Sie unter Linux mit dem psql-Kommando auf Daten unter Windows zuzugreifen

Bei Starten von postgresql: IP-Adresse vom Windows-Host als host angeben:
psql -H 192.168.XX.XX -U postgres
