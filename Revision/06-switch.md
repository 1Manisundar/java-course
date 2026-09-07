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

