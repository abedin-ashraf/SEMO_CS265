/*
 (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal. Write a method that returns true if m1 and m2 are strictly identical, using the following header: public static boolean equals(int[][] m1, int[][] m2) Write a test program that prompts the user to enter two 3 * 3 arrays of integers and displays whether the two are strictly identical.
 */
import java.util.Scanner;
public class Assignment03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row and column length: ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        int[][] list1 = new int[row][column];
        int[][] list2 = new int[row][column];

        System.out.print("Enter list1: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                list1[i][j]=input.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                list2[i][j]=input.nextInt();
            }
        }

        boolean i = equals(list1, list2);
        if(i == true)
            System.out.println("The two arrays are strictly identical");
        else
            System.out.println("The two arrays are not strictly identical");
    }
    public static boolean equals(int[][] m1, int[][] m2){
        boolean equal = false;
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m1[i].length; j++){
                if(m1[i][j]==m2[i][j])
                    equal= true;
                else{
                    equal = false;
                    break;
                }
                
            }
            if(equal == false)
                    break;
        }
        return equal;
    }
}
