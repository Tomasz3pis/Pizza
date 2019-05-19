package TomaszTrzpisPizzaMenu;
import java.util.*;


public class Pizza extends AbstractPizza {


    public Pizza (String name, double price) {
        super(name, price);
    }
    @Override
    public String toString(){
     return
             getName() + System.getProperty("line.separator") + getProductsAsString();
    }

}
