package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {


        int[] score = {70, 100, 80, 90, 65};
        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("-----------------------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

        char[] ch = {'a', 'b', 'c'};
        char[] ch1 = {'a', 'c', 'b'};

        boolean r2 = Arrays.equals(ch, ch1);
        System.out.println(r2);


        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(Arrays.equals(s1, s2));


        System.out.println("-----------------------------------");

        int[] nums = {1, 2, 3, 4, 5, 66, 211, 1, 0, 1};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number is: " + nums[0]);
        System.out.println("Maximum number is: " + nums[nums.length - 1]);


        System.out.println("-----------------------------------");


        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1, b2));


        System.out.println("-----------------------------------");


        String[] students = {"Ben", "Andrea", "Serghei"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array, 8);

        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------------");


        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i = 0, j = n1.length; i < n2.length; j++, i++) {
            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("-----------------------------------");


        char[] cha = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] results = Arrays.copyOf(cha, 20);
        System.out.println(Arrays.toString(results));

        for (char c : cha) {
            System.out.println(c); //shortcut for this is "cha.for"
        }

    }
}
