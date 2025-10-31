# OOP Lab 4

This lab includes **5 Problems** on Strings, Interfaces, and **Packages**. We count them as Problem 8 to 12 in continuation of Lab 3.

Each problem provides:
- Skeleton Java classes with **TODOs** (do not change method signatures).
- A **self‑checking test** that prints PASS/FAIL.
- A tiny in‑house `Assert` (no external libraries).

---

## How to Compile & Run (packages)
From the repository root:

```bash
# Compile everything into an 'out' folder
javac -d out $(find src -name "*.java")

# Run any test by its fully‑qualified class name:
java -cp out edu.lab.tests.Problem8Test
java -cp out edu.lab.tests.Problem9Test
java -cp out edu.lab.tests.Problem10Test
java -cp out edu.lab.tests.Problem11Test
java -cp out edu.lab.tests.Problem12Test
```

### 8) Text Analyzer (Interfaces + Strings + Packages)
**Goal:** Build a text analyzer using an interface; practice `split`, `length`, `indexOf`, `contains`.

**Packages & files**
- `edu.lab.api.Analyzer`
- `edu.lab.text.SimpleAnalyzer` (implements `Analyzer`)

**Method signatures**
```java
package edu.lab.api;
public interface Analyzer {
    int countWords(String text);
    int countCharacters(String text);
    boolean containsSubstring(String text, String sub);
}
```
```java
package edu.lab.text;
import edu.lab.api.Analyzer;
public class SimpleAnalyzer implements Analyzer {
    public SimpleAnalyzer();
    @Override public int countWords(String text);
    @Override public int countCharacters(String text);
    @Override public boolean containsSubstring(String text, String sub);
}
```

---

### 9) Palindrome Utilities (StringBuffer + Packages)
**Goal:** Practice immutability of `String`, use `StringBuffer.reverse()`; 

**Packages & files**
- `edu.lab.util.PalindromeUtil`

**Method signatures**
```java
package edu.lab.util;
public final class PalindromeUtil {
    private PalindromeUtil() {}
    public static boolean isPalindrome(String text); // ignore case & spaces
    public static String reverse(String text);       // use StringBuffer.reverse()
}
```

---

### 10) Comparable Employee (Interfaces + String compare + Packages)
**Goal:** Implement ordering via `Comparable<T>`; sort by name **case-insensitively**;

**Packages & files**
- `edu.lab.model.Employee` (implements `Comparable<Employee>`)

**Method signatures**
```java
package edu.lab.model;
public class Employee implements Comparable<Employee> {
    public Employee(int id, String name);
    public int getId();
    public String getName();
    @Override public int compareTo(Employee other); // compare by name, case-insensitive
    @Override public String toString();             // "Employee{id=.., name='..'}"
    @Override public boolean equals(Object o);      // consistent with compareTo by name
    @Override public int hashCode();
}
```

---

### 11) Shape API (Interfaces + toString + Packages)
**Goal:** Separate API from implementations; demonstrate polymorphism through an interface and package imports.

**Packages & files**
- `edu.lab.shapes.api.Shape`
- `edu.lab.shapes.impl.Circle`
- `edu.lab.shapes.impl.Rectangle`

**Method signatures**
```java
package edu.lab.shapes.api;
public interface Shape {
    double area();
    double perimeter();
}
```
```java
package edu.lab.shapes.impl;
import edu.lab.shapes.api.Shape;
public class Circle implements Shape {
    public Circle(double radius);
    public double getRadius();
    @Override public double area();
    @Override public double perimeter();
    @Override public String toString(); // "Circle{r=.., area=.., perim=..}"
}
```
```java
package edu.lab.shapes.impl;
import edu.lab.shapes.api.Shape;
public class Rectangle implements Shape {
    public Rectangle(double width, double height);
    public double getWidth();
    public double getHeight();
    @Override public double area();
    @Override public double perimeter();
    @Override public String toString(); // "Rectangle{w=.., h=.., area=.., perim=..}"
}
```

---

### 12) String Search Strategy (Multiple Implementations + Packages)
**Goal:** Two interchangeable search strategies via an interface; practice case-sensitive vs. case-insensitive search and `replace`.

**Packages & files**
- `edu.lab.search.Searchable`
- `edu.lab.search.CaseSensitiveSearch`
- `edu.lab.search.CaseInsensitiveSearch`

**Method signatures**
```java
package edu.lab.search;
public interface Searchable {
    boolean search(String text, String key);
    String replace(String text, String oldWord, String newWord);
}
```
```java
package edu.lab.search;
public class CaseSensitiveSearch implements Searchable {
    public CaseSensitiveSearch();
    @Override public boolean search(String text, String key);          // use indexOf
    @Override public String replace(String text, String oldWord, String newWord);
}
```
```java
package edu.lab.search;
public class CaseInsensitiveSearch implements Searchable {
    public CaseInsensitiveSearch();
    @Override public boolean search(String text, String key);          // toLowerCase both
    @Override public String replace(String text, String oldWord, String newWord); // case-insensitive replace
}
```

---

## Self‑Evaluation
- Compile and run each `ProblemXTest`. 
- If the summary prints **✅ All tests passed!**, your solution meets the spec.
- Do **not** change method signatures; implement the TODOs only.

Good luck!
