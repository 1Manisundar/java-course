# Multidimensional Arrays

A 2D array can be viewed as rows containing arrays.

```java
int[][] nums = new int[3][4];
```

Means 3 rows and 4 columns in each row.

## Access
`nums[row][column]`

`nums[2][1]` means 3rd row, 2nd column.

## Length
- `nums.length` → number of rows.
- `nums[0].length` → number of elements in row 0.

## Nested Loop
`i` → row, `j` → column.

Use `nums[i].length` instead of assuming every row has the same size.

## Total Elements
`3 × 4 = 12`

