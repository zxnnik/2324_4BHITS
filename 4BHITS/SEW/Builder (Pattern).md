---
tags: SEW
---
https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

Das Bilderentwurfsmuster ist eine Möglichkeit Objekte zu erstellen, es hilft bei der Erstellung unveränderlicher Objekte, die eine große Anzahl an Eigenschaften aufweisen.

Wenn man von einem User-Objekt ausgeht, das 5 `final` Eigenschaften (firstName, lastName, age, phone, address) besitzt, wovon nur firstName und lastName verpflichtend sind, führt das zu einer hohen Anzahl an Konstruktoren (telescoping constructors problem)

Das BuilderPattern bietet eine elegante Lösung, bei der die Unveränderlichkeit der Objekte erhalten bleibt.

```java
public static void main(String[] args) {
	User user1 = new User.UserBuilder("Bart", "Simpson")
	.age(13)
	.phone("1234567")
	.address("Springfield ?")
	.build();

	System.out.println(user1);
}
```

```java
public static void main(String[] args) {
	User user2 = new User.UserBuilder("James", "Bond")
	.age(57)
	.phone("007")
	// no address
	.build();

	System.out.println(user2);
}
```

```java
public static void main(String[] args) {
	User user3 = new User.UserBuilder("Super", "Man")
	// no age, phone or address
	.build();

	System.out.println(user3);
}
```

Die konkrete des UserBuilder findet sich im Projekt BuilderPattern.


