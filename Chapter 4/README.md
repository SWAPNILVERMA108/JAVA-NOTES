# 📘 Chapter 4: Conditional Statements and Switch in Java

Welcome to **Chapter 4**! 🚀
In this chapter, you will learn how Java makes decisions using **if-else statements, logical operators, and switch-case**.

This README includes:

✅ All Questions
✅ Easy Explanations
✅ Example Codes
✅ Sample Output

---

## 📚 Topics Covered

1. Boolean and Logical Operators
2. if-else Ladder
3. else-if Conditions
4. switch-case Statement
5. User Input using Scanner

---

## 📌 Topic 1: Boolean and Logical Operators

### ❓ Question

How do logical operators work with boolean values?

### 💡 Explanation

Logical operators are used to combine conditions.

| Operator | Meaning                 |   |                   |
| -------- | ----------------------- | - | ----------------- |
| `&&`     | AND (Both must be true) |   |                   |
| `        |                         | ` | OR (Any one true) |
| `!`      | NOT (Reverse result)    |   |                   |

### 💻 Code

```java
boolean a = true;
boolean b = true;

if (a && b) {
    System.out.println("Y");
} else {
    System.out.println("N");
}
```

---

## 📌 Topic 2: Taking User Input (Age)

### ❓ Question

How to take age as input from the user?

### 💡 Explanation

The `Scanner` class is used to take input from the keyboard.

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
```

---

## 📌 Topic 3: if-else Ladder

### ❓ Question

Check experience level using age with if-else.

### 💡 Explanation

The if-else ladder checks conditions one by one.
The first true condition is executed.

### 💻 Code

```java
if (age > 56) {
    System.out.println("You are experienced!");
}
else if (age > 46) {
    System.out.println("You are semi experienced!");
}
else if (age > 36) {
    System.out.println("You are semi-semi experienced!");
}
else {
    System.out.println("You are not experienced!");
}
```

---

## 📌 Topic 4: switch-case Statement

### ❓ Question

Display different messages based on age using switch-case.

### 💡 Explanation

The `switch` statement is used when multiple fixed values are checked.

`break` stops execution after a case.

### 💻 Code

```java
switch (age) {
    case 18:
        System.out.println("You are going to become an Adult!");
        break;

    case 23:
        System.out.println("You are going to join a job!");
        break;

    case 60:
        System.out.println("You are going to get retired!");
        break;

    default:
        System.out.println("Enjoy Your Life!");
}
```

---

## 📝 Complete Example Program

### 💻 Code

```java
import java.util.Scanner;

public class Chapter4 {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {

            case 18:
                System.out.println("You are going to become an Adult!");
                break;

            case 23:
                System.out.println("You are going to join a job!");
                break;

            case 60:
                System.out.println("You are going to get retired!");
                break;

            default:
                System.out.println("Enjoy Your Life!");
        }
    }
}
```

---

## 🖥️ Sample Output

### Example 1

**Input:**

```
18
```

**Output:**

```
You are going to become an Adult!
```

---

### Example 2

**Input:**

```
45
```

**Output:**

```
Enjoy Your Life!
```

---

### Example 3

**Input:**

```
60
```

**Output:**

```
You are going to get retired!
```

---

## 🌟 Chapter Summary

After completing this chapter, you can:

✅ Use logical operators
✅ Apply if-else conditions
✅ Take user input
✅ Use switch-case properly

These concepts are very important for decision-making in Java programs. 💻🚀

---

Happy Coding! 😄✨
