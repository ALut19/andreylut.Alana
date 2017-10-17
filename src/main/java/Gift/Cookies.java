package Gift;

/**
 * Created by user on 17.10.2017.
 */
public class Cookies extends GiftParam {

    private String cookiesType;

    public Cookies(String name, int price, int weight, String cookiesType) {
        super(name, price, weight);
        this.cookiesType = cookiesType;
    }

    public String getCookiesType() {
        return cookiesType;
    }

    public void setCookiesType(String cookiesType) {
        this.cookiesType = cookiesType;
    }

    @Override
    public String toString() {
        return "Cookies + [" + super.toString() +", Cookies type = " + cookiesType +"]";
    }
}
