package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


        String str = "Cydeo School";

      char[] a =  str.replace(" ", "").toCharArray();


        System.out.println(Arrays.toString(a));

        System.out.println("---------------------------------");

        String str2 = "Today is a great day to learn Java";

        String[] str3 = str2.split("great");

        System.out.println(Arrays.toString(str3));

        System.out.println("---------------------------------");


        String sentence = "today is a great day";

       String[] sentence2 =  ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(sentence2));
        
        String reversedSentence = "";

        for (int i = 0; i < sentence2.length; i++) {
            reversedSentence += sentence2[i] + " ";
        }

        System.out.println(reversedSentence);

    }
}
