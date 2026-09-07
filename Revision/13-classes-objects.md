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

