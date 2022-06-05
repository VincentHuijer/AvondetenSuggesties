package TemplateMethodPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class KipBroodjeKeuzemenu {
    public static ArrayList<KipBroodjes> kipBroodjes = new ArrayList<>();

    public static void kipbroodjes() {
        kipBroodjes.add(new BroodjeKipGyros());
        kipBroodjes.add(new BroodjeKipShoarma());
        kipBroodjes.add(new BroodjeKipCarpaccio());
    }

    public KipBroodjeKeuzemenu() {
        Scanner scanner = new Scanner(System.in);
        kipbroodjes();
        System.out.printf("Waar heeft u trek in? Voer een optie in met de getallen 1 t/m %d.%n", kipBroodjes.size());
        int teller = 1;
        for (KipBroodjes kipbroodje : kipBroodjes) {
            System.out.println(teller + ". " + kipbroodje.getName());
            teller++;
        }
        teller = scanner.nextInt();

        kipBroodjes.get(--teller).kipBroodjeSamenstellen();
       }
    }
