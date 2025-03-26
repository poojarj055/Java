// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
// Example 1:
// Input: s = "leetcode"
// Output: 0
// Explanation:
// The character 'l' at index 0 is the first character that does not occur at any other index.
// Example 2:
// Input: s = "loveleetcode"
// Output: 2
// Example 3:
// Input: s = "aabb"
// Output: -1

class Solution {
    public int firstUniqChar(String s) {
         // Create a frequency map of characters
        Map<Character, Long> frequencyMap = s.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        // Find the index of the first unique character
        return IntStream.range(0, s.length())  // Iterate over indices
                .filter(i -> frequencyMap.get(s.charAt(i)) == 1) // Check if count is 1
                .findFirst()
                .orElse(-1); // Return -1 if no unique character is found
        
    }
}



Step 1: Create a frequency map using Collectors.groupingBy(), where:
Each character is mapped to its count.
We use LinkedHashMap to preserve the order of characters.

Step 2: Use IntStream.range(0, s.length()) to iterate over indices.
We check if the character at the current index has a count of 1 in frequencyMap.
The first index that satisfies this condition is returned.

Step 3: If no unique character is found, orElse(-1) ensures we return -1.


