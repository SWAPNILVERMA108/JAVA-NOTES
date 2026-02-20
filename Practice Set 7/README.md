# 📘 Practice Set 7: Methods & Recursion in Java

Welcome to **Practice Set 7**! 🧠🔁
This practice set focuses on **methods**, **pattern problems**, and **recursion**, which are extremely important for logic building and interviews.

---

## 📚 Topics Covered

1. Method to Print Multiplication Table
2. Star Pattern using Methods
3. Sum of First N Natural Numbers (Recursion)
4. Reverse Star Pattern
5. Fibonacci Series using Recursion

---

## 🔢 Question 1: Multiplication Table using Method

### ❓ Question

Write a method to print the multiplication table of a given number.

### 💻 Code

```java
static void table(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.format("%d * %d = %d\n", n, i, n * i);
    }
}
```

### ▶️ Method Call

```java
table(8);
```

### 🖥️ Output

```
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
8 * 10 = 80
```

---

## ⭐ Question 2: Star Pattern using Method

### ❓ Question

Print the following pattern using a method:

```
*
**
***
****
```

### 💻 Code

```java
static void pattern(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```

### ▶️ Method Call

```java
pattern(4);
```

---

## ➕ Question 3: Sum of First N Natural Numbers (Recursion)

### ❓ Question

Find the sum of first `n` natural numbers using recursion.

### 💡 Logic

```
sum(n) = n + sum(n-1)
```

### 💻 Code

```java
static int sumrec(int n) {
    if (n == 1) {
        return 1;
    }
    return n + sumrec(n - 1);
}
```

### ▶️ Method Call

```java
int result = sumrec(8);
System.out.println(result);
```

### 🖥️ Output

```
36
```

---

## ⭐ Question 4: Reverse Star Pattern

### ❓ Question

Print the following pattern using a method:

```
****
***
**
*
```

### 💻 Code

```java
static void pattern(int n) {
    for (int i = n; i >= 1; i--) {
        for (int j = i; j >= 1; j--) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```

### ▶️ Method Call

```java
pattern(4);
```

---

## 🔁 Question 5: Fibonacci Series using Recursion

### ❓ Question

Find the nth term of the Fibonacci series using recursion.

### 💡 Fibonacci Series

```
0, 1, 1, 2, 3, 5, 8, 13 ...
```

### 💻 Code

```java
static int fib(int n) {
    if (n == 1) {
        return 0;
    } else if (n == 2) {
        return 1;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}
```

### ▶️ Method Call

```java
int result = fib(7);
System.out.println(result);
```

### 🖥️ Output

```
8
```

---

## 🌟 Summary

After completing **Practice Set 7**, you can:

✅ Create and call methods
✅ Solve pattern problems
✅ Understand recursion clearly
✅ Solve Fibonacci and summation problems

This practice set builds **strong logical thinking and recursion skills** 💪🧠

---

Happy Coding! 😄🚀
