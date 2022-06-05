package AbstractFactoryPattern;

import AbstractFactoryPattern.BurgerKing.BurgerKingFactory;
import AbstractFactoryPattern.McDonalds.McDonaldsFactory;

import java.util.ArrayList;

public class Assortiment {
    private final ArrayList<menu> gerechten = new ArrayList<>();

    public Assortiment() {
        gerechten.add(new menu(McDonaldsFactory.mcDonaldsBurger.getName(), McDonaldsFactory.mcDonaldsBurger.getPrijs(), McDonaldsFactory.mcDonaldsBurger.getSpecialeActie()));
        gerechten.add(new menu(McDonaldsFactory.mcDonaldsIjs.getName(), McDonaldsFactory.mcDonaldsIjs.getPrijs(), McDonaldsFactory.mcDonaldsIjs.getSpecialeActie()));
        gerechten.add(new menu(McDonaldsFactory.mcDonaldsChickenNuggets.getName(), McDonaldsFactory.mcDonaldsChickenNuggets.getPrijs(), McDonaldsFactory.mcDonaldsChickenNuggets.getSpecialeActie()));

        gerechten.add(new menu(BurgerKingFactory.burgerKingBurger.getName(), BurgerKingFactory.burgerKingBurger.getPrijs(), BurgerKingFactory.burgerKingBurger.getSpecialeActie()));
        gerechten.add(new menu(BurgerKingFactory.burgerKingChickenNuggets.getName(), BurgerKingFactory.burgerKingChickenNuggets.getPrijs(), BurgerKingFactory.burgerKingChickenNuggets.getSpecialeActie()));
        gerechten.add(new menu(BurgerKingFactory.burgerKingIjs.getName(), BurgerKingFactory.burgerKingIjs.getPrijs(), BurgerKingFactory.burgerKingIjs.getSpecialeActie()));
    }

    public ArrayList<menu> getGerechten() {
        return gerechten;
    }
}