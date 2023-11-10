package day06;

public class NetIncomeCalc {
    public static void main(String[] args) {

        double salary = 131000;
        boolean isMarried = false;
        double result = 0;

        if (salary >= 130000){
            result = salary + (salary * .35);
            if (isMarried == true){
                result = result + (salary * .05);
            }
        } else if (salary >= 100000 && salary <= 129000) {
            result = salary + (salary * .3);
            if (isMarried == true){
                result = result + (salary * .05);
            }
        } else if (salary >= 80000 && salary <= 99000) {
            result = salary + (salary * .25);
            if (isMarried == true){
                result = result + (salary * .05);
            }
        } else if (salary <= 79000) {
            result = salary + (salary * .2);
            if (isMarried == true){
                result = result + (salary * .05);
            }
        } else {
            System.out.println("Not Acceptable Number");
        }

        System.out.println(result);



    }
}
/*
6. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */