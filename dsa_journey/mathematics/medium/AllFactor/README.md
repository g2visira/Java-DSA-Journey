# Find All Factors of a Number

Given an integer `n`, find and print **all factors (divisors)** of the number.

---

## Input / Output

Example  
Input: n = 10  

Output:  
1 2 5 10  

---

## Key Observation (Very Important)

Factors always come in **pairs**:

If `i` is a factor of `n` then `(n / i)` is also a factor.

So instead of checking till `n`, we only need to check till:

√n

---

# Approach 1 – Brute Force Method

### Idea

Check every number from `1` to `n`.

---

### Steps

1. Loop from 1 to n  
2. If n % i == 0 → add factor  
3. Return list  

---

### Complexity

Time: O(n)  
Space: O(1)  

Slow for large values.

---

# Approach 2 – Optimized Square Root Method (Best)

### Idea

Loop only till √n and add both factor pairs.

---

### Steps

1. Loop from 1 to √n  
2. If divisible:
   - Add i  
   - Add n/i (if different)  
3. Return list  

---

### Complexity

Time: O(√n)  
Space: O(1)  

---

## Key Learning

- Factors appear in pairs  
- Square root optimization improves performance  
- Avoid unnecessary loops  
- Efficient for large numbers  

---

## Conclusion

Use **Approach 2** for best performance.  
Fast, optimized and interview friendly.
