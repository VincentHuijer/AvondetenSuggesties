package AbstractFactoryPattern.BurgerKing;

import AbstractFactoryPattern.*;
import AbstractFactoryPattern.Interfaces.Burger;
import AbstractFactoryPattern.Interfaces.ChickenNuggets;
import AbstractFactoryPattern.Interfaces.Ijs;

public class BurgerKingFactory extends AbstractFactory {
    public static BurgerKingBurger burgerKingBurger = new BurgerKingBurger();
    public static BurgerKingIjs burgerKingIjs = new BurgerKingIjs();
    public static BurgerKingChickenNuggets burgerKingChickenNuggets = new BurgerKingChickenNuggets();

    @Override
    public Burger createBurger() {
        return new BurgerKingBurger();
    }

    @Override
    public Ijs createIjs() {
        return new BurgerKingIjs();
    }

    @Override
    public ChickenNuggets createChickenNuggets() {
        return new BurgerKingChickenNuggets();
    }
}
