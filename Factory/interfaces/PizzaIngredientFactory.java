package Factory.interfaces;

import Factory.ingredients.interfaces.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni creatPepperoni();
    public Clams createClam();
}