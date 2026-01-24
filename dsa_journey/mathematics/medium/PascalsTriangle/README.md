# Pascal’s Triangle (n Rows)

Given an integer `n`, generate the first `n` rows of **Pascal’s Triangle**.

Each element is the sum of the two elements directly above it.

---

## Input / Output

Example  
Input: n = 5  

Output:
1  
1 1  
1 2 1  
1 3 3 1  
1 4 6 4 1  

---

## Key Observation (Very Important)

Pascal’s Triangle follows two important rules:

- First and last element of every row is `1`  
- Middle elements:

value = above-left + above-right  

Also,

Each element represents **binomial coefficient (nCr)**.

---

# Approach 1 – Using Binomial Coefficient Formula

### Idea

Each value is calculated using:

nCr formula

---

### Steps

1. Loop through rows  
2. Compute each value using binomial coefficient  
3. Store row in list  

---

### Complexity

Time: O(n²)  
Space: O(1)  

---

# Approach 2 – Dynamic Programming (Previous Row Method)

### Idea

Build triangle using previously computed row.

---

### Steps

1. Start with first row  
2. Use previous row values  
3. Add adjacent elements  
4. Store result  

---

### Complexity

Time: O(n²)  
Space: O(n²)  

---

# Approach 3 – Optimized Row Computation (Best)

### Idea

Use formula:

Next value = Previous value × (row - col) / col  

No extra space required.

---

### Steps

1. Start each row with 1  
2. Generate next values iteratively  
3. Print directly  

---

### Complexity

Time: O(n²)  
Space: O(1)  

---

## Key Learning

- Pascal’s Triangle is based on combinations  
- Dynamic programming avoids recomputation  
- Optimized method is fastest and memory efficient  
- Useful in combinatorics and probability  

---

## Conclusion

Use **Approach 3** for best performance.  
Fast, space optimized and interview friendly.
