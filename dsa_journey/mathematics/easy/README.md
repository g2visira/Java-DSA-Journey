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

## Problem Name - LCM of Two Numbers
STATEMENT - Find the Least Common Multiple (LCM) of two given numbers.

### Example
Input: 5, 11 → Output: 55  

### Approach 1: Conditional Loop Method
- Start from the greater number
- Check multiples until a common multiple is found

**Time Complexity:** `O(a × b / max(a, b))`  
**Space Complexity:** `O(1)`

### Approach 2: Using GCD–LCM Formula (Expected)
Formula:  
LCM(a, b) = (a × b) / GCD(a, b)

- First calculate GCD using Euclidean algorithm
- Apply the formula to get LCM

**Time Complexity:** `O(log(min(a, b)))`  
**Space Complexity:** `O(1)`

### Key Notes
- Formula-based approach is faster and cleaner
- Loop-based method is easy to understand but inefficient
- Division before multiplication helps avoid overflow

### Conclusion
- Always prefer GCD-based formula for LCM
- Use loop approach only for learning basics

---

## Problem Name - Add Two Fractions
STATEMENT - Add two given fractions and return the result in its simplest form.

### Example
Input: 1/2 + 3/2 → Output: 2/1  

### Approach: Using LCM and GCD
- Find LCM of denominators using GCD
- Convert both fractions to common denominator
- Add numerators
- Simplify the result using GCD

**Time Complexity:** `O(log(min(a, b)))`  
**Space Complexity:** `O(1)`

### Key Notes
- GCD is used for both LCM calculation and simplification
- Result is always returned in reduced form
- Works for all valid integer fractions

### Conclusion
- GCD-based approach is efficient and optimal
- Best method for fraction addition problems

---

## Problem Name - Day of the Week
STATEMENT - Find the day of the week for a given date.

### Example
Input: 15 / 6 / 1995 → Output: Day Index (0–6)

### Approach 1: Formula-Based Method
- Use predefined month codes
- Adjust year for January and February
- Compute year code using century and leap year rules
- Final result obtained using modulo `7`

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Approach 2: Zeller’s Congruence (Optimized)
- Apply Zeller’s Congruence formula
- Adjust year when month is January or February
- Directly compute day index using modulo arithmetic

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

### Key Notes
- Both approaches return day index in range `0–6`
- Zeller’s Congruence is widely used and reliable
- No loops or extra memory required

### Conclusion
- Zeller’s Congruence is cleaner and more standard
- Formula-based approach helps in understanding logic

---

## Problem Name - Nth Fibonacci Number
STATEMENT - Find the nth Fibonacci number, where each number is the sum of the previous two numbers.

The Fibonacci sequence starts as:  
0, 1, 1, 2, 3, 5, 8, 13, ...

### Example
Input: 9 → Output: 34  

### Approach 1: Recursion
In this approach, the problem is broken down into smaller subproblems.
- If `n` is `0` or `1`, return `n`
- Otherwise, recursively calculate `fib(n - 1)` and `fib(n - 2)`
- Add both results to get the nth Fibonacci number

**Time Complexity:** `O(2^n)`  
**Space Complexity:** `O(n)` (due to recursion stack)

**Explanation:**  
This approach closely follows the mathematical definition of Fibonacci numbers, which makes it easy to understand. However, it recalculates the same values many times, making it inefficient for larger values of `n`.

### Approach 2: Bottom-Up Dynamic Programming
This approach avoids repeated calculations by storing previously computed values.
- Create an array `dp` where `dp[i]` stores the ith Fibonacci number
- Initialize base cases `dp[0] = 0` and `dp[1] = 1`
- Build the solution iteratively up to `n`

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

**Explanation:**  
By storing results, this method ensures that each Fibonacci number is computed only once. It is much faster than recursion and is a classic example of dynamic programming.

### Approach 3: Space Optimized Iterative Approach
This is an improvement over the DP approach.
- Instead of storing all values, keep track of only the last two Fibonacci numbers
- Update them iteratively until reaching the nth value

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

**Explanation:**  
Since only the previous two values are required to compute the next one, extra memory can be avoided. This approach is both efficient and clean, making it suitable for real-world usage.

### Approach 4: Golden Ratio Method
This method uses the mathematical approximation based on the golden ratio (φ).
- Uses a constant value of φ ≈ 1.618
- Calculates Fibonacci numbers by repeated multiplication and rounding

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

**Explanation:**  
This approach is interesting from a mathematical perspective, but due to floating-point rounding, it may produce incorrect results for larger values of `n`.

### Key Notes
- Recursive approach is intuitive but inefficient
- Dynamic programming removes redundant calculations
- Space-optimized approach gives the best balance of performance and memory
- Golden ratio method should be used cautiously

### Conclusion
- For learning purposes, recursion helps in understanding the logic
- For practical and interview scenarios, the space-optimized iterative approach is the best choice

---

## Problem Name - Decimal to Binary Conversion
STATEMENT - Convert a given decimal number into its binary representation.

Binary representation uses only `0` and `1`, where each digit represents a power of `2`.

### Example
Input: 12 → Output: 1100  

### Approach 1: Division by 2 (Iterative)
This is the most basic and commonly taught method.
- Repeatedly divide the number by `2`
- Store the remainder (`0` or `1`)
- Reverse the obtained sequence to get the binary number

**Time Complexity:** `O(log n)`  
**Space Complexity:** `O(log n)`

**Explanation:**  
Each division by `2` gives the next least significant bit. Since bits are obtained in reverse order, the result must be reversed at the end.

### Approach 2: Recursion
This approach builds the binary representation from the most significant bit.
- Recursively divide the number by `2`
- Append the remainder after the recursive call returns

**Time Complexity:** `O(log n)`  
**Space Complexity:** `O(log n)` (recursion stack)

**Explanation:**  
Recursion naturally processes higher bits first, so the binary number is formed in the correct order without reversing.

### Approach 3: Bitwise Operator
This approach uses low-level bit manipulation.
- Use `n & 1` to extract the last bit
- Right shift the number using `n >> 1`
- Reverse the collected bits

**Time Complexity:** `O(log n)`  
**Space Complexity:** `O(log n)`

**Explanation:**  
Bitwise operations are faster and closer to how numbers are represented internally, making this approach efficient and interview-friendly.

### Approach 4: Built-in Function
- Use Java’s built-in `Integer.toBinaryString()` method

**Time Complexity:** `O(log n)`  
**Space Complexity:** `O(1)`

**Explanation:**  
This is the cleanest approach for real-world applications, but it hides the actual logic, so it’s not recommended when learning fundamentals.

### Key Notes
- Binary digits are obtained from least significant bit to most significant bit
- Bitwise approach is the closest to hardware-level computation
- Built-in methods are good for production code

### Conclusion
- Use division or recursion to understand the concept
- Use bitwise method for optimized logic
- Use built-in function when readability matters most

---

## Problem Name - Find Nth Term of the Series
STATEMENT - Find the nth term of the series:  
1, 3, 6, 10, 15, 21, ...

This series is formed by adding natural numbers step by step and is also known as the **Triangular Number Series**.

### Example
Input: 1 → Output: 1  
Input: 4 → Output: 10  
Input: 6 → Output: 21  

### Approach 1: Using Loop
In this approach, we directly follow how the series is formed.
- Start with a variable `ans = 0`
- Add numbers from `1` to `n`
- The final sum gives the nth term

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

**Explanation:**  
This method is easy to understand because it mimics the actual formation of the series. However, for large values of `n`, it becomes slower due to repeated additions.

### Approach 2: Using Mathematical Formula
This approach uses a direct formula to calculate the result.
- The nth term of the series is given by:  
  **n × (n + 1) / 2**

**Time Complexity:** `O(1)`  
**Space Complexity:** `O(1)`

**Explanation:**  
This formula is derived from the sum of the first `n` natural numbers. It avoids loops and computes the result instantly, making it the most efficient approach.

### Key Notes
- This series represents triangular numbers
- Loop-based approach is good for understanding logic
- Formula-based approach is optimal and preferred

### Conclusion
- Use loop approach when learning the concept
- Use formula approach for performance and interviews

---

## Problem Name - Armstrong Number
STATEMENT - Check whether a given number is an Armstrong number or not.

An Armstrong number is a number that is equal to the sum of its digits raised to the power of the number of digits.

### Example
Input: 153 → Output: true  

Explanation:  
1³ + 5³ + 3³ = 1 + 125 + 27 = 153  

### Approach 1: Mathematical Digit Processing
This approach follows the exact definition of an Armstrong number.
- First, find the number of digits in the given number
- Extract each digit one by one
- Raise each digit to the power of total digits
- Add all the powered digits and compare with the original number

**Time Complexity:** `O(d × log d)`  
**Space Complexity:** `O(1)`  
(where `d` is the number of digits)

**Explanation:**  
This method stays close to the mathematical concept of Armstrong numbers. It avoids converting the number into another format and works purely with digits.

### Approach 2: Using Numeric String
This approach converts the number into a string.
- Convert the number to string
- Find the length of the string (number of digits)
- Convert each character back to digit
- Raise it to the required power and sum

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(d)`

**Explanation:**  
This approach is easier to write and understand, especially for beginners. However, it uses extra memory due to string conversion.

### Key Notes
- Armstrong numbers depend on the number of digits
- Mathematical approach avoids extra memory
- String-based approach improves readability
- Both approaches give the same result

### Conclusion
- Use mathematical digit processing for better efficiency
- Use string-based approach for clarity and simplicity
- Both methods are valid depending on the use case

---

## Problem Name - Palindrome Number
STATEMENT - Check whether a given number is a palindrome or not.

A palindrome number is a number that reads the same forward and backward.

### Example
Input: 12321 → Output: true  
Input: 123 → Output: false  

### Approach 1: Reversing the Number
In this approach, we reverse the given number and compare it with the original number.
- Store the absolute value of the number to handle negatives
- Reverse the number using digit extraction
- Compare the reversed number with the original value

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(1)`  
(where `d` is the number of digits)

**Explanation:**  
This approach works directly with numbers and avoids any extra data structures. It is efficient and commonly preferred in interviews.

### Approach 2: Using Number as a String
This approach checks palindrome property by treating the number as a string.
- Convert the number into a string
- Compare characters from start and end moving towards the center

**Time Complexity:** `O(d)`  
**Space Complexity:** `O(d)`

**Explanation:**  
This method is easier to understand and implement. However, it uses extra memory due to string conversion.

### Key Notes
- Negative numbers are handled using absolute value
- Reversing method is more memory efficient
- String approach improves readability

### Conclusion
- Use number reversal approach for optimized performance
- Use string-based approach for simplicity and clarity

---
