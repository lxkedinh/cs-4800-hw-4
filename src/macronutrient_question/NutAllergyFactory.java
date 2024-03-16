package macronutrient_question;

public class NutAllergyFactory extends DietFactory {
    private String[] carbsOptions = {"Cheese", "Bread", "Lentils"};
    private String[] proteinOptions = {"Fish", "Chicken", "Beef", "Tofu"};
    private String[] fatsOptions = {"Avocado", "Sour Cream", "Tuna"};

    @Override
    public DietPlan createDietPlan() {
        return new DietPlan(
                carbsOptions[random.nextInt(carbsOptions.length)],
                proteinOptions[random.nextInt(proteinOptions.length)],
                fatsOptions[random.nextInt(fatsOptions.length)],
                DietType.NutAllergy
        );
    }

}
