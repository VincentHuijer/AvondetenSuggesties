package AbstractFactoryPattern.BurgerKing;

import AbstractFactoryPattern.Interfaces.ChickenNuggets;

public class BurgerKingChickenNuggets implements ChickenNuggets {
    @Override
    public String getName() {
        return "King Nuggets";
    }

    @Override
    public double getPrijs() {
        return 2.00;
    }

    @Override
    public String getSpecialeActie() {
        return null;
    }
}
