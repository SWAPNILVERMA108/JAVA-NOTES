
# 📘✨ **Chapter 2: Operators and Expressions (Java)**

This chapter explains how Java handles:

✅ Arithmetic Expressions
✅ Data Types in Calculations
✅ Increment Operators
✅ Practice Questions

---

## 📌 🔢 **Topic 1: Operator Precedence**

### 📝 **Task**

Evaluate an arithmetic expression using Java.

---

### 💻 **Code**

```java
public class OperatorPrecedence {
    public static void main(String[] args) {

        int a = 6 * 5 - 34 / 2;
        System.out.println(a);

    }
}
```

---

## 📌 🧮 **Topic 2: Data Types in Expressions**

### 📝 **Task**

Understand how different data types behave in calculations.

---

### 💻 **Code**

```java
public class DataTypesInExpressions {
    public static void main(String[] args) {

        byte x = 5;
        int y = 6;
        short z = 8;

        int c = y + z;
        System.out.println(c);

    }
}
```

---

## 📌 🔁 **Topic 3: Increment Operators**

### 📝 **Task**

Demonstrate Pre-Increment and Post-Increment.

---

### 💻 **Code**

```java
public class IncrementOperators {
    public static void main(String[] args) {

        int i = 56;

        System.out.println(i++);
        System.out.println(i);

        System.out.println(++i);
        System.out.println(i);

    }
}
```

---

## 📝📚 **Practice Set – Solution**

### ❓ **Question 1**

Find the value of `x` when:

```
y = 7
x = ++y * 8
```

---

### ❓ **Question 2**

Increment the character `'a'` and print the result.

---

### 💻 **Code**

```java
public class PracticeSet {
    public static void main(String[] args) {

        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        char ch = 'a';
        System.out.println(++ch);

    }
}
```

---

## 🌟✨ Key Takeaways

✔ Java follows operator precedence
✔ Arithmetic results are usually `int`
✔ `++i` increases first, then uses
✔ Characters follow ASCII values


