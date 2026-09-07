# Enhanced For Loop

The enhanced `for` loop iterates through elements directly.

```java
int[] nums = {10, 20, 30};

for (int n : nums) {
    System.out.println(n);
}
```

Read it as: **For each `n` in `nums`.**

## Index
Enhanced `for` does not provide an index directly. Use a normal `for` loop when the index is required.

## Important
For primitive values, changing `n` does not modify the original array because `n` receives a copy of the value.

## Objects
```java
for (Student s : students) {
    System.out.println(s.name);
}
```

