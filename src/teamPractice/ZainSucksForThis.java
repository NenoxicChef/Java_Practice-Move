package teamPractice;

public class ZainSucksForThis {
    public static void main(String[] args) {

        int number = 25;
        int first = 0;
        int second = 1;

        System.out.print(first + " ");

        for (int i = 2; i <= number; i++) {
            int answer = first + second;
            System.out.print(answer + " ");
            first = second;
            second = answer;
        }

    }


}

/*
Write a Java program that generates the first 25 numbers in the Fibonacci sequence. The Fibonacci sequence starts
 with 0 and 1, and each subsequent number is the sum of the two preceding numbers. Your program should use a loop
 (e.g., for or while) to generate these numbers and print them. The goal is to calculate these numbers efficiently,
 so you should avoid recursive solutions.
 */