package FastFoodMenu.BurgerKing;

import FastFoodMenu.Interfaces.KipNuggets;

public class BKChiliCheeseNuggets implements KipNuggets {
    @Override
    public String getName() {
        return "Burger King Chili Cheese Nuggets";
    }

    @Override
    public double getPrijs() {
        return 3.90;
    }

    @Override
    public int getAantal() {
        return 7;
    }
}