package visitor;

public class ShippingDiscountVisitorConcrete implements ShippeableVisitor{

    double shippingCost = 0;

    @Override
    public void visit(BlueRay blueRay) {
        shippingCost += 1;
    }

    @Override
    public void visit(Chips chips) {
        shippingCost += 2;
    }

    @Override
    public void visit(Chocolate chocolate) {
        shippingCost += 3;
    }

    @Override
    public void visit(ShippingOrder shippingOrder) {
        System.out.println("The total Shipping Cost is: " + shippingCost / 2);
    }
}
