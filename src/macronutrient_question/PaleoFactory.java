package macronutrient_question;

public class PaleoFactory extends DietFactory {
    private String[] proteinOptions = {"Fish", "Chicken", "Beef"};
    private String[] fatsOptions = {"Avocado", "Tuna", "Peanuts"};

    @Override
    public DietPlan createDietPlan() {
        return new DietPlan(
                "Pistachio",
                proteinOptions[random.nextInt(proteinOptions.length)],
                fatsOptions[random.nextInt(fatsOptions.length)],
                DietType.Paleo
        );
    }

}
