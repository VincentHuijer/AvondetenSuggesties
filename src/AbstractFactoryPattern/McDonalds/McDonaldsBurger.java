package AbstractFactoryPattern.McDonalds;

import AbstractFactoryPattern.Interfaces.Burger;

public class McDonaldsBurger implements Burger {
    @Override
    public String getName() {
        return "Big Mac";
    }

    @Override
    public double getPrijs() {
        return 2.34;
    }

    @Override
    public String getSpecialeActie() {
        return "Lego City auto";
    }
}
