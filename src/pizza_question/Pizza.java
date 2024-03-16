package pizza_question;

import java.util.HashSet;

public class Pizza {
    private HashSet<Toppings> toppings = new HashSet<>();
    private String chain;
    private Size size;

    public Pizza(String chain, Size size, HashSet<Toppings> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Pizza chain: " + chain);
        System.out.println("Pizza size: " + size);
        printToppings();
        System.out.println();
    }

    public void printToppings() {
        System.out.println("Pizza toppings:");
        for (Toppings topping : toppings) {
            System.out.println(" - " + topping);
        }
    }
}

