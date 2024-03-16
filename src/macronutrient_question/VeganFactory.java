package macronutrient_question;

public class VeganFactory extends DietFactory {
    private String[] carbsOptions = {"Bread", "Lentils", "Pistachio"};
    private String[] fatsOptions = {"Avocado", "Sour Cream", "Peanuts"};

    @Override
    public DietPlan createDietPlan() {
        return new DietPlan(
                carbsOptions[random.nextInt(carbsOptions.length)],
                "Tofu",
                fatsOptions[random.nextInt(fatsOptions.length)],
                DietType.Vegan
        );
    }

}
