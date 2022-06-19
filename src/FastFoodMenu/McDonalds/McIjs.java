package FastFoodMenu.McDonalds;

import FastFoodMenu.Interfaces.Ijs;

public class McIjs implements Ijs {

    @Override
    public String getName() {
        return "Mc Flurry";
    }

    @Override
    public double getPrijs() {
        return 1.40;
    }
}
