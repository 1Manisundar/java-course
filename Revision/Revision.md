# Java Revision Notes

Complete interview-focused revision notes for the Java topics covered so far.

## Table of Contents

1. [Java Basics](#1-java-basics)
2. [Variables and Data Types](#2-variables-and-data-types)
3. [Type Casting](#3-type-casting)
4. [Operators](#4-operators)
5. [Conditional Statements](#5-conditional-statements)
6. [Switch Statement](#6-switch-statement)
7. [Loops](#7-loops)
8. [Arrays](#8-arrays)
9. [Multidimensional Arrays](#9-multidimensional-arrays)
10. [Jagged Arrays](#10-jagged-arrays)
11. [3D Arrays](#11-3d-arrays)
12. [Enhanced For Loop](#12-enhanced-for-loop)
13. [Classes and Objects](#13-classes-and-objects)
14. [Methods](#14-methods)
15. [Method Overloading](#15-method-overloading)
16. [Array of Objects](#16-array-of-objects)

---


---

# Java Basics

## JVM, JRE, JDK
- JVM: Executes Java bytecode.
- JRE: JVM + libraries required to run Java applications.
- JDK: JRE + development tools such as `javac`.

## Java Execution Flow
`.java` → `javac` → `.class` (bytecode) → JVM → machine code

## Key Points
- Java follows Write Once, Run Anywhere (WORA).
- `.java` = source code.
- `.class` = Java bytecode.
- JVM executes bytecode.
- `main()` is the entry point of a Java application.

## static
`static` means a member belongs to the class rather than a particular object.
`main()` is static so Java can call it without creating an object first.


---

# Variables and Data Types

## Variable
A variable is a named memory location used to store a value.

```java
int age = 25;
```

## Primitive Data Types
`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`

## Important
- `char` stores a single character.
- `String` stores text and is not a primitive type.
- Integer literals such as `10` are normally `int`.
- Float literals need `f`: `10.5f`.

## Default Values
- numeric types → `0`
- boolean → `false`
- char → `\u0000`
- reference types → `null`


---

# Type Casting

Type casting means converting one data type into another.

## Widening Casting
Smaller type → larger compatible type. Automatic.

```java
int x = 10;
double y = x;
```

## Narrowing Casting
Larger type → smaller type. Must be explicit.

```java
double x = 10.5;
int y = (int) x;
```

The fractional part can be lost.

## byte Overflow
`byte` range is `-128` to `127`.

```java
byte x = 127;
x++;
System.out.println(x); // -128
```

Widening → automatic. Narrowing → explicit and may lose data.


---

# Operators

## Arithmetic
`+  -  *  /  %`

`%` gives the remainder. Integer division removes the decimal part.

```java
10 / 3 // 3
10 % 3 // 1
```

## Assignment
`=` assigns a value.

## Comparison
`==  !=  >  <  >=  <=`

`=` assigns; `==` compares.

## Logical
`&&` = AND, `||` = OR, `!` = NOT

## Increment / Decrement
`x++`, `++x`, `x--`, `--x`

Post-increment uses the old value first. Pre-increment increments before using the value.


---

# Conditional Statements

Used to execute code based on conditions.

## if
```java
if (age >= 18) {
    System.out.println("Adult");
}
```

## if-else
```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

## else-if
Conditions are checked from top to bottom. Once a matching branch executes, remaining branches are skipped.

## Common Mistake
Use `==` for comparison, not `=`.


---

# Switch Statement

Used when comparing a value against fixed cases.

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

## break
Stops execution from falling into the next case. Without `break`, Java can continue into following cases: **fall-through**.

## default
Runs when no case matches.

## switch vs if-else
- `switch` → fixed values.
- `if-else` → ranges and complex conditions.


---

# Loops

Loops repeat code.

## while
Checks the condition before executing. May execute zero times.

## do-while
Executes at least once because the condition is checked afterward.

## for
Common when the number of iterations is known.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

## continue
Skips the current iteration and moves to the next iteration.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.print(i + " ");
}
```
Output: `1 2 4 5`

## Nested Loops
A loop inside another loop. The inner loop runs for every outer-loop iteration.


---

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


---

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


---

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


---

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


---

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


---

# Classes and Objects

## Class
A class is a blueprint/template used to create objects.

```java
class Student {
    int roll;
    String name;
    int marks;
}
```

## Object
An object is an **instance of a class**.

```java
Student s1 = new Student();
```

- `Student` → class/reference type
- `s1` → reference variable
- `new Student()` → creates an object

## Reference
`Student s1;` only declares a reference variable. No object is created yet.

## Fields
Access fields using the dot operator: `s1.name = "Mani";`

## Object References
```java
Student s2 = s1;
```
This does not create a new object. Both references point to the same object.


---

# Methods

A method is a block of code that performs a specific task.

```java
int add(int a, int b) {
    return a + b;
}
```

## Parts
- `int` → return type
- `add` → method name
- `a, b` → parameters
- `return` → sends a value back

## Parameters vs Arguments
Parameters are variables defined in the method.
Arguments are actual values passed during the call.

`add(10, 20);` → `10` and `20` are arguments.

## void
A `void` method does not return a value.

```java
void greet() {
    System.out.println("Hello");
}
```

You cannot store a `void` result in an `int`.

Parameter types and return type are independent.


---

# Method Overloading

Method overloading means the **same method name with a different parameter list**.

```java
int add(int a, int b) {
    return a + b;
}

int add(int a, int b, int c) {
    return a + b + c;
}
```

Parameters can differ by:
- number
- type
- order

Example:
```java
void show(int x) { }
void show(double x) { }
```

## Important
Return type alone cannot overload a method.


---

# Array of Objects

An array can store references to objects.

```java
class Student {
    int roll;
    String name;
}

Student[] students = new Student[3];
```

This creates the **array**, but does not create 3 Student objects.

Initially:
`[null, null, null]`

Create objects separately:
```java
students[0] = new Student();
students[1] = new Student();
students[2] = new Student();
```

## null
`Student` is a reference type, so the default value of an object-array element is `null`.

Accessing `students[0].name` while `students[0]` is `null` throws `NullPointerException`.

## Enhanced for
```java
for (Student s : students) {
    System.out.println(s.name);
}
```

Primitive array → `[0, 0, 0]`
Object array → `[null, null, null]`

