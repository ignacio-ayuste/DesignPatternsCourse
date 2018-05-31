package template;

public class WebOrder extends OrderTemplate{

    protected void checkout() {
        System.out.println("Get the items from shopping cart");
        System.out.println("Set the gif preferences");
        System.out.println("Set delivery address");
        System.out.println("Set invoice address");
    }

    protected void payment() {
        System.out.println("Pay with Credit Card");
    }

    protected void receipt() {
        System.out.println("Email invoice");
    }

    protected void delivery() {
        System.out.println("Ship the item to address");
    }
}