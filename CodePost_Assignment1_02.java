import java.util.Scanner;

public class CodePost_Assignment1_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int numberOfStudents = input.nextInt();

        double [] scores = new double[numberOfStudents];
        System.out.print("Scores: ");
        for(int i=0; i<numberOfStudents; i++){
            scores[i]=input.nextDouble();
        }

        double bestScore = scores[0];
        for(int i=0; i<numberOfStudents; i++){
            if(scores[i]>bestScore)
                bestScore = scores[i];
        }
        System.out.println("\n");
        for(int i=0; i<numberOfStudents; i++){
            if(scores[i]>=(bestScore-10))
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is A\n\n");
            else if(scores[i]>=(bestScore-20))
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is B\n\n");
            else if(scores[i]>=(bestScore-30))
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is C\n\n");
            else if(scores[i]>=(bestScore-40))
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is D\n\n");
            else
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is F\n\n");

        }
        
    }
}
