package command.broker;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        System.out.println("Processing orders...");
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
        System.out.println("Finish Processing orders...");
    }

}