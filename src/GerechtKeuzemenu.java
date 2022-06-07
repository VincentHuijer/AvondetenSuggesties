import java.util.ArrayList;
import java.util.Scanner;

public class GerechtKeuzemenu {

    public GerechtKeuzemenu() {
        GerechtKeuzemenuOpties gerechtKeuzemenuOpties = new GerechtKeuzemenuOpties();
        gerechtKeuzemenuOpties.GerechtKeuzeOpties();
        Gerecht gerecht = new Gerecht();
        GerechtInformatie gerechtInformatie = new GerechtInformatie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Waar heeft u trek in? Voer een optie in met de getallen 1 tot en met 4.");
        System.out.println("heeft u trek in 1. Pasta, 2. Rijst, 3. Deeg-recepten, 4. Vegetarisch");

        String gerechtTypeInput = scanner.nextLine(); // met gerechtTypeInput geef je het type gerecht aan(Pasta, Rijst, Deeg, Vegetarisch)
        ArrayList<GerechtUitprinter> optiesLijst = new ArrayList<>();
        if (gerechtTypeInput.equals("1")) {
            optiesLijst = gerechtKeuzemenuOpties.getGerechtOptiesLijst("Pasta-gerecht");
        } else if (gerechtTypeInput.equals("2")) {
            optiesLijst = gerechtKeuzemenuOpties.getGerechtOptiesLijst("Rijst-gerecht");
        } else if (gerechtTypeInput.equals("3")) {
            optiesLijst = gerechtKeuzemenuOpties.getGerechtOptiesLijst("Deeg-gerecht");
        } else if (gerechtTypeInput.equals("4")) {
            optiesLijst = gerechtKeuzemenuOpties.getGerechtOptiesLijst("Vegetarisch-gerecht");
        }

        String opties = "";
        int teller = 0;
        for (GerechtUitprinter gerechtUitprinter : optiesLijst) {
            opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
        }
        System.out.println("Heeft u trek in " + opties);
        int gerechtInput = scanner.nextInt();
        Integer number = Integer.valueOf(gerechtInput);
        System.out.printf("%s%nDit gerecht bevat de volgende ingrediënten%n", optiesLijst.get(number - 1));
        for (int i = 0; i < gerecht.zoekGerecht(optiesLijst.get(number - 1).getName()).getIngredienten().size(); i++) {
            System.out.println(gerecht.zoekGerecht(optiesLijst.get(number - 1).getName()).getIngredienten().get(i).getNaam());
        }
        gerechtInformatie.gerechtSportMaaltijd(optiesLijst.get(number - 1).getName());
        gerechtInformatie.gerechtGezondheid(optiesLijst.get(number - 1).getName());
        gerechtInformatie.voedingswaardesPrinter(optiesLijst.get(number - 1).getName());
    }


}
