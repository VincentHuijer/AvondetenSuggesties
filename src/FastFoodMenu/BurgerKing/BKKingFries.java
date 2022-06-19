package FastFoodMenu.BurgerKing;

import FastFoodMenu.Interfaces.Friet;

public class BKKingFries implements Friet {
    @Override
    public String getName() {
        return "King Fries";
    }

    @Override
    public double getPrijs() {
        return 2.30;
    }
}
