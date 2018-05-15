package factory;

import org.junit.Test;

public class TestClientFactory {

    @Test
    public void TestClientFactory() {
        Client basic = ClientFactory.createClient(ClientType.BASIC);
        Client premium = ClientFactory.createClient(ClientType.PREMIUM);
        
        System.out.println("Basic Product List....");
        System.out.println(basic.productList);

        System.out.println("Premium Product List....");
        System.out.println(premium.productList);
        
    }
    
}