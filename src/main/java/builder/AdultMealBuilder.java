package builder;

//Concrete Builder
public class AdultMealBuilder extends MealBuilder {

    public void buildDrink() {
        System.out.println("build Adult Drink");
        meal.setDrink("Water Big");
    }

    public void buildMain() {
        System.out.println("build Adult Main");
        meal.setMain("Pasta");
    }

    public void buildDessert() {
        System.out.println("build Adult Dessert");
        meal.setDessert("Flan");
    }

    public Meal getMeal() {
        return meal;
    }

}