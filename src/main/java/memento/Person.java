package memento;

public class Person {//implements Serializable{

    private String name;
    private String lastName;
    private String address;
    private String phone;

    public Person(String name, String lastName, String address, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public PersonMemento save(){
        return new PersonMemento(address, phone);
    }

    public void revert(PersonMemento personMemento){
        this.phone = personMemento.getPhone();
        this.address = personMemento.getAddress();
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}

    public String getLastName() { return lastName;}

    public void setLastName(String lastName) { this.lastName = lastName;}

    public String getAddress() { return address;}

    public void setAddress(String address) { this.address = address;}

    public String getPhone() { return phone;}

    public void setPhone(String phone) { this.phone = phone;}
}