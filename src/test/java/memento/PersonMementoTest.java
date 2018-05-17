package memento;

import org.junit.Test;

public class PersonMementoTest {


    @Test
    public void testPersonHistory(){

        Caretaker caretaker = new Caretaker();

        Person person = new Person("Juan", "Gomez", "Santa fe 200", "11112222");

        System.out.println("Person before save: " + person);

        //Original
        caretaker.save(person);

        person.setAddress("Callao 300");
        person.setPhone("44445555");

        //First Change
        caretaker.save(person);

        System.out.println("Person after change address and phone: " + person);

        person.setAddress("Las Heras 400");

        //Second Change
        caretaker.save(person);

        System.out.println("Person after change address: " + person);

        caretaker.revert(person);
        caretaker.revert(person);

        System.out.println("2 - REVERTS Person after revert first change original address and phone: " + person);

        caretaker.revert(person);

        System.out.println("1 - REVERT Person original address and phone: " + person);
    }

}