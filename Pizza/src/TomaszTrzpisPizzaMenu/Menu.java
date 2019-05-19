package TomaszTrzpisPizzaMenu;
import java.util.*;

import static TomaszTrzpisPizzaMenu.Product.*;

public class Menu extends ArrayList<AbstractPizza> {

public Menu() {

    AbstractPizzaFactory factory = null;
    add(factory.preparePizza(AbstractPizzaFactory.MARGERITTA));
    add(factory.preparePizza(AbstractPizzaFactory.PROSCIUTTO));
    add(factory.preparePizza(AbstractPizzaFactory.VESUVIO));
    add(factory.preparePizza(AbstractPizzaFactory.PEPPERONI));
    add(factory.preparePizza(AbstractPizzaFactory.GREEK));
    add(factory.preparePizza(AbstractPizzaFactory.HAWAJSKA));
}
public void showMenu() {
System.out.println("PIZZA MENU");
System.out.println("Wybierz pizze:");
 for (int i = 0; i< size(); i++) {
     System.out.println();
     System.out.println(i + 1 + ". " + get(i).getPrice() + " " + get(i));
 }
}
}
