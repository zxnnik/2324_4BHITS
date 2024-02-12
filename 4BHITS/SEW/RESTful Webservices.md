---
tags: SEW
---
Webservices bieten die Möglichkeit Dienste, die ein Server zur Verfügung stellt, anzusprechen. RESTful Webservices folgen den REST-Grundprinzipien.

<mark style='background:#f7b731'>Eindeutige Definition von Ressourcen</mark>
	z.B.: https://shop.htlhl.at/products/75
<mark style='background:#f7b731'>Verwendung von http Standardmethoden</mark>
	z.B.: GET, POST, PUT, PATCH, DELETE
	Analogie objektorientierte Methode vs RESTful Webservice:
		getUsers() GET https://shop.htlhl.at/users
		updateUsers(int id, User user) PATCH https://shop.htlhl.at/users/{id}
		addUser(User user) POST  https://shop.htlhl.at/users
		deleteUser(int id) DELETE  https://shop.htlhl.at/users/{id}

<mark style='background:#f7b731'>Statuslose Kommunikation</mark>
Bei RESTful Webservices gibt es keinen Sitzungsstatus, der serverseitig gespeichert wird. Stattdessen muss der Kommunikationszustand im Client gespeichert werden.
	<span style='color:#20bf6b'>Vorteile</span>: Neustart des Servers, Skalierbarkeit

![[Pasted image 20230915113804.png]]