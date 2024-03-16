package macronutrient_question;

import java.util.Random;

public abstract class DietPlan {
    String carbs;
    String protein;
    String fats;

    abstract void print();
}

enum DietType {
    NoRestriction,
    Paleo,
    Vegan,
    NutAllergy
}
