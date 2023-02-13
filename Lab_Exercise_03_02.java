/*
 Write a JAVA class called Calculator which has default constructor and a constructor which takes two input variables of type int. Also include ADD(), SUB(),MUL() and DIV() methods inside the class Calculator which take no input argument but performs the addition, subtraction, multiplication and division of two numbers inputted in the constructor.
Initialize the class called Calculator in the main program, ask user to enter 2 numbers and system must display +, -. * and / of those two numbers by calling the Calculator methods.

              Example:

              It’s a pseudo code,

              Class Calculator{

Int a,b;

Calculator (){

}

Calculator (int n1, int n2) {

// TODO: your code to assign these values

a = n1;

b = n2;

}

ADD(){

// TODO: your code to add two numbers passed in the constructor.

}

 

SUB(){

// TODO: your code to subtract two numbers passed in the constructor.

}

MUL(){

// TODO: your code to multiply two numbers passed in the constructor.

}

DIV(){

// TODO: your code to divide two numbers passed in the constructor.

}

}

 

Class Main {

Main function {

// TODO: Ask your to input 2 numbers

Calculator C = new Calculator( pass those two numbers);

     System.out.println("Addition of two numbers : "+ C.ADD());

        System.out.println("Subtraction of two numbers : "+ C.SUB());

        System.out.println("Multiplication of two numbers : " + C.MUL());

        System.out.println("Division of two numbers : " + C.DIV ());

}

}

 
 */

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