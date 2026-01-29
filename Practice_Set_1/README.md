# 📘 Practice Set 1: Basic Input and Output in Java

This practice set focuses on **basic programs using the Scanner class**. It is designed to help beginners practice user input, calculations, and simple logic in Java.

---

## ✅ Topic: User Input, Calculations, and Data Handling

### 📌 Description

In this practice set, we learn about:

* Taking integer, float, and string input
* Performing basic calculations
* Writing clean and reusable code
* Using one `Scanner` object efficiently
* Improving program readability

Each question is written in an organized and beginner-friendly way.

---

## 📝 Practice Questions

### Question 1

Write a Java program to take three integers from the user and print their sum.

### Question 2

Write a Java program to take marks of three subjects and calculate the CGPA.

### Question 3

Write a Java program to take the user’s name and print a greeting message.

### Question 4

Write a Java program to convert kilometers into miles.

### Question 5

Write a Java program to check whether the entered value is an integer or not.

---

## 💻 Improved Source Code

```java
import java.util.Scanner;

public class PracticeSet1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- Question 1 ----------------
        // Sum of Three Numbers

        System.out.println("\n--- Question 1: Sum of Three Numbers ---");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println("Sum of three numbers: " + sum);


        // ---------------- Question 2 ----------------
        // CGPA Calculation

        System.out.println("\n--- Question 2: CGPA Calculation ---");

        System.out.print("Enter marks of subject 1: ");
        float m1 = sc.nextFloat();

        System.out.print("Enter marks of subject 2: ");
        float m2 = sc.nextFloat();

        System.out.print("Enter marks of subject 3: ");
        float m3 = sc.nextFloat();

        float cgpa = (m1 + m2 + m3) / 30;
        System.out.println("CGPA: " + cgpa);


        // ---------------- Question 3 ----------------
        // Greeting Program

        System.out.println("\n--- Question 3: Greeting Program ---");

        sc.nextLine(); // Clear buffer

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", Have a nice day!");


        // ---------------- Question 4 ----------------
        // Kilometer to Mile Conversion

        System.out.println("\n--- Question 4: Kilometer to Mile Conversion ---");

        System.out.print("Enter distance in kilometers: ");
        float km = sc.nextFloat();

        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);


        // ---------------- Question 5 ----------------
        // Check Integer Input

        System.out.println("\n--- Question 5: Check Integer Input ---");

        sc.nextLine(); // Clear buffer

        System.out.print("Enter any value: ");

        if (sc.hasNextInt()) {
            System.out.println("You entered an Integer.");
        } else {
            System.out.println("You did NOT enter an Integer.");
        }

        sc.close(); // Close Scanner
    }
}
```

---

## 📖 Explanation

### ▶️ 1. Using One Scanner Object

Only one `Scanner` object is created and used throughout the program:

```java
Scanner sc = new Scanner(System.in);
```

This improves performance and avoids unnecessary duplication.

---

### ▶️ 2. Organized Code Structure

Each question is separated using comments:

```java
// ---------------- Question 1 ----------------
```

This makes the program easy to read and understand.

---

### ▶️ 3. Buffer Clearing (`nextLine()`)

After using `nextInt()` or `nextFloat()`, `nextLine()` is used to clear the buffer:

```java
sc.nextLine();
```

This prevents input-related errors.

---

### ▶️ 4. Better Output Formatting

Meaningful messages are printed with results:

```java
System.out.println("Sum of three numbers: " + sum);
```

This makes the output user-friendly.

---

### ▶️ 5. Closing Scanner

At the end, the `Scanner` object is closed:

```java
sc.close();
```

This is a good programming practice.

---

## 📤 Sample Output

```
--- Question 1: Sum of Three Numbers ---
Enter first number: 10
Enter second number: 20
Enter third number: 30
Sum of three numbers: 60

--- Question 2: CGPA Calculation ---
Enter marks of subject 1: 75
Enter marks of subject 2: 80
Enter marks of subject 3: 85
CGPA: 8.0

--- Question 3: Greeting Program ---
Enter your name: Swapnil
Hello Swapnil, Have a nice day!

--- Question 4: Kilometer to Mile Conversion ---
Enter distance in kilometers: 5
Distance in miles: 3.106855

--- Question 5: Check Integer Input ---
Enter any value: 45
You entered an Integer.
```

---

## ⭐ Key Points

* One `Scanner` object is enough
* Proper formatting improves readability
* Buffer clearing avoids input errors
* Closing resources is important
* Clean code is easier to maintain

---

## 🚀 Summary

This improved practice set shows how to write clean, organized, and professional Java programs using basic concepts. It prepares beginners for larger projects and interview coding questions.

Keep practicing and improving your coding style.

---

Happy Coding! 😄💻
