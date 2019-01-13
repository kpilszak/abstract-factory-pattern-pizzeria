public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough(){
        return new ThinCrustDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    public Toppings[] createToppings(){
        Toppings[] toppings = {
                new Garlic(),
                new Mushroom()
        };
        return toppings;
    }
}
