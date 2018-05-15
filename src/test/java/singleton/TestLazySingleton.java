package singleton;

import org.junit.Test;

public class TestLazySingleton {
    
    public TestLazySingleton() {
    }

    @Test
    public void testUniqueInstance() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingletonTwo = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        System.out.println(lazySingletonTwo);
    
        if(lazySingleton == lazySingletonTwo){
            System.out.println("The object are the same");
        }
        
    }
}
