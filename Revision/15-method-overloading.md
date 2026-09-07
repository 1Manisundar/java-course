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

