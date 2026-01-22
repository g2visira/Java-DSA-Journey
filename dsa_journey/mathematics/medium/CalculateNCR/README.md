# Calculate nCr (Combination)

Given two integers `n` and `r`, calculate the **combination value**:

nCr = n! / (r! × (n - r)!)

Combination means **order does NOT matter**.

---

## Input / Output

Example 1  
Input: n = 5, r = 2  
Output: 10  

Example 2  
Input: n = 6, r = 3  
Output: 20  

---

## Key Observation (Very Important)

- If r > n → result is 0  
- If r = 0 or r = n → result is 1  
- nCr grows fast, so optimized methods are preferred  

---

# Approach 1 – Recursive Method (Naive)

### Idea

Uses Pascal’s Identity:

nCr = (n-1)C(r-1) + (n-1)Cr  

---

### Steps

1. Handle base cases  
2. Call recursion using formula  
3. Return result  

---

### Complexity

Time: O(2^n)  
Space: O(n)  

Not efficient for large inputs.

---

# Approach 2 – Factorial Formula

### Formula

nCr = n! / (r! × (n - r)!)

---

### Steps

1. Compute factorial of n  
2. Compute factorial of r  
3. Compute factorial of (n-r)  
4. Apply formula  

---

### Complexity

Time: O(n)  
Space: O(1)  

Risk of overflow for large values.

---

# Approach 3 – Optimized Multiplication Method (Best)

### Idea

Avoid full factorial calculation.

Formula used internally:

nCr = (n-r+1)/1 × (n-r+2)/2 × ... × n/r  

---

### Steps

1. Initialize result = 1  
2. Multiply and divide step by step  
3. Return final value  

---

### Complexity

Time: O(r)  
Space: O(1)  

---

## Dry Run

Input: n = 5, r = 2  

Calculation:

(4/1) × (5/2)  
= 10  

Output → 10  

---

## Key Learning

- Recursion is slow for large n  
- Factorial approach is simple but risky for overflow  
- Optimized multiplication is fastest and safest  
- Always prefer mathematical optimization  

---

## Conclusion

Use **Approach 3** for best performance.  
Efficient, accurate and interview friendly.
