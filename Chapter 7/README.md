# 📘 Chapter 7: Methods (Functions) in Java

Welcome to **Chapter 7**! ⚙️🧠
This chapter explains how to **create, call, and overload methods** in Java, and how to use **variable arguments (varargs)** for flexible method calls.

---

## 📚 Topics Covered

1. Creating Methods
2. Static vs Non‑Static Methods
3. Calling Methods
4. Method Overloading
5. Call by Value vs Reference (Arrays)
6. Variable Arguments (Varargs)

---

## 📌 Topic 1: Creating a Method

### ❓ What is a Method?

A **method** is a reusable block of code that performs a specific task and runs only when called.

### 💡 Why use methods?

* Avoid code repetition ♻️
* Improve readability 👀
* Easy debugging & maintenance 🛠️

---

## 📌 Topic 2: Static Method Example

### ❓ Question

Create a static method that performs logic on two numbers.

### 💻 Code

```java
static int logic(int x, int y) {
    int z;
    if (x > y) {
        z = x + y;
    } else {
        z = (x + y) * 5;
    }
    return z;
}
```

### ▶️ Method Call

```java
int c = logic(5, 7);
int c1 = logic(2, 1);
```

### 🖥️ Output

```
60
3
```

---

## 📌 Topic 3: Non‑Static Method (Using Object)

### ❓ Question

How do we call a method using an object?

### 💡 Explanation

Non‑static methods require **object creation**.

### 💻 Code

```java
int logic(int x, int y) {
    int z;
    if (x > y) {
        z = x + y;
    } else {
        z = (x + y) * 5;
    }
    return z;
}
```

### ▶️ Method Call

```java
Chapter_7 obj = new Chapter_7();
int c = obj.logic(5, 7);
```

---

## 📌 Topic 4: Method Overloading

### ❓ What is Method Overloading?

Using the **same method name** with **different parameters**.

### 💻 Code

```java
static void foo() {
    System.out.println("Good morning bro!");
}

static void foo(int a) {
    System.out.println("Good morning " + a + " bro!");
}

static void foo(int a, int b) {
    System.out.println("Good morning " + a + " bro!");
    System.out.println("Good morning " + b + " bro!");
}
```

### 🖥️ Output

```
Good morning bro!
Good morning 3000 bro!
Good morning 899 bro!
Good morning 999 bro!
```

---

## 📌 Topic 5: Call by Value vs Reference

### ❓ Question

Why does value not change but array does?

### 💡 Explanation

Java uses **call by value**.

* Primitive types → value copy
* Arrays → reference copy

### 💻 Code

```java
static void change(int a) {
    a = 98;
}

static void change2(int[] arr) {
    arr[0] = 98;
}
```

---

## 📌 Topic 6: Variable Arguments (Varargs)

### ❓ What are Varargs?

Varargs allow a method to accept **any number of arguments**.

### 💻 Code

```java
static int sum(int... arr) {
    int result = 0;
    for (int a : arr) {
        result += a;
    }
    return result;
}
```

### ▶️ Method Calls

```java
sum(4, 5);
sum(4, 5, 3);
sum(2, 4, 6, 8, 9);
sum();
```

### 🖥️ Output

```
9
12
29
0
```

---

## 🧪 Complete Program Output

```
welcome to varargs tutorial
the sum is 4 and 5 is: 9
the sum is 3, 4 and 5 is: 12
The sum of 2, 4, 6, 8 and 9 is : 29
sum of nothing :0
```

---

## 🌟 Chapter Summary

After completing **Chapter 7**, you can:

✅ Create reusable methods
✅ Use static & non‑static methods
✅ Apply method overloading
✅ Understand memory behavior
✅ Use varargs confidently

Methods are the **foundation of clean and professional Java programs** 💻✨

---

Happy Coding! 😄🚀
