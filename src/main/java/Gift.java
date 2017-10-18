/**
 * Created by user on 17.10.2017.
 */
import Gift.GiftParam;
import Gift.Candy;
import Gift.Cookies;
import Gift.Jellybean;




public class Gift {
    public static void main(String[] args) {


        Candy candy1 = new Candy("Snikers", 150, 200, "Chocolate bar");
        Candy candy2 = new Candy("Bownty", 135, 170, "Coco nut bar");
        Cookies cookies1 = new Cookies("Oreo", 300, 150, "Chocolate cookies");
        Cookies cookies2 = new Cookies("Choco Pie", 500, 300, "Marshmallows cookies");
        Jellybean jellybean1 = new Jellybean("Harry Potter", 550, 200, "Jelleybeans in original package");
        Jellybean jellybean2 = new Jellybean("Crazy Bee", 65, 150, "Jelleybean candy");


        GiftParam [] box = {candy1, candy2, cookies1, cookies2, jellybean1, jellybean2};

        for (GiftParam giftsGiftParam: box){
            System.out.println(giftsGiftParam.toString());
        }

        System.out.println("Total gift weigt = " + GiftParam.gettotalWeight());
        System.out.println("Total gift price = " + GiftParam.gettotalPrice());
    }
}
