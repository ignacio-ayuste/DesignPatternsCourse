package command.broker;

//Concrete Command
public class BuyOrder implements Order {

    private Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}