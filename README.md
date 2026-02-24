# ☕ Java - Object Oriented Programming Systems (OOPS)

A comprehensive guide and code repository covering the core concepts of **Object-Oriented Programming (OOP)** in Java.

---

## 📌 Table of Contents

- [What is OOP?](#what-is-oop)
- [Core Concepts](#core-concepts)
  - [Class & Object](#class--object)
  - [this Keyword](#this-keyword)
  - [Constructors](#constructors)
  - [Polymorphism](#polymorphism)
- [Inheritance](#inheritance)
- [Packages](#packages)
- [Access Modifiers](#access-modifiers)
- [Encapsulation](#encapsulation)
- [Abstraction](#abstraction)
- [Static Keyword](#static-keyword)
- [Code Examples](#code-examples)
- [Getting Started](#getting-started)

---

## What is OOP?

Object-Oriented Programming is a methodology or paradigm to design a program using **classes** and **objects**. It simplifies software development and maintenance by organizing code around real-world entities.

---

## Core Concepts

### Class & Object

| Concept | Description |
|--------|-------------|
| **Class** | A user-defined data type that defines properties (fields) and behaviors (methods). It does not occupy memory until an object is instantiated. |
| **Object** | A runtime instance of a class. Objects can represent a person, place, or any real-world item, and can operate on both data members and member functions. |

> 💡 When an object is created using the `new` keyword, space is allocated in the **heap**, and the starting address is stored in the **stack memory**.

---

### `this` Keyword

The `this` keyword refers to the **current instance** of the class. It is used to:
- Refer to the current class instance variable
- Pass the current object as a parameter to another method

---

### Constructors

A **constructor** is a special method invoked automatically at the time of object creation. It is used to initialize data members.

**Rules:**
- Same name as the class
- No return type (not even `void`)
- Called only once, at object creation

#### Types of Constructors

| Type | Description |
|------|-------------|
| **Non-Parameterized** | No arguments; called by default at object creation. Java provides a default one if none is defined. |
| **Parameterized** | Takes arguments to initialize objects with specific values. |
| **Copy Constructor** | Initializes an object using another object of the same class (user-defined in Java). |

> 📝 Unlike C++, Java does **not** have a destructor. Java uses an efficient **Garbage Collector** to automatically deallocate memory.

---

### Polymorphism

Polymorphism means **"many forms"** — the ability to present the same interface for different underlying data types.

#### Types of Polymorphism

```
Polymorphism
├── Compile-Time (Static)  → Method Overloading
└── Runtime (Dynamic)      → Method Overriding
```

**1. Compile-Time Polymorphism — Method Overloading**

Having multiple methods with the **same name** but different parameters (type or number).

```java
public void displayInfo(String name) { ... }
public void displayInfo(int age) { ... }
public void displayInfo(String name, int age) { ... }
```

**2. Runtime Polymorphism — Method Overriding**

When a **child class** provides its own implementation of a method already defined in the **parent class**. The method call is resolved at runtime.

```java
class Shape {
    public void area() { ... }
}
class Circle extends Shape {
    public void area(int r) { ... }  // Overrides parent method
}
```

---

## Code Examples

### Student Class
```java
class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
}

public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        s1.getInfo();
    }
}
```

### Polymorphism with Shapes
```java
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
```

---

## Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/bountyhunter12/JAVA-OOPS.git
   ```

2. **Navigate to the project**
   ```bash
   cd JAVA-OOPS
   ```

3. **Compile a Java file**
   ```bash
   javac OOPS.java
   ```

4. **Run the program**
   ```bash
   java OOPS
   ```

---

## 🛠 Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or a terminal

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

---

## Inheritance

Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. It allows you to reuse, extend, or modify attributes and behaviors defined in other classes.

- **Base Class** — the class whose members are inherited
- **Derived Class** — the class that inherits from the base class (specialized version of the base)

#### Types of Inheritance

```
Inheritance
├── Single         → One class inherits one class
├── Hierarchical   → Multiple classes inherit one base class
├── Multilevel     → A class inherits from another derived class
└── Hybrid         → Combination of the above types
```

**1. Single Inheritance**
```java
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}
```

**2. Hierarchical Inheritance**
```java
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
```

**3. Multilevel Inheritance**
```java
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}
class EquilateralTriangle extends Triangle {
    int side;
}
```

**4. Hybrid Inheritance** — A combination of single, hierarchical, and multilevel inheritance.

---

## Packages

A **package** is a group of similar types of classes, interfaces, and sub-packages. Packages can be built-in or user-defined.

- **Built-in packages** — `java`, `util`, `io`, etc.

```java
import java.util.Scanner;
import java.io.IOException;
```

---

## Access Modifiers

Access modifiers control the visibility/accessibility of classes, methods, and variables.

| Modifier | Within Class | Within Package | Outside Package (subclass) | Outside Package |
|----------|:---:|:---:|:---:|:---:|
| **Private** | ✅ | ❌ | ❌ | ❌ |
| **Default** | ✅ | ✅ | ❌ | ❌ |
| **Protected** | ✅ | ✅ | ✅ | ❌ |
| **Public** | ✅ | ✅ | ✅ | ✅ |

```java
package newpackage;

class Account {
    public String name;
    protected String email;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Sample {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.setPassword("abcd");
        a1.email = "hello@apnacollege.com";
    }
}
```

---

## Encapsulation

Encapsulation is the process of combining data and functions into a single unit (class). Data is **not accessed directly** — it is accessed through methods inside the class.

- Class attributes are kept **private**
- **Public getter and setter** methods are provided to access/modify them
- Makes **data hiding** possible — restricting access to internal object details to reduce unintended side effects

---

## Abstraction

Abstraction means hiding unnecessary details and **showing only the essential functionalities** to the user. It helps model real-world problems by focusing on what an object does rather than how it does it.

Abstraction is achieved in two ways:

### 1. Abstract Class

- Declared with the `abstract` keyword
- Can have both abstract and non-abstract methods
- Cannot be instantiated directly
- Can have constructors and static methods
- Can have `final` methods to prevent subclass modification

```java
abstract class Animal {
    abstract void walk();

    void breathe() {
        System.out.println("This animal breathes air");
    }
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
        horse.breathe();
    }
}
```

### 2. Interfaces (Pure Abstraction)

- All fields are `public`, `static`, and `final` by default
- All methods are `public` and `abstract` by default
- A class implementing an interface **must implement all its methods**
- Supports **multiple inheritance**

```java
interface Animal {
    void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}
```

---

## Static Keyword

The `static` keyword can be applied to variables, methods, blocks, and nested classes.

- **Static Variable (Class Variable)** — shared across all instances of the class
- **Static Method (Class Method)** — can be called without creating an object

```java
class Student {
    static String school;
    String name;
}

public class OOPS {
    public static void main(String args[]) {
        Student.school = "JMV";

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Meena";
        s2.name = "Beena";

        System.out.println(s1.school);  // JMV
        System.out.println(s2.school);  // JMV
    }
}
```

> 💡 Since `school` is static, it is shared by all `Student` objects. Changing it once changes it for all instances.

---

