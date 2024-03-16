package macronutrient_question;

public class Customer {
    private String name;
    private DietPlan diet;

    public Customer(String name, DietType type) {
        this.name = name;
        DietFactory dietFactory = FactoryCreator.getInstance().createDietFactory(type);
        this.diet = dietFactory.createDietPlan();
    }

    public void print() {
        System.out.println("Customer name: " + name);
        diet.print();
        System.out.println();
    }

}
