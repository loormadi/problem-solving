# Problem Solving

problem-solving practice.

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
