package AbstractFactoryPattern.McDonalds;

import AbstractFactoryPattern.Interfaces.ChickenNuggets;

public class McDonaldsChickenNuggets implements ChickenNuggets {
    @Override
    public String getName() {
        return "McNuggets";
    }

    @Override
    public double getPrijs() {
        return 4.54;
    }

    @Override
    public String getSpecialeActie() {
        return null;
    }

}
