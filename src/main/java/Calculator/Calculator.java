package Calculator;

/**
 * Created by user on 27.10.2017.
 */
public class Calculator {
    double first;
    double second;
    double result = 0;
    String action;

    public Calculator(double first, double second, String action) {
        this.first = first;
        this.second = second;
        this.action = action;
    }

    public Calculator() {

    }


    public void setfirst(double name) {
        this.first = name;
    }

    public void calcplus()
    {
        this.result = this.first + this.second;
        System.out.println(this.result);
    }


    public int fi()
    {
        return 1;
    }
}
