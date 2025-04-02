# Numbered Right-Angle Triangle Pattern in Java

## Description
This Java program generates a right-angled triangle pattern of numbers. The user inputs a number `n`, which determines the number of rows in the triangle. Each row contains the same number repeated, starting from 1 up to `n`. The program makes use of nested `for` loops to achieve this pattern.

## Code Explanation

### Package Declaration
```java
package number_patterns;
```
This declares that the class belongs to the `number_patterns` package.

### Importing Scanner Class
```java
import java.util.Scanner;
```
The `Scanner` class from the `java.util` package is imported to allow user input.

### Class Declaration
```java
public class Numbered_RightAngleTriangle
```
Defines a public class named `Numbered_RightAngleTriangle`.

### Main Method
```java
public static void main(String[] args)
```
The `main` method is the entry point of the Java program.

### Scanner Object Creation
```java
Scanner s = new Scanner(System.in);
```
The `Scanner` object `s` is created to take user input from the console.

### User Input
```java
System.out.println("Enter the Number");
int n = s.nextInt();
```
The program prompts the user to enter a number and stores it in the variable `n`.

### Variable Initialization
```java
int num = 1;
```
The variable `num` is initialized to 1 and is used to control the numbers printed in the pattern.

### Outer `for` Loop
```java
for(int i=1; i<=n; i++)
```
- The loop runs from `i = 1` to `i = n`.
- Controls the number of rows in the pattern.

### Inner `for` Loop
```java
for(int j=0; j<i; j++)
```
- This loop prints the numbers in each row.
- The loop runs `i` times, ensuring that row `i` has `i` numbers printed.

### Printing the Numbers
```java
System.out.print(num);
```
Prints the value of `num` without moving to the next line.

### Moving to the Next Line
```java
System.out.println();
```
Moves the cursor to the next line after completing a row.

### Incrementing the Number
```java
num++;
```
Increments the `num` variable after each row so that the next row has the next number.

## Sample Output
**Input:** `5`
```
1
22
333
4444
55555
```

## Key Concepts
1. **Scanner Class**: Used to take user input.
2. **Nested `for` Loops**: Used to create the pattern structure.
3. **Printing Statements**: `System.out.print()` and `System.out.println()` for formatting output.
4. **Incrementing Values**: `num++` ensures the correct number is printed in each row.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Numbered_RightAngleTriangle.git
```
