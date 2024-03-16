package pizza_question;

public class BuilderDriver {
    public static void main(String[] args) {
        System.out.println("Builder Question Part 1");
        System.out.println("---------------------------------");
        Pizza threeToppings = new PizzaBuilder()
                .setSize(Size.Small)
                .setChain("Pizza Hut")
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Onions)
                .setToppings(Toppings.Bacon)
                .build();
        threeToppings.eat();

        Pizza sixToppings = new PizzaBuilder()
                .setSize(Size.Medium)
                .setChain("Pizza Hut")
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Onions)
                .setToppings(Toppings.Bacon)
                .setToppings(Toppings.TomatoAndBasil)
                .setToppings(Toppings.Spinach)
                .setToppings(Toppings.SpicyPork)
                .build();
        sixToppings.eat();

        Pizza nineToppings = new PizzaBuilder()
                .setSize(Size.Medium)
                .setChain("Pizza Hut")
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Onions)
                .setToppings(Toppings.Bacon)
                .setToppings(Toppings.TomatoAndBasil)
                .setToppings(Toppings.Spinach)
                .setToppings(Toppings.SpicyPork)
                .setToppings(Toppings.Beef)
                .setToppings(Toppings.Olives)
                .setToppings(Toppings.Chicken)
                .build();
        nineToppings.eat();

        System.out.println("Builder Question Part 2");
        System.out.println("---------------------------------");

        Pizza pizzahut1 = new PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize(Size.Large)
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Chicken)
                .setToppings(Toppings.Beef)
                .build();
        pizzahut1.eat();

        Pizza pizzahut2 = new PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize(Size.Small)
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Chicken)
                .build();
        pizzahut2.eat();

        Pizza caesar1 = new PizzaBuilder()
                .setChain("Little Caesar's")
                .setSize(Size.Medium)
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Onions)
                .setToppings(Toppings.Bacon)
                .setToppings(Toppings.TomatoAndBasil)
                .setToppings(Toppings.Spinach)
                .setToppings(Toppings.SpicyPork)
                .setToppings(Toppings.Beef)
                .setToppings(Toppings.Olives)
                .build();
        caesar1.eat();

        Pizza caesar2 = new PizzaBuilder()
                .setChain("Little Caesar's")
                .setSize(Size.Small)
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Onions)
                .setToppings(Toppings.Bacon)
                .setToppings(Toppings.TomatoAndBasil)
                .setToppings(Toppings.Spinach)
                .setToppings(Toppings.SpicyPork)
                .build();
        caesar2.eat();

        Pizza domino1 = new PizzaBuilder()
                .setChain("Domino's")
                .setSize(Size.Small)
                .setToppings(Toppings.Beef)
                .build();
        domino1.eat();

        Pizza domino2 = new PizzaBuilder()
                .setChain("Domino's")
                .setSize(Size.Large)
                .setToppings(Toppings.Beef)
                .setToppings(Toppings.Pepperoni)
                .setToppings(Toppings.Chicken)
                .build();
        domino2.eat();
    }
}