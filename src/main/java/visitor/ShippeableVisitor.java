package visitor;

public interface ShippeableVisitor {

    void visit(BlueRay blueRay);
    void visit(Chips chips);
    void visit(Chocolate chocolate);
    void visit(ShippingOrder shippingOrder);

}
