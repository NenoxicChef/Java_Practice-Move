package teamPractice;

import java.util.Scanner;

public class Task2Gokhan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int answer = scan.nextInt();
        int result = 0;

        while (answer >= 0) {

            result += answer;
            System.out.println("Enter a number:");
            answer = scan.nextInt();
        }
        System.out.println(result);

    }

}
/*
While Loop with User Input:
     Create a Java program that uses a while loop to continuously ask the user for a number.
     The program should keep asking until the user enters a negative number,
     at which point it should print the sum of all the positive numbers entered.
 */