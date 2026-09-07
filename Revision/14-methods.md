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

