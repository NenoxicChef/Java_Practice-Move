package day07;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 4;
        String result = "";

        if (gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elementary School";
        } else if (gradeLevel >=6 && gradeLevel <= 8) {
            result = "Middle School";
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = "High School";
        } else if (gradeLevel >= 13 && gradeLevel < 16) {
            result = "College";
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            result = "Grad School";
        } else {
            result = "Invalid";
        }

        System.out.println(result);

    }
}
/*
4. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */