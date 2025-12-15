# Basic DSA Problem

---

## Problem Name - Even or Odd
STATEMENT - Check whether a given number is even or odd.

### Example
Input:  68 → Even
Input:  95 → Odd

### Approach 1: Modulo Operator (%)
n % 2 == 0
- Remainder `0` → Even  
- Else → Odd  

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Approach 2: Bitwise AND Operator (`&`)
(n & 1) == 0
- Last bit:
  - `0` → Even
  - `1` → Odd

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- Even numbers always end with `0` in binary
- Odd numbers always end with `1` in binary
- Modulo → readable
- Bitwise → faster & optimized

### Conclusion
- Use `%` for simplicity
- Use `&` for performance-critical code

---
## Problem Name - Multiplication Table
STATEMENT - Print the multiplication table of a given number up to 10.

### Example
Input: 5  
Output:
5 * 1 = 5  
5 * 2 = 10  
...  
5 * 10 = 50  

### Approach 1: Iterative Approach
- Use a loop from `1` to `10`
- Multiply the number with loop variable

**Time Complexity:** `O(10)` → `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- Simple loop-based solution
- Best for beginners
- Clean and readable

### Conclusion
- Iterative approach is efficient and enough for this problem

---

## Problem Name - Sum of Natural Numbers
STATEMENT - Find the sum of first `n` natural numbers.

### Example
Input: 5 → Output: 15  
Input: 0 → Output: 0  

### Approach 1: Loop Based (Naive)
- Start from `n`
- Keep adding till `1`

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

### Approach 2: Mathematical Formula (Expected)
Formula:
n * (n + 1) / 2

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- Loop works but slower for large `n`
- Formula is optimal and interview-friendly

### Conclusion
- Always prefer formula when possible

---

## Problem Name - Sum of Squares of Natural Numbers
STATEMENT - Calculate the sum of squares of first `n` natural numbers.

### Example
Input: 5 → Output: 55  
(1² + 2² + 3² + 4² + 5²)

### Approach 1: Iterative Approach
- Loop from `n` to `1`
- Add `n * n` each time

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

### Approach 2: Mathematical Formula (Expected)
Formula:
n * (n + 1) * (2n + 1) / 6

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- Loop is straightforward
- Formula is faster and optimized

### Conclusion
- Formula-based approach is preferred

---

## Problem Name - Swap Two Numbers
STATEMENT - Swap two numbers using different techniques.

### Example
Input: a = 2, b = 3  
Output: a = 3, b = 2  

### Approach 1: Using Temporary Variable
- Store one value in temp
- Swap values

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Approach 2: Using Arithmetic Operators
- a = a + b  
- b = a - b  
- a = a - b  

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Approach 3: Using Bitwise XOR
- a = a ^ b  
- b = a ^ b  
- a = a ^ b  

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- Temp variable → safest
- Arithmetic → risk of overflow
- XOR → interview flex 💪

### Conclusion
- Use temp variable in real-world code
- XOR is good for understanding bitwise logic

---