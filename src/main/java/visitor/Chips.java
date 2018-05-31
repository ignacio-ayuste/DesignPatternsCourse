package visitor;

public class Chips implements ShippeableElement{

    @Override
    public void acceptVisitor(ShippeableVisitor shippeableVisitor) {
        shippeableVisitor.visit(this);
    }
}