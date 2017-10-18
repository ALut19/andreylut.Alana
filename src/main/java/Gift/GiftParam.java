package Gift;

/**
 * Created by user on 17.10.2017.
 */
public abstract class GiftParam {
    private String name;
    private int price;
    private int weight;


    public GiftParam(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "name = " + name + ", price = " + price + ", weight = " + weight;
    }

  /*  public static void testArray() {
        int myArray[] = {};
        int sum=0;
        for(int i=0; i<myArray.length; i++) {
            sum=sum+myArray[i];
        }
        System.out.println(sum);
    }*/

}

