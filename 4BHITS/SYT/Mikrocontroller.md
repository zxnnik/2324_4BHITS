---
tags: SYT
---
Ein Laptop ist ein multifunktionaler Computer, der vielseitige Aufgaben wie Internetzugang, Softwareausführung und Datenverarbeitung ermöglicht. Ein Mikrocontroller ist ein spezialisiertes, eingebettetes System, das für bestimmte Aufgaben wie Sensordatenverarbeitung oder Steuerungsaufgaben optimiert ist. Laptops sind leistungsstark und flexibel, während Mikrocontroller auf spezifische Anwendungen zugeschnitten und ressourceneffizient sind.


CP2102 Treiber aktualisieren

1. Programm:
```c++
#include <Arduino.h>

  

#define LED_PIN_1 18

#define INPUT_PIN 32

#define INPUT_PIN_2 33

  

void setup() {

    pinMode( LED_PIN_1, OUTPUT );

    pinMode( INPUT_PIN, INPUT_PULLDOWN );

    pinMode( INPUT_PIN_2, INPUT_PULLDOWN );

}

  

void loop() {

  if (digitalRead(INPUT_PIN) == HIGH)

  {

    if (digitalRead(INPUT_PIN_2) == HIGH)

    {

      digitalWrite( LED_PIN_1, HIGH );

      delay(750);

      digitalWrite( LED_PIN_1, LOW );

      delay(150);

    } else {

      digitalWrite( LED_PIN_1, HIGH );

    }

  } else {

    digitalWrite( LED_PIN_1, LOW);

  }

}
```

2. Programm:
```c++
#include <Arduino.h>

  

#define INPUT_PIN 25

#define INPUT_PIN_2 33

#define INPUT_PIN_3 35

#define INPUT_PIN_4 34

  

void setup() {

    pinMode( 18, OUTPUT);

    ledcSetup( 0, 144, 8 );

    ledcAttachPin( 18, 0 );

    pinMode(INPUT_PIN, INPUT_PULLDOWN);

    pinMode(INPUT_PIN_2, INPUT_PULLDOWN);

    pinMode(INPUT_PIN_3, INPUT_PULLDOWN);

    pinMode(INPUT_PIN_4, INPUT_PULLDOWN);

    Serial.begin(9600);

}

  

void loop() {

  
  

    if (digitalRead(INPUT_PIN)== HIGH) {

      ledcWrite( 0, 64 );

      Serial.println("OK");

    } else if (digitalRead(INPUT_PIN_2)== HIGH) {

      ledcWrite( 0, 128);

      Serial.println("BRUH");

    } else if (digitalRead(INPUT_PIN_3)== HIGH) {

      ledcWrite( 0, 192 );

      Serial.println("YUH");

    } else if (digitalRead(INPUT_PIN_4)== HIGH) {

      ledcWrite( 0, 255 );

      Serial.println("AIGHT");

    } else {

      Serial.println("NIX");

    }

}
```

3. Programm:
```c++
#include <Arduino.h>

  

void setup() {

    Serial.begin(9600);

    pinMode(36, ANALOG);

    ledcSetup(0, 144, 8);

    ledcAttachPin(18, 0);

}

  

int getValue(int analogValue) {

    return analogValue / 16;

}

  

void loop() {

    Serial.println( analogRead(36));

    ledcWrite(0, getValue( analogRead(36)));

}
```