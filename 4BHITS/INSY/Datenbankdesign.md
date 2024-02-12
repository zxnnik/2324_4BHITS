---
tags: INSY
---
# [Datenbanksysteme](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#datenbanksysteme)

Einteilung:

- Hierarchische DBS
- Netzwerk DBS
- Relationale DBS
- Objektorientierte DBS
- Objektrelationale DBS

## [Drei-Ebenen-Architektur](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#drei-ebenen-architektur)

Weiter Infos unter:  
[https://luo-darmstadt.de/wiki2/doku.php?id=db:datenbanksysteme](https://luo-darmstadt.de/wiki2/doku.php?id=db:datenbanksysteme)

## [Datenbankentwurf](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#datenbankentwurf)

[https://info-wsf.de/datenbankentwurf/](https://info-wsf.de/datenbankentwurf/)

[![dbs02.png](https://github.com/gersto/dbs/raw/main/pic/dbs01.png)](https://github.com/gersto/dbs/blob/main/pic/dbs01.png)

Die 4 Phasen eines Datenbankentwurfs:

- In der **externen Phase** findet eine Zweckbestimmung statt -> Kundenwunsch
- In der **konzeptionellen Phase** erfolgt die formale und strukturierte Beschreibung aller relevanten Objekte und deren Beziehungen untereinander -> **ER-Modell**
- Dieses semantische Modell wird in der **logischen Phase** in ein Relationenmodell (auch **relationales Datenbankmodell**) umgesetzt.
- Erst in der **physischen Phase** wird die Datenbankstruktur mit einem DBMS modelliert.

[![dbs02.png](https://github.com/gersto/dbs/raw/main/pic/dbs02.png)](https://github.com/gersto/dbs/blob/main/pic/dbs02.png)

### [Externe Phase](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#externe-phase)

[https://info-wsf.de/informationsstruktur-ermitteln-externe-phase/](https://info-wsf.de/informationsstruktur-ermitteln-externe-phase/)

- **Top-Down** versus **Bottom-Up**-Ansatz
    
- Ermittlung aufgrund von Realitätsbeobachtungen Erzeugung eines Ausschnitts der realen Welt -> **Miniwelt**
    
    Beispielsweise ist die Schule ein Teil der realen Welt. Unter dem Blickwinkel der Verwaltung von Schülerdaten würde unsere Miniwelt aus den Objekten Schüler, Lehrer, Bücher, Kurse, Noten und deren Beziehungen zueinander bestehen; andere Objekte der Schule, wie Gebäudedaten, Reinigungskosten usw. würden ausgeklammert. Wir bilden deshalb im Hinblick auf die logische Gesamtsicht ein Modell der Miniwelt.
    
- Ermittlung aufgrund von Benutzersichtanalysen  
    Benutzersichten stellen zum Beispiel Formulare und Berichte dar.
    
- Ermittlung aufgrund von Datenbestandsanalysen  
    Dieses Verfahren ermöglicht die Integration existierender Datenbestände in ein neues Datenmodell -> **Migration**
    
- Geschäftsregeln  
    Feststellungen über die Objekte der Miniwelt.
    

### [Konzeptionelle Phase](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#konzeptionelle-phase)

Wie im Datenbankentwurf ausgeführt, ist es zunächst sinnvoll, ein konzeptionelles Modell des gegebenen Problems zu erstellen.

Dabei lassen sich drei Abstraktionsmechanismen unterscheiden:

- **Klassifikation**
- **Aggregation**
- **Generalisierung oder Spezialisierung**

Um die Modellierung der Realität systematischer gestalten zu können, gibt es verschiedene Standardstrategien. Eine der bekanntesten ist das so genannte Entity-Relationship-Modell (ER-Modell). Neben dem ER-Modell gibt es weitere Datenbankmodelle, z.B. das Hierarchische Modell (HM), das Netzwerkmodell (NWM), das Relationenmodell (RM), das SQL-Datenmodell (SQL) oder das Normalformmodell (NFM).

Abstraktionskonzepte:  
Bei der Erstellung eines Datenmodells werden die Objekte und deren Eigenschaften untersucht. Es werden zuerst alle Daten (Objekte) gesammelt. In einem Prozess der Abstraktion werden dann gleichartige Mengen von Objekten zusammengefasst und auf relevante Eigenschaften untersucht. In der Informatik existieren bestimmte Konzepte, nach denen dieser Abstraktionsprozess erfolgt.

#### [Klassifikation](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#klassifikation)

Gleichartige Dinge (Objekte) mit gemeinsamen Eigenschaften werden zu Klassen zusammengefasst.

#### [Aggregation](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#aggregation)

Eine neue Klasse wird aus anderen, bereits existierenden Klassen zusammengesetzt bzw. besteht zum Teil aus Objekten anderer Klassen.

#### [Generalisierung (Verallgemeinerung)](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#generalisierung-verallgemeinerung)

Zwischen bestimmten Klassen wird eine Teilmengenbeziehung hergestellt. Dabei stellt eine Klasse eine Verallgemeinerung der anderen Klasse dar. Zum Beispiel ist die Klasse Tier eine Verallgemeinerung der Klassen Vögel, Reptilien und Säugetiere. Die Eigenschaften der verallgemeinerten Klasse werden den Klassen vererbt, die Teilmengen dieser Klasse sind.

#### [Assoziation](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#assoziation)

Objekte bzw. Klassen können miteinander in Beziehung gesetzt (assoziiert) werden. Diese Beziehung kann zwischen zwei oder mehr Objekten aufgebaut werden.

#### [Identifikation](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#identifikation)

Eigenschaftswerte bzw. Kombinationen von Eigenschaftswerten der Objekte werden als Schlüssel definiert und dienen der eindeutigen Identifizierung des Objekts. Über diese Schlüssel werden die Objekte assoziiert.

### [Beispiele der konzeptionellen Phase](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#beispiele-der-konzeptionellen-phase)

#### [Galerie](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#galerie)

- Eine Galerie kann eindeutig über ihren Namen identifiziert werden, und sie besitzt eine Adresse.
- Eine Galerie präsentiert Ausstellungen, die durch die Angaben ihres Titels eindeutig identifizierbar sind. Außerdem müssen ihr Anfangs- und Enddatum festgehalten werden.
- Eine Ausstellung setzt sich aus mehreren Kunstgegenständen zusammen, die durch eine global eindeutige Registriernummer identifizierbar sind und eine Bezeichnung haben.
- Außerdem soll die Art der Kunstgegenstände gespeichert werden, die entweder „Gemälde“ oder „Skulptur“ (nichts anderes) sein kann.
- Der Name des Künstlers sowie das Jahr der Erschaffung müssen erfasst werden.
- Der Künstler kann in einer Ausstellung mehrere Kunstgegenstände präsentieren.
- Eine Galerie muss (im gesamten erfassten Zeitraum) mindestens eine Ausstellung präsentieren. Eine Ausstellung findet in genau einer Galerie statt.
- Ein Kunstgegenstand ist (im Laufe der Zeit) Bestandteil von beliebig vielen (oder keiner) Ausstellung(en). Eine Ausstellung besteht aus mindestens 5 Kunstgegenstände.

#### [Fuhrpark](https://github.com/gersto/dbs/blob/main/Datenbankdesign.md#fuhrpark)

Die Firma Atlanta GmbH hat einen Fuhrpark von Firmenwägen, die von Mitarbeitern für berufliche Zwecke genutzt werden können. Das Unternehmen möchte die Verwaltung des Fuhrparks, die bislang ausschließlich in Papierform erfolgt, auf eine IT-gestützte Lösung umstellen.

Erstellen Sie aufgrund der folgenden Unterlagen und Anforderungen ein Entity-Relationship-Diagramm.

- Reservierung  
    Mitarbeiter füllen einen Reservierungsvordruck aus. Ein Verantwortlicher des Fuhrparks ordnet der Reservierung dann ein Fahrzeug zu und vermerkt dessen Kennzeichen auf dem Reservierungsvordruck.
    
    [![dbs03.png](https://github.com/gersto/dbs/raw/main/pic/dbs03.png)](https://github.com/gersto/dbs/blob/main/pic/dbs03.png)
    
    Wird ein neues Fahrzeug angeschafft, erfasst die Fuhrparkverwaltung dessen Daten in folgender Tabelle.
    
    [![dbs04.png](https://github.com/gersto/dbs/raw/main/pic/dbs04.png)](https://github.com/gersto/dbs/blob/main/pic/dbs04.png)
    
- Instandhaltung  
    Bei Reparaturen beziehungsweise Wartungsarbeiten an Fahrzeugen sollen Datum, Kilometerstand, Kosten sowie eine kurze Beschreibung in der Datenbank festgehalten werden.
    
- KFZ-Versicherung  
    Als zusätzliche Anforderung sollen auch einige Daten der Kfz-Versicherungen der Fahrzeuge in die Datenbank integriert werden. Verlangt werden jeweils folgende Informationen: die Versicherungsnummer, ob zusätzlich zur Haftpflichtversicherung eine Vollkasko bzw. Teilkasko abgeschlossen wurde, die Höhe des jährlichen Beitrags sowie der Firmenname der jeweiligen Versicherungsgesellschaft, inklusive Postanschrift und Telefonnummer.  
    Es soll auch möglich sein, die Kontaktdaten einer Versicherungsgesellschaft zu erfassen, mit der bisher noch kein Kfz-Versicherungsvertrag abgeschlossen worden ist.  
    Es reicht aus, wenn für jeden Firmenwagen jeweils der aktuelle Vertrag gespeichert werden kann. Eine Historie wird nicht verlangt.

