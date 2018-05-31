package visitor;

public class BlueRay implements ShippeableElement{

    @Override
    public void acceptVisitor(ShippeableVisitor shippeableVisitor) {
        shippeableVisitor.visit(this);
    }
}