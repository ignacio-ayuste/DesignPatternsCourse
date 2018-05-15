package singleton;

public class LazySingleton {
 
    private static LazySingleton lazySingleton;
    
    private LazySingleton(){
        
    }
    
    //Race Condition.
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    
}