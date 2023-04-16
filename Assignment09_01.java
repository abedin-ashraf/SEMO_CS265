/*
 (Sort ArrayList) Write the following method that sorts an ArrayList: public static <E extends Comparable<E>> void sort(ArrayList<E> list)

Write a test program that prompts the user to enter 10 integers, invokes this method to sort the numbers, and displays the numbers in increasing order. 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment09_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(list));
        sort(arrList);
        System.out.println(arrList);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.size(); i++) {
            currentMin = list.get(i);
            currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.compareTo(list.get(j)) > 0) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
