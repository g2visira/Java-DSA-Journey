# Program for Square Root of Integer

Given a positive integer `n`, find its square root.  
If `n` is **not a perfect square**, return the **floor value of √n**.

---

## Input / Output

### Example 1
**Input:** `n = 4`  
**Output:** `2`  
**Explanation:** The square root of 4 is exactly 2.

### Example 2
**Input:** `n = 11`  
**Output:** `3`  
**Explanation:** √11 lies between 3 and 4, so the floor value is 3.

---

## Approach 1 – Naive Iterative Method

### Approach
- Start with `res = 1`
- Keep incrementing `res` while `res * res <= n`
- When the condition fails, return `res - 1`

### Why This Works
Squares grow in increasing order.  
The moment `res * res` exceeds `n`, the previous value of `res` is the floor square root.

### Dry Run (n = 11)
- `res = 1` → `1 <= 11` ✔
- `res = 2` → `4 <= 11` ✔
- `res = 3` → `9 <= 11` ✔
- `res = 4` → `16 > 11` ❌  
Return `3`

### Time & Space Complexity
- **Time:** O(√n)
- **Space:** O(1)

---

## Approach 2 – Binary Search on Answer Space

### Approach
- Apply binary search between `1` and `n`
- Check if `mid * mid <= n`
- Store valid `mid` and move right to find a better answer

### Why This Works
The square function is **monotonic**, so binary search can be applied safely on the answer range.

### Dry Run (n = 11)
- `lo = 1`, `hi = 11`
- `mid = 6` → `36 > 11` → move left
- `mid = 3` → `9 <= 11` → store `3`, move right
- `mid = 4` → `16 > 11` → move left  
Final answer = `3`

### Time & Space Complexity
- **Time:** O(log n)
- **Space:** O(1)

---

## Approach 3 – Using Built-in sqrt()

### Approach
- Directly compute `Math.sqrt(n)`
- Typecast the result to `int`

### Why This Works
Typecasting truncates the decimal part, effectively giving the floor value.

### Dry Run (n = 11)
- `Math.sqrt(11) ≈ 3.316`
- `(int) 3.316 → 3`

### Time & Space Complexity
- **Time:** O(1)
- **Space:** O(1)

---

## Approach 4 – Using Logarithm and Exponential

### Approach
- Use the formula: `sqrt(n) = exp(0.5 * log(n))`
- Correct the result in case of floating-point precision issues

### Why This Works
This method avoids loops and relies on mathematical computation, but needs a validation step.

### Dry Run (n = 11)
- `res = (int) exp(0.5 * log(11)) ≈ 3`
- Check `(res + 1)² <= n` → false  
Return `3`

### Time & Space Complexity
- **Time:** O(1)
- **Space:** O(1)

---

## Key Learning
- Square root problems can be solved using brute force, binary search, or math-based approaches
- **Binary search on answer space** is the most efficient and reliable method
- Built-in and mathematical solutions are fast but can suffer from precision issues
- Always validate results when using floating-point calculations
