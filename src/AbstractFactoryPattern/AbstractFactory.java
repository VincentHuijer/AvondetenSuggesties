package AbstractFactoryPattern;

import AbstractFactoryPattern.Interfaces.Burger;
import AbstractFactoryPattern.Interfaces.ChickenNuggets;
import AbstractFactoryPattern.Interfaces.Ijs;

public abstract class AbstractFactory {
    public abstract Burger createBurger();

    public abstract Ijs createIjs();

    public abstract ChickenNuggets createChickenNuggets();
}
