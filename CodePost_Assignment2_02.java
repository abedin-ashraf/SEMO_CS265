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
