package TomaszTrzpisPizzaMenu;
import java.util.*;

import static TomaszTrzpisPizzaMenu.Product.*;


public class Main {
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

final Menu menu = new Menu();
menu.showMenu();
int opt;
double price = 0.0;
AbstractPizza orderPizza = null;
while (orderPizza == null){
    opt = in.nextInt();
    if (opt < 1 || opt > 5)
        System.out.println("Wybrano nieprawidłową opcję.");
    else
        orderPizza = menu.get(opt - 1);
}

        List<String> addicionList = new ArrayList<>();
int opt2;
double addicionPrice = 0.0;
do {
    System.out.println("Może jakiś dodatek do tego?");
    System.out.println("1. Nie dzięki, to wszystko.");
    System.out.println("2. 2.00 " + BECON);
    System.out.println("3. 2.50 " + CHICKEN);
    System.out.println("4. 1.50 " + CHEESE);
    System.out.println("5. 2.00 " + HAM);
    System.out.println("6. 1.50 " + OLIVES);
    System.out.println("7. 2.00 " + SALAMI);
    System.out.println("8. 1.50 " + FETA);
opt2 = in.nextInt();
switch (opt2){
    case 1:
        break;
    case 2:
       orderPizza.addAdditional(BECON);
        break;
    case 3:
       orderPizza.addAdditional(CHICKEN);
        break;
    case 4:
        orderPizza.addAdditional(CHEESE);
        break;
    case 5:
        orderPizza.addAdditional(HAM);
        break;
    case 6:
       orderPizza.addAdditional(OLIVES);
        break;
    case 7:
       orderPizza.addAdditional(SALAMI);
        break;
    case 8:
       orderPizza.addAdditional(FETA);
        break;
    default:
        System.out.println("Wybrano nieprawidłową opcję");
        break;

}

} while (opt2 != 1);

System.out.println("Zamówiłeś pizze " + orderPizza);
        System.out.println("Wybrane dodatki to: " + orderPizza.getAdditionalsAsString());
        System.out.println("Do zapłaty: " + orderPizza.getPrice());
    }

}
