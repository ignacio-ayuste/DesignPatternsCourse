package command;

//Receiver
public class Light {

    public boolean on;

    public void switchOn(){
        on = true;
    }

    public void switchOff(){
        on = false;
    }

    public String isOn() {
        return on == true ? "ON" : "OFF";
    }
}