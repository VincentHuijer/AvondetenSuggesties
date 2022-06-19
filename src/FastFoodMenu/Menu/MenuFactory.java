package FastFoodMenu.Menu;


import FastFoodMenu.Interfaces.Burger;
import FastFoodMenu.Interfaces.Friet;
import FastFoodMenu.Interfaces.Ijs;
import FastFoodMenu.Interfaces.KipNuggets;

public abstract class MenuFactory {

    private final String name;
    private final Burger burger;
    private final Ijs ijs;
    private final KipNuggets kipNuggets;
    private final Friet friet;

    public MenuFactory(String name, FastfoodMenuFactory factory) {
        this.name = name;
        this.burger = factory.createBurger();
        this.ijs = factory.createIjs();
        this.kipNuggets = factory.createKipNuggets();
        this.friet = factory.createFriet();
    }

    public String getName() {
        return name;
    }

    public String getBestelling() {
        double totaalprijs = burger.getPrijs() + kipNuggets.getPrijs() + friet.getPrijs() + ijs.getPrijs(); //Prijs van alle producten in een menu bij elkaar.
        return String.format("Uw Bestelling:%nBurger: %s%nNuggets: %d %s%nFriet: %s%nIjs: %s%nDit zou uitkomen op: %.2f$", burger.getName(), kipNuggets.getAantal(), kipNuggets.getName(), friet.getName(), ijs.getName(), totaalprijs);
    }
}