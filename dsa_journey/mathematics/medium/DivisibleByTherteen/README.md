# Check Divisibility by 13 (Large Number)

Given a very large number as a string, check if it is divisible by 13.

---

## Input / Output

Example 1  
Input: "2911285"  
Output: true  

Example 2  
Input: "123456"  
Output: false  

---

## Key Observation (Very Important)

Divisibility by 13 has no simple last-digit rule.  
So we use the **3-digit grouping with alternating addition and subtraction** trick.

Why this works?

Because powers of 1000 repeat in modulo 13 pattern, so we can break the number into chunks of 3 digits.

---

## Approach – Alternating 3 Digit Group Method

### Steps

1. Make string length multiple of 3 by adding trailing zeros  
2. Traverse from right side  
3. Form groups of 3 digits  
4. Add and subtract groups alternately  
5. Take absolute sum  
6. If sum % 13 == 0 → divisible  

---

## Dry Run

Input: "2911285"  

After padding: "291128500"  

Groups (Right to Left):

500 → +500  
128 → -128  
291 → +291  

Calculation:

500 - 128 + 291 = 663  
663 % 13 = 0  

Output → true  

---

## Time & Space Complexity

Time: O(n)  
Space: O(1)  

---

## Key Learning

- Divisibility by 13 needs number theory tricks  
- Grouping reduces large number handling  
- String based solution avoids overflow  
- Works efficiently for very large inputs  

---

## Conclusion

Use grouping logic when modulo accumulation is not allowed.  
Fast, memory efficient and interview acceptable.
