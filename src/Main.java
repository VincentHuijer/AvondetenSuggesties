import AbstractFactoryPattern.FactoryKeuzemenu;
import TemplateMethodPattern.KipBroodjeKeuzemenu;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Wat wilt u doen? voer een optie in met de getallen 1 t/m 4.\n" +
                        "1. Suggesties voor het zelf bereiden van avondeten.\n" +
                        "2. Suggesties voor pizza bestellen.\n" +
                        "3. Suggesties voor Rooster broodjes bestellen.\n" +
                        "4. Suggesties voor McDonalds of Burger King bestellen.");
        String keuze = scanner.nextLine();
        if (keuze.equals("1")) new GerechtKeuzemenu();
        if (keuze.equals("2")) new PizzaKeuzemenu();
        if (keuze.equals("3")) new KipBroodjeKeuzemenu();
        if (keuze.equals("4")) new FactoryKeuzemenu();
    }
}
