package macronutrient_question;

import java.util.Random;

public class NoRestrictionDietPlan extends DietPlan {
    private static String[] possibleCarbs = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private static String[] possibleProtein = {"Fish", "Chicken", "Beef", "Tofu"};
    private static String[] possibleFats = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
    public NoRestrictionDietPlan() {
        Random r = new Random();
        carbs = new Random().nextInt()
    }
}
