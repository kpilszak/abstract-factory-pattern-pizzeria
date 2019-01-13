public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Toppings[] createToppings();
}
