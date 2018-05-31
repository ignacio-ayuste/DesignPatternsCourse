package template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPersonJavaApi {

    public static void main(String[] args) {

        Person juan = new Person("Juan", 25, "11112222");
        Person pedro = new Person("Pedro", 19, "33334444");
        Person tomas = new Person("Tomas", 30, "44445555");
        Person nicolas = new Person("Nicolas", 50, "66667777");

        List<Person> personList = Arrays.asList(juan, pedro, tomas, nicolas);

        System.out.println("Person List not sorted");
        printPersonList(personList);

        System.out.println("Person List sorted by Age");
        Collections.sort(personList);

        printPersonList(personList);
    }

    public static void printPersonList(List<Person> personList){
        for(Person person : personList){
            System.out.println(person);
        }
    }


}
