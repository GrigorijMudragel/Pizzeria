package mudragel.grigorij.study.designpatterns.factory;

import mudragel.grigorij.study.designpatterns.factory.ingridients.*;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
