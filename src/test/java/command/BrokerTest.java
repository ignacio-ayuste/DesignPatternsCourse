package command;

import command.broker.Broker;
import command.broker.BuyOrder;
import command.broker.SellOrder;
import command.broker.Stock;
import org.junit.Test;

public class BrokerTest {


    @Test
    public void testBuyAndSellStock(){

        //Receiver
        Stock stock = new Stock();

        //Command
        BuyOrder buyOrder = new BuyOrder(stock);
        //Command
        SellOrder sellOrder = new SellOrder(stock);

        //Invoker
        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();
    }

}
