# Kth Digit of Power (Large Exponent)

Given integers `a`, `b` and `k`, find the **k-th digit from right** in the value of `a^b`.

---

## Input / Output

Example 1  
Input: a = 5, b = 2, k = 1  
Output: 5  

Example 2  
Input: a = 7, b = 3, k = 2  
Output: 4  

---

## Key Observation (Very Important)

Directly calculating `a^b` is not safe for large values because it may cause **overflow**.

So we use:

- **Binary Exponentiation**
- **Modulo with 10^k**

This keeps only the **last k digits** of the result.

---

## Approach – Fast Power with Modulo

### Steps

1. Compute `mod = 10^k`  
2. Use binary exponentiation to calculate:

(a^b) % mod  

3. Remove last (k-1) digits by dividing result  
4. Return the remaining digit  

---

## Dry Run

Input: a = 5, b = 2, k = 1  

Power value:
5² = 25  

Last 1 digit:
25 → 5  

Output → 5  

---

## Time & Space Complexity

Time: O(log b)  
Space: O(1)  

---

## Key Learning

- Binary exponentiation makes power calculation fast  
- Modulo limits number size  
- Avoids overflow issues  
- Efficient for large exponents  

---

## Conclusion

Never compute power directly for large values.  
Use fast exponentiation with modulo for optimized performance.
