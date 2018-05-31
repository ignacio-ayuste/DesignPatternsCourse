package visitor.bad;

public class Cd implements Shippeable{

    @Override
    public double calculateShipping() {
        return 1;
    }
}
