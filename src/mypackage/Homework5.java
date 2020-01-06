package mypackage;

public class Homework5 {
    public static void main(String[] args) {
        //Homework:
//1.Students score, total possible score
// 15/20 -> You got a C (75%)
// A 90-100, B 80-89, C 70-79, D 60-69, F 0-59

        int testscore = 75;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);


//2. Write a logic that prints multiplication table of the user provided number upto ten.

//3. Write a logic that checks if a number is a Prime number


    }
}