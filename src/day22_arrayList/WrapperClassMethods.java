package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {


        String str = "20";
        System.out.println(str + 1);

        // Integer num1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str); //returns primitive value

        System.out.println(num + 1);


       Integer num2 =  Integer.valueOf(str);

        System.out.println(num2);


        System.out.println("--------------------------------------");


        String s = "20.5";

        double s1 = Double.valueOf(s);

        System.out.println(s1);

        Double s2 = Double.valueOf(s);

        System.out.println(s2);
        System.out.println("--------------------------------------");



        String x = "true";

        boolean x1 = Boolean.parseBoolean(x);

        System.out.println(x1);

        Boolean x2 = Boolean.valueOf(x);

        System.out.println(x2);

        System.out.println("--------------------------------------");


        char ch = '1';

        boolean q1 =Character.isDigit(ch);
        System.out.println("is digit: " + q1);
        boolean q2 =Character.isLetter(ch);
        boolean q3 =Character.isLowerCase(ch);
        boolean q4 =Character.isUpperCase(ch);
        boolean q5 =Character.isLetterOrDigit(ch);

        System.out.println("--------------------------------------");


        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);

    }
}
