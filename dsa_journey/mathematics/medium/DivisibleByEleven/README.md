# Check Divisibility by 11 (Large Number)

Given a number `N`, check whether it is **divisible by 11**.  
The number can be **very large**, so it is provided as a **string**.

---

## Input / Output

### Example 1
**Input:** `"1234567589333892"`  
**Output:** `true`

### Example 2
**Input:** `"121"`  
**Output:** `true`

### Example 3
**Input:** `"12345"`  
**Output:** `false`

---

## Key Observation (Very Important)

A number is **divisible by 11** if the **difference between the sum of digits at odd positions and even positions** is divisible by `11` (including `0`).

> `(sum of digits at odd positions − sum of digits at even positions) % 11 == 0`

Indexing is done from **left to right**, starting at index `0`.

---

## Why This Rule Works

Any number can be represented as a combination of powers of `10`.  
Since:

- `10 ≡ -1 (mod 11)`
- `10² ≡ 1 (mod 11)`

Digits at alternate positions cancel out when checked modulo `11`.

That’s why alternating sums decide divisibility.

---

## Approach – Alternating Digit Sum (Optimized)

### Approach
- Traverse the string digit by digit
- Add digits at even indices to one sum
- Add digits at odd indices to another sum
- Take the difference of the two sums
- Check if the difference is divisible by `11`

---

### Dry Run

#### Input: `"1234567589333892"`

Digits with positions:

| Index | Digit | Sum |
|------|------|-----|
| 0 | 1 | oddSum = 1 |
| 1 | 2 | evenSum = 2 |
| 2 | 3 | oddSum = 4 |
| 3 | 4 | evenSum = 6 |
| ... | ... | ... |

Final:
- `oddSum - evenSum = multiple of 11` ✔  
Output → `true`

---

### Time & Space Complexity
- **Time:** `O(n)`
- **Space:** `O(1)`

---

## Key Learning
- Divisibility by `11` depends on **alternating digit sums**
- Entire number conversion is unnecessary
- String-based processing avoids overflow
- Number theory rules drastically simplify problems

---

## Conclusion
- Use alternating sum rule for divisibility by `11`
- Ideal for very large numbers
- Clean, fast, and interview-ready solution

---
