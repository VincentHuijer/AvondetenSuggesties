package App;

import java.util.ArrayList;

public class GerechtKeuzemenuOpties {
    private static final ArrayList<GerechtVerwerker> gerechten = new ArrayList<>();

    public static ArrayList<GerechtVerwerker> GerechtKeuzeOpties() {
        if (gerechten.isEmpty()){
        //pasta
        gerechten.add(new PastaGerecht("Lasagne", "pasta", 3.23));
        gerechten.add(new PastaGerecht("Penne-alla-Vodka", "pasta", 6.32));
        gerechten.add(new PastaGerecht("Spaghetti", "pasta", 3.54));
        gerechten.add(new PastaGerecht("Tagliatelle", "pasta", 1.01));
        gerechten.add(new PastaGerecht("Macaroni", "pasta", 0.77));
        //rijst
        gerechten.add(new RijstGerecht("Risotto", "rijst", 1.27));
        gerechten.add(new RijstGerecht("Kip Siam", "rijst", 0.65));
        gerechten.add(new RijstGerecht("Bulgoli", "rijst", 0.99));
        gerechten.add(new RijstGerecht("Nasi", "rijst", 7.32));
        gerechten.add(new RijstGerecht("Kip-Tandoori", "rijst", 3.21));
        //deeg
        gerechten.add(new DeegGerecht("Pizza", "deeg", 2.43));
        gerechten.add(new DeegGerecht("Spinazietaart", "deeg", 2.41));
        gerechten.add(new DeegGerecht("Burritos", "deeg", 2.74));
        gerechten.add(new DeegGerecht("Quiche", "deeg", 3.53));
        gerechten.add(new DeegGerecht("Caprese-Empanadas", "deeg", 3.33));
        //vegetarisch
        gerechten.add(new VegetarischGerecht("Salade", "vegetarisch", 2.13));
        gerechten.add(new VegetarischGerecht("Vega-taco's", "vegetarisch", 1.11));
        gerechten.add(new VegetarischGerecht("Stamppot", "vegetarisch", 2.38));
        gerechten.add(new VegetarischGerecht("Shakshuka", "vegetarisch", 1.06));
        gerechten.add(new VegetarischGerecht("Hutspot", "vegetarisch", 1.24));
        } return gerechten;

    }
    public ArrayList<GerechtVerwerker> getGerechtOptiesLijst(String typeGerecht) {
        ArrayList<GerechtVerwerker> arrayToevoegen = new ArrayList<>();
        for (GerechtVerwerker gerechtVerwerker : GerechtKeuzeOpties()) {
            if (gerechtVerwerker.getType().equals(typeGerecht)) {
                arrayToevoegen.add(gerechtVerwerker);
            }
        }
        return arrayToevoegen;
    }
}
