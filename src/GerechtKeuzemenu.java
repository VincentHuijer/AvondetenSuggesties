import java.util.ArrayList;
import java.util.Scanner;

public class GerechtKeuzemenu {

    public GerechtKeuzemenu() {
        GerechtKeuzemenuOpties gerechtKeuzemenuOpties = new GerechtKeuzemenuOpties();
        Gerecht gerecht = new Gerecht();
        GerechtInformatie gerechtInformatie = new GerechtInformatie();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Waar heeft u trek in? Voer de naam van het type gerecht in\npasta\nrijst\ndeeg\nvegetarisch");
        String gerechtTypeInput = scanner.nextLine(); // met gerechtTypeInput geef je het type gerecht aan(Pasta, Rijst, Deeg, Vegetarisch)
        ArrayList<GerechtVerwerker> optiesLijst = gerechtKeuzemenuOpties.getGerechtOptiesLijst(gerechtTypeInput);
        //hier kies ik het gerecht na het kiezen van de typen.
        StringBuilder opties = new StringBuilder();
        int teller = 0;
        for (GerechtVerwerker gerechtVerwerker : optiesLijst)
            opties.append(++teller).append(".").append(gerechtVerwerker.getName()).append("\n");
        System.out.println("Waar heeft u trek in? Voer het getal van het gerecht in\n" + opties);
        int gerechtInput = scanner.nextInt();
        System.out.printf("%s%nDit gerecht bevat de volgende ingrediënten%n", optiesLijst.get(gerechtInput - 1));
        for (int i = 0; i < gerecht.zoekGerecht(optiesLijst.get(gerechtInput - 1).getName()).getIngredienten().size(); i++) {
            System.out.println(gerecht.zoekGerecht(optiesLijst.get(gerechtInput - 1).getName()).getIngredienten().get(i).getNaam());
        }//Thiier verwerk ik de informatie van het gerecht
        gerechtInformatie.gerechtSportMaaltijd(optiesLijst.get(gerechtInput - 1).getName());
        gerechtInformatie.gerechtGezondheid(optiesLijst.get(gerechtInput - 1).getName());
        gerechtInformatie.voedingswaardesPrinter(optiesLijst.get(gerechtInput - 1).getName());
    }
}
