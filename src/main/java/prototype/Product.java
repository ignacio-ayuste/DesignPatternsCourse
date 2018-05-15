package prototype;

public class Product implements Cloneable{

    private String name;
    private double price;
    private Address address;

    public Product(String name, double price, Address address) {
        this.name = name;
        this.price = price;
        this.address = address;
    }

    //Shallow Copy
    public Object clone() throws CloneNotSupportedException{
        //Force DeepCopy
        deepCopy();

        return super.clone();
    }

    private void deepCopy(){
        Address newAddressInstance = new Address(address.getStreet(), address.getNumber());
        address = newAddressInstance;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }
}