package TomaszTrzpisPizzaMenu;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza {

    private final String name;
    private final List<Product> products;
    private final double price;
    private final List<Product> additionalProducts;

     protected AbstractPizza (String name, double price){
        this.name = name;
        this.products = new ArrayList<>();
        this.price = price;
        this.additionalProducts = new ArrayList<>();
    }


    public void addProduct(Product aProduct){
        products.add(aProduct);
    }
    public void addAdditional (Product aAdditional){
        additionalProducts.add(aAdditional);
    }
    public String getName () {
        return name;
    }
    public String getProductsAsString() {
        return prepareStringFromArray(additionalProducts);
    }
    public double getPrice(){
        return price + additionalProducts.stream().mapToDouble(Product::getPrice).sum();
    }
    public String getAdditionalsAsString() {
        return prepareStringFromArray(additionalProducts);
    }
   // @Override
   // public String toString(){
   //     return name + System.getProperty("line.separator") + getProductsAsString();
    //}
    private String prepareStringFromArray(List<Product> additionalProducts){
        StringBuilder sb = new StringBuilder();
        products.stream().forEach(product -> {
            sb.append(product);
            sb.append(", ");
        });
        return sb.toString().isEmpty() ? sb.toString() : sb.toString().substring(0, sb.toString().length() - 2);
    }

}
