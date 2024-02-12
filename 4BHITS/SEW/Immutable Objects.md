---
tags: SEW
---
## Unveränderliche Objekte
Wenn 2 Threads gleichzeitig versuchen eine Variable zu bearbeiten, wird sie undefiniert. Deshalb muss man sie <span style='color:#f7b731'>threadsicher</span> machen.
Mit immutable objects kann man die Probleme der Threadsicherheit ignorieren.

Der innere Zustand eines unveränderlichen Objekts bleibt immer konstant, nachdem es erzeugt wurde. Damit ist sichergestellt, dass sich unveränderliche Objekte über die gesamte Lebenszeit gleich verhalten.

###### Wie kann eine Unveränderlichkeit erreicht werden?
- keine Settermethoden in der API der Klasse zu Verfügung stellen.
- alle Eigenschaften final und private setzen
- aberben verbieten (Klasse als final deklarieren, keine Subklassen, public final class User...)

###### Beispiele für unveränderliche Klassen
- String
- wrapper-Klassen wie Integer, Long
- Local



###### Vorteile:
- einfach zu testen
- automatisch threadsicher und keine Synchronisationsprobleme, da der innere Zustand nicht verändert werden kann, sehen alle Threads immer das Gleiche
- default clone()-Methode funktioniert, keine eigene Implementierung notwendig

Speziell in Multithread-Umgebungen bieten unveränderliche Objekte den entscheidenden Vorteil der Threadsicherheit.
Webservices beispielsweise sollten immer threadsicher realisiert sein, da viele Clients gleichzeitig darauf zugreifen können.



