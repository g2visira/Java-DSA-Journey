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

## Problem Name - Power Checking
STATEMENT - Check whether a given number `y` is a power of another number `x`.

### Example
Input: x = 10, y = 1000 → Output: true  
Input: x = 10, y = 1001 → Output: false  
Input: x = 1, y = 1 → Output: true  

### Approach 1: Repeated Multiplication (Naive)
- Start with `pow = 1`
- Repeatedly multiply by `x`
- Stop when `pow >= y`
- Check if `pow == y`

**Time Complexity:** `O(logₓ y)`  
**Space Complexity:** `O(1)`

### Approach 2: Iterative Division (Expected)
- Repeatedly divide `y` by `x` while divisible
- If final value becomes `1`, then `y` is power of `x`

**Time Complexity:** `O(logₓ y)`  
**Space Complexity:** `O(1)`

### Key Notes
- If `x == 1`, only `y == 1` is valid
- Zero or negative values are invalid
- Division approach avoids overflow issues

### Conclusion
- Iterative division is cleaner and safer
- Prefer expected approach for optimized solutions

---

## Problem Name - Distance Between Two Points
STATEMENT - Find the distance between two points in a 2D plane.

### Example
Input: (3, 4), (4, 3) → Output: √2 ≈ 1.414  

### Approach 1: Pythagorean Theorem
- Calculate horizontal and vertical distance
- Apply distance formula  
  √[(x₂ − x₁)² + (y₂ − y₁)²]

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Approach 2: Using `Math.hypot()`
- Directly compute distance using built-in method
- Internally applies the same formula safely

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- `Math.hypot()` is cleaner and more readable
- Handles overflow better internally
- Both approaches are equally efficient

### Conclusion
- Use `Math.hypot()` for clean and professional code
- Formula-based approach is good for understanding logic

---

## Problem Name - Valid Triangle
STATEMENT - Check whether three given sides can form a valid triangle.

### Example
Input: 7, 10, 5 → Valid  
Input: 1, 10, 12 → Invalid  

### Approach: Triangle Inequality Theorem
- Sum of any two sides must be greater than the third side  
  a + b > c  
  a + c > b  
  b + c > a  

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- If any condition fails, triangle is invalid
- Works for all positive integer values
- Simple logical check, no loops required

### Conclusion
- Triangle Inequality Theorem is sufficient and optimal
- Best approach for validation problems

---

## Problem Name - Overlapping Rectangles
STATEMENT - Check whether two rectangles overlap or not on a 2D plane.

### Example
Input:  
Rectangle 1 → (0, 10), (10, 0)  
Rectangle 2 → (5, 5), (15, 0)  

Output: Rectangle Overlapped

### Approach: Coordinate Comparison
- If one rectangle is completely to the left of the other → no overlap
- If one rectangle is completely above the other → no overlap
- Otherwise, rectangles overlap

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- Uses top-left and bottom-right coordinates
- Works for axis-aligned rectangles only
- Simple logical conditions, no loops required

### Conclusion
- Coordinate comparison is efficient and sufficient
- Best approach for rectangle overlap problems

---

## Problem Name - Factorial of a Number
STATEMENT - Find the factorial of a given number.

### Example
Input: 5 → Output: 120  
(5 × 4 × 3 × 2 × 1)

### Approach 1: Iterative Method
- Initialize result as `1`
- Multiply numbers from `2` to `n`

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

### Approach 2: Recursion Method
- Base case: `n == 0 or n == 1`
- Recursive call with `n - 1`

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)` (recursion stack)

### Key Notes
- Iterative approach is faster and memory efficient
- Recursive approach is easier to understand conceptually

### Conclusion
- Prefer iterative method in real-world applications
- Use recursion for learning and practice

---

## Problem Name - Pair Cube Count
STATEMENT - Count the number of distinct pairs `(a, b)` such that  
`a³ + b³ = n`.

### Example
Input: 9 → Output: 1  
(1³ + 2³ = 9)

### Approach 1: Nested Loop (Naive)
- Iterate `a` from `1` to `n`
- Iterate `b` from `1` to `n`
- Check if `a³ + b³ == n`

**Time Complexity:** `O(n²)`  
**Space Complexity:** `O(1)`

### Approach 2: Mathematical Optimization
- Iterate `a` till `∛n`
- Compute remaining value `b = n - a³`
- Check if `b` is a perfect cube

**Time Complexity:** `O(∛n)`  
**Space Complexity:** `O(1)`

### Key Notes
- Optimized approach avoids unnecessary iterations
- Uses cube root to limit search space
- Much faster for large values of `n`

### Conclusion
- Nested loop is easy but inefficient
- Optimized approach is preferred for performance

---

## Problem Name - GCD of Two Numbers
STATEMENT - Find the Greatest Common Divisor (GCD) of two given numbers.

### Example
Input: 36, 60 → Output: 12  

### Approach 1: Using Loop (Naive)
- Start from minimum of both numbers
- Check divisibility for both numbers
- First common divisor from top is GCD

**Time Complexity:** `O(min(a, b))`  
**Space Complexity:** `O(1)`

### Approach 2: Euclidean Algorithm (Subtraction)
- Repeatedly subtract smaller number from larger
- Continue until both numbers become equal

**Time Complexity:** `O(max(a, b))`  
**Space Complexity:** `O(1)`

### Approach 3: Modified Euclidean Algorithm (Optimized Subtraction)
- Check divisibility before subtraction
- Reduces unnecessary recursive calls

**Time Complexity:** `O(max(a, b))`  
**Space Complexity:** `O(1)`

### Approach 4: Euclidean Algorithm (Modulo - Optimized)
- Replace subtraction with remainder operation
- Recursively compute `gcd(b, a % b)`

**Time Complexity:** `O(log(min(a, b)))`  
**Space Complexity:** `O(log(min(a, b)))`

### Approach 5: Built-in Method
- Use `BigInteger.gcd()` for direct computation

**Time Complexity:** `O(log(min(a, b)))`  
**Space Complexity:** `O(1)`

### Key Notes
- Modulo-based Euclidean algorithm is the most efficient
- Built-in method is reliable and clean
- Naive approaches are useful for understanding basics

### Conclusion
- Prefer modulo-based Euclidean algorithm in practice
- Use built-in method when readability matters

---

