package FastFoodMenu.Menu;

import FastFoodMenu.BurgerKing.BurgerKingFactory;
import FastFoodMenu.Interfaces.Burger;
import FastFoodMenu.Interfaces.Friet;
import FastFoodMenu.Interfaces.Ijs;
import FastFoodMenu.Interfaces.KipNuggets;
import FastFoodMenu.McDonalds.McDonaldsFactory;

public abstract class FastfoodMenuFactory {

    public static final BurgerKingFactory burgerKing = new BurgerKingFactory();
    public static final McDonaldsFactory mCDonalds = new McDonaldsFactory();

    public abstract Burger createBurger();
    public abstract Ijs createIjs();
    public abstract KipNuggets createKipNuggets();
    public abstract Friet createFriet();
}