package state;

import org.junit.Test;

public class TestDoorOld {

    @Test
    public void TestOpen(){
        DoorOld door = new DoorOld();
        System.out.println("Previous State: " + door.showState());
        door.open();
        System.out.println("After State: " + door.showState());
    }

    @Test
    public void TestAlreadyOpen(){
        DoorOld door = new DoorOld();
        System.out.println("Previous State: " + door.showState());
        door.open();
        System.out.println("After State: " + door.showState());
        door.open();
    }

    @Test
    public void TestClose(){
        DoorOld door = new DoorOld();
        door.open();
        System.out.println("Previous State: " + door.showState());
        door.close();
        System.out.println("After State: " + door.showState());
    }

    @Test
    public void TestAlreadyClosed(){
        DoorOld door = new DoorOld();
        System.out.println("Previous State: " + door.showState());
        door.close();
        System.out.println("After State: " + door.showState());
    }

}
