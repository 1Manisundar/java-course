# Jagged Arrays

A jagged array is a 2D array where different rows can have different lengths.

```java
int[][] nums = {
    {10, 20},
    {30, 40, 50},
    {60}
};
```

- Row 0 → 2 elements
- Row 1 → 3 elements
- Row 2 → 1 element

`nums.length` → 3
`nums[0].length` → 2
`nums[1].length` → 3
`nums[2].length` → 1

When traversing, use `nums[i].length`.

