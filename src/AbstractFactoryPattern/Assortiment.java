package AbstractFactoryPattern;

import AbstractFactoryPattern.BurgerKing.BurgerKingFactory;
import AbstractFactoryPattern.McDonalds.McDonaldsFactory;

import java.util.ArrayList;

public class Assortiment {
    private final ArrayList<Menu> gerechten = new ArrayList<>();

    public Assortiment() {
        gerechten.add(new Menu(McDonaldsFactory.mcDonaldsBurger.getName(), McDonaldsFactory.mcDonaldsBurger.getPrijs(), McDonaldsFactory.mcDonaldsBurger.getSpecialeActie()));
        gerechten.add(new Menu(McDonaldsFactory.mcDonaldsIjs.getName(), McDonaldsFactory.mcDonaldsIjs.getPrijs(), McDonaldsFactory.mcDonaldsIjs.getSpecialeActie()));
        gerechten.add(new Menu(McDonaldsFactory.mcDonaldsChickenNuggets.getName(), McDonaldsFactory.mcDonaldsChickenNuggets.getPrijs(), McDonaldsFactory.mcDonaldsChickenNuggets.getSpecialeActie()));

        gerechten.add(new Menu(BurgerKingFactory.burgerKingBurger.getName(), BurgerKingFactory.burgerKingBurger.getPrijs(), BurgerKingFactory.burgerKingBurger.getSpecialeActie()));
        gerechten.add(new Menu(BurgerKingFactory.burgerKingChickenNuggets.getName(), BurgerKingFactory.burgerKingChickenNuggets.getPrijs(), BurgerKingFactory.burgerKingChickenNuggets.getSpecialeActie()));
        gerechten.add(new Menu(BurgerKingFactory.burgerKingIjs.getName(), BurgerKingFactory.burgerKingIjs.getPrijs(), BurgerKingFactory.burgerKingIjs.getSpecialeActie()));
    }

    public ArrayList<Menu> getGerechten() {
        return gerechten;
    }
}