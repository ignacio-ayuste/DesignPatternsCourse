package visitor.bad;

public class Dvd implements Shippeable{

    @Override
    public double calculateShipping() {
        return 2;
    }
}
