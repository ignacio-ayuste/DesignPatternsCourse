package memento;

import java.io.*;

public class MementoSerializable {

    public static final String STORE_DIR = "c:/test/Persona.ser";

    public static void main(String[] args) {
        Person person = new Person("Pedro", "Picapiedra", "piedradura 100", "11112222");

        serialize(person);

        Person newPerson = deserialize();

        System.out.println(newPerson);
    }

    private static Person deserialize() {
        Person person = null;
        try{
            FileInputStream fis = new FileInputStream(STORE_DIR);
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            person = (Person) objectInputStream.readObject();
            objectInputStream.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    private static void serialize(Person person) {
        try {
            FileOutputStream fos = new FileOutputStream(STORE_DIR);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(person);
            outputStream.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
