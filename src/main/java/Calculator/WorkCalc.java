package Calculator;

import Calculator.Calculator;

import java.util.Scanner;

/**
 * Created by user on 27.10.2017.
 */
public class WorkCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculator Calcul = new Calculator(10,15,
                "+");
        Calculator c2 = new Calculator(input.nextDouble(),input.nextDouble(),input.next());


   //     Calcul.setfirst(input.nextDouble());

        Calcul.calcplus();
        c2.calcplus();
    }

    }

