package AbstractFactoryPattern.McDonalds;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.Interfaces.Burger;
import AbstractFactoryPattern.Interfaces.ChickenNuggets;
import AbstractFactoryPattern.Interfaces.Ijs;

public class McDonaldsFactory extends AbstractFactory {
    public static McDonaldsBurger mcDonaldsBurger = new McDonaldsBurger();
    public static McDonaldsIjs mcDonaldsIjs = new McDonaldsIjs();
    public static McDonaldsChickenNuggets mcDonaldsChickenNuggets = new McDonaldsChickenNuggets();

    @Override
    public Burger createBurger() {
        return new McDonaldsBurger();
    }

    @Override
    public Ijs createIjs() {
        return new McDonaldsIjs();
    }

    @Override
    public ChickenNuggets createChickenNuggets() {
        return new McDonaldsChickenNuggets();
    }

}
