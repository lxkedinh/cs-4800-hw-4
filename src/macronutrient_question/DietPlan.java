package macronutrient_question;

import java.util.Random;

public class DietPlan {
    private String carbs;
    private String protein;
    private String fats;
    private DietType type;

    public DietPlan(String carbs, String protein, String fats, DietType type) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
        this.type = type;
    }

    public void print() {
        System.out.println("Diet Plan Type: " + type);
        System.out.println("Carbs: " + carbs);
        System.out.println("Protein: " + protein);
        System.out.println("Fats: " + fats);
    }
}

enum DietType {
    NoRestriction,
    Paleo,
    Vegan,
    NutAllergy
}
