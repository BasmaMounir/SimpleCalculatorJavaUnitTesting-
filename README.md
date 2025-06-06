﻿# SimpleCalculatorJavaUnitTesting 🧮 

This project is a simple calculator implementation with a method to add two numbers ➕. The program includes a **Calculator** class that performs the addition operation and a test class **CalculatorTest** to test the functionality of the `add()` method. 🧑‍💻

## Features ✨

- **Addition method**: Adds two positive integers. 
- **Error handling**: Throws a `RuntimeException` if any input number is negative ⚠️.
- **JUnit Testing**: Contains test cases for both valid and invalid inputs using **JUnit 5** ✅.

## Calculator Class 📦

The **Calculator** class contains a single method:

### `int add(int number1, int number2)` 🔢

This method accepts two integers and returns their sum, but only if both numbers are non-negative. If either of the numbers is negative, it throws a `RuntimeException` with the message "positive numbers only" 🚫.

## CalculatorTest Class 🧪

The **CalculatorTest** class is responsible for testing the **add** method. It includes two test cases:

1. **testAdd**: Tests valid input where both numbers are positive. It uses the `@ParameterizedTest` annotation to test multiple cases.
2. **testAddNegativeNumberShouldThrowException**: Tests invalid input where one or both numbers are negative ❌. It checks if the `RuntimeException` is thrown correctly.

![image](https://github.com/user-attachments/assets/b516afc9-e561-4d5a-b932-0f8df139f234)


### Test Methods 🔍:

- **addData**: A method that provides a stream of valid test data (positive numbers) for addition ✅.
- **addNegativeData**: A method that provides a stream of invalid test data (negative numbers) for testing the exception throwing ❗.

## How to Run 🏃‍♂️

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run the tests using your preferred IDE or the following Maven command:

```bash
mvn test
