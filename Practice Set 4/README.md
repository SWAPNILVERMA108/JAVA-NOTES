# 📘 Practice Set 4: Conditional Statements in Java

Welcome to **Practice Set 4**! 🚀
This practice set focuses on strengthening your understanding of **conditional statements**, **logical operators**, **switch-case**, and **real-world decision making** in Java.

This README contains:

✅ All Questions
✅ Clear Explanations
✅ Code Snippets
✅ Sample Outputs

---

## 📚 Topics Covered

1. Assignment vs Comparison Operator
2. Pass / Fail Calculation
3. Income Tax Calculation
4. Day of Week using Switch
5. Leap Year Check
6. Website Type Detection

---

## 📌 Question 1: Assignment vs Comparison

### ❓ Question

What is wrong with the following condition?

```java
if (a = 11)
```

### 💡 Explanation

* `=` is an **assignment operator**
* `==` is a **comparison operator**

Using `=` inside `if` causes a compilation error.

### ✅ Correct Code

```java
int a = 10;
if (a == 11) {
    System.out.println("I am 11");
} else {
    System.out.println("I am not 11");
}
```

---

## 📌 Question 2: Pass or Fail Result

### ❓ Question

Take marks of three subjects and check if the student is **Pass** or **Fail**.

### 💡 Conditions

* Overall percentage ≥ 40%
* Each subject marks ≥ 33

### 💻 Code

```java
Scanner sc = new Scanner(System.in);

float a = sc.nextFloat();
float b = sc.nextFloat();
float c = sc.nextFloat();

float percentage = (a + b + c) / 3;

if (percentage >= 40 && a >= 33 && b >= 33 && c >= 33) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### 🖥️ Sample Output

**Input:**

```
70 60 50
```

**Output:**

```
Pass
```

---

## 📌 Question 3: Income Tax Calculator

### ❓ Question

Calculate income tax based on the following slabs:

| Income Range          | Tax Rate |
| --------------------- | -------- |
| ≤ 3,00,000            | No Tax   |
| 3,00,001 – 7,00,000   | 5%       |
| 7,00,001 – 10,00,000  | 10%      |
| 10,00,001 – 12,00,000 | 15%      |
| 12,00,001 – 15,00,000 | 20%      |
| > 15,00,000           | 30%      |

### 💻 Code

```java
float income = sc.nextFloat();
float tax;

if (income <= 300000) {
    tax = 0;
}
else if (income <= 700000) {
    tax = income * 0.05f;
}
else if (income <= 1000000) {
    tax = income * 0.10f;
}
else if (income <= 1200000) {
    tax = income * 0.15f;
}
else if (income <= 1500000) {
    tax = income * 0.20f;
}
else {
    tax = income * 0.30f;
}

System.out.println("Income Tax: " + tax);
```

---

## 📌 Question 4: Day of the Week

### ❓ Question

Print the day of the week using numbers (1–7).

### 💻 Code

```java
int num = sc.nextInt();

switch (num) {
    case 1 -> System.out.println("Sunday");
    case 2 -> System.out.println("Monday");
    case 3 -> System.out.println("Tuesday");
    case 4 -> System.out.println("Wednesday");
    case 5 -> System.out.println("Thursday");
    case 6 -> System.out.println("Friday");
    case 7 -> System.out.println("Saturday");
}
```

### 🖥️ Sample Output

**Input:**

```
3
```

**Output:**

```
Tuesday
```

---

## 📌 Question 5: Leap Year Check

### ❓ Question

Check whether a given year is a leap year.

### 💡 Explanation

A leap year is divisible by `4`.

### 💻 Code

```java
int year = sc.nextInt();

if (year % 4 == 0) {
    System.out.println("Leap Year");
} else {
    System.out.println("Not a Leap Year");
}
```

---

## 📌 Question 6: Website Type Detection

### ❓ Question

Identify website type based on its domain name.

| Domain | Type         |
| ------ | ------------ |
| .com   | Commercial   |
| .org   | Organization |
| .in    | Indian       |

### 💻 Code

```java
String website = sc.nextLine();

if (website.endsWith(".com")) {
    System.out.println("Commercial Website");
}
else if (website.endsWith(".org")) {
    System.out.println("Organization Website");
}
else if (website.endsWith(".in")) {
    System.out.println("Indian Website");
}
```

### 🖥️ Sample Output

**Input:**

```
www.google.com
```

**Output:**

```
Commercial Website
```

---

## 🌟 Summary

After completing Practice Set 4, you can:

✅ Use if-else conditions confidently
✅ Apply logical operators
✅ Write switch-case programs
✅ Solve real-world decision problems

This practice set makes your Java fundamentals very strong 💪🚀

---

Happy Coding! 😄✨
