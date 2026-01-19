# Fraction to Recurring Decimal

Given two integers `a` (numerator) and `b` (denominator), convert the fraction `a / b` into its **decimal representation**.  
If the decimal part is repeating, enclose the repeating part inside **parentheses ()**.

---

## Input / Output

Example 1  
Input: a = 50, b = 22  
Output: 2.(27)  

Example 2  
Input: a = 1, b = 2  
Output: 0.5  

---

## Key Observation (Very Important)

Repeating decimals occur when the **same remainder appears again** during division.

So the idea is simple:

- Track remainders  
- When a remainder repeats → cycle detected  

---

## Approach – Remainder Mapping Method

### Steps

1. Handle sign of result  
2. Add integer part of division  
3. Store remainder positions using HashMap  
4. Multiply remainder by 10  
5. Add quotient digit to result  
6. If remainder repeats:
   - Insert `(` at first occurrence  
   - Append `)` at end  
   - Stop  

---

## Dry Run

Input: a = 50, b = 22  

50 / 22 = 2 remainder 6  

Decimal steps:

6 × 10 = 60 → digit = 2 → rem = 16  
16 × 10 = 160 → digit = 7 → rem = 6 (repeats)  

Cycle detected: "27"  

Output → 2.(27)  

---

## Time & Space Complexity

Time: O(n)  
Space: O(n)  

---

## Key Learning

- Repeating decimals depend on remainder cycles  
- HashMap helps detect repetition  
- String building avoids floating point precision errors  
- Works for large inputs accurately  

---

## Conclusion

Never use floating point division for recurring decimals.  
Use remainder tracking for exact and reliable results.
