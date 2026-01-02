# Numbers with Exactly 3 Divisors

Given a positive integer `n`, count how many numbers **≤ n** have **exactly 3 divisors**.

---

## Input / Output

### Example 1
**Input:** `n = 16`  
**Output:** `2`  
**Explanation:** Numbers are `4 (1,2,4)` and `9 (1,3,9)`.

### Example 2
**Input:** `n = 100`  
**Output:** `4`  
**Explanation:** Numbers are `4, 9, 25, 49`.

---

## Key Observation (Very Important 💡)

A number has **exactly 3 divisors** **iff** it is a **square of a prime number**.

Why?
- Divisors of `p²` → `{1, p, p²}` → exactly 3
- Any other number either has <3 or >3 divisors

So the task reduces to:
> **Count prime numbers `p` such that `p² ≤ n`**

---

## Approach 1 – Brute Force Divisor Counting

### Approach
- For every number from `1` to `n`
- Count its divisors using another loop
- If divisor count is exactly `3`, increment answer

### Why This Works
The approach directly follows the definition of divisors.  
No optimization, just raw checking.

### Dry Run (n = 16)
- `4 → divisors = {1,2,4}` → count = 3 ✔
- `9 → divisors = {1,3,9}` → count = 3 ✔  
Answer = `2`

### Time & Space Complexity
- **Time:** O(n²)
- **Space:** O(1)

---

## Approach 2 – Sieve of Eratosthenes (Optimized)

### Approach
- Find all prime numbers up to `√n` using **Sieve of Eratosthenes**
- Count how many primes `p` satisfy `p² ≤ n`

### Why This Works
Only squares of prime numbers can have exactly 3 divisors.  
Sieve efficiently finds all primes up to `√n`.

### Dry Run (n = 100)
- `√100 = 10`
- Primes ≤ 10 → `{2, 3, 5, 7}`
- Squares → `{4, 9, 25, 49}`  
Answer = `4`

### Time & Space Complexity
- **Time:** O(√n log log √n)
- **Space:** O(√n)

---

## Approach 3 – Prime Check Without Sieve

### Approach
- Iterate `i` from `2` while `i² ≤ n`
- Check whether `i` is prime using trial division
- If prime, increment count

### Why This Works
Still uses the core observation (`p² ≤ n`),  
but checks primality on the fly instead of using a sieve.

### Dry Run (n = 50)
- `i = 2` → prime → `4 ≤ 50` ✔
- `i = 3` → prime → `9 ≤ 50` ✔
- `i = 4` → not prime ❌
- `i = 5` → prime → `25 ≤ 50` ✔  
Answer = `3`

### Time & Space Complexity
- **Time:** O(√n · √√n)
- **Space:** O(1)

---

## Key Learning
- A number with **exactly 3 divisors** must be a **square of a prime**
- Brute force works but is highly inefficient
- **Sieve of Eratosthenes** is the cleanest and fastest approach
- Recognizing number theory patterns saves massive computation
- Always try to reduce the problem using mathematical observations first

---
