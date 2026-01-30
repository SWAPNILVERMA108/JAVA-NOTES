# 📘 Practice Set 2: Operators and Expressions in Java

Welcome to **Practice Set 2**! 🚀
This practice set is designed to improve your understanding of operators, type conversion, input handling, and expressions in Java.

This README contains:

✅ All Questions
✅ Detailed Explanations
✅ Individual Programs
✅ One Merged Program

---

## 📚 Topics Covered

1. Integer and Float Division
2. Character Encryption and Decryption
3. User Input and Comparison
4. Formula Evaluation
5. Expression Solving

---

## 📌 Question 1: Integer vs Float Division

### ❓ Question

Find the output of the following expression:

```
7 / 4 * 9 / 2
```

### 💡 Explanation

All values are integers, so integer division is applied first.

```
7 / 4 = 1
1 * 9 = 9
9 / 2 = 4
```

Final Answer: `4`

To get a decimal result, at least one value must be `float`.

### 💻 Code

```java
public class Question1 {
    public static void main(String[] args) {

        float a = 7 / 4 * 9 / 2;
        System.out.println(a);

    }
}
```

---

## 📌 Question 2: Character Encryption and Decryption

### ❓ Question

Encrypt a character by adding `8` and then decrypt it by subtracting `8`.

### 💡 Explanation

Characters are stored as ASCII values. Adding or subtracting changes the character.

Example:

```
B → ASCII 66
66 + 8 = 74 → J
```

### 💻 Code

```java
public class Question2 {
    public static void main(String[] args) {

        char grade = 'B';

        grade = (char) (grade + 8);
        System.out.println(grade);

        grade = (char) (grade - 8);
        System.out.println(grade);

    }
}
```

---

## 📌 Question 3: Taking Input and Comparison

### ❓ Question

Take an integer input from the user and check if it is greater than 8.

### 💡 Explanation

`Scanner` is used to take input from the keyboard.
The `>` operator compares values.

### 💻 Code

```java
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a > 8);

    }
}
```

---

## 📌 Question 4: Formula Evaluation

### ❓ Question

Evaluate the following formula:

```
(v² - u²) / (2as)
```

### 💡 Explanation

This formula is used in physics for motion equations.

All variables are declared as `float` to get accurate results.

### 💻 Code

```java
public class Question4 {
    public static void main(String[] args) {

        float a = 7;
        float s = 8;
        float v = 9;
        float u = 6;

        float t = (v * v - u * u) / (2 * a * s);
        System.out.println(t);

    }
}
```

---

## 📌 Question 5: Expression Solving

### ❓ Question

Find the value of the following expression:

```
7 * 49 / 7 + 35 / 7
```

### 💡 Explanation

Java solves expressions using operator precedence.

```
7 * 49 = 343
343 / 7 = 49
35 / 7 = 5
49 + 5 = 54
```

Final Answer: `54`

### 💻 Code

```java
public class Question5 {
    public static void main(String[] args) {

        int a = (7 * 49 / 7 + 35 / 7);
        System.out.println(a);

    }
}
```


