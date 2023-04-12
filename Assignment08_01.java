/*
 (Print the digits in an integer reversely) Write a recursive method that displays an int value reversely on the console using the following header: public static void reverseDisplay(int value). For example, reverseDisplay(12345) displays 54321. 

Write a test program that prompts the user to enter an integer and displays its reversal. 
 */

import java.util.Scanner;

public class Assignment08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to print in reverse order: ");
        long number = input.nextLong();
        System.out.println("Reverse order is: ");
        reverseNumber(number);
    }

    public static void reverseNumber(long number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);

        }
    }
}
