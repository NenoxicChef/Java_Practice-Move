package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length];

        int k= 0; //for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first arrays index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second arrays index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------");

        int[] a1 = {1,2,3,4,5,6,9};
        int[] a2 = {70,80,90,100};

        int[] a3 =ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));


        System.out.println("--------------------------------------------");

double[] b1 = {10.5, 5.5, 6.5};
double[] b2 = {10.5, 5.5, 6.5};

double[] b3 = ArraysUtility.merge(b1, b2);

        System.out.println(Arrays.toString(b3));
        System.out.println("--------------------------------------------");


        char[] ch1 = {'a', 'b', 'C', 'F'};
        char[] ch2 = {'c', 'b', 'C', 'F'};

        char[] ch3 = ArraysUtility.merge(ch1,ch2);

        System.out.println(Arrays.toString(ch3));
        System.out.println("--------------------------------------------");


        String [] str1 = {"egg","potato","dill"};
        String [] str2 = {"dijon","mayo","salt"};

        String [] str3 = ArraysUtility.merge(str1, str2);

        System.out.println(Arrays.toString(str3));

    }
}
//write a program that can merge two arrays of integers