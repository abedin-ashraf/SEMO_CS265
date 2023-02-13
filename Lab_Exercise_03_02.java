import java.util.Scanner;
public class Lab_Exercise_03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        Calculator C = new Calculator(num1,num2);

        System.out.println("Addition of two numbers: "+C.ADD());
        System.out.println("Subtraction of two numbers: "+C.SUB());
        System.out.println("Multiplication of two numbers: "+C.MUL());
        System.out.println("Division of two numbers: "+C.DIV());
    }
    
}
class Calculator{
    int a;
    int b;

    Calculator(){

    }
    Calculator(int n1, int n2){
        a = n1;
        b = n2;
    }
    public int ADD(){
        return a+b;
    }
    public int SUB(){
        return a-b;
    }
    public int MUL(){
        return a*b;
    }
    public int DIV(){
        return a/b;
    }
}