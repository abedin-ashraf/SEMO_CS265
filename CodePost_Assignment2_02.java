/*
 (Locate the largest element) Write the following method that returns the location of the largest element in a two-dimensional array: public static int[] locateLargest(double[][] a). The return value is a one-dimensional array that contains two elements. These two elements indicate the row and column indices of the largest element in the two-dimensional array. If there is more than one largest element, return the smallest row index and then the smallest column index. Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array. Here is a sample run: (10)

 */
import java.util.Scanner;

public class CodePost_Assignment2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter the array:");
        double[][] matrix = new double[row][column];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=input.nextDouble();
            }
        }
        int[] loc = locateLargest(matrix);
        System.out.println("The location of the largest element is at ("+loc[0]+", "+loc[1]+")");

    }
    public static int[] locateLargest(double[][] a){
        double highest = 0;
        int[] location = new int[2];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j]>highest){
                    location[0]=i;
                    location[1]=j;
                    highest = a[i][j];
                }
            }
        }
        return location;
    }
}
