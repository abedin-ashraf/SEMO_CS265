/*
Write a JAVA program to accept the marks obtained by a student into a one-dimensional array and find the total marks and percentage of marks. Assume the total mark in each subject is 100. 
*/
import java.util.Scanner;
public class Lab_Exercise_01_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many subjects do you have: ");
        int sub = input.nextInt();
        
        //Initializg Array
        double[] numbers = new double[sub];
        
        double total = 0;
        //Taking input from the user
        for(int i=0; i<sub; i++){
            numbers[i] = input.nextDouble();
            total+=numbers[i];
        }

        //Printing result
        System.out.println("Total marks: "+total);
        
        System.out.println("Percentage of marks: "+total/sub+"%");
        

    }
}
