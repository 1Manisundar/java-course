# 3D Arrays

A 3D array can be viewed as multiple 2D arrays/layers.

```java
int[][][] nums = new int[2][3][4];
```

- 2 layers
- 3 rows per layer
- 4 columns per row

## Indexing
`nums[i][j][k]`

- `i` → layer
- `j` → row
- `k` → column

`nums[1][2][3]` → 2nd layer, 3rd row, 4th column.

## Lengths
- `nums.length` → 2
- `nums[0].length` → 3
- `nums[0][0].length` → 4

## Total
`2 × 3 × 4 = 24`

