package teamPractice;

public class Task3Gokhan {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

    }


}
/*
Nested Loop: Multiplication Table:
     Write a Java program that uses nested for loops to print a multiplication table for
     numbers 1 through 10.
     The output should look something like this:

     Output: 1   2   3   4   5   6   7   8   9   10
             2   4   6   8   10  12  14  16  18  20
             ...
             10  20  30  40  50  60  70  80  90  100
 */