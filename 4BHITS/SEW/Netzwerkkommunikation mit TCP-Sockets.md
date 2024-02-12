---
tags: SEW
---


TCP ist ein verbindungsorientiertes Protokoll (siehe Gegenstand NWT). Zwischen Client- und Serverprozess wird eine virtuelle Verbindung aufgebaut, über die durch einen bidirektionalen Datenstrom Daten ausgetauscht werden.

Zu den Zweck wird sowohl auf Client- als auch auf Serverseite ein sogenannter “Socket” erstellt.

Ablauf:

![](file:///C:/Users/wollm/AppData/Local/Temp/msohtmlclip1/01/clip_image002.jpg)

Konkrete Implementierung --> siehe Demoprogramm

Damit ein Server mit mehreren Clients gleichzeitig kommunizieren kann, verwendet man Threads.

