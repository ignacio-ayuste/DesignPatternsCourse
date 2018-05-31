package visitor.bad;

import java.util.ArrayList;
import java.util.List;

public class BuyOrder implements Shippeable{

    private List<Shippeable> shippeableList = new ArrayList<Shippeable>();

    public void addProduct(Shippeable shippeable){
        shippeableList.add(shippeable);
    }

    @Override
    public double calculateShipping() {
        double shippingCost = 0;
        for(Shippeable shippeable : shippeableList){
            shippingCost += shippeable.calculateShipping();
        }
        return shippingCost;
    }
}
