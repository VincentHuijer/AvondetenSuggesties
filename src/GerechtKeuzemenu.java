import java.util.ArrayList;
import java.util.Scanner;

public class GerechtKeuzemenu {
    Scanner scanner = new Scanner(System.in);
    GerechtKeuzemenuSeeder gerechtKeuzemenuOpties = new GerechtKeuzemenuSeeder();
    int teller = 0;
    StringBuilder opties = new StringBuilder(); //toont alle opties van een type uit de arraylist van gerechten.

    public GerechtKeuzemenu() {
        System.out.println("Waar heeft u trek in? Voer de naam van het type gerecht in\npasta\nrijst\ndeeg\nvegetarisch");
        String gerechtTypeInput = scanner.nextLine();// gerechtTypeInput geeft type gerecht aan(Pasta, Rijst, Deeg, Vegetarisch)
        gerechtenTonen(gerechtTypeInput);
    }

    public void gerechtenTonen(String gerechtTypeInput) {
        ArrayList<GerechtVerwerker> optiesLijst = gerechtKeuzemenuOpties.getGerechtOptiesLijst(gerechtTypeInput);
        for (GerechtVerwerker gerechtVerwerker : optiesLijst)
            opties.append(++teller).append(".").append(gerechtVerwerker.getName()).append("\n");
        gerechtKiezen(opties, gerechtTypeInput);
    }

    public void gerechtKiezen(StringBuilder opties, String gerechtTypeInput) {
        System.out.println("Waar heeft u trek in? Voer het getal van het gerecht in\n" + opties);
        int gerechtInput = scanner.nextInt();
        gekozenGerecht(gerechtInput, gerechtTypeInput);
    }

    public void gekozenGerecht(int gerechtInput, String gerechtTypeInput) {
        ArrayList<GerechtVerwerker> optiesLijst = gerechtKeuzemenuOpties.getGerechtOptiesLijst(gerechtTypeInput);
        System.out.printf("%s%nDit gerecht bevat de volgende ingrediënten:%n", optiesLijst.get(gerechtInput - 1));
        GerechtSeeder.zoekGerecht(optiesLijst.get(gerechtInput - 1).getName()).getIngredienten().stream().map(Ingredient::getNaam).forEach(System.out::println);
        String gekozenGerecht = optiesLijst.get(gerechtInput - 1).getName();
        gekozenGerechtInformatie(gekozenGerecht);
    }

    public void gekozenGerechtInformatie(String gerecht) {
        new GerechtInformatie().gerechtSportMaaltijd(gerecht);
        new GerechtInformatie().gerechtGezondheid(gerecht);
        new GerechtInformatie().voedingswaardesPrinter(gerecht);
    }
}
