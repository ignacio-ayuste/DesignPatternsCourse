package builder;

public class MealDirector {

    public Meal createMeal(MealBuilder mealBuilder){
        mealBuilder.buildDrink();
        mealBuilder.buildMain();
        mealBuilder.buildDessert();

        return mealBuilder.getMeal();
    }

}