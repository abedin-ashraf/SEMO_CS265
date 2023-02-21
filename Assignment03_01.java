/*
 (Column sorting) Implement the following method  public static double[][] sortColumns(double[][] m), to sort the columns in a two-dimensional array. A new array is returned and the original array is intact. Please take the input from the user.
 */

import java.util.Arrays;
import java.util.Scanner;
public class Assignment03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row length: ");
        int row = input.nextInt();
        System.out.print("Enter the column length: ");
        int column = input.nextInt();

        double[][] mat = new double[row][column];
        System.out.println("Enter a "+row+"-by-"+column+" matrix row by row: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                mat[i][j]=input.nextDouble();
            }
        }
        double[][] mat1 = new double[row][column];
        mat1 = sortColumns(mat);
        
        System.out.println("\nThe column-sorted array is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(mat1[i][j]+"  ");
            }
            System.out.println();
        }
       
    }
    public static double[][] sortColumns(double[][] m){
       
        double[][] arr = new double[m.length][m.length];
        
        for(int i=0; i<m.length; i++){
            double[] arr1=new double[m.length];
            for(int j=0; j<m[i].length; j++){
                arr1[j]=m[j][i];
            }
            Arrays.sort(arr1);
            for(int j=0; j<m[i].length; j++){
                arr[j][i]=arr1[j];
            }
        }
        return arr;
    }
    
}
