package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Andrea" , "Max", "Serghei", "Ben"}; //4 names
        String[] group2 = {"Dajuan" , "Pedro" , "Carlos"};//3
        String[] group3 = {"Carmella" , "Izem" , "Steve" , "Marco" , "Benji"}; //5
        String[] group4 = {"Jose" , "Juan"};  //2


        String [][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }


        System.out.println("------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

    }
}
