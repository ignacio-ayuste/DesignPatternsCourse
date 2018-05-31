package visitor.bad;

public class Snack implements Shippeable{

    @Override
    public double calculateShipping() {
        return 3;
    }

}
