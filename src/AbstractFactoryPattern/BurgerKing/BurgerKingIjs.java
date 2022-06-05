package AbstractFactoryPattern.BurgerKing;

import AbstractFactoryPattern.Interfaces.Ijs;

public class BurgerKingIjs implements Ijs {
    @Override
    public String getName() {
        return "King Ijshoorn";
    }

    @Override
    public double getPrijs() {
        return 1.00;
    }

    @Override
    public String getSpecialeActie() {
        return null;
    }
}
