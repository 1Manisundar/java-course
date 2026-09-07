# Arrays

An array stores multiple values of the same type.

```java
int[] nums = new int[5];
```

## Index
Arrays are zero-based. For length 5, indexes are `0,1,2,3,4`.

Last index = `length - 1`.

## Initialization
```java
int[] nums = {10, 20, 30};
```

## length
`nums.length` gives the number of elements. It is a property, not a method.

## Default Values
`new int[3]` → `[0, 0, 0]`

## Fixed Size
An array's size cannot be changed after creation.

## Common Error
Accessing index `3` in an array of length `3` throws `ArrayIndexOutOfBoundsException`.

## Enhanced for
```java
for (int n : nums) {
    System.out.println(n);
}
```
Useful when you need values but not indexes.

