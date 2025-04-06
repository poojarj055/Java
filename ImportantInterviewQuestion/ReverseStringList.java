List<String> list = Arrays.asList("Java", "is", "awesome");

List<String> reversed = IntStream.range(0, list.size())
    .mapToObj(i -> list.get(list.size() - 1 - i))
    .collect(Collectors.toList());

System.out.println(reversed); // Output: [awesome, is, Java]
