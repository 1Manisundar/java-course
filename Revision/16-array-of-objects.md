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

