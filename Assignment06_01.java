
/*
 (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:

    Creates an array with 100 randomly chosen integers.
    Prompts the user to enter the index of the array, then displays the corresponding element value. If the specified index is out of bounds, display the message "Out of Bounds".
 */
import java.util.Scanner;

public class Assignment06_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = arrayInitializer();

        System.out.print("Enter the index of the array: ");
        try {
            System.out.println("The corresponding element value is " + array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }

    public static int[] arrayInitializer() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
