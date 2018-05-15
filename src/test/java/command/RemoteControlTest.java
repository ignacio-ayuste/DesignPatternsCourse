package command;

import org.junit.Test;

public class RemoteControlTest {


    @Test
    public void testTurnOnTheLight(){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        System.out.println("State of the light before: " + light.isOn());

        Command lightOnCommand = new LightOnCommand(light);

        //switch on the light
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        System.out.println("State of the light after: " + light.isOn());
    }

    @Test
    public void testTurnOffTheLight(){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        System.out.println("State of the light before: " + light.isOn());

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        //switch off the light
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
        System.out.println("State of the light after turn on command: " + light.isOn());
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();

        System.out.println("State of the light after: " + light.isOn());
    }

}