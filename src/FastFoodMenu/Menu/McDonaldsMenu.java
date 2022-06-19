package FastFoodMenu.Menu;

import FastFoodMenu.McDonalds.McDonaldsFactory;

public class McDonaldsMenu extends MenuFactory {

    public McDonaldsMenu() {
        super ("McDonalds Menu", McDonaldsFactory.mCDonalds);
    }
}
