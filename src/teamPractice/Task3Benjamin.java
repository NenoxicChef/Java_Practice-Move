package teamPractice;

public class Task3Benjamin {

    public static int maximumNumber(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }


    }


    public static void main(String[] args) {
        int a = 113;
        int b = 41;
        int c = -5;

        int max = maximumNumber(a, b, c);

        System.out.println("The maximum number among " + a + ", " + b + ", " + c + " is: " + max);
    }

}
/*
3)  Create a method that can return the maximum number among three given numbers.

Output:

    The maximum number among 12, 30, 25 is: 30
 */