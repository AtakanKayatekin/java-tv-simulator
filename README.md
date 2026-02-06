Java Console TV Simulator

This project is a console-based Java application that simulates the behavior of a television.
It was developed as part of my Java learning process to practice object-oriented programming principles, user input handling, and state management.

Project Goals

The main goals of this project are:

To practice Object-Oriented Programming (OOP) concepts in Java

To understand stateful objects and how their internal state evolves

To implement user-driven control flow using loops and conditional logic

To work with encapsulation, getters/setters, and validation logic

Features

The application allows the user to:

Turn the TV on and off

Change the channel

Adjust the volume

Adjust the brightness

View the current TV state at any time

All operations are validated to prevent invalid states (e.g., negative volume or invalid channels).

Project Structure
ProgettoTelevisore/
│
├── Main.java        → Entry point, handles user interaction and menu logic
└── Televisore.java  → Core TV model with state, validation, and behavior

Technologies Used

Java (Standard Edition)

Console I/O (Scanner)

Object-Oriented Design

How to Run

Compile:

javac ProgettoTelevisore/*.java


Run:

java ProgettoTelevisore.Main

Design Overview

Televisore class encapsulates the internal state:

isSpento

volume

luminosita

canale

State changes are controlled via setter methods with validation logic.

Main class acts as the controller layer:

Displays menu

Reads user input

Invokes behavior on the Televisore object

This separation allows clean responsibility boundaries between logic and interaction.

Learning Outcomes

Through this project, I practiced:

Designing stateful objects

Writing defensive setters

Implementing menu-driven programs

Structuring small-scale Java applications cleanly

Possible Improvements

Add persistence (save/load TV state)

Add remote control abstraction

Add unit tests

Replace console UI with GUI

Author

Developed by Atakan as part of Java learning journey.