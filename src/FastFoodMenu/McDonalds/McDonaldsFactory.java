package FastFoodMenu.McDonalds;

import FastFoodMenu.Interfaces.Burger;
import FastFoodMenu.Interfaces.Friet;
import FastFoodMenu.Interfaces.Ijs;
import FastFoodMenu.Interfaces.KipNuggets;

import FastFoodMenu.Menu.FastfoodMenuFactory;

public class McDonaldsFactory extends FastfoodMenuFactory {

    @Override
    public Burger createBurger() {
        return new McBigMac();
    }

    @Override
    public Ijs createIjs() {
        return new McIjs();
    }

    @Override
    public KipNuggets createKipNuggets() {
        return new McNuggets();
    }

    @Override
    public Friet createFriet() {
        return new McFranseFrietjes();
    }
}
