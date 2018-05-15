package builder;

//Concrete Builder
public class KidsMealBuilder extends MealBuilder {

    public void buildDrink() {
        System.out.println("build kid Drink");
        meal.setDrink("regular coke small");
    }

    public void buildMain() {
        System.out.println("build kid Main");
        meal.setMain("small hamburger");
    }

    public void buildDessert() {
        System.out.println("build kid Dessert");
        meal.setDessert("ice cream");
    }

    public Meal getMeal() {
        return meal;
    }

}