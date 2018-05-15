package builder;

import org.junit.Test;

public class MealDirectorTest {

    @Test
    public void createKidsMeal(){
        createMeal(new KidsMealBuilder());
    }

    @Test
    public void createAdultMeal(){
        createMeal(new AdultMealBuilder());
    }

    private void createMeal(MealBuilder mealBuilder){
        MealDirector mealDirector = new MealDirector();

        Meal adultMeal = mealDirector.createMeal(mealBuilder);
        System.out.println("MEAL DETAILS");
        System.out.println(adultMeal);
    }


}