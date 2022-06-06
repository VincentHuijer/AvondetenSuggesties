package AbstractFactoryPattern;

import AbstractFactoryPattern.BurgerKing.BurgerKingFactory;
import AbstractFactoryPattern.McDonalds.McDonaldsFactory;

import java.util.ArrayList;

public class Assortiment {
    private final ArrayList<Producten> producten = new ArrayList<>();

    public Assortiment() {
        producten.add(new Producten(McDonaldsFactory.mcDonaldsBurger.getName(), McDonaldsFactory.mcDonaldsBurger.getPrijs(), McDonaldsFactory.mcDonaldsBurger.getSpecialeActie()));
        producten.add(new Producten(McDonaldsFactory.mcDonaldsIjs.getName(), McDonaldsFactory.mcDonaldsIjs.getPrijs(), McDonaldsFactory.mcDonaldsIjs.getSpecialeActie()));
        producten.add(new Producten(McDonaldsFactory.mcDonaldsChickenNuggets.getName(), McDonaldsFactory.mcDonaldsChickenNuggets.getPrijs(), McDonaldsFactory.mcDonaldsChickenNuggets.getSpecialeActie()));

        producten.add(new Producten(BurgerKingFactory.burgerKingBurger.getName(), BurgerKingFactory.burgerKingBurger.getPrijs(), BurgerKingFactory.burgerKingBurger.getSpecialeActie()));
        producten.add(new Producten(BurgerKingFactory.burgerKingChickenNuggets.getName(), BurgerKingFactory.burgerKingChickenNuggets.getPrijs(), BurgerKingFactory.burgerKingChickenNuggets.getSpecialeActie()));
        producten.add(new Producten(BurgerKingFactory.burgerKingIjs.getName(), BurgerKingFactory.burgerKingIjs.getPrijs(), BurgerKingFactory.burgerKingIjs.getSpecialeActie()));
    }

    public ArrayList<Producten> getProducten() {
        return producten;
    }
}