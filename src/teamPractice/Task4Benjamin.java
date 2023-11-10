package teamPractice;

public class Task4Benjamin {

public static void fuseString (String a, String b){

    if (a.charAt(a.length()-1) == b.charAt(0)){
        System.out.println(a.substring(0,a.length()-1) + b);
    } else {
        System.out.println(a.substring(0, a.length()) + b);
    }

}

    public static void main(String[] args) {
        fuseString("apple", "egg");
    }
}
/*
4)  Create a method that can take two string and then add them together and returns it.
But if the last letter of the first word and the first letter of the last word are the same, return that character once.

Output:
    combine("this","show") --> thishow
 */