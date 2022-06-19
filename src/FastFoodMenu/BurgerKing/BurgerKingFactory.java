package FastFoodMenu.BurgerKing;

import FastFoodMenu.Interfaces.Burger;
import FastFoodMenu.Interfaces.Friet;
import FastFoodMenu.Interfaces.Ijs;
import FastFoodMenu.Interfaces.KipNuggets;
import FastFoodMenu.Menu.FastfoodMenuFactory;

public class BurgerKingFactory extends FastfoodMenuFactory {

    @Override
    public Burger createBurger() {
        return new BKWhopper();
    }

    @Override
    public Ijs createIjs() {
        return new BKIjs();
    }

    @Override
    public KipNuggets createKipNuggets() {
        return new BKChiliCheeseNuggets();
    }

    @Override
    public Friet createFriet() {
        return new BKKingFries();
    }
}
