package template;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public int compareTo(Person person) {

        if(this.age > person.age){
            return 1;
        }

        if(this.age < person.age){
            return -1;
        }

        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
