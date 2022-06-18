package Factories;

import AbstractFactoryPattern.Assortiment;
import AbstractFactoryPattern.printMenukeuze;
import App.Gerecht;
import App.GerechtInformatie;
import App.GerechtWaardenCalculator;

import java.util.Scanner;

public class FactoryKeuzeMenu {
    public FactoryKeuzeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Waar heeft u trek in? vul een van de getallen in t/m %d.%n", Gerecht.getAlleGerechten().size());
        int teller = 1;
        for (int i = 0; i < Gerecht.getAlleGerechten().size(); i++) {
            String productnaam = Gerecht.getAlleGerechten().get(i).getNaam();
            System.out.printf("%d. %s%n", teller++, productnaam);
        }
        int input = scanner.nextInt();

        Gerecht g = new FactoryProvider().getFactory(Gerecht.getAlleGerechten().get(input-1).getNaam()).create();
        new GerechtInformatie().voedingswaardesPrinter(Gerecht.getAlleGerechten().get(input-1).getNaam());
       // System.out.println(g.getNaam());
    }
}
