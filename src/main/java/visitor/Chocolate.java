package visitor;

public class Chocolate implements ShippeableElement{

    @Override
    public void acceptVisitor(ShippeableVisitor shippeableVisitor) {
        shippeableVisitor.visit(this);
    }
}