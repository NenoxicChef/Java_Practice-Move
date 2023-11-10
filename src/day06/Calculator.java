package day06;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 15;
        char mathOperator = 'u';
        int result ;

        if (mathOperator == '+'){
            result = num1 + num2;
            System.out.println(result);
        } else if (mathOperator == '-') {
            result = num1 - num2;
            System.out.println(result);
        } else if (mathOperator == '*') {
            result = num1 * num2;
            System.out.println(result);
        } else if (mathOperator == '/') {
            result = num1 / num2;
            System.out.println(result);
        } else {
            System.out.println("invalid operator");
        }


    }
}
/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */