In Java, both the `Comparable` and `Comparator` interfaces are used to define the natural ordering of objects or provide custom sorting. However, they are used in different scenarios and have different methods and purposes.

### Comparable Interface

1. **Purpose:**
   - The `Comparable` interface is used to define the natural ordering of objects of a class. It allows objects of the implementing class to be compared with each other based on a single criterion.

2. **Method:**
   - The `Comparable` interface has a single method:
     ```java
     int compareTo(T o);
     ```
     This method compares the current object (`this`) with the specified object (`o`) and returns:
     - A negative integer if `this` object is less than `o`.
     - Zero if `this` object is equal to `o`.
     - A positive integer if `this` object is greater than `o`.

3. **Implementation:**
   - The `Comparable` interface is typically implemented by the class whose objects need to be sorted.
   - Example:
     ```java
     public class Student implements Comparable<Student> {
         private String name;
         private int age;

         public Student(String name, int age) {
             this.name = name;
             this.age = age;
         }

         @Override
         public int compareTo(Student other) {
             return this.age - other.age;  // Sorts by age
         }
     }
     ```
   - Here, the `compareTo` method is implemented to sort `Student` objects by age.

4. **Usage:**
   - `Comparable` is used when you want to define a single, natural order for objects, typically when the class is aware of its own ordering.
   - Collections like `TreeSet`, `TreeMap`, and methods like `Collections.sort(List<T>)` rely on `Comparable` for sorting.

### Comparator Interface

1. **Purpose:**
   - The `Comparator` interface is used to define multiple or custom sorting criteria for objects of a class. It allows comparing two different objects, potentially of the same or different types.

2. **Methods:**
   - The `Comparator` interface has two main methods:
     ```java
     int compare(T o1, T o2);
     boolean equals(Object obj); // (optional, usually not overridden)
     ```
     The `compare` method compares the two specified objects (`o1` and `o2`) and returns:
     - A negative integer if `o1` is less than `o2`.
     - Zero if `o1` is equal to `o2`.
     - A positive integer if `o1` is greater than `o2`.

3. **Implementation:**
   - The `Comparator` interface is typically implemented by a separate class or can be provided as an anonymous class or lambda expression.
   - Example:
     ```java
     public class Student {
         private String name;
         private int age;

         public Student(String name, int age) {
             this.name = name;
             this.age = age;
         }

         public static Comparator<Student> nameComparator = new Comparator<Student>() {
             @Override
             public int compare(Student s1, Student s2) {
                 return s1.name.compareTo(s2.name);  // Sorts by name
             }
         };
     }
     ```
   - Here, the `nameComparator` is a `Comparator` that sorts `Student` objects by name.

4. **Usage:**
   - `Comparator` is used when you want to define multiple or custom sorting orders, especially when the class itself cannot be modified or when sorting criteria may vary.
   - Useful in sorting with different criteria at different times, e.g., sorting by name, then by age, etc.
   - Collections like `Collections.sort(List<T>, Comparator<? super T>)` and `PriorityQueue` can use `Comparator` for sorting.

### Key Differences

| Feature                 | Comparable                                          | Comparator                                       |
|-------------------------|-----------------------------------------------------|--------------------------------------------------|
| **Location**            | Defined in the class whose instances need to be sorted | Defined in a separate class, or as an anonymous class |
| **Method**              | `compareTo(T o)`                                    | `compare(T o1, T o2)`                            |
| **Number of sort criteria** | Only one sort criteria                           | Multiple or custom sort criteria                 |
| **Modifying the class** | Requires modifying the class                        | Does not require modifying the class             |
| **Usage**               | Used when natural order is required (e.g., sorting by age) | Used for custom sorting orders (e.g., sorting by name) |

### Example Usage

- **Comparable Example:**
  ```java
  List<Student> students = new ArrayList<>();
  Collections.sort(students);  // Uses Comparable's compareTo method
  ```

- **Comparator Example:**
  ```java
  Collections.sort(students, Student.nameComparator);  // Uses Comparator's compare method
  ```

In summary, `Comparable` is for natural ordering within the class itself, while `Comparator` is for custom or multiple orderings that can be defined externally.
