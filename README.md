# Problem Solving

## Week 1

### 1. Contains Duplicate

**Difficulty:** Easy  
**Language:** Java

**Problem:** https://leetcode.com/problems/contains-duplicate/

**Approach 1: Brute Force**
- Used nested loops to compare elements.
- Time Complexity: O(n²)
- Space Complexity: O(1)
- Result: Time Limit Exceeded.

**Approach 2: HashSet**
- Used a HashSet to track previously seen numbers.
- Time Complexity: O(n).
- Space Complexity: O(n).
- Result: Accepted.

**What I learned:**
- How to detect duplicates in an array.
- How to use HashSet in Java.
- The difference between brute force and optimized solutions.
- How time complexity affects performance.

### 2. Two Sum

**Difficulty:** Easy  
**Language:** Java

**Problem:** https://leetcode.com/problems/two-sum/

**Approach 1: Brute Force**
- Used nested loops to find two numbers that add up to the target.
- Time Complexity: O(n²)
- Space Complexity: O(1)

**Approach 2: HashMap**
- Used a HashMap to store numbers and their indices.
- Time Complexity: O(n).
- Space Complexity: O(n).

**What I learned:**
- How to use HashMap in Java.
- How to find two numbers that add up to a target.
- How to improve a solution using HashMap.

### 3. Valid Palindrome

**Difficulty:** Easy  
**Language:** Java

**Problem:** https://leetcode.com/problems/valid-palindrome/

**Approach 1: String Cleaning**
- Removed spaces and special characters.
- Converted the string to lowercase.
- Compared characters from both ends.
- Time Complexity: O(n²).
- Space Complexity: O(n).
- Result: Accepted.

**Approach 2: Two Pointers**
- Used two pointers (`left` and `right`) starting from opposite ends of the string.
- Skipped non-alphanumeric characters using `Character.isLetterOrDigit()`.
- Compared characters ignoring case using `Character.toLowerCase()`.
- Moved both pointers toward the center without creating a new string.
- Time Complexity: O(n).
- Space Complexity: O(1).
- Result: Accepted.

**What I learned:**
- How to check if a string is a palindrome.
- How string concatenation affects performance.
- How to use the Two Pointers technique.
- Why nested loops do not always mean O(n²) time complexity.
- How to optimize space complexity from O(n) to O(1).


## Week 2

### 1. Binary Search

**Difficulty:** Easy  
**Language:** Java

**Problem:** https://leetcode.com/problems/binary-search/

**Approach: Binary Search**
- Used two pointers (`low` and `high`) to define the search range.
- Calculated the middle index (`mid`) in each iteration.
- Compared the middle element with the target.
- Eliminated half of the search range based on the comparison.
- Returned the target's index if found, or `-1` if not found.
- Time Complexity: O(log n).
- Space Complexity: O(1).
- Result: Accepted.

**What I learned:**
- How Binary Search works on a sorted array.
- How to use `low`, `high`, and `mid` to find a target.
- How to update the search boundaries correctly.
- Why Binary Search has O(log n) time complexity.

### 2. Valid Anagram

**Difficulty:** Easy  
**Language:** Java

**Problem:** https://leetcode.com/problems/valid-anagram/

**Approach 1: Brute Force**
- Used nested loops to find matching characters.
- Used a boolean array to track already matched characters.
- Time Complexity: O(n²).
- Space Complexity: O(n).
- Result: Time Limit Exceeded.

**Approach 2: Frequency Counting**
- Used an integer array of size 26 to count character frequencies.
- Incremented the count for each character in the first string.
- Decremented the count for each character in the second string.
- Checked that all frequencies were zero.
- Time Complexity: O(n).
- Space Complexity: O(1).
- Result: Accepted.

**What I learned:**
- How to check whether two strings are anagrams.
- How to use a frequency array to count character occurrences.
- How to convert lowercase letters into array indices.
- How to optimize time complexity from O(n²) to O(n).

### 3. Best Time to Buy and Sell Stock

**Difficulty:** Easy  
**Language:** Java

**Problem:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

**Approach 1: Brute Force**
- Used nested loops to check every possible buying and selling pair.
- Ensured the selling day comes after the buying day.
- Calculated the profit for each pair and tracked the maximum profit.
- Time Complexity: O(n²).
- Space Complexity: O(1).
- Result: Time Limit Exceeded.

**Approach 2: One Pass (Greedy)**
- Traversed the array once.
- Kept track of the minimum stock price seen so far.
- Calculated the potential profit for each selling day.
- Updated the maximum profit whenever a higher profit was found.
- Time Complexity: O(n).
- Space Complexity: O(1).
- Result: Accepted.


