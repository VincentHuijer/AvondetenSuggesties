package FastFoodMenu.Menu;

import FastFoodMenu.BurgerKing.BurgerKingFactory;

public class BurgerKingMenu extends MenuFactory {

    public BurgerKingMenu() {
        super ("Burger King Menu", BurgerKingFactory.burgerKing);
    }
}
