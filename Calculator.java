
import java.util.Scanner;

public class Calculator {

    public static String welcome() {
        System.out.println("If you wish to stop calculating, type exit for your symbol");
    
        return null;
    }
    
    public static double takeInput() {
        Scanner in = new Scanner(System.in);

        System.out.println("Your number: ");
        double input1 = in.nextDouble();

        return input1;   
    }

    public static char takeInput(Scanner input) {

        System.out.println("Your symbol: ");
        char operator = input.next().charAt(0);
        
        return operator;
    }

    public static double addInput(double a, double b) {

        return a + b;
    }

    public static double multiplyInput(double a, double b) {

        return a * b;
    }

    public static double modulusInput(double a, double b) {

        return a % b;
    }

    public static double powerInput(double a, double b) {

        return Math.pow(a, b);
    }

    public static double absoluteInput(double a) {

        return a > 0 ? a : -a;
    }
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        welcome();
        double num1;
        double num2;
        char operator;

       while (true) {
           
        
        num1 = takeInput();
        num2 = takeInput();
        operator = takeInput(in);
        

        if (operator == '+') {
            System.out.println("Your answer is: " + addInput(num1, num2) + '\n');
        
        } else if (operator == '-') {
            System.out.println("Your answer is: " + (num1 - num2) + '\n');

        } else if (operator == '*') {
            System.out.println("Your answer is: " + multiplyInput(num1, num2) + '\n');

        } else if (operator == '/') {
            System.out.println("Your answer is: " + (num1 / num2) + '\n');

        } else if (operator == '%') {
            System.out.println("Your answer is: " + modulusInput(num1, num2) + '\n');

        } else if (operator == '^') {
            System.out.println("Your answer is: " + powerInput(num1, num2) + '\n');

        } else {
            break;

        }

       }

    }
}
