# Design Patterns Overview

This repository contains implementations of various design patterns in Java. Design patterns are solutions to common problems that arise during software development. They provide reusable templates to help solve these problems in a structured and efficient manner.

## Creational Patterns

Creational patterns focus on object creation mechanisms. They abstract the instantiation process, making the system more independent of how its objects are created, composed, and represented.

### Patterns Included:
1. **Factory Method**: 
   - Description: Defines an interface for creating objects, but leaves the choice of its type to the subclasses, thus deferring the instantiation to subclasses.
   - Example(s): Document Factory, GUI Factory

2. **Abstract Factory**:
   - Description: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
   - Example(s): Abstract Window Toolkit (AWT), JDBC Connection Factories

3. **Builder**:
   - Description: Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.
   - Example(s): StringBuilder, DocumentBuilder

4. **Prototype**:
   - Description: Creates new objects by copying an existing object, thus avoiding the overhead of creating new instances through costly instantiation processes.
   - Example(s): Cloning in Java, Serialization and Deserialization

5. **Singleton**:
   - Description: Ensures that a class has only one instance and provides a global point of access to that instance.
   - Example(s): Logger, Configuration Manager

## Structural Patterns

Structural patterns deal with the composition of classes or objects, forming larger structures.

### Patterns Included:
1. **Adapter**:
   - Description: Allows objects with incompatible interfaces to work together by providing a wrapper that converts the interface of one class into another interface that a client expects.
   - Example(s): Legacy Code Integration, Plugging in New Components

2. **Bridge**:
   - Description: Decouples an abstraction from its implementation, allowing the two to vary independently.
   - Example(s): JDBC Driver, GUI Toolkits

3. **Composite**:
   - Description: Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
   - Example(s): File System, GUI Components

4. **Decorator**:
   - Description: Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
   - Example(s): GUI Components, Text Formatting

5. **Facade**:
   - Description: Provides a unified interface to a set of interfaces in a subsystem, thus simplifying the usage of complex systems.
   - Example(s): JDBC API, High-Level API for Complex Libraries

6. **Proxy**:
   - Description: Provides a surrogate or placeholder for another object to control access to it.
   - Example(s): Virtual Proxy, Remote Proxy

## Behavioral Patterns

Behavioral patterns focus on communication between objects, encapsulating patterns of communication.

### Patterns Included:
1. **Chain of Responsibility**:
   - Description: Allows an object to send a command without knowing which object will handle it. It decouples sender and receiver objects and allows multiple objects to handle the request.
   - Example(s): Error Handling, Request Handling

2. **Observer**:
   - Description: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   - Example(s): Event Handling, MVC Frameworks

3. **Mediator**:
   - Description: Defines an object that encapsulates how a set of objects interact, thus promoting loose coupling by keeping objects from referring to each other explicitly.
   - Example(s): Chat Applications, Air Traffic Control Systems

4. **Memento**:
   - Description: Captures and externalizes an object's internal state so that the object can be restored to this state later, without violating encapsulation.
   - Example(s): Undo Mechanism, Checkpoint System

5. **Template Method**:
   - Description: Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
   - Example(s): Sorting Algorithms, Lifecycle Hooks in Frameworks


