### **Understanding the `allMatch()` Function in Java Streams**

The `allMatch()` method in Java Streams is used to check if **all** elements in a stream satisfy a given predicate. It returns:
- `true` if **all** elements match the given condition.
- `false` if **at least one** element does not match the condition.

### **Syntax**
```java
boolean result = stream.allMatch(predicate);
```
- `predicate`: A condition (lambda expression or method reference) applied to each element.
- Returns `true` if all elements satisfy the condition; otherwise, `false`.

---

## **Examples of `allMatch()` in Java Streams**

### **1. Check if All Numbers Are Even**
**Question:** Write a Java program to check if all numbers in a list are even using `allMatch()`.

**Solution:**
```java
import java.util.stream.IntStream;

public class AllMatchExample {
    public static void main(String[] args) {
        boolean allEven = IntStream.of(2, 4, 6, 8, 10) // Stream of numbers
                                   .allMatch(n -> n % 2 == 0); // Check if all are even
        System.out.println("Are all numbers even? " + allEven);
    }
}
```
**Output:**
```
Are all numbers even? true
```
**Explanation:**  
- All numbers (`2, 4, 6, 8, 10`) are divisible by `2`, so `allMatch()` returns `true`.

---

### **2. Check If All Names Start with 'A'**
**Question:** Given a list of names, check if all names start with the letter `'A'`.

**Solution:**
```java
import java.util.List;

public class NameCheck {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Aaron", "Ava");
        
        boolean allStartWithA = names.stream()
                                     .allMatch(name -> name.startsWith("A"));

        System.out.println("Do all names start with 'A'? " + allStartWithA);
    }
}
```
**Output:**
```
Do all names start with 'A'? true
```
**Explanation:**  
- All names (`Alice, Aaron, Ava`) start with `'A'`, so `allMatch()` returns `true`.

---

### **3. Check If All Numbers Are Positive**
**Question:** Given a list of numbers, check if all numbers are positive.

**Solution:**
```java
import java.util.stream.IntStream;

public class PositiveCheck {
    public static void main(String[] args) {
        boolean allPositive = IntStream.of(1, 5, 7, -3, 9) // Contains -3
                                      .allMatch(n -> n > 0);
        System.out.println("Are all numbers positive? " + allPositive);
    }
}
```
**Output:**
```
Are all numbers positive? false
```
**Explanation:**  
- `-3` is negative, so `allMatch()` returns `false`.

---

### **4. Check If All Words Have More Than 3 Letters**
**Question:** Given a list of words, check if all words have more than 3 letters.

**Solution:**
```java
import java.util.List;

public class WordLengthCheck {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream", "API", "Code");
        
        boolean allLongerThanThree = words.stream()
                                          .allMatch(word -> word.length() > 3);

        System.out.println("Do all words have more than 3 letters? " + allLongerThanThree);
    }
}
```
**Output:**
```
Do all words have more than 3 letters? false
```
**Explanation:**  
- `"API"` has only 3 letters, so `allMatch()` returns `false`.

---

### **5. Check If All Employees Are Above 25 Years Old**
**Question:** Given a list of employee ages, check if all employees are above `25` years old.

**Solution:**
```java
import java.util.List;

public class EmployeeAgeCheck {
    public static void main(String[] args) {
        List<Integer> ages = List.of(30, 40, 35, 28, 26, 24);
        
        boolean allAbove25 = ages.stream()
                                 .allMatch(age -> age > 25);

        System.out.println("Are all employees above 25? " + allAbove25);
    }
}
```
**Output:**
```
Are all employees above 25? false
```
**Explanation:**  
- `24` is below `25`, so `allMatch()` returns `false`.

---

## **Key Points to Remember About `allMatch()`**
| Feature | Explanation |
|---------|------------|
| **Short-Circuiting** | As soon as `allMatch()` finds one element that **does not** match, it stops checking further. |
| **Returns `true` Only If All Match** | Even if one element fails the condition, it returns `false`. |
| **Works with Any Stream Type** | Can be used with `Stream<T>`, `IntStream`, `DoubleStream`, etc. |

---
### **Conclusion**
- `allMatch()` is useful for checking **whether all** elements in a stream satisfy a condition.
- It is short-circuiting, meaning it stops checking as soon as a condition fails.
- It returns `true` only if **every** element in the stream matches the predicate.

Would you like me to modify any example to better suit your needs? 🚀
