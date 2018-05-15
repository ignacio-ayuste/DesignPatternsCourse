package prototype;

import java.util.HashMap;
import java.util.Map;

public class ProductStore {
 
    private Map<String, Product> productMap = new HashMap<String, Product>();

    public ProductStore() {
        loadProducts();
    }
    
    public Product createProduct(ProductType productType){
        Product productFromStore = null;
        try{
            productFromStore = (Product) productMap.get(productType.getCode()).clone();    
        }catch(CloneNotSupportedException ex){
            System.out.println("The object cannot be clone");
        }
        
        return productFromStore;
    }
    
    //in this method i create the prototypes.
    public void loadProducts(){
        Book bookGameOfThrones = new Book("Game Of Thrones", 200, new Address("street one", 100));
        Book bookHarryPotter = new Book("Harry Potter", 300, new Address("street two", 200));
        
        Candy jorgito = new Candy("Jorgito", 20, new Address("street three", 300));
        
        productMap.put("GOT", bookGameOfThrones);
        productMap.put("HRP", bookHarryPotter);
        productMap.put("JOR", jorgito);
        
    }
    
    
}