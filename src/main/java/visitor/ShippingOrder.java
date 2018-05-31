package visitor;

import java.util.ArrayList;
import java.util.List;

public class ShippingOrder implements ShippeableElement{

    private List<ShippeableElement> shippeableList = new ArrayList<ShippeableElement>();

    public void addProduct(ShippeableElement shippeable){
        shippeableList.add(shippeable);
    }

    public List<ShippeableElement> getShippeableList() {
        return shippeableList;
    }

    /*
    @Override
    public double calculateShipping() {
        double shippingCost = 0;
        for(Shippeable shippeable : shippeableList){
            shippingCost += shippeable.calculateShipping();
        }
        return shippingCost;
    }
    */

    @Override
    public void acceptVisitor(ShippeableVisitor shippeableVisitor) {
        for(ShippeableElement shippeableElement : shippeableList){
            shippeableElement.acceptVisitor(shippeableVisitor);
        }
        shippeableVisitor.visit(this);
    }
}
