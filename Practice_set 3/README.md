# 📘 Practice Set 3: Strings in Java

Welcome to **Practice Set 3**! 🚀
This practice set helps you improve your understanding of **String operations** in Java.

This README includes:

✅ All Questions
✅ Easy Explanations
✅ Example Codes
✅ Sample Output

---

## 📚 Topics Covered

1. Convert String to Lowercase
2. Replace Spaces with Underscore
3. Replace Text in a String
4. Find Double and Triple Spaces
5. Print Text Using Escape Characters

---

## 📌 Question 1: Convert to Lowercase

### ❓ Question

Convert the given String into lowercase letters.

### 💡 Explanation

`toLowerCase()` converts all characters into small letters.

### 💻 Code

```java
String str = "Swapnil";
String lstr = str.toLowerCase();
System.out.println(lstr);
```

---

## 📌 Question 2: Replace Spaces with Underscore

### ❓ Question

Replace all spaces in a String with underscore (`_`).

### 💡 Explanation

`replace()` method is used to change characters in a String.

### 💻 Code

```java
String str = "I am Swapnil";
System.out.println(str.replace(' ', '_'));
```

---

## 📌 Question 3: Replace Name in a Template

### ❓ Question

Replace `<|name|>` with your name in the given String.

### 💡 Explanation

`replace()` can also replace words or patterns.

### 💻 Code

```java
String str = "Dear <|name|> , Thanks a lot.";
System.out.println(str.replace("<|name|>", "Swapnil"));
```

---

## 📌 Question 4: Find Extra Spaces

### ❓ Question

Find the index of double and triple spaces in a String.

### 💡 Explanation

`indexOf()` returns the position of given text.
If not found, it returns `-1`.

### 💻 Code

```java
String str = "Hello  everyone , this    string contains    double and triple spaces ";
System.out.println(str.indexOf("  "));
System.out.println(str.indexOf("   "));
```

---

## 📌 Question 5: Use Escape Characters

### ❓ Question

Print the following message using escape characters:

```
"Dear Swapnil , This Java is nice . Thanks"
```

### 💡 Explanation

The backslash `\` is used to escape special characters in Strings.

### 💻 Code

```java
System.out.println("\"Dear Swapnil , This Java is nice . Thanks\"");
```

---

## 🖥️ Sample Output

When you run each program, the output will be:

### ✅ Question 1

```
swapnil
```

### ✅ Question 2

```
I_am_Swapnil
```

### ✅ Question 3

```
Dear Swapnil , Thanks a lot.
```

### ✅ Question 4

```
5
18
```

### ✅ Question 5

```
"Dear Swapnil , This Java is nice . Thanks"
```

---

## 🌟 Summary

After completing this practice set, you can:

✅ Modify Strings easily
✅ Replace text correctly
✅ Find unwanted spaces
✅ Use escape characters

These skills are very useful in real-world Java projects. 💻🚀

---

Happy Coding! 😄✨
