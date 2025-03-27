Your solutions using **Java Streams API** are well-structured and mostly correct! I'll review each problem one by one and point out any necessary improvements.

---

### ✅ **1. Find the First Non-Repeating Character**
Your solution:
```java
String str = "swwiiss";
Optional<Character> firstChar = str
    .chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(letter -> letter, LinkedHashMap::new, Collectors.counting()))
    .entrySet()
    .stream()
    .filter(w -> w.getValue() == 1)
    .map(Map.Entry::getKey)
    .findFirst();
System.out.println(firstChar);
```
✔ **Correct Implementation:**  
- Uses `LinkedHashMap` to maintain insertion order.
- Groups characters by frequency.
- Finds the first non-repeating character.

✅ **Output for "swwiiss"**: `Optional.empty()` (correct)  
✅ **Output for "swiss"**: `Optional[w]` (correct)

---

### ✅ **2. Count the Frequency of Each Character**
Your solution:
```java
String s = "banana";
Map<Character, Long> output = s
    .chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
System.out.println(output);
```
✔ **Correct Implementation:**  
- Uses `groupingBy` to count character occurrences.
- Uses `LinkedHashMap` to maintain character order.

✅ **Output for "banana"**: `{b=1, a=3, n=2}` (correct)

---

### ✅ **3. Remove Duplicates and Sort Characters Alphabetically**
Your solution:
```java
String str = "programming";
System.out.println(str
    .chars()
    .mapToObj(c -> (char) c)
    .distinct()
    .sorted()
    .map(Object::toString)
    .collect(Collectors.joining()));
```
✔ **Correct Implementation:**  
- Uses `distinct()` to remove duplicates.
- Uses `sorted()` to arrange characters alphabetically.
- Uses `joining()` to form the final string.

✅ **Output for "programming"**: `"agimnopr"` (correct)

---

### ✅ **4. Reverse Words in a Sentence**
Your solution:
```java
String input = "Hello World Java";
System.out.println(Arrays.stream(input.split(" "))
    .collect(Collectors.collectingAndThen(
        Collectors.toList(),
        l -> { Collections.reverse(l); return l; }
    ))
    .stream()
    .collect(Collectors.joining(" ")));
```
✔ **Correct Implementation:**  
- Uses `split(" ")` to break words.
- Collects words into a list.
- Uses `Collections.reverse()` to reverse the order.
- Uses `joining(" ")` to merge words back into a sentence.

✅ **Output for "Hello World Java"**: `"Java World Hello"` (correct)

📌 **Alternative Approach (Shorter):**
```java
String result = Arrays.stream(input.split(" "))
    .collect(Collectors.toCollection(LinkedList::new))
    .descendingIterator()
    .forEachRemaining(System.out::print);
```
(This prints the reversed sentence but doesn't return it as a single string.)

---

### ✅ **5. Check If Two Strings Are Anagrams**
Your solution:
```java
String s1 = "listen";
String s2 = "silent";
boolean flag = s1.chars().mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
    .equals(s2.chars().mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
System.out.println(flag);
```
✔ **Correct Implementation:**  
- Uses `groupingBy` to count character frequencies.
- Compares character frequency maps.

✅ **Output for ("listen", "silent")**: `true` (correct)  
✅ **Output for ("hello", "world")**: `false` (correct)

📌 **Alternative Approach (Shorter):**
```java
boolean isAnagram = s1.chars().sorted()
    .boxed().collect(Collectors.toList())
    .equals(s2.chars().sorted()
    .boxed().collect(Collectors.toList()));
```
(This approach sorts both strings and compares them.)

---

## 🎯 **Final Verdict:**
✅ **All your solutions are correct and optimized for Java Streams API!**  
💡 **Suggestions:**
1. Use `.mapToObj(c -> (char) c)` **only where necessary**.
2. Alternative shorter solutions exist but your implementations are **efficient** and **readable**.

🔥 **Great job! Keep practicing Java Streams for interviews.** 🚀 Let me know if you need more challenges! 😊
