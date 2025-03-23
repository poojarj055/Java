Beginner Level

   // 1. Group a list of words by their first character.
        List<String> words= new ArrayList<>();
        words.add("asdf");
        words.add("mnbv");
        words.add("add");
        words.add("mock");

        Map<Character, List<String>> output=words.stream().collect(Collectors.groupingBy(word->word.charAt(0)));
        System.out.println(output);



   // 2. Group a list of students based on their grades (A, B, C, etc.).

    class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return name;
        }
    }

                List<Student> students = Arrays.asList(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "B"),
                new Student("Eve", "C")
        );
        Map<String, List<Student>> student= students.stream().collect(Collectors.groupingBy(stu -> stu.grade));
        System.out.println(student);

     
    //3. Count the number of occurrences of each word in a list of strings.

        List<String> words = new ArrayList<>(Arrays.asList("abc", "abc", "xyz", "pqr", "xyz", "is", "a"));
        Map<String, Long> st= words.stream().collect(Collectors.groupingBy(word -> word ,Collectors.counting()));
        System.out.println(st);



Intermediate Level

    //4. Group books by category and count how many books are in each category.

            class Books {
            String name;
            String category;
            double price;

            Books(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price=price;
            }
            @Override
            public String toString() {
            return name;
        }
    }

         List<Books> books = Arrays.asList(
                new Books("Book1", "Motivational", 5000),
                new Books("Book2", "Adventure", 7000),
                new Books("Book3", "Story", 8000),
                new Books("Book4", "Sci-Fi", 6000),
                new Books("Book5", "Motivational", 9000)
        );

        Map<String, Long> bookCategory= books.stream().collect(Collectors.groupingBy(b->b.category, Collectors.counting()));
        System.out.println(bookCategory);


   // 5. Group customers based on their city and count the number of customers per city.

               class Customer {
               String name;
               String city;

               Customer(String name, String city) {
                   this.name = name;
                   this.city = city;
               }
               @Override
               public String toString() {
                   return name;
               }
            }

               List<Customer> books = Arrays.asList(
               new Customer("sita", "Delhi"),
               new Customer("gita", "mumbai"),
               new Customer("mita", "kanpur"),
               new Customer("ram", "Delhi"),
               new Customer("shyam", "mumbai")
    );
                   Map<String, Long> customergroup= books.stream().collect(Collectors.groupingBy(book->book.city, Collectors.counting()));
                   System.out.println(customergroup);



    //6. Group products by price range (low, medium, high) and list the products in each range.
                class Products {
                        String name;
                        int price;

                    Products(String name, int price) {
                      this.name = name;
                      this.price = price;
                }
                @Override
                public String toString() {
                return name;
            }
        }   
                List<Products> product = Arrays.asList(
                new Products("product1", 247),
                new Products("product1", 213),
                new Products("product3", 167),
                new Products("product2", 79),
                new Products("product2", 56)
        );
         Map<String, List<Products>> productList=product.stream().collect(Collectors.groupingBy(p-> {
             if (p.price <= 100) return "Low";
             else if (p.price <=200) return  "Medium";
             else return "High";
         }));
        System.out.println(productList);



    // 7. Group employees by department and calculate the average salary per department.

        class Employee {
            String name;
            String department;
            int salary;

        Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        }
    }
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 5000),
                new Employee("Bob", "IT", 7000),
                new Employee("Charlie", "IT", 8000),
                new Employee("David", "HR", 6000),
                new Employee("Eve", "Finance", 9000)
        );

        Map<String, Double> avgSal=employees.stream().collect(Collectors.groupingBy(emp->emp.department, Collectors.averagingInt(emp->emp.salary)));
        System.out.println(avgSal);





Advanced Level

    //8. Group transactions by year, then by month, and find the total transaction amount in each group.
            class Transaction {
                private int year;
                private int month;
                private double amount;

                public Transaction(int year, int month, double amount) {
                    this.year = year;
                    this.month = month;
                    this.amount = amount;
                }

                public int getYear() { return year; }
                public int getMonth() { return month; }
                public double getAmount() { return amount; }

                @Override
                public String toString() {
                    return "Transaction{year=" + year + ", month=" + month + ", amount=" + amount + "}";
                }
            }
                List<Transaction> transactions = Arrays.asList(
                new Transaction(2023, 1, 500.0),
                new Transaction(2023, 1, 300.0),
                new Transaction(2023, 2, 200.0),
                new Transaction(2024, 1, 100.0),
                new Transaction(2024, 2, 400.0),
                new Transaction(2024, 2, 250.0)
        );
        Map<Integer, Map<Integer, Double>> transactionamount=transactions.stream().
                collect(Collectors.groupingBy(Transaction::getYear,
                        Collectors.groupingBy(Transaction::getMonth,Collectors.summingDouble(Transaction::getAmount))));
        System.out.println(transactionamount);


   //9. Group students by grade and then by age range (e.g., <18, 18-25, >25).
               List<Student> students = Arrays.asList(
                new Student("Alice", "A", 17),
                new Student("Bob", "A", 22),
                new Student("Charlie", "B", 26),
                new Student("David", "B", 18),
                new Student("Eve", "A", 30)
        );

        Map<String, Map<String, List<Student>>> studentGroups = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.groupingBy(s -> {
                            if (s.getAge() < 18) return "LessThan18";
                            else if (s.getAge() >= 18 && s.getAge() <= 25) return "Between18-25";
                            else return "GreaterThan25";
                        })
                ));

        System.out.println(studentGroups);

  //10.  Group movies by genre, then further group them by rating categories (e.g., 0-5, 5-7, 7-10).

       List<Movie> movies = Arrays.asList(
                new Movie("Movie1", "Action", 4.5),
                new Movie("Movie2", "Action", 6.0),
                new Movie("Movie3", "Drama", 8.5),
                new Movie("Movie4", "Comedy", 7.0),
                new Movie("Movie5", "Drama", 5.5),
                new Movie("Movie6", "Comedy", 4.0),
                new Movie("Movie7", "Action", 7.8)
        );

        // Grouping movies by genre and then by rating category
        Map<String, Map<String, List<Movie>>> groupedMovies = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre, // Outer grouping by genre
                        Collectors.groupingBy(movie -> { // Inner grouping by rating category
                            if (movie.getRating() <= 5) return "Below-Average";
                            else if (movie.getRating() > 5 && movie.getRating() <= 7) return "Average";
                            else return "Good";
                        })
                ));

        System.out.println(groupedMovies);
