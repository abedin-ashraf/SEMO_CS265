/*
 (Maximum element in an array) Implement the following method that returns the maximum element in an array: public static <E extends Comparable<E>> E max(E[] list)

Write a test program that prompts the user to enter 10 integers, invokes this method to find the max, and displays the maximum number.
 */

import java.util.Scanner;

public class Assignment09_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

}
