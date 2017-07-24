package mudragel.grigorij.study.designpatterns.factory;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory=ingredientFactory;
    }

    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
