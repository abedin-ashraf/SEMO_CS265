import java.util.Scanner;
public class CodePost_Assignment1_01 {
    public static double min(double[] array){
        double low = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<low)
                low = array[i];
        }
        return low;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("java DisplayminimumValue ");

        double[] arr = new double[10];

        for(int i=0; i<10; i++){
            arr[i]=input.nextDouble();
        }

        System.out.println("The minimum number is: "+min(arr));

    }
}
