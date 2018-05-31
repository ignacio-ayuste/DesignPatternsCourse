package visitor;

public interface ShippeableElement {

    void acceptVisitor(ShippeableVisitor shippeableVisitor);
}
