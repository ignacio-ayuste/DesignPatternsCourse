package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList();

    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void dettach(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }

}
