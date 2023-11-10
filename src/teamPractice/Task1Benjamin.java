package teamPractice;

public class Task1Benjamin {

    public static int twoIntegers(int a, int b) {
        int sum = a + b;

        return sum;

    }

    public static void main(String[] args) {
        int x = 10;
        int y = 11;

        int sum = twoIntegers(x, y);

        System.out.println("The sum of " + x + " and " + y + " is: " + sum);
    }


}
/*1)  Create a method that takes two integers as parameters and returns their sum as an integer.

        Output:
        The sum of 3 and 4 is: 7
        */
