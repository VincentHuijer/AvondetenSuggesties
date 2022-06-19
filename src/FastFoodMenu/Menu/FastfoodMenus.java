package FastFoodMenu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class FastfoodMenus {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<MenuFactory> menus;

    public FastfoodMenus() {
        menus = new ArrayList<>();
        menus.add(new BurgerKingMenu());
        menus.add(new McDonaldsMenu());
        MenuFactory menuFactory = fastfoodKeuzemenu();
        System.out.println(menuFactory.getName()); //type menu (burgerking, McDonadlds)
        System.out.println(menuFactory.getBestelling()); //alle producten die in een menu zitten (Burger, ijsje, friet, Nuggets)
    }

    public MenuFactory fastfoodKeuzemenu() {
        int teller = 1;
        System.out.printf("Waar heeft u trek in? Kies uit een getal van 1 t/m %d%n", menus.size());
        for (MenuFactory menuFactory : menus) System.out.printf("%d. %s%n", teller++, menuFactory.getName());
        int menuKeuze = scanner.nextInt();
        return menus.get(menuKeuze - 1);
    }

    public static void main(String[] args) {

    }
}
