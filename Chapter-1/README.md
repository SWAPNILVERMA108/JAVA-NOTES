# 📘 Chapter 1: Percentage Calculator in Java

This chapter introduces **basic input, output, and calculations** in Java using the `Scanner` class. It helps beginners understand how to take user input and perform simple arithmetic operations.

---

## ✅ Topic: Taking User Input and Calculating Percentage

### 📌 Description

In this program, we learn about:

* Using `Scanner` for user input
* Reading float values
* Performing arithmetic calculations
* Calculating percentage
* Displaying output

---

## 📝 Practice Question

### Question

Write a Java program to take marks of five subjects from the user and calculate the percentage.

The program should:

* Accept marks using `Scanner`
* Calculate total marks
* Find percentage
* Display the result

---

## 💻 Source Code

```java
import java.util.Scanner;

public class Chapter_1 {

    public static void main(String[] args) {
        
        System.out.println("Taking marks From the User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of sub 1 :");
        float a = sc.nextFloat();

        System.out.println("Enter marks of sub 2 :");
        float b = sc.nextFloat();

        System.out.println("Enter marks of sub 3 :");
        float c = sc.nextFloat();

        System.out.println("Enter marks of sub 4 :");
        float d = sc.nextFloat();

        System.out.println("Enter marks of sub 5 :");
        float e = sc.nextFloat();

        float percentage = ((a + b + c + d + e) * 100) / 500;

        System.out.println("Percentage is : ");
        System.out.println(percentage);

    }
}
```

---

## 📖 Explanation

### ▶️ 1. Using Scanner for Input

The `Scanner` class is used to take input from the user.

```java
Scanner sc = new Scanner(System.in);
```

It allows us to read values from the keyboard.


### ▶️ 2. Reading Marks

We use `nextFloat()` to take decimal values:

```java
float a = sc.nextFloat();
```

This is useful when marks can have decimal points.

---

### ▶️ 3. Percentage Formula

Total marks = a + b + c + d + e
Maximum marks = 500

Formula:

```
Percentage = (Total Marks × 100) / 500
```

---

### ▶️ 4. Displaying Output

We use `System.out.println()` to show results:

```java
System.out.println(percentage);
```

---

## 📤 Sample Output

```
Taking marks From the User
Enter marks of sub 1 :
78
Enter marks of sub 2 :
82
Enter marks of sub 3 :
75
Enter marks of sub 4 :
80
Enter marks of sub 5 :
85
Percentage is :
80.0
```

---

## ⭐ Key Points

* `Scanner` is used for taking input
* `nextFloat()` reads decimal numbers
* Percentage formula is important
* Output is displayed using `println()`

---

## 🚀 Summary

This program helps beginners understand how to take input from users and perform basic calculations in Java. It is a foundation for many real-world programs like result systems and grading applications.

Practice this program to improve your basics.

---

Happy Coding! 😄💻
