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

    public
}
