import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Аедрей Лут
 */
public class Task3CalculatorAndWords {
    public static void main(String[] args) {

        Scanner choise = new Scanner(System.in);
        int button;

        while (true) {
            System.out.println("Please enter: \n1 - for ArrayWords; \n2 - for Calculator; \n0 - For exit ");
            button = choise.nextInt();

            if (button == 1) {
                Task3CalculatorAndWords.ArrayWords();
            } else if (button == 2) {
                Task3CalculatorAndWords.Calculator();
            }
            else if (button == 0)
                break;
            else System.out.println("no!");
        }
    }


    public static void Calculator() {
        Scanner input = new Scanner(System.in);

        double first;
        double second;
        double result = 0;
        String action;

//Ввести первую перенную 
        System.out.println("Enter first number");
        first = input.nextDouble();
        System.out.println(first);

//Ввести один из следующих операторов: сложения, вычитания, умножения, деления 
        System.out.println("Enter one of this operators: \n+\n-\n*\n/");
        action = input.next();
        System.out.println(action);

//Ввести вторую переменную 
        System.out.println("Enter second number");
        second = input.nextDouble();
        System.out.println(second);


        if (action.equals("+")) {
            result = first + second;
        } else if (action.equals("-")) {
            result = first - second;
        } else if (action.equals("*")) {
            result = first * second;
        } else if (action.equals("/")) {
            result = first / second;
        }
        System.out.printf("%.4f", result);

    }

    public static void ArrayWords() {

        Scanner input1 = new Scanner(System.in);

        String[] wn = {"first word", "second word", "third word", "fourth word", "fifth word", "sixth word"};
        String[] arrayw = new String[6];

        System.out.println("Words " + Arrays.toString(arrayw));

        String maxi = "";
        int a = 0;

        for (int i = 0; i < arrayw.length; i++) {
            System.out.println("Enter " + wn[i]);
            arrayw[i] = input1.nextLine();
            System.out.println(arrayw[i]);

            if (arrayw[i].length() > a) {
                a = arrayw[i].length();
                maxi = arrayw[i];
            }
        }
        System.out.println(maxi);
    }
}