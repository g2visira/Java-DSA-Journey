# Check Divisibility by 4 (Large Number)

Given a number `N`, check whether it is **divisible by 4**.  
The number may be **very large**, so it is provided as a **string** instead of an integer.

---

## Input / Output

### Example 1
**Input:** `"769527595274152152854512"`  
**Output:** `Yes`

### Example 2
**Input:** `"12345"`  
**Output:** `No`

---

## Key Observation (Very Important)

A number is **divisible by 4** **iff** the number formed by its **last two digits** is divisible by `4`.

Why?
- `100` is divisible by `4`
- Any number can be written as  
  `N = (remaining digits × 100) + last_two_digits`
- So divisibility depends **only on the last two digits**

Examples:
- `312` → last two digits = `12` → `12 % 4 == 0` Run
- `1076` → last two digits = `76` → `76 % 4 == 0` Run
- `123` → last two digits = `23` → `23 % 4 != 0` Doesn't Run

---

## Approach 1 – Direct Integer Conversion (Not Safe)

### Approach
- Convert the entire number into an integer
- Check `number % 4 == 0`

### Why This Fails
- Very large numbers may cause **integer overflow**
- Not suitable when input size exceeds data type limits

### Time & Space Complexity
- **Time:** O(n)
- **Space:** O(1)
**Not recommended for large inputs**

---

## Approach 2 – Using Last Two Digits Rule (Optimized & Correct)

### Approach
- If string length is `0`, return `false`
- If string length is `1`, check that digit `% 4`
- Otherwise:
  - Extract the **last two characters**
  - Convert them to a number
  - Check `% 4 == 0`

### Why This Works
Divisibility by `4` depends **only on the last two digits**,  
so no need to process the entire number.

---

### Dry Run

#### Input: `"769527595274152152854512"`
- Last two digits = `"12"`
- `12 % 4 == 0` 
Output → `Yes`

#### Input: `"12345"`
- Last two digits = `"45"`
- `45 % 4 != 0` 
Output → `No`

---

### Time & Space Complexity
- **Time:** `O(1)`
- **Space:** `O(1)`

---

## Key Learning
- Divisibility rules can reduce big problems to small checks
- Last two digits are sufficient for divisibility by `4`
- String-based solutions avoid overflow issues
- Always look for **mathematical shortcuts** before brute force

---

## Conclusion
- Never convert huge numbers directly into integers
- Use divisibility rules for optimal solutions
- This approach is fast, safe, and interview-friendly

---
