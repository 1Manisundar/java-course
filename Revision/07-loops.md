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

