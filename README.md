# Beautiful-Code
Designprinzipien - Klassen und Funktionen

Aufgabe 1:
Überarbeite den Code nach den SOLID-Prinzipien.

Single Responsibility Principle (SRP):
Extrahiere die Drucklogik aus der Order-Klasse und implementiere sie in einer eigenen Klasse.

Open/Closed Principle (OCP):
Definiere eine Schnittstelle OrderPrinter und erstelle eine einfache Implementierung SimpleOrderPrinter.

Liskov Substitution Principle (LSP):
Implementiere eine detaillierte Druckmethode DetailedOrderPrinter, die die einfache Druckmethode ersetzen kann.

Interface Segregation Principle (ISP):
Definiere eine Schnittstelle OrderRepository und implementiere eine In-Memory-Version InMemoryOrderRepository.

Dependency Inversion Principle (DIP):
Gestalte die OrderManager-Klasse so um, dass sie von den Abstraktionen OrderRepository und OrderPrinter abhängt.
