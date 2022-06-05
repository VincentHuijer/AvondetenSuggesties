package TemplateMethodPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class BurgerKeuzemenu {
    public static ArrayList<Burger> burgers = new ArrayList<>();

    public static void burgers() {
        burgers.add(new BigMacBurger());
        burgers.add(new CrispyChickenBurger());
        burgers.add(new DoubleBigTastyBurger());
    }

    public BurgerKeuzemenu() {
        Scanner scanner = new Scanner(System.in);
        burgers();
        System.out.printf("Waar heeft u trek in? Voer een optie in met de getallen 1 t/m %d.%n", burgers.size());
        int teller = 1;
        for (Burger burger : burgers) {
            System.out.println(teller + ". " + burger.getName());
            teller++;
        }
        teller = scanner.nextInt();

        burgers.get(--teller).burgerSamenStellen();
       }
    }
