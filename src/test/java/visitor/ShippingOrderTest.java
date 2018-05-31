package visitor;

import org.junit.Test;

public class ShippingOrderTest {

    @Test
    public void testOrder(){

        ShippingOrder shippingOrder = new ShippingOrder();
        shippingOrder.addProduct(new BlueRay());
        shippingOrder.addProduct(new Chips());
        shippingOrder.addProduct(new Chocolate());

        shippingOrder.acceptVisitor(new ShippingVisitorConcrete());
        shippingOrder.acceptVisitor(new ShippingDiscountVisitorConcrete());
    }


}
