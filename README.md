# Java Simple Interest Calculator

## Overview
This is a simple Java-based console application that calculates both **Simple Interest** and **Compound Interest**. It takes user input for the principal amount, interest rate, and time period, then computes and displays the results. The program includes error handling for invalid inputs.

## Features
- Calculates **Simple Interest** using the formula: `SI = (P * R * T) / 100`
- Calculates **Compound Interest** using the formula: `CI = P * (1 + R/100)^T - P`
- Handles invalid inputs (negative values, non-numeric inputs)
- User-friendly CLI-based interaction

## Installation
### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a terminal with `javac` and `java`

### Steps
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/java-simple-interest-calculator.git
   ```
2. Navigate to the project folder:
   ```sh
   cd java-simple-interest-calculator
   ```
3. Compile the Java program:
   ```sh
   javac -d bin src/simpleinterestcalculator/SimpleInterestCalculator.java
   ```
4. Run the program:
   ```sh
   java -cp bin simpleinterestcalculator.SimpleInterestCalculator
   ```

## Usage
1. Enter the **principal amount**.
2. Enter the **annual interest rate** in percentage.
3. Enter the **time period** in years.
4. The program will display both **Simple Interest** and **Compound Interest**.

### Example Output
```
Enter Principal Amount: 1000
Enter Annual Interest Rate (in %): 5
Enter Time Period (in years): 3
Simple Interest: 150.00
Compound Interest: 157.63
```

## Repository Structure
```
java-simple-interest-calculator/
│── src/
│   └── SimpleInterestCalculator.java
│── README.md
└── LICENSE
```

## License
This project is licensed under the **MIT License**. See the `LICENSE` file for details.

