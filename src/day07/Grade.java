package day07;

public class Grade {
    public static void main(String[] args) {
        char grade = 'f';
        String result = "";

        if (grade == 'A' || grade == 'a'){
            result = "Excellent";
        } else if (grade == 'B' || grade == 'b') {
            result = "Great Job";
        } else if (grade == 'C' || grade == 'c') {
            result = "Good";
        } else if (grade == 'D' || grade == 'd') {
            result = "Passed";
        } else if (grade == 'F' || grade == 'f') {
            result = "Failed";
        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}
/*
2. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */