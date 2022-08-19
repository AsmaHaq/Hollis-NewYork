package practice;
// Conditional operator is also known as the ternary operator.
// the operator consists of three operands and is used to evaluate Boolean expression.
//the main goal of the operator is to decide which value should be assigned to the variable.
//Syntax: variables x = (expression) ? value if true: value if false

public class CondOperator {

    public static void main (String [] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("value of b is:" + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("value of b is: " + b);

    }
}



