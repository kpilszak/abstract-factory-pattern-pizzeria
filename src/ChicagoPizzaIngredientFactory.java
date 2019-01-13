public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    public Toppings[] createToppings(){
        Toppings[] toppings = {
                new Onion(),
                new Mushroom()
        };
        return toppings;
    }
}
