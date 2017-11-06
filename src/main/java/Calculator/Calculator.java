package Calculator;

import java.util.Scanner;

/**
 * Created by user on 27.10.2017.
 */
public class Calculator {
  // Scanner scan = new Scanner(System.in);

    double first;
    double second;
    double result;
    String action;

    public Calculator(double first, double second, String action) {

        this.first = first;
        this.second = second;
        this.result = result;
        this.action = action;
    }


    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getResult() { return result; }

    public void setResult(double result) { this.result = result; }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    /*  public void setfirst(double name) {
        this.first = name;
    }*/


    public Calculator() {
        if (this.action.equals("+")) {
            this.result = this.first + this.second;
        }
        System.out.println(result);

    /*    @Override
        public String toString () {
            return "first = " + first + ", second = " + second + ", result = " + result;
        }*/

    }

}
