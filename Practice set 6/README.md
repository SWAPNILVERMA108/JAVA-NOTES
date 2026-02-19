# 📘 Practice Set 6: Arrays in Java

Welcome to **Practice Set 6**! 📦🚀
This practice set helps you strengthen your understanding of **arrays**, **loops**, and **common array-based problems** in Java.

This README contains:

✅ All questions from the practice set
✅ Simple explanations
✅ Clean code snippets
✅ Sample outputs

---

## 📚 Topics Covered

1. Sum of Array Elements
2. Searching an Element in an Array
3. Average of Marks
4. 2D Arrays and Matrix Operations
5. Reverse an Array
6. Maximum Element in an Array
7. Minimum Element in an Array
8. Check if Array is Sorted

---

## 🔢 Question 1: Sum of Array Elements

### ❓ Question

Find the sum of all elements in a float array.

### 💻 Code

```java
float[] num = {98.5f, 97.5f, 85.5f, 92.6f, 96.9f};
float sum = 0;

for (float element : num) {
    sum = sum + element;
}
System.out.println(sum);
```

### 🖥️ Output

```
471.0
```

---

## 🔍 Question 2: Check if an Element is Present

### ❓ Question

Check whether a given number exists in an array.

### 💡 Explanation

A boolean flag is used to track whether the element is found.

### 💻 Code

```java
int[] num = {97, 96, 86, 89, 90};
int no = 96;
boolean isInArray = false;

for (int element : num) {
    if (no == element) {
        isInArray = true;
        break;
    }
}

if (isInArray) {
    System.out.println("The value is present in the array");
} else {
    System.out.println("The value is not present in the array");
}
```

### 🖥️ Output

```
The value is present in the array
```

---

## 📊 Question 3: Average of Marks

### ❓ Question

Calculate the average marks from an array.

### 💻 Code

```java
float[] marks = {89, 83, 81, 89, 99, 56, 67};
float sum = 0;

for (float element : marks) {
    sum = sum + element;
}

float avg = sum / marks.length;
System.out.println(avg);
```

### 🖥️ Output

```
80.57143
```

---

## 🧩 Question 4: 2D Array (Matrix) Traversal

### ❓ Question

Store values in a 2D array and print them in matrix form.

### 💻 Code

```java
int[][] matrix = new int[2][3];

matrix[0][0] = 11;
matrix[0][1] = 12;
matrix[0][2] = 13;

matrix[1][0] = 21;
matrix[1][1] = 22;
matrix[1][2] = 23;

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### 🖥️ Output

```
11 12 13
21 22 23
```

---

## ➕ Question 5: Matrix Addition

### ❓ Question

Add two 2×3 matrices and store the result.

### 💻 Code

```java
int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
int[][] mat2 = {{2, 6, 13}, {3, 7, 1}};
int[][] result = new int[2][3];

for (int i = 0; i < mat1.length; i++) {
    for (int j = 0; j < mat1[i].length; j++) {
        result[i][j] = mat1[i][j] + mat2[i][j];
        System.out.print(result[i][j] + " ");
    }
    System.out.println();
}
```

---

## 🔄 Question 6: Reverse an Array

### ❓ Question

Reverse the elements of an array.

### 💻 Code

```java
int[] arr = {1, 2, 3, 4, 5, 6, 7};
int l = arr.length;
int n = l / 2;
int temp;

for (int i = 0; i < n; i++) {
    temp = arr[i];
    arr[i] = arr[l - 1 - i];
    arr[l - 1 - i] = temp;
}

for (int element : arr) {
    System.out.print(element + " ");
}
```

### 🖥️ Output

```
7 6 5 4 3 2 1
```

---

## 📈 Question 7: Maximum Element in Array

### ❓ Question

Find the maximum value in an array.

### 💡 Tip

Use `Integer.MIN_VALUE` for safety.

### 💻 Code

```java
int[] arr = {3, 6, 89, 90, 97, 34, 56, 90, 88};
int max = Integer.MIN_VALUE;

for (int e : arr) {
    if (e > max) {
        max = e;
    }
}
System.out.println(max);
```

### 🖥️ Output

```
97
```

---

## 📉 Question 8: Minimum Element in Array

### ❓ Question

Find the minimum value in an array.

### 💻 Code

```java
int[] arr = {3, 6, 89, 90, 97, 34, 56, 90, 88};
int min = Integer.MAX_VALUE;

for (int e : arr) {
    if (e < min) {
        min = e;
    }
}
System.out.println(min);
```

### 🖥️ Output

```
3
```

---

## ✅ Question 9: Check if Array is Sorted

### ❓ Question

Check whether an array is sorted in ascending order.

### 💻 Code

```java
int[] arr = {3, 6, 89, 90, 97, 34, 56, 90, 88};
boolean isSorted = true;

for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
    }
}

if (isSorted) {
    System.out.println("Array is sorted");
} else {
    System.out.println("Array is not sorted");
}
```

### 🖥️ Output

```
Array is not sorted
```

---

## 🌟 Summary

After completing **Practice Set 6**, you can:

✅ Work confidently with arrays
✅ Solve common array problems
✅ Use loops effectively with arrays
✅ Handle real interview-level array logic

This practice set builds a strong foundation for **DSA and problem-solving** 💪📊

---

Happy Coding! 😄✨
