package FastFoodMenu.BurgerKing;

import FastFoodMenu.Interfaces.Burger;

public class BKWhopper implements Burger {

    @Override
    public String getName() {
        return "Whopper";
    }

    @Override
    public double getPrijs() {
        return 3.45;
    }
}
