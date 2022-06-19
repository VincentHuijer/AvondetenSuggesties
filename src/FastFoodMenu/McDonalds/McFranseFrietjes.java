package FastFoodMenu.McDonalds;

import FastFoodMenu.Interfaces.Friet;

public class McFranseFrietjes implements Friet {
    @Override
    public String getName() {
        return "Franse Frietjes";
    }

    @Override
    public double getPrijs() {
        return 2.00;
    }
}
