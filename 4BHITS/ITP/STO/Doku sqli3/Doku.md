---
tags: ITP
---
https://portswigger.net/web-security/all-labs
![[login1.png]]
In der Aufgabe gibt es eine SQL vulnerability, durch die man sich als administrator anmelden kann
![[login2.png]]
Hier auf "My Account" um zu einem Anmeldefenster zu kommen
![[login3.png]]


Da die Query so etwas wie  ... WHERE username = administrator AND WHERE password = ___ ... ist, kann man durch das Einsetzen von administrator'-- (' beendet den Command, -- kommentiert alles danach aus) in den Username die Passwortanforderung quasi überspringen und sich so einfach als Admin anmelden
![[login4.png]]
Damit ist die Aufgabe gelöst
![[login5.png]]