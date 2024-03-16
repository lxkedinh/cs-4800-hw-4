package pizza_question;

import java.util.HashSet;

public class PizzaBuilder {
    private HashSet<Toppings> toppingsToAdd = new HashSet<>();
    private String chain;
    private Size size;

    public PizzaBuilder() {}

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setToppings(Toppings topping) {
        toppingsToAdd.add(topping);
        return this;
    }

    public Pizza build() {
        if (size == null) {
            throw new IllegalArgumentException("Pizza size is required");
        }

        return new Pizza(chain, size, toppingsToAdd);
    }
}
