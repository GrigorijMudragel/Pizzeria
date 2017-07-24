package mudragel.grigorij.study.designpatterns.factory;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
            return pizza;
        } else return null;
    }
}
