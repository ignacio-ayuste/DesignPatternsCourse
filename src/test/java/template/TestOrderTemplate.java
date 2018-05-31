package template;

import org.junit.Test;

public class TestOrderTemplate {

    @Test
    public void testStoreOrder(){
        System.out.println("Store Order");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }

    @Test
    public void testWebOrder(){
        System.out.println("Web Order");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

    }


}
