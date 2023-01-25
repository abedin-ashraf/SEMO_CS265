import java.util.Scanner;
public class Lab_Exercise_01_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[25];
        
        //taking input
        for(int i=0; i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2!=0){
                System.out.print(numbers[i]+",");
            }
            
        }
        System.out.println();
    }
}