package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Spaces before the asterisks
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" "); // Adjust spacing for alignment
            }

            // Asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
