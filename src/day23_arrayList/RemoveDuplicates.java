package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ben");
        names.add("Andrea");
        names.add("Andrea");
        names.add("Mike");
        names.add("Scott");
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)) {
                continue;
            }


            nonDup.add(each);

        }

        names = nonDup;

        System.out.println(names);


    }
}
