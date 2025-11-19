# java-design-patterns
A simple java project to demonstrate GOF Design Pattern usage.

## Implemented Design Patterns

This project implements several Gang of Four (GoF) design patterns, categorized as Creational, Structural, and Behavioral patterns. Each pattern is organized into its own package under `src/main/java/br/com/danilors/`.

### Creational Patterns

These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

*   **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
    *   *Real-life Example*: `ConfigurationManager` - Manages application-wide configuration settings (e.g., log level, database URL) ensuring only one instance exists.
    *   *Location*: `br.com.danilors.singleton`
*   **Factory Method**: Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
    *   *Real-life Example*: `DocumentFactory` - Creates different types of `Document` objects (e.g., `PdfDocument`, `WordDocument`) based on input, abstracting the instantiation logic.
    *   *Location*: `br.com.danilors.factory`
*   **Builder**: Separates the construction of a complex object from its representation so that the same construction process can create different representations.
    *   *Real-life Example*: `MealBuilder` - Constructs complex `Meal` objects (e.g., vegetarian, non-vegetarian) step-by-step, allowing different representations with the same construction process.
    *   *Location*: `br.com.danilors.builder`
*   **Prototype**: Specifies the kind of objects to create using a prototypical instance, and creates new objects by copying this prototype.
    *   *Real-life Example*: `ShapeCache` - Stores and clones various `Shape` objects (e.g., `Circle`, `Rectangle`) to avoid costly re-creation of objects.
    *   *Location*: `br.com.danilors.prototype`

### Structural Patterns

These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

*   **Adapter**: Converts the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
    *   *Real-life Example*: `MediaAdapter` - Adapts an `AdvancedMediaPlayer` (e.g., MP4, VLC players) to work with a standard `MediaPlayer` interface.
    *   *Location*: `br.com.danilors.adapter`
*   **Bridge**: Decouples an abstraction from its implementation so that the two can vary independently.
    *   *Real-life Example*: `RemoteControl` - Operates different `Device`s (e.g., `TvDevice`, `RadioDevice`) independently, allowing variations in both remote controls and devices.
    *   *Location*: `br.com.danilors.bridge`
*   **Composite**: Composes objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
    *   *Location*: `br.com.danilors.composite`
*   **Decorator**: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
    *   *Real-life Example*: `Beverage` and `CondimentDecorator` - Adds condiments (e.g., `Milk`, `Sugar`) to a `Beverage` (e.g., `Espresso`, `HouseBlend`) dynamically.
    *   *Location*: `br.com.danilors.decorator`
*   **Facade**: Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
    *   *Real-life Example*: `HomeTheaterFacade` - Simplifies the complex operations of a home theater system (e.g., `Amplifier`, `Tuner`, `DvdPlayer`) into a single, easy-to-use interface.
    *   *Location*: `br.com.danilors.facade`
*   **Flyweight**: Uses sharing to support large numbers of fine-grained objects efficiently.
    *   *Real-life Example*: `TreeFactory` - Creates and manages `TreeType` objects (e.g., `OakTreeType`, `PineTreeType`), sharing common intrinsic state to render a large `Forest` efficiently.
    *   *Location*: `br.com.danilors.flyweight`
*   **Proxy**: Provides a surrogate or placeholder for another object to control access to it.
    *   *Location*: `br.com.danilors.proxy`

### Behavioral Patterns

These patterns are concerned with algorithms and the assignment of responsibilities between objects.

*   **Chain of Responsibility**: Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. It chains the receiving objects and passes the request along the chain until an object handles it.
    *   *Real-life Example*: `SupportTicketHandler` - Processes different types of support requests (e.g., technical, billing, general) by passing them along a chain of handlers until one can handle it.
    *   *Location*: `br.com.danilors.chainofresponsibility`
*   **Command**: Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
    *   *Real-life Example*: `RemoteControl` - Executes various `Command` objects (e.g., `LightOnCommand`, `LightOffCommand`) on a `Light` (receiver), decoupling the invoker from the receiver.
    *   *Location*: `br.com.danilors.command`
*   **Interpreter**: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
    *   *Real-life Example*: `ProductFilterInterpreter` - Interprets product filter criteria (e.g., "red AND large", "expensive OR new") to filter products based on their attributes.
    *   *Location*: `br.com.danilors.interpreter`
*   **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
    *   *Location*: `br.com.danilors.iterator` (Existing pattern)
*   **Mediator**: Defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
    *   *Real-life Example*: `Chatroom` - Facilitates communication between multiple `User`s (colleagues) in a chat application, centralizing communication logic.
    *   *Location*: `br.com.danilors.mediator`
*   **Memento**: Captures and externalizes an object's internal state without violating encapsulation, so that the object can be restored to this state later.
    *   *Location*: `br.com.danilors.memento` (Existing pattern)
*   **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
    *   *Real-life Example*: `WeatherStation` - Notifies multiple `WeatherObserver`s (e.g., `CurrentConditionsDisplay`) about changes in weather data (temperature, humidity).
    *   *Location*: `br.com.danilors.observer`
*   **State**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
    *   *Location*: `br.com.danilors.state` (Existing pattern)
*   **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
    *   *Location*: `br.com.danilors.strategy` (Existing pattern)
*   **Template Method**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
    *   *Real-life Example*: `BeveragePreparation` - Defines the steps for preparing a beverage, allowing subclasses like `CoffeePreparation` and `TeaPreparation` to implement specific steps.
    *   *Location*: `br.com.danilors.templatemethod`
*   **Visitor**: Represents an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
    *   *Real-life Example*: `DocumentVisitor` - Processes different `DocumentPart`s (e.g., `Title`, `Paragraph`, `Image`) to perform operations like `DocumentRenderer` or `HtmlExportVisitor`.
    *   *Location*: `br.com.danilors.visitor`

## Project Structure

The design patterns are organized into individual packages within the `src/main/java/br/com/danilors` directory. Each package contains the necessary classes and interfaces to demonstrate the respective pattern.

Unit tests for each pattern are located in `src/test/java/br/com/danilors/` following the same package structure.
