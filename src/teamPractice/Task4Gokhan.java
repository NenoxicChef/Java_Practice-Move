package teamPractice;

public class Task4Gokhan {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 8, 12, 15, 18, 22};

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                result += numbers[i];
            }
        }
        System.out.println(result);

    }
}
/*
Looping with Arrays:

     Given an array of integers,
     create a Java program that uses a for loop to find and print the sum of all the
     even numbers in the array.

     int[] numbers = {2, 5, 8, 12, 15, 18, 22};
 */