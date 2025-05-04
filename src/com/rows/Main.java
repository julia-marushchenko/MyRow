package com.rows;

/**
 * Java program to print rows like this
 * Input: n = 1, Output: 10 9 8 7 6 5 4 3 2 1
 * Input n = 2, Output: 20 18 16 14 12 10 8 6 4 2
 * Condition 1 <= n<= 1000
 *
 * @autor Julia Marushchenko
 * @version 1.1
 * @since 2025-05-04
 */
public class Main {

    // Method to print a row of numbers in reverse order
    public void calculateMultiples(int n) {

        // Condition
        if(n >= 1 && n <= 1000){

            //Starting number
            int number = n * 10;

            while(number >= n){
                // Printing to console
                System.out.print(number + " ");
                number = number - n;
            }
        }
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating instance of class Main
        Main instance = new Main();
        // Calling method calculateMultiples
        instance.calculateMultiples(3);
    }
}
