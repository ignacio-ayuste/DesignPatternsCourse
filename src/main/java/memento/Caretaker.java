package memento;

import java.util.Stack;

public class Caretaker {

    public Stack<PersonMemento> personHistory = new Stack<PersonMemento>();

    public void save(Person person){
        personHistory.push(person.save());
    }

    public void revert(Person person){
        person.revert(personHistory.pop());
    }

}
