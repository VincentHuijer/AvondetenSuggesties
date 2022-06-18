package Factories;

import App.Gerecht;

public class PizzaFactory extends AbstractFactory{

    public Gerecht create(){
        return Gerecht.zoekGerecht("pizza");
    }

}
