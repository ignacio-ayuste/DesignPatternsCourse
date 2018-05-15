package singleton;

public class TestEagerSingleton {
    
    public static void main(String[] args) {

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingletonTwo = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
        System.out.println(eagerSingletonTwo);
        
        if(eagerSingleton == eagerSingletonTwo){
            System.out.println("The objects are equal");
        }
        
    }
    
    
}