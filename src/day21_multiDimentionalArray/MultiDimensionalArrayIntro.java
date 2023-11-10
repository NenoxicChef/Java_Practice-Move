package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] a1 = {1,2,3,4};
        int[] a2 = {11,22,33,44};
        int[] a3 = {111,222,333,444};
        int[] a4 = {11, 222, 333};


        int[][] arr2D = { {1,2,3,4} , {11,22,60,44} , {90,222,333,444} }; //index 0~2
                             //0            1                 2
        System.out.println(arr2D.length);


        System.out.println(Arrays.toString( arr2D[1]));
        System.out.println(Arrays.toString( arr2D[2]));

        System.out.println(arr2D[2][0]); //90
        System.out.println(arr2D[1][2]);

    }
}
