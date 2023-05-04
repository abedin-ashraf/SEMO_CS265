import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);
        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);
        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());
        Complex c3 = (Complex) c1.clone();
        System.out.println(c1 == c3);
        System.out.println(c1.equals(c3));
        System.out.println(c3.getRealPart());
        System.out.println(c3.getImaginaryPart());
    }
}

class Complex implements Cloneable {
    // Variable
    private double real;
    private double imaginary;

    // Constructor
    Complex(double a, double b) {
        this.real = a;
        this.imaginary = b;
    }

    Complex(double a) {
        this.real = a;
        this.imaginary = 0;
    }

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Getter Method
    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }

    // Add function
    public Complex add(Complex x) {
        return new Complex(this.real + x.real, this.imaginary + x.imaginary);
    }

    // Subtract function
    public Complex subtract(Complex x) {
        return new Complex(this.real - x.real, this.imaginary - x.imaginary);
    }

    // Multiply function
    public Complex multiply(Complex x) {
        //
        return new Complex((this.real * x.real + (-(this.imaginary * x.imaginary))),
                (this.real * x.imaginary + this.imaginary * x.real));
    }

    // Divide function
    public Complex divide(Complex x) {
        double a = this.real;
        double b = this.imaginary;
        double c = x.real;
        double d = x.imaginary;
        double resultReal = ((a * c + b * d) / (c * c + d * d));
        double resultImaginary = ((b * c - a * d) / (c * c + d * d));
        return new Complex(resultReal, resultImaginary);
    }

    // Abs Function
    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Cloneable
    protected Object clone() {
        return new Complex(real, imaginary);
    }

    // Override tostring function
    public String toString() {
        String s;
        if (imaginary == 0.0) {
            s = real + " + 0.0i";
        } else if (real == 0.0) {
            s = "0.0 + " + imaginary + "i";
        } else if (imaginary < 0) {
            s = real + " + " + (imaginary) + "i";
        } else {
            s = real + " + " + imaginary + "i";
        }
        return s;
    }
}
