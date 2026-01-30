# 📘 Chapter 3: Strings in Java

Welcome to **Chapter 3**! 🚀
In this chapter, you will learn about **String handling in Java** and how to use important String methods.

This README includes:

✅ All Questions
✅ Easy Explanations
✅ Example Codes
✅ Beginner-Friendly Notes

---

## 📚 Topics Covered

1. Creating Strings
2. String Length
3. Changing Case (Upper & Lower)
4. Substring
5. Replace Method
6. StartsWith Method
7. charAt Method
8. indexOf Method

---

## 📌 Topic 1: Creating a String

### ❓ Question

How do you create and store a String in Java?

### 💡 Explanation

A String is a sequence of characters used to store text.

### 💻 Code

```java
String name = "Swapnil";
```

---

## 📌 Topic 2: Finding Length of String

### ❓ Question

How do you find the length of a String?

### 💡 Explanation

The `length()` method returns the total number of characters in a String.

### 💻 Code

```java
int value = name.length();
System.out.println(value);
```

---

## 📌 Topic 3: Convert String to Lowercase and Uppercase

### ❓ Question

How can you change the case of a String?

### 💡 Explanation

* `toLowerCase()` converts all letters to small letters.
* `toUpperCase()` converts all letters to capital letters.

### 💻 Code

```java
String lower = name.toLowerCase();
System.out.println(lower);

String upper = name.toUpperCase();
System.out.println(upper);
```

---

## 📌 Topic 4: Substring Method

### ❓ Question

How do you extract part of a String?

### 💡 Explanation

`substring()` is used to get a part of a String.

* `substring(start)` → from start index to end
* `substring(start, end)` → from start to end-1

### 💻 Code

```java
System.out.println(name.substring(1));
System.out.println(name.substring(1, 5));
```

---

## 📌 Topic 5: Replace Method

### ❓ Question

How do you replace characters or words in a String?

### 💡 Explanation

`replace()` is used to change characters or words.

### 💻 Code

```java
System.out.println(name.replace('p', 'a'));
System.out.println(name.replace("pni", "am"));
```

---

## 📌 Topic 6: startsWith Method

### ❓ Question

How do you check if a String starts with specific text?

### 💡 Explanation

`startsWith()` returns `true` or `false`.

### 💻 Code

```java
System.out.println(name.startsWith("Swa"));
```

---

## 📌 Topic 7: charAt Method

### ❓ Question

How do you get a character from a String using its index?

### 💡 Explanation

`charAt(index)` returns the character at the given position.

Index starts from `0`.

### 💻 Code

```java
System.out.println(name.charAt(4));
```

---

## 📌 Topic 8: indexOf Method

### ❓ Question

How do you find the position of a character in a String?

### 💡 Explanation

`indexOf()` returns the index of the first occurrence.

If not found, it returns `-1`.

### 💻 Code

```java
System.out.println(name.indexOf("p"));
```

---

# 📝 Complete Example Program

### 💻 Code

```java
public class Chapter3 {
    public static void main(String[] args) {

        String name = "Swapnil";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 5));

        System.out.println(name.replace('p', 'a'));
        System.out.println(name.replace("pni", "am"));

        System.out.println(name.startsWith("Swa"));

        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("p"));

    }
}
```

---

## 🌟 Chapter Summary

After completing this chapter, you will be able to:

✅ Create and use Strings
✅ Modify text using methods
✅ Extract characters and substrings
✅ Search inside Strings

Strings are very important in Java and used in almost every real project. 💻🚀

---

Happy Learning & Coding! 😄✨

---

## 🖥️ Sample Output

When you run the complete example program, the output will be:

```
7
swapnil
SWAPNIL
wapnil
wapn
Swaanil
Swaam
true
n
3
```

---

### 📖 Output Explanation

| Line | Output  | Reason                      |
| ---- | ------- | --------------------------- |
| 1    | 7       | Length of "Swapnil"         |
| 2    | swapnil | Converted to lowercase      |
| 3    | SWAPNIL | Converted to uppercase      |
| 4    | wapnil  | Substring from index 1      |
| 5    | wapn    | Substring from index 1 to 4 |
| 6    | Swaanil | 'p' replaced by 'a'         |
| 7    | Swaam   | "pni" replaced by "am"      |
| 8    | true    | Starts with "Swa"           |
| 9    | n       | Character at index 4        |
| 10   | 3       | Index of 'p'                |

---
