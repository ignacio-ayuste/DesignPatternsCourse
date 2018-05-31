package state;

public class ClosedState implements State{

    private Door door;

    public ClosedState(Door door) {
        this.door = door;
    }

    public void handle() {
        System.out.println("The door was closed, it will be open");
        door.setState(new OpenState(door));
    }

    @Override
    public String toString() {
        return "The Door is closed";
    }
}