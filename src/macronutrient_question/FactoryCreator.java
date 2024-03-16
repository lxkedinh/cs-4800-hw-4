package macronutrient_question;

public class FactoryCreator {
    public static FactoryCreator instance = null;

    private FactoryCreator() {}

    public static FactoryCreator getInstance() {
        if (instance != null) {
            instance = new FactoryCreator();
        }

        return instance;
    }

    public DietFactory createDietFactory(DietType type) {
        return switch (type) {
            case NoRestriction -> new NoRestrictionFactory();
            case Paleo -> null;
            case Vegan -> null;
            case NutAllergy -> null;
        };
    }

}
