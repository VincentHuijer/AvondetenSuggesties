import java.util.ArrayList;
import java.util.Scanner;

public class GerechtKeuzemenu {
    private ArrayList<GerechtUitprinter> gerechten = new ArrayList<>();

    public GerechtKeuzemenu() {
        ArrayList<GerechtUitprinter> gerechten = new ArrayList<>();
        gerechtOpties();
        Gerecht gerecht = new Gerecht();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Waar heeft u trek in? Voer een optie in met de getallen 1 tot en met 4.");
        System.out.println("heeft u trek in 1. Pasta, 2. Rijst, 3. Deeg-recepten, 4. Vegetarisch");

        String gerechtTypeInput = scanner.nextLine(); // met gerechtTypeInput geef je het type gerecht aan(Pasta, Rijst, Deeg, Vegetarisch)
        if (gerechtTypeInput.equals("1")) {
            gerechten = getGerechtOptiesLijst("Pasta-gerecht");
        } else if (gerechtTypeInput.equals("2")) {
            gerechten = getGerechtOptiesLijst("Rijst-gerecht");
        } else if (gerechtTypeInput.equals("3")) {
            gerechten = getGerechtOptiesLijst("Deeg-gerecht");
        } else if (gerechtTypeInput.equals("4")) {
            gerechten = getGerechtOptiesLijst("Vegetarisch-gerecht");
        }

        String opties = "";
        int teller = 0;
        for (GerechtUitprinter gerechtUitprinter : gerechten) {
            opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
        }
        System.out.println("Heeft u trek in " + opties);
        int gerechtInput = scanner.nextInt();
        Integer number = Integer.valueOf(gerechtInput);
        System.out.printf("%s%nDit gerecht bevat de volgende ingrediënten%n", gerechten.get(number - 1));
        for (int i = 0; i < gerecht.zoekGerecht(gerechten.get(number - 1).getName()).getIngredienten().size(); i++) {
            System.out.println(gerecht.zoekGerecht(gerechten.get(number - 1).getName()).getIngredienten().get(i).getNaam());
        }
        gerecht.controleerGerechtSportMaaltijd(gerechten.get(number - 1).getName());
        gerecht.gerechtGezondheid(gerechten.get(number - 1).getName());
        gerecht.voedingswaardesPrinter(gerechten.get(number - 1).getName());

    }

    public ArrayList<GerechtUitprinter> getGerechtOptiesLijst(String typeGerecht) {
        ArrayList<GerechtUitprinter> arrayToevoegen = new ArrayList<>();
        for (GerechtUitprinter gerechtUitprinter : gerechten) {
            if (gerechtUitprinter.getType().equals(typeGerecht)) {
                arrayToevoegen.add(gerechtUitprinter);
            }
        }

        return arrayToevoegen;
    }


    public void gerechtOpties() {
        //pasta
        gerechten.add(new PastaGerecht("Lasagne", "Pasta-gerecht", 3.23));
        gerechten.add(new PastaGerecht("Penne-alla-Vodka", "Pasta-gerecht", 6.32));
        gerechten.add(new PastaGerecht("Spaghetti", "Pasta-gerecht", 3.54));
        gerechten.add(new PastaGerecht("Tagliatelle", "Pasta-gerecht", 1.01));
        gerechten.add(new PastaGerecht("Macaroni", "Pasta-gerecht", 0.77));
        //rijst
        gerechten.add(new RijstGerecht("Risotto", "Rijst-gerecht", 1.27));
        gerechten.add(new RijstGerecht("Kip Siam", "Rijst-gerecht", 0.65));
        gerechten.add(new RijstGerecht("Bulgoli", "Rijst-gerecht", 0.99));
        gerechten.add(new RijstGerecht("Nasi", "Rijst-gerecht", 7.32));
        gerechten.add(new RijstGerecht("Kip-Tandoori", "Rijst-gerecht", 3.21));
        //deeg
        gerechten.add(new DeegGerecht("Pizza", "Deeg-gerecht", 2.43));
        gerechten.add(new DeegGerecht("Spinazietaart", "Deeg-gerecht", 2.41));
        gerechten.add(new DeegGerecht("Burritos", "Deeg-gerecht", 2.74));
        gerechten.add(new DeegGerecht("Quiche", "Deeg-gerecht", 3.53));
        gerechten.add(new DeegGerecht("Caprese-Empanadas", "Deeg-gerecht", 3.33));
        //vegetarisch
        gerechten.add(new VegetarischGerecht("Salade", "Vegetarisch-gerecht", 2.13));
        gerechten.add(new VegetarischGerecht("Vega-taco's", "Vegetarisch-gerecht", 1.11));
        gerechten.add(new VegetarischGerecht("Stamppot", "Vegetarisch-gerecht", 2.38));
        gerechten.add(new VegetarischGerecht("Shakshuka", "Vegetarisch-gerecht", 1.06));
        gerechten.add(new VegetarischGerecht("Hutspot", "Vegetarisch-gerecht", 1.24));
    }
}
