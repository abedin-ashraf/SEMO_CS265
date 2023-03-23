
/*
  (InputMismatchException) Write a program that prompts the user to read two integers and displays their sum. Your program should prompt the user to read the number again if the input is incorrect.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");

        int num1 = 0, num2 = 0;

        boolean isValid = false;
        while (!isValid) {
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();
                isValid = true;
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("Invalid input..");
                System.out.println("Enter two integers: ");

            }
        }
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
