package macronutrient_question;

import java.util.Random;

public abstract class DietFactory {
    static Random random = new Random();

    abstract DietPlan createDietPlan();
}
