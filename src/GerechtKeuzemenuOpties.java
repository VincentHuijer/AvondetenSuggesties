import java.util.ArrayList;

public class GerechtKeuzemenuOpties {
    private static ArrayList<GerechtUitprinter> gerechten = new ArrayList<>();

    public static ArrayList<GerechtUitprinter> GerechtKeuzeOpties() {
        if (gerechten.isEmpty()){
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
        } return gerechten;

    }
    public ArrayList<GerechtUitprinter> getGerechtOptiesLijst(String typeGerecht) {
        ArrayList<GerechtUitprinter> arrayToevoegen = new ArrayList<>();
        for (GerechtUitprinter gerechtUitprinter : GerechtKeuzeOpties()) {
            if (gerechtUitprinter.getType().equals(typeGerecht)) {
                arrayToevoegen.add(gerechtUitprinter);
            }
        }

        return arrayToevoegen;
    }

}
