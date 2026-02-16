# 📘 Practice Set 5: Loops in Java

Welcome to **Practice Set 5**! 🔁🚀
This practice set focuses on mastering **nested loops, patterns, tables, factorials, and summation problems** using Java loops.

This README contains:

✅ All questions
✅ Clear explanations
✅ Code snippets
✅ Sample outputs

---

## 📚 Topics Covered

1. Star Patterns using Nested Loops
2. Sum of Even Numbers
3. Multiplication Tables
4. Reverse Order Tables
5. Factorial using for Loop
6. Factorial using while Loop
7. Pattern using while Loop
8. Sum of a Multiplication Table

---

## ⭐ Question 1: Star Pattern (Decreasing Order)

### ❓ Question

Print the following pattern for `n = 4`:

```
****
***
**
*
```

### 💻 Code

```java
int n = 4;
for (int i = n; i > 0; i--) {
    for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

## 🔢 Question 2: Sum of First N Even Numbers (while loop)

### ❓ Question

Take a number `N` and print the first `N` even numbers and their sum.

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

int i = 0;
int sum = 0;
while (i <= a) {
    i++;
    System.out.println(2 * i);
    sum = sum + (2 * i);
}
System.out.println(sum);
```

### 🖥️ Sample Output (Input: 3)

```
2
4
6
12
```

---

## 📊 Question 3: Multiplication Table

### ❓ Question

Print the multiplication table of a given number.

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();

for (int i = 1; i <= 10; i++) {
    System.out.println(s * i);
}
```

### 🖥️ Sample Output (Input: 5)

```
5
10
15
20
25
30
35
40
45
50
```

---

## 🔄 Question 4: Multiplication Table in Reverse Order

### ❓ Question

Print the multiplication table of a number in reverse order.

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

for (int i = 10; i != 0; i--) {
    System.out.println(a * i);
}
```

---

## 🧮 Question 5: Factorial using for Loop

### ❓ Question

Calculate the factorial of a number using a for loop.

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

int fact = 1;
for (int i = 1; i <= a; i++) {
    fact = fact * i;
}
System.out.println(fact);
```

### 🖥️ Sample Output (Input: 5)

```
120
```

---

## 🔁 Question 6: Factorial using while Loop

### ❓ Question

Calculate factorial using a while loop.

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

int fact = 1;
int i = 1;
while (i < a) {
    i++;
    fact = fact * i;
}
System.out.println(fact);
```

---

## ⭐ Question 7: Star Pattern using while Loop

### ❓ Question

Print a decreasing star pattern using a while loop.

### 💻 Code

```java
int n = 5;
int i = n;
while (i > 0) {
    i--;
    int j = 0;
    while (j < i) {
        j++;
        System.out.print("*");
    }
    System.out.println();
}
```

---

## ➕ Question 8: Sum of Multiplication Table

### ❓ Question

Find the sum of the multiplication table of `8` from `0` to `10`.

### 💻 Code

```java
int a = 8;
int sum = 0;
for (int i = 0; i <= 10; i++) {
    System.out.println(i * a);
    sum = sum + (i * a);
}
System.out.println(sum);
```

---

## 🔢 Question 9: Sum of First N Even Numbers (for loop)

### ❓ Question

Print the first `N` even numbers and their sum using a for loop.

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

int sum = 0;
for (int i = 0; i <= a; i++) {
    System.out.println(2 * i);
    sum = sum + (2 * i);
}
System.out.println(sum);
```

### 🖥️ Sample Output (Input: 4)

```
0
2
4
6
8
20
```

---

## 🌟 Summary

After completing **Practice Set 5**, you can:

✅ Create patterns using nested loops
✅ Work with for and while loops confidently
✅ Solve factorial and summation problems
✅ Handle loop-based logic easily

This practice set strengthens your loop concepts and problem-solving skills 💪💻

---

Happy Coding! 😄✨
