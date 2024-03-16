package macronutrient_question;

public class FactoryCreator {
    private static FactoryCreator instance = null;

    private FactoryCreator() {}

    public static FactoryCreator getInstance() {
        if (instance == null) {
            instance = new FactoryCreator();
        }

        return instance;
    }

    public DietFactory createDietFactory(DietType type) {
        return switch (type) {
            case NoRestriction -> new NoRestrictionFactory();
            case Paleo -> new PaleoFactory();
            case Vegan -> new VeganFactory();
            case NutAllergy -> new NutAllergyFactory();
        };
    }

}
