package FastFoodMenu.BurgerKing;

import FastFoodMenu.Interfaces.Ijs;

public class BKIjs implements Ijs {

    @Override
    public String getName() {
        return "King Fusion";
    }

    @Override
    public double getPrijs() {
        return 1.00;
    }
}
