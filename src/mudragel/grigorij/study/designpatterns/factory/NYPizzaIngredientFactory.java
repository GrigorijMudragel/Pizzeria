package mudragel.grigorij.study.designpatterns.factory;

import mudragel.grigorij.study.designpatterns.factory.ingridients.*;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough() ;
    }

    @Override
    public Sauce createSauce() {
        return new Marinarasauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }
}
