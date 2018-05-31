package template;

public class StoreOrder extends OrderTemplate{

    protected void checkout() {
        System.out.println(" bring items from deposit");
    }

    protected void payment() {
        System.out.println("process payment with cash or credit card");
    }

    protected void receipt() {
        System.out.println("Print invoice or receive");
    }

    protected void delivery() {
        System.out.println("Bag items");
    }
}