package mudragel.grigorij.study.designpatterns.factory;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();// ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
            return pizza;
        } else return null;
    }
}
