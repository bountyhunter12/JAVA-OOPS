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

