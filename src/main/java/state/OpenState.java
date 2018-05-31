package state;

public class OpenState implements State{

    private Door door;

    public OpenState(Door door) {
        this.door = door;
    }

    public void handle() {
        System.out.println("The door is open, it will be close");
        door.setState(new ClosedState(door));
    }

    @Override
    public String toString() {
        return "The Door is opened";
    }

}