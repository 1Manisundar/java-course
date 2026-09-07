@"
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

"@ | Set-Content .\Revision.md -Encoding UTF8

Get-ChildItem *.md |
    Where-Object { $_.Name -match '^\d{2}-.*\.md$' } |
    Sort-Object Name |
    ForEach-Object {
        "`n---`n" | Add-Content .\Revision.md
        Get-Content $_.FullName | Add-Content .\Revision.md
    }

Write-Host "Revision.md created with all 16 topics."