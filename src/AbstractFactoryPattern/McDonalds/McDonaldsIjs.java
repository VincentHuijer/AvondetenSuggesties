package AbstractFactoryPattern.McDonalds;

import AbstractFactoryPattern.Interfaces.Ijs;

public class McDonaldsIjs implements Ijs {

    @Override
    public String getName() {
        return "McFlurry";
    }

    @Override
    public double getPrijs() {
        return 1.49;
    }

    @Override
    public String getSpecialeActie() {
        return null;
    }
}
