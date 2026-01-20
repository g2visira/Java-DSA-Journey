# Recurring Sequence in Fraction

Given two integers `numr` (numerator) and `denr` (denominator), find the **repeating digit sequence** in the decimal representation of the fraction.

If no repeating part exists, return empty result.

---

## Input / Output

Example 1  
Input: numr = 50, denr = 22  
Output: 27  

Example 2  
Input: numr = 1, denr = 4  
Output: No recurring sequence  

---

## Key Observation (Very Important)

Repeating decimals occur when the **same remainder appears again** during long division.

So if a remainder repeats → the digits between repetitions form the **recurring sequence**.

---

## Approach – Remainder Tracking Method

### Steps

1. Store remainder and its position using HashMap  
2. Multiply remainder by 10  
3. Extract next digit  
4. Update remainder  
5. If remainder repeats:
   - Extract substring from first occurrence  
6. If remainder becomes 0:
   - No recurring sequence  

---

## Dry Run

Input: numr = 50, denr = 22  

Remainders process:

6 → 16 → 6 (repeat)

Digits formed:
27  

Output → 27  

---

## Time & Space Complexity

Time: O(n)  
Space: O(n)  

---

## Key Learning

- Recurring decimals are caused by remainder cycles  
- HashMap helps detect loops  
- Avoids floating point precision errors  
- Works accurately for large divisions  

---

## Conclusion

Use remainder tracking instead of float division.  
Reliable and interview friendly solution.
