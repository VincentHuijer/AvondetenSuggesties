package AbstractFactoryPattern.BurgerKing;

import AbstractFactoryPattern.Interfaces.Burger;

public class BurgerKingBurger implements Burger {
    @Override
    public String getName() {
        return "Whopper";
    }

    @Override
    public double getPrijs() {
        return 3.21;
    }

    @Override
    public String getSpecialeActie() {
        return "Frozen kleurplaat";
    }
}

