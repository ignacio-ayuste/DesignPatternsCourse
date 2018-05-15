package prototype;

import org.junit.Test;

public class TestPrototype {
    
    @Test
    public void TestPrototype() throws CloneNotSupportedException {
    
        Book bookGameOfThrones = new Book("Game Of Thrones", 200, new Address("street four", 999));
        
        Book bookGameOfThronesTwo = (Book) bookGameOfThrones.clone();
        bookGameOfThronesTwo.setPrice(300);
        
        System.out.println(bookGameOfThrones);
        System.out.println(bookGameOfThronesTwo);
        
        if(bookGameOfThrones == bookGameOfThronesTwo){
            System.out.println("There are the same object");
        }else{
            System.out.println("There are different instances");
        }
    }
    
    @Test
    public void TestPrototypeFromStore() {
        ProductStore productStore = new ProductStore();
        Product bookGameOfThrones = productStore.createProduct(ProductType.GAME_OF_THRONES);
        bookGameOfThrones.getAddress().setNumber(988);
        bookGameOfThrones.setPrice(500);

        Product bookGameOfThronesTwo = productStore.createProduct(ProductType.GAME_OF_THRONES);
        //bookGameOfThronesTwo.setPrice(500);
        
        Product bookHarryPotter = productStore.createProduct(ProductType.HARRY_POTTER);
        
        System.out.println(bookGameOfThrones);
        System.out.println(bookGameOfThronesTwo);
        System.out.println(bookHarryPotter);
        
    }

}