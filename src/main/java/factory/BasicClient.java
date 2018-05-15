package factory;

public class BasicClient extends Client{

    @Override
    public void createClient() {
        productList.add(new Product("Basic Product 1", 10));
        productList.add(new Product("Basic Product 2", 20));
    }
    
}
