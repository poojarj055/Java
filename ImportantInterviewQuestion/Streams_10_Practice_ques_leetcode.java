import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
// 1. group the strings based on there length
//        List<String> str = Arrays.asList("cat", "dog", "abcd", "yak", "qwerty", "asdfgh", "zxcv");
//        Map<Integer, List<String>> groupedStr =
//                str.
//                        stream().
//                        collect(Collectors.groupingBy(String::length)).
//                        entrySet().
//                        stream().
//                        map(w -> "Strings with length " + w.getKey() + " are " + w.getValue()).
//                        forEach(System.out::println);
// just print the count
//        str.
//                stream().
//                collect(Collectors.groupingBy(String::length, Collectors.counting())).
//                forEach((length, count) -> System.out.println("Strings of length " + length + ": " + count + " strings"));

 //2.Problem: Given a list of words, group the words that are anagrams of each other
//        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        Arrays.stream(strArr).
//                collect(Collectors.groupingBy(word -> {
//                            char[] chars = word.toCharArray();
//                            Arrays.sort(chars);
//                            return new String(chars);
//                        }
//                )).values().forEach(System.out::print);

  //3. Given an array of integers, find the most frequently occurring element
//          int [] arr={1, 3, 3, 3, 4, 3, 5, 3, 2, 2, 2};
//         int freqElement= Arrays.stream(arr).
//                  boxed().
//                 collect(Collectors.groupingBy(n->n, Collectors.counting())).
//                 entrySet().
//                 stream().
//                 max(Map.Entry.comparingByValue()).
//                 map(Map.Entry::getKey).
//                 orElse(null);
//
//        System.out.println(freqElement);

//       4.Problem: Two strings are isomorphic if the characters in one string can be replaced to get the other string.
//                Given two strings, check if they are isomorphic.

//        String s1 = "egg", t1 = "add";
//        String s2 = "bbbaaaba", t2 = "aaabbbba";
//
//    Map<Character,Character> s1Map=new HashMap<>();
//    Map<Character,Character> t1Map=new HashMap<>();
//
//    for(int i=0;i<s1.length();i++){
//        char s=s1.charAt(i);
//        char t=t1.charAt(i);
//        if(s1Map.containsKey(s) && s1Map.get(s)!=t){
//            return false;
//        }
//        if(t1Map.containsKey(t) && t1Map.get(t)!=s){
//            return false;
//        }
//        s1Map.put(s,t);
//        t1Map.put(t,s);
//    }
//    return true;

//       boolean check= s1.chars().
//               mapToObj(c->(char)c).
//               distinct().
//               count()==t1.chars().
//               mapToObj(c->(char)c).
//               distinct().
//               count();
//       boolean check2= s2.chars().
//               mapToObj(c->(char)c).
//               distinct().count()==t2.chars().
//               mapToObj(c->(char)c).
//               distinct().
//               count();
//
//        System.out.println(check);
//        System.out.println(check2);

       // 5.Given two arrays, return their intersection (elements common in both) using a HashMap
//        int[] nums1 = {4, 9, 5};
//        int[] nums2 = {9, 4, 9, 8, 4};
//
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums1) {
//            set.add(num);
//        }
//
//        Set<Integer> result = new HashSet<>();
//        for (int num : nums2) {
//            if (set.contains(num)) {
//                result.add(num);
//            }
//        }
//        System.out.println(result);
//6.  Given an array of integers and an integer k, find the number of subarrays whose sum equals k using a HashMap.
//        int[]nums = {1,1,1};
//        int k = 2;
//         7.Given a string, find the first character that appears more than once using a HashMap
//        String s="abca";
//
//        String result = s.chars()
//                .mapToObj(st -> (char) st)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .entrySet().stream()
//                .filter(e -> e.getValue() > 1)
//                .map(e -> String.valueOf(e.getKey()))  // Convert Character to String
//                .findFirst()
//                .orElse("-1");
//        System.out.println(result);
//        9. Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//        int [] nums={100, 4, 200, 1, 3, 2};
//        int max=0;
//        if (nums.length == 0) max=0;
//
//        Arrays.sort(nums); // Sort the array
//        int maxLength = 1, currentLength = 1;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1] + 1) {
//                currentLength++;
//            } else if (nums[i] != nums[i - 1]) {
//                maxLength = Math.max(maxLength, currentLength);
//                currentLength = 1;
//            }
//        }
//
//       max= Math.max(maxLength, currentLength);
//        System.out.println(max);
//    10.Given an array of integers, find all duplicate elements.
//        int [] arr={1, 2, 3, 1, 2, 4};
//        Arrays.stream(arr).mapToObj(num->(int)num).collect(Collectors.groupingBy(n->n, Collectors.counting()))
//                .entrySet().stream().
//                filter(entry->entry.getValue()>1).
//                map(Map.Entry::getKey).forEach(System.out::println);


    }
}
