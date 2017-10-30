package Calculator;

import java.util.Scanner;

/**
 * Created by user on 27.10.2017.
 */
public class WorkCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator ();

        System.out.println("Enter first number");
        calc.setFirst (input.nextDouble());

        System.out.println("Enter one of this operators: \n+\n-\n*\n/");
        calc.setAction (input.next ());

        System.out.println("Enter second number");
        calc.setSecond (input.nextDouble());

        calc.operation();

        System.out.println ("Result is: " + calc.getResult());
    }
}
