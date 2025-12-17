# Easy DSA Problem

---

## Problem Name - Sum of Digits
STATEMENT - Find the sum of digits of a given number.

### Example
Input: 687 → Output: 21  
(6 + 8 + 7)

### Approach 1: Digit Extraction (Iterative)
- Extract last digit using `% 10`
- Add to sum
- Remove last digit using `/ 10`

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(1)`  
(where `d` = number of digits)

### Approach 2: Recursion
- Base case: `n == 0`
- Recursive call on `n / 10`
- Add last digit each time

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(d)` (recursion stack)

### Approach 3: String Conversion
- Convert number to string
- Iterate over characters
- Convert char to digit and add

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(d)`

### Key Notes
- Iterative approach is most efficient
- Recursion is elegant but uses extra stack
- String approach is intuitive but less optimal

### Conclusion
- Prefer digit extraction for performance
- Use recursion/string for learning clarity

---

## Problem Name - Reverse of Digits
STATEMENT - Reverse the digits of a given number.

### Example
Input: 4002 → Output: 2004  
Input: 400 → Output: 4  

### Approach 1: Digit Extraction
- Build reversed number using multiplication by `10`
- Append last digit using `% 10`

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(1)`

### Approach 2: String Conversion
- Convert number to string
- Reverse using `StringBuffer`
- Parse back to integer

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(d)`

### Key Notes
- Leading zeros are automatically removed
- Iterative approach is faster and memory efficient

### Conclusion
- Use digit extraction in real-world scenarios
- String approach is okay for quick implementation

---

## Problem Name - Prime Number Check
STATEMENT - Check whether a given number is prime or not.

### Example
Input: 11 → Prime  
Input: 15 → Not Prime  
Input: 1 → Not Prime  

### Approach 1: Naive Method
- Check divisibility from `2` to `n-1`

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

### Approach 2: Optimized Method
- Check divisibility till `√n`
- If no divisor found, number is prime

**Time Complexity:** `O(√n)`  
**Space Complexity:** `O(1)`

### Key Notes
- Numbers ≤ 1 are not prime
- If `n` has a divisor greater than √n, it must also have one smaller

### Conclusion
- Optimized approach is preferred for large numbers

---