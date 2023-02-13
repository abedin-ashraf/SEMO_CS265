/*
 Write a JAVA program to input 2 matrix (A and B) and perform the addition of those 2 matrices when matrix addition conditions are met. (Conditions: Rows and columns of the matrix must be same). Print the input matrices and the result matrix after addition.
Example:
 */



import java.util.Scanner;

public class Lab_Exercise_03_01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row for matirx 1: ");
        int rowOfMatrix1 = input.nextInt();

        System.out.print("Enter the number of column for matirx 1: ");
        int columnOfMatrix1 = input.nextInt();

        System.out.print("Enter the number of row for matirx 2: ");
        int rowOfMatrix2 = input.nextInt();

        System.out.print("Enter the number of column for matirx 2: ");
        int columnOfMatrix2 = input.nextInt();

        int[][] matrix1 = new int[rowOfMatrix1][columnOfMatrix1];
        int[][] matrix2 = new int[rowOfMatrix2][columnOfMatrix2];

        System.out.println("Enter the elements for Matrix 1");
        for(int i=0; i<rowOfMatrix1; i++){
            for(int j=0; j<columnOfMatrix1; j++){
                matrix1[i][j]=input.nextInt();
            }
        }

        System.out.println("Enter the elements for Matrix 2");
        for(int i=0; i<rowOfMatrix2; i++){
            for(int j=0; j<columnOfMatrix2; j++){
                matrix2[i][j]=input.nextInt();
            }
        }
        int[][] sum = new int[rowOfMatrix1][columnOfMatrix1];
        if(rowOfMatrix1==rowOfMatrix2 && columnOfMatrix1==columnOfMatrix2){
            for(int i=0; i<rowOfMatrix1; i++){
                for(int j=0; j<columnOfMatrix1; j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
                }
            }
            System.out.println("Sum of Matrix 1 and Matrix 2 is: ");
            for(int i=0; i<rowOfMatrix1; i++){
                for(int j=0; j<columnOfMatrix1; j++){
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Sum of Matrix 1 and Matrix 2 are not possible");
    }
}