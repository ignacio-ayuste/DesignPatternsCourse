package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    
    protected List<Product> productList = new ArrayList<Product>();

    public Client() {
        this.createClient();
    }
    
    public abstract void createClient();
    
}