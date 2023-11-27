package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Spaces before the numbers
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // Incrementing part of the row
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Decrementing part of the row
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
