package visitor.bad;

public class TestBuyOrder {

    public static void main(String[] args) {

        BuyOrder buyOrder = new BuyOrder();
        buyOrder.addProduct(new Cd());
        buyOrder.addProduct(new Dvd());
        buyOrder.addProduct(new Snack());
        buyOrder.addProduct(new Snack());

        System.out.println("Total Shipping Cost: " + buyOrder.calculateShipping());

    }

}
