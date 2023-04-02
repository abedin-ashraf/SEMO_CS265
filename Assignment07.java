import java.util.Scanner;

public class Assignment07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three sides of the trianlge: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false) : ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(s1, s2, s3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea() + " , Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Trianle is " + (triangle.isFilled() ? "" : "not ") + "filled.");
    }
}

abstract class GeometricObject {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean,
     * the get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
