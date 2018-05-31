package state;

public class DoorOld {

    private int state;
    private final int OPEN = 0;
    private final int CLOSED = 1;

    public DoorOld() {
        state = CLOSED;
    }

    public void open(){
        if(isOpen()){
            System.out.println("The door is already open");
        }else if(isClosed()){
            System.out.println("Opening the door");
            state = OPEN;
        }
    }

    public void close(){
        if(isOpen()){
            System.out.println("Closing the door");
            state = CLOSED;
        }else if(isClosed()){
            System.out.println("The door is already closed");
        }
    }

    public String showState(){
        if(isOpen()){
            return "The door is opened";
        }else if (isClosed()){
            return "The door is closed";
        }
        return "The door is in an invalid state";
    }

    private boolean isOpen() {
        return state == OPEN;
    }

    private boolean isClosed() {
        return state == CLOSED;
    }

}