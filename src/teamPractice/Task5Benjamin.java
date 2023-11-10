package teamPractice;

public class Task5Benjamin {

    public static int squareSum(int a, int b) {

        int squareOne = a * a;
        int squareTwo = b * b;

        return squareOne + squareTwo;


    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        int totalSum = squareSum(a, b);

        System.out.println("The sum of the squares of " + a + " and " + b + " is: " + totalSum);

    }

}

/*
5)  Create a method that takes two integers and returns the sum of their squares.

Output:
    The sum of the squares of 3 and 4 is: 25
 */