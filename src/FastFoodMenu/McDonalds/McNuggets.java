package FastFoodMenu.McDonalds;

import FastFoodMenu.Interfaces.KipNuggets;

public class McNuggets implements KipNuggets {
    @Override
    public String getName() {
        return "McDonalds McNuggets";
    }

    @Override
    public double getPrijs() {
        return 3.39;
    }

    @Override
    public int getAantal() {
        return 6;
    }
}
