package day22_arrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        String str = "Java";

        int a1 = 10;
        Integer a2 = 10;

        System.out.println("----------------------------------");

        int b1 = 100;
        Integer b2 = b1; //auto boxing

        double c1 = b1;
        long c3 = b1;

        char ch = 'A';
        Character ch1 = ch; //auto boxing

        double d1 = 5.5;
        Double d2 = d1; // autoboxing

        System.out.println("----------------------------------");

        Integer n1 = 20;

        int n2 = n1;//unboxing
       // double n3 = n1;
      //  long n4 = n1;
     //   float n5 = n1;

        Character e1 = 'Z';//unboxing
        char e2 = e1;
        //int e3 = e1;
        //long e4 = e1;


    }
}
