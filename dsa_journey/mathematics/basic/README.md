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
