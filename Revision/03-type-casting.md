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

