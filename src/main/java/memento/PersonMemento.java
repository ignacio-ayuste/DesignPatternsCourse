package memento;

public class PersonMemento {

    private String address;
    private String phone;

    public PersonMemento(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
