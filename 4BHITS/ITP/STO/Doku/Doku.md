---
tags: ITP
---
OS Metasploitable-Download:
https://sourceforge.net/projects/metasploitable/

Auf "Neu" in VirtualBox:
![[metasploitable1.png]]
Unter Festplatte auf "Eine vorhandene ..." klicken, dann rechts unten auf den Ordner
![[metasploitable2.png]]
dann "Hinzufügen" und die .vmdk-Datei aus dem extrahierten .zip auswählen
![[metasploitable3.png]]

Nach fertigstellen VM starten, warten bis login gefragt wird:
![[metasploitable4.png]]
default-Login und Passwort: "msfadmin"


## Demo zu Penetrationstestung:

ifconfig in Metasploitable um target-IP herauszufinden
![[metasploitable5.png]]
nmap -sV -O 10.0.2.15
msfconsole
![[metasploitable6.png]]
show options
![[metasploitable7.png]]
target host zur Metasploitable-IP setzen
![[metasploitable8.png]]
 dann command "exploit"
 mit command shell commands testen 
![[metasploitable9.png]]