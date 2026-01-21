# Calculate nPr (Permutation)

Given two integers `n` and `r`, calculate the **permutation value**:

nPr = n! / (n - r)!

---

## Input / Output

Example 1  
Input: n = 5, r = 2  
Output: 20  

Example 2  
Input: n = 4, r = 3  
Output: 24  

---

## Key Observation (Very Important)

Permutation means **arrangement matters**.

Formula:

nPr = n! / (n - r)!

So we only need factorial values.

---

## Approach – Factorial Based Calculation

### Steps

1. Calculate factorial of `n`  
2. Calculate factorial of `(n - r)`  
3. Divide both values  
4. Return result  

---

## Dry Run

Input: n = 5, r = 2  

5! = 120  
3! = 6  

nPr = 120 / 6 = 20  

Output → 20  

---

## Time & Space Complexity

Time: O(n)  
Space: O(1)  

---

## Key Learning

- Permutations depend on order  
- Factorial helps compute permutation easily  
- Works efficiently for small values  
- Simple and clean implementation  

---

## Conclusion

Use factorial method for basic permutation problems.  
Fast and interview friendly solution.
