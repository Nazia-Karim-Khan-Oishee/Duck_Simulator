## Duck Simulator 

The Duck Simulator is a console-based project developed for the **Design Patterns Lab** course. This project incorporates several design patterns, including Adapter, Decorator, Factory, Composite, and Observer. 

## The key components of the Duck Simulator:

### 1. Quackable Interface
We start by defining a `Quackable` interface, which is implemented by various duck classes. These ducks will exhibit different quacking behaviors.

### 2. Goose Adapter
An adapter is created to seamlessly convert a goose into a duck to ensure compatibility.

### 3. Quack Counter Decorator
A decorator is implemented to count the number of quacks made by each duck. This new behavior is achieved by wrapping ducks with a decorator object.

### 4. Duck Factory and Counting Duck Factory
Factories are introduced for creating standard ducks and for creating ducks with the quack counting behavior.

### 5. Composite Pattern with Iterator
To simulate a flock of ducks, we employ the Composite Pattern. This allows us to treat a collection of ducks in the same manner as individual ducks. Additionally, an iterator is used for seamless iteration through the duck collection.

### 6. Real-Time Quacking Observer
An Observer Pattern is implemented to track and observe the quacking behavior of each duck individually.
