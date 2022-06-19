package FastFoodMenu.McDonalds;

import FastFoodMenu.Interfaces.Burger;

public class McBigMac implements Burger {

    @Override
    public String getName() {
        return "Big Mac";
    }

    @Override
    public double getPrijs() {
        return 4.33;
    }
}
