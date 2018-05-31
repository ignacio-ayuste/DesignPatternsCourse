package state;

import org.junit.Test;

public class TestDoor {

    @Test
    public void TestOpen(){
        Door door = new Door();
        System.out.println("Previous State: " + door.showState());
        door.toogle();
        System.out.println("After State: " + door.showState());
    }


    @Test
    public void TestClose(){
        Door door = new Door();
        door.toogle();
        System.out.println("Previous State: " + door.showState());
        door.toogle();
        System.out.println("After State: " + door.showState());
    }

}
