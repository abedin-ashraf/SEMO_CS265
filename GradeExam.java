/*
 Case Study: Grading a Multiple-Choice Test

The problem is to write a program that will grade multiple-choice tests. Suppose you need to write a program that grades multiple-choice tests. Assume there are eight students and ten questions, and the answers are stored in a two-dimensional array. Each row records a student’s answers to the questions, as shown in the following array:

Your program grades the test and displays the result. It compares each student’s answers with the key, counts the number of correct answers, and displays it. Below is the program:

 */

public class GradeExam {
    public static void main(String[] args){
        char[][] answers = {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'}};

            char[] keys={'D','B','D','C','C','D','A','E','A','D'};

            int maxCorrectCount = 0;
            int topperStudent = 0;
            for(int i=0; i<answers.length; i++){
                int correctCount = 0;
                 
                for(int j=0; j<answers[i].length;j++){
                    if(answers[i][j]==keys[j])
                        correctCount++;
                }
                if(correctCount>maxCorrectCount){
                    maxCorrectCount = correctCount;
                    topperStudent = i;
                }
                System.out.println("Student "+ i+"'s correct count is "+correctCount); 
            }
            System.out.println("\n\nStudent "+topperStudent+"'s has the highest count which is "+maxCorrectCount);   
    }
    
}
