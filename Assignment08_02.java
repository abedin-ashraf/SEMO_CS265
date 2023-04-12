/*
 (Find the number of uppercase letters in a string) Write a recursive method to return the number of uppercase letters in a string. Write a test program that prompts the user to enter a string and displays the number of uppercase letters in the string.
 */

import java.util.Scanner;

public class Assignment08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = input.next();
        System.out.print("The number of uppercase in the string is " + searchUpperCase(s));
    }

    public static int searchUpperCase(String s) {
        if (s.length() == 1) {
            return (Character.isUpperCase(s.charAt(0)) ? 1 : 0);
        } else
            return searchUpperCase(s.substring(1)) + (Character.isUpperCase(s.charAt(0)) ? 1 : 0);
    }
}
