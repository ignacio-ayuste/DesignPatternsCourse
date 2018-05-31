package observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverJavaApi {


    public static void main(String[] args) {

        FacebookStream facebookStream = new FacebookStream();

        Client client1 = new Client("Juan");
        Client client2 = new Client("Pedro");

        facebookStream.addObserver(client1);
        facebookStream.addObserver(client2);

        facebookStream.someonePublish();
        facebookStream.someonePublish();
    }
}


//Concrete Subject
class FacebookStream extends Observable{

    public void someonePublish(){
        setChanged();
        notifyObservers();
    }
}

//Concrete Observer
class Client implements Observer{
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + " Stream, someone published something on Facebook");
    }
}