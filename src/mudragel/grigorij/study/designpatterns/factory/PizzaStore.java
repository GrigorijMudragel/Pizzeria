package mudragel.grigorij.study.designpatterns.factory;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract  Pizza createPizza(String type);
}
