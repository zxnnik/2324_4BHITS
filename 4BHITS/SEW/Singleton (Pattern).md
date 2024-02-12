---
tags: SEW
---
Das Entwurfsmuster Singleton stellt sicher, dass von einer Klasse genau ein Objekt existiert.

Implementierung:
```java
public class MySingleton {
	private static MySingleton instance;
	private MySingleton() {
		// ...
	}
	public static synchronized MySingleton getInstance() { // synchronized, falls mehrere Threads
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
	// other methods......
	public int getValue() {
		// ......
	}
}
```

Das Schlüsselwort synchronized stellt sicher, dass der Singleton nur ein Mal instanziiert wird. (threadsicher)

Zugriff aus anderer Klasse: 
```java
MySingleton.getInstance().getValue();
```

Alternative Implementierung mittels enum:
```java
public enum MySingleton {
	INSTANCE;
	public MySingleton getInstance() {
		return INSTANCE;
	}
	// Other methods...
	public int getValue() {
		// ...
	}
}
```

##### Anwendungsbeispiele:
Zugriff auf eine zentrale Login-Funktionalität in eine Datei

Vorsicht: eine Singleton Implementierung sollte sehr sparsam eingesetzt werden, da die Gefahr besteht, quasi ein Äquivalent zu globalen Variablen zu schaffen.
Die Testbarkeit wird darüber hinaus sehr erschwert.