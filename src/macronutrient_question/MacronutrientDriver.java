package macronutrient_question;

public class MacronutrientDriver {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", DietType.NoRestriction);
        Customer c2 = new Customer("Luke", DietType.NoRestriction);
        Customer c3 = new Customer("Jasmin", DietType.Paleo);
        Customer c4 = new Customer("Leo", DietType.NutAllergy);
        Customer c5 = new Customer("Liam", DietType.Vegan);
        Customer c6 = new Customer("Andrew", DietType.Paleo);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        c6.print();

    }
}
