---
tags: ITP
---
Access the lab
![[account1.png]]
Hier auf "My Account"
![[account2.png]]
Wenn man hier irgendwelche Daten eingibt werden diese in Burp Suite abgefangen:
![[account3.png]]
![[account9.png]]

Unter Proxy HTTP history den login POST finden:
![[account4.png]]

Den Username markieren und an den Intruder senden
![[account8.png]]
Im Intruder --> Payloads dann Sniper Attacke mit der Candidate usernames Liste starten, einer davon ist länger, in diesem steht im Gegensatz zu den anderen "Incorrect password" statt "Invalid username"
![[account7.png]]
Unter Positions den gefundenen Username eingeben und das Passwort zu einer Payload machen:
![[account5.png]]
Dann das selbe wieder machen, Sniper Attack, diesmal mit der gegebenen Liste von Passwörtern

Eines dieser Passwörter hat einen einzigartigen Wert und den Statuscode 302, hier steht auch der Username drin:
![[account6.png]]
Damit dann einloggen und die Aufgabe ist gelöst:
![[account10.png]]

![[account11.png]]