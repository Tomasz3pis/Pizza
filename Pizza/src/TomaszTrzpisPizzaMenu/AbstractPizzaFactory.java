package TomaszTrzpisPizzaMenu;


import static TomaszTrzpisPizzaMenu.Product.*;

public abstract class AbstractPizzaFactory {
    public final static String MARGERITTA = "margeritta";
    public final static String PROSCIUTTO = "prosciutto";
    public final static String PEPPERONI = "Pepperoni";
    public final static String VESUVIO = "vesuvio";
    public final static String GREEK = "grecka";
    public final static String HAWAJSKA = "hawajska";

    public AbstractPizza preparePizza(String aType) {
        switch (aType) {
            case MARGERITTA:
                AbstractPizza margeritta = createInstance("Margeritta", 15.00);
                margeritta.addProduct(TOMATOSOUCE);
                margeritta.addProduct(CHEESE);
                margeritta.addProduct(MOZZARELLA);
                return margeritta;
            case PROSCIUTTO:
                AbstractPizza prosciutto = createInstance("Prosciutto", 18.00);
                prosciutto.addProduct(TOMATOSOUCE);
                prosciutto.addProduct(CHEESE);
                prosciutto.addProduct(HAM);
                prosciutto.addProduct(MASHROOMS);
                return prosciutto;
            case PEPPERONI:
                AbstractPizza pepperoni = createInstance("Pepperoni", 16.50);
                pepperoni.addProduct(TOMATOSOUCE);
                pepperoni.addProduct(CHEESE);
                pepperoni.addProduct(SALAMI);
                pepperoni.addProduct(ONION);
                return pepperoni;
            case VESUVIO:
                AbstractPizza vesuvio = createInstance("Vesuvio", 16.50);
                vesuvio.addProduct(TOMATOSOUCE);
                vesuvio.addProduct(CHEESE);
                vesuvio.addProduct(HAM);
                return vesuvio;
            case GREEK:
                AbstractPizza greek = createInstance("Grecka", 21.00);
                greek.addProduct(TOMATOSOUCE);
                greek.addProduct(CHEESE);
                greek.addProduct(MOZZARELLA);
                greek.addProduct(OLIVES);
                greek.addProduct(CHICKEN);
                greek.addProduct(FETA);
                return greek;
            case HAWAJSKA:
                AbstractPizza hawajska = createInstance("Hawajska", 19.50);
                hawajska.addProduct(TOMATOSOUCE);
                hawajska.addProduct(CHEESE);
                hawajska.addProduct(PINEAPPLE);
                hawajska.addProduct(HAM);
                hawajska.addProduct(ONION);
                return hawajska;

        }
        throw new IllegalArgumentException("I don't know this pizza");
    }

    protected abstract AbstractPizza createInstance(String aName, double aPrice);
}






