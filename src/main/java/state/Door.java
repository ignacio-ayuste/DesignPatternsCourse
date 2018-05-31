package state;

public class Door {

    private State state;

    public Door() {
        state = new ClosedState(this);
    }

    public void toogle(){
        state.handle();
    }

    /*
    public void open() {
        state.handle();
    }

    public void close(){
        state.handle();
    }
    */

    public String showState(){
        return state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }
}