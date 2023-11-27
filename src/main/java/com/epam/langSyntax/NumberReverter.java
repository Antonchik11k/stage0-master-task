package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int digit1 = number / 100; // Get the first digit
        int digit2 = (number / 10) % 10; // Get the second digit
        int digit3 = number % 10; // Get the third digit

        // Reversing the number
        int reversedNumber = digit3 * 100 + digit2 * 10 + digit1;

        System.out.println(reversedNumber);
    }

}
