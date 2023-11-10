package teamPractice;

import java.util.Scanner;

public class Task5Gokhan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a row");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= 2 *i - 1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
/*
Nested Loop: Patterns:
     Write a Java program that uses nested for loops to print a pyramid pattern using asterisks. 
     The user should be able to specify the height of the pyramid. For example, 
     if the user enters a height of 4, the program should print:

 	
     Output: 
      
              *
             ***
            *****
           *******
 */