package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int digit1 = number / 1000; // Get the first digit
        int digit2 = (number / 100) % 10; // Get the second digit
        int digit3 = (number / 10) % 10; // Get the third digit
        int digit4 = number % 10; // Get the fourth digit

        // Calculating sum
        int sum = digit1 + digit2 + digit3 + digit4;

        System.out.println(sum);
    }

}
