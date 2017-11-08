package Calculator;

/**
 * Created by user on 27.10.2017.
 */
public class Calculator {

    private double first;
    private double second;
    private String action;
    private double result;

    public void operation() {
        if (action.equals("*")) {
            result = (first * second);
        }
        if (action.equals("/")) {
            if (second != 0) {
                result = (first / second);
            } else {
                System.out.println("You can't divide into zero!");
            }
        }
        if (action.equals("+")) {
            result = (first + second);
        }
        if (action.equals("-")) {
            result = (first - second);
        }
    }


    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public double getResult() {
        return result;
    }
}