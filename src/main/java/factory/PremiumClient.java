package factory;

public class PremiumClient extends Client{

    @Override
    public void createClient() {
        productList.add(new Product("Product Premium 1", 100));
        productList.add(new Product("Product Premium 2", 200));
    }
    
}
