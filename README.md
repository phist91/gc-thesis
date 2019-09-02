# Garbage-Collection-Algorithmen und ihre Simulation

In diesem Repository befindet sich meine Masterarbeit **Garbage-Collection-Algorithmen und ihre Simulation**, die ich im Wintersemester 2018/2019 unter Betreuung von [Prof. Dr. Jan Vahrenhold](https://www.uni-muenster.de/Informatik.AGVahrenhold/personen/prof.dr.janvahrenhold/) an der WWU Münster verfasst habe.

### Zusammenfassung
Die vorliegende Arbeit liefert eine Aufarbeitung verschiedener Ansätze für Garbage-Collection-Algorithmen.
Nach einer kurzen Darstellung der zugrunde liegenden Problematik und ihrer praktischen Relevanz sowie der Vor- und Nachteile einer automatischen Speicherverwaltung gegenüber einer manuellen Speicherverwaltung werden gängige Ansätze vergleichend vorgestellt.
Hierbei erfolgt auch eine Beurteilung des Einsatzes und der Eignung in der Praxis.
Als Gütekriterien dienen unter anderem Laufzeitbetrachtungen, Speicherbedarf und entstehende Verzögerungen im Programmablauf, die für ausgewählte Ansätze besonders detailliert untersucht werden.

Weiter wird eine Anwendung entworfen, mit der die Arbeitsweise der diskutierten Garbage-Collection-Ansätze visualisiert werden kann.
Dies umfasst eine angemessene Visualisierung eines beschränkten Speicherbereichs durch eine optische Unterscheidbarkeit belegter Blöcke sowie der einzelnen Arbeitsphasen, die eine Garbage Collection ausführt.
Dabei sind auch unterschiedliche Szenarien auswählbar, etwa verschiedene Speicherfüllstände und eine variable Anzahl bzw. Größe von Objekten, die im Speicher hinterlegt sind.
Nennenswerte Auszüge aus dem Entwurfs- und Implementationsprozess werden detailliert hervorgehoben und erläutert.

### Garbage-Collection-Simulator
Der implementierte Simulator ist in [diesem Repository](https://gitlab.com/phist91/gcsim) zu finden.
Entwicklung und Verwendung des Simulators werden in den Kapiteln 7 und 8 beschrieben.

### Disclaimer
Diese Masterarbeit wurde mit LaTeX unter Verwendung der Vorlage [Clean Thesis](https://github.com/derric/cleanthesis) von Ricardo Langner gesetzt.
Für mehr Informationen siehe [hier](http://cleanthesis.der-ric.de/).

Phil Steinhorst, 2019/04/07
