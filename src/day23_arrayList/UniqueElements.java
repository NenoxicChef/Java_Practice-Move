package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {

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

        System.out.println(names);
        for (String each : names) {
            if (names.indexOf(each ) == names.lastIndexOf(each)){
                System.out.println(each);

            }
        }


        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasBob = names.contains("Bob");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasBob = " + hasBob);

        System.out.println("------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;


        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        System.out.println("------------------------------------");

        ArrayList <Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);


        ArrayList <Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);
        n2.add(30);

        System.out.println(n1.equals(n2));

        n1.clear();
        n2.clear();


        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());



    }

}
