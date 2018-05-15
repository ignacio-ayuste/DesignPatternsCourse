package builder;

/* The object to be build. */
public class Meal {

    private String drink;
    private String main;
    private String dessert;

    @Override
    public String toString() {
        return "Meal{" +
                "drink='" + drink + '\'' +
                ", main='" + main + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }
}
