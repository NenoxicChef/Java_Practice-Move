package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9};

        int[] reverse = new int[arr1.length];

        for (int i = arr1.length - 1, j=0 ; i >= 0; i--, j++) {
           reverse[j] = arr1[i] ;
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("-----------------------");

        int[] arr2 = {9,8,7,6,5,4,3,2,1};

        int[] arr3 = ArraysUtility.reverse(arr2);

        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------");


        double[] a1 = {1.5,2.5,3.5,4.5};

        double[] a2 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a2));

    }
}
