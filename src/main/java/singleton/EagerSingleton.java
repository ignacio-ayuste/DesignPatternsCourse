package singleton;

public class EagerSingleton {
 
    private static EagerSingleton instance = new EagerSingleton();
    
    private String name;

    private EagerSingleton(){
        name = "testName";
    }
    
    @Override
    public String toString(){
        return "EagerSingleton[ name=" + name + "]";
    }
    
    public static EagerSingleton getInstance(){
        return instance;
    }
}