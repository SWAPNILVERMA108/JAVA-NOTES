# 📘 Chapter 6: Arrays in Java

Welcome to **Chapter 6**! 📦🚀
In this chapter, you will learn how to **store multiple values efficiently** using **arrays** in Java, instead of creating many individual variables.

This README includes:

✅ Concepts of arrays
✅ 1D and 2D arrays
✅ Different ways to declare & initialize arrays
✅ Looping through arrays
✅ Sample outputs

---

## 📚 Topics Covered

1. Why Arrays are Needed
2. Declaring Arrays
3. Initializing Arrays
4. Array Length
5. Traversing Arrays (for, for-each)
6. Reverse Traversal
7. 2D Arrays (Matrix)

---

## 📌 Topic 1: Why Do We Need Arrays?

### ❓ Problem

You have marks of **500 students**. How will you store them?

### 💡 Explanation

Two options:

1. Create 500 variables ❌ (Not practical)
2. Use an **array** ✅ (Best approach)

Arrays allow storing **multiple values of the same type** under one name.

---

## 📌 Topic 2: Declaring an Array

### 💻 Code

```java
int[] marks;          // Declaration
marks = new int[5];   // Memory allocation
```

---

## 📌 Topic 3: Initializing an Array

### 💻 Code

```java
marks[0] = 100;
marks[1] = 60;
marks[2] = 70;
marks[3] = 90;
marks[4] = 86;
```

⚠️ Accessing `marks[5]` will cause an **ArrayIndexOutOfBoundsException**.

---

## 📌 Topic 4: Declaration + Initialization Together

### 💻 Code

```java
int[] marks = {98, 45, 79, 99, 80};
```

### 🖥️ Sample Output

```java
System.out.println(marks[4]);
System.out.println(marks.length);
```

```
80
5
```

---

## 📌 Topic 5: Array of Different Data Types

### 💻 Float Array

```java
float[] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
System.out.println(marks[2]);
System.out.println(marks.length);
```

### 💻 String Array

```java
String[] students = {"Swapnil", "Aman", "Harry"};
System.out.println(students[1]);
```

### 🖥️ Output

```
79.5
5
Aman
```

---

## 📌 Topic 6: Traversing an Array (for Loop)

### 💻 Code

```java
int[] marks = {98, 45, 79, 99, 80};

for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

---

## 📌 Topic 7: Reverse Traversal

### 💻 Code

```java
for (int i = marks.length - 1; i >= 0; i--) {
    System.out.println(marks[i]);
}
```

---

## 📌 Topic 8: for-each Loop

### ❓ Why use for-each?

Simpler syntax when you only need values.

### 💻 Code

```java
for (int element : marks) {
    System.out.println(element);
}
```

---

## 📌 Topic 9: 2D Arrays (Matrix)

### ❓ What is a 2D Array?

A 2D array stores data in **rows and columns**.

### 💻 Code

```java
int[][] flats = new int[2][3];

flats[0][0] = 101;
flats[0][1] = 102;
flats[0][2] = 103;

flats[1][0] = 201;
flats[1][1] = 202;
flats[1][2] = 203;
```

---

## 📌 Printing a 2D Array

### 💻 Code

```java
for (int i = 0; i < flats.length; i++) {
    for (int j = 0; j < flats[i].length; j++) {
        System.out.print(flats[i][j] + " ");
    }
    System.out.println();
}
```

### 🖥️ Output

```
101 102 103
201 202 203
```

---

## 🌟 Chapter Summary

After completing **Chapter 6**, you can:

✅ Declare and initialize arrays
✅ Use array length safely
✅ Traverse arrays using loops
✅ Work with 2D arrays

Arrays are a **core foundation** for Data Structures and Algorithms 💪📦

---

Happy Coding! 😄✨
