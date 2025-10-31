# OOP Lab 3

This lab contains seven self-check problems that reinforce core object-oriented programming concepts in Java. Each problem ships with starter code; complete the missing logic so the provided tests pass.

## Problem Overview

1. **Gradebook** – Manage students, subject marks, averages, and top performers.
2. **Parking Lot** – Track polymorphic vehicle rates, occupancy, and revenue.
3. **Shopping Cart** – Handle products, discounts, and cart totals.
4. **Employees** – Model managers and interns, apply raises, and find the highest-paid employee.
5. **Library** – Manage books, nested borrower data, and active loans.
6. **Banking** – Support deposits, withdrawals, transfers, and account counters.
7. **Zoo** – Use an abstract animal hierarchy with polymorphic behaviors.

---

### 1. Student Gradebook

Design a gradebook that stores student records, calculates averages, and surfaces highest/lowest subject marks.

```java
// Student.java
public class Student {
    public Student(String id, String name);
    public void addSubjectMark(String subject, int mark);
    public double average();
    public String highestSubject();
    public String lowestSubject();
    public String getId();
    public String getName();
    public java.util.Map<String, Integer> getMarksView();
}

// Gradebook.java
public class Gradebook {
    public void addStudent(Student s);
    public Student findById(String id);
    public double classAverage();
    public java.util.ArrayList<Student> topK(int k);
}
```

---

### 2. Smart Parking Lot Simulation

Simulate a parking lot with vehicle-specific rates. Manage vehicle entry/exit, compute fees by duration, and track occupancy plus revenue.

```java
// Vehicle.java
public abstract class Vehicle {
    public Vehicle(String plate, long entryTime);
    public String getPlate();
    public long getEntryTime();
    public abstract double ratePerHour();
}

// Car.java, Bike.java, Truck.java
public class Car extends Vehicle { /* ... */ }
public class Bike extends Vehicle { /* ... */ }
public class Truck extends Vehicle { /* ... */ }

// ParkingLot.java
public class ParkingLot {
    public boolean park(Vehicle v);
    public double leave(String plate, long exitTime);
    public double getRevenue();
    public int getOccupancy();
}
```

---

### 3. Online Shopping Cart

Implement a cart that stores products, supports optional discounts, and reports the total cost.

```java
// Product.java
public class Product {
    public Product(int id, String name, double price);
    public int getId();
    public String getName();
    public double getPrice();
}

// ShoppingCart.java
public class ShoppingCart {
    public void addProduct(Product p);
    public boolean removeProductById(int id);
    public void applyDiscount(double percent);
    public double getTotalCost();
    public int size();
}
```

*(Optional: introduce a `Customer` class that owns a `ShoppingCart`.)*

---

### 4. Employee Management with Inheritance

Model a company that stores employees, differentiates managers and interns, applies raises, and finds the highest-paid employee.

```java
// Employee.java
public abstract class Employee {
    public Employee(String id, String name);
    public String getId();
    public String getName();
    public abstract double getPayment();
    public void raiseByPercent(double pct);
}

// Manager.java, Intern.java
public class Manager extends Employee { /* ... */ }
public class Intern extends Employee { /* ... */ }

// Company.java
public class Company {
    public void add(Employee e);
    public Employee richest();
    public void raiseAll(double pct);
    public int size();
}
```

---

### 5. Library System with Nested Class

Track books, borrowers, and loan status using a nested `Borrower` type. Support lookups by title and list active loans.

```java
// Book.java
public class Book {
    public class Borrower {
        public Borrower(String name, String date);
        public String getName();
        public String getDate();
    }

    public Book(String title, String author);
    public boolean isBorrowed();
    public Book.Borrower getBorrower();
    public void borrow(String name, String date);
    public void giveBack();
    public String getTitle();
    public String getAuthor();
}

// Library.java
public class Library {
    public void add(Book b);
    public Book findByTitle(String title);
    public java.util.ArrayList<Book> borrowedBooks();
}
```

---

### 6. Banking System with Static Variables

Implement bank accounts that support common transactions and maintain a static counter for total accounts created.

```java
// BankAccount.java
public class BankAccount {
    public BankAccount(int accountNumber, String holderName, double openingBalance);
    public void deposit(double amount);
    public boolean withdraw(double amount);
    public boolean transferTo(BankAccount other, double amount);
    public static int getTotalAccounts();
    public double getBalance();
}
```

---

### 7. Zoo Simulation with Abstract Class

Build a zoo that uses an abstract animal hierarchy. Each animal announces its sound, tracks its age, and the zoo can feed and query the collection.

```java
// Animal.java and subclasses
public abstract class Animal {
    public Animal(String name, int age);
    public String getName();
    public int getAge();
    public abstract String makeSound();
}

public class Lion extends Animal { /* ... */ }
public class Elephant extends Animal { /* ... */ }
public class Monkey extends Animal { /* ... */ }

// Zoo.java
public class Zoo {
    public void add(Animal a);
    public void feedAll();
    public Animal oldest();
    public int size();
}
```

---

## How to Run Tests

```bash
cd Problem1_Gradebook
javac *.java
java Problem1Test
```

Repeat for `Problem2Test` through `Problem7Test` in their respective folders.

- Run each `ProblemXTest` class.
- Skeletons compile, but tests will fail until you finish the TODOs.
- Aim for every test to print `PASS` and the final summary `✅ All tests passed!`.
- Submit your implemented code along with the passing test output.
