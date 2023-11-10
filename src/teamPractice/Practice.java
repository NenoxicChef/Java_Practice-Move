package teamPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static String identify(int x) {
        if (x % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }


    public static int noDivision(int x, int y) {
        int result = 0;

        while (x >= y) {
            x = x - y;
            result++;
        }
        return result;

    }

    public static void finRa() {


        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
                ;
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }
    }


    public static void main(String[] args) {
        System.out.println(identify(10));
        System.out.println(noDivision(55, 5));
        finRa();
    }


}
