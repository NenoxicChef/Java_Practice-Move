package day06;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 21;
        int c = 20;

        if (a > b & a <c){
            System.out.println(a + " is the median number");
        } else if (b > a & b <c){
            System.out.println(b + " is the median number");
        } else {
            System.out.println(c + " is the median number");
        }

    }
}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */