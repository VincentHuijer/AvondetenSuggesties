import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        new Applicatie();
    }
}

public class Applicatie {
    /**
     * Gerechten worden toegevoegd aan de ArrayList en worden vervolgens verder verwerkt in PastaGerecht, RijstGerecht, etc.
     **/
    private ArrayList<Gerecht> gerechten = new ArrayList<>();


    public void gerechten() {
        gerechten.add(new PastaGerecht("Lasagne", "Pasta-gerecht", 1.23));
        gerechten.add(new PastaGerecht("Penne alla Vodka", "Pasta-gerecht", 6.32));
        gerechten.add(new PastaGerecht("Spaghetti", "Pasta-gerecht", 1.54));
        gerechten.add(new PastaGerecht("Tagliatelle", "Pasta-gerecht", 1.01));
        gerechten.add(new PastaGerecht("Macaroni", "Pasta-gerecht", 0.77));

        gerechten.add(new RijstGerecht("Risotto", "Rijst-gerecht", 1.27));
        gerechten.add(new RijstGerecht("Kip Siam", "Rijst-gerecht", 0.65));
        gerechten.add(new RijstGerecht("Bulgoli", "Rijst-gerecht", 0.99));
        gerechten.add(new RijstGerecht("Nasi", "Rijst-gerecht", 7.32));
        gerechten.add(new RijstGerecht("Kip Tandoori", "Rijst-gerecht", 3.21));

        gerechten.add(new DeegGerecht("Pizza", "Deeg-gerecht", 2.43));
        gerechten.add(new DeegGerecht("Spinazietaart", "Deeg-gerecht", 2.41));
        gerechten.add(new DeegGerecht("Burritos", "Deeg-gerecht", 2.74));
        gerechten.add(new DeegGerecht("Quiche", "Deeg-gerecht", 3.53));
        gerechten.add(new DeegGerecht("Caprese Empanadas", "Deeg-gerecht", 3.33));

        gerechten.add(new VegetarischGerecht("Salade", "Vegetarisch-gerecht", 2.13));
        gerechten.add(new VegetarischGerecht("Vega-taco's", "Vegetarisch-gerecht", 1.11));
        gerechten.add(new VegetarischGerecht("Stamppot", "Vegetarisch-gerecht", 2.38));
        gerechten.add(new VegetarischGerecht("Shakshuka", "Vegetarisch-gerecht", 1.06));
        gerechten.add(new VegetarischGerecht("Hutspot", "Vegetarisch-gerecht", 1.24));
    }




    public Applicatie() {
        gerechten();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Waar heeft u trek in? Voer een optie in met de getallen 1 tot en met 4.");
        /**1. Laat de applicatie een suggestie geven voor avondeten doormiddel van een vraag waar je trek in hebt **/
        System.out.println("heeft u trek in 1. Pasta, 2. Rijst, 3. Deeg-recepten, 4. Vegetarisch");
        String num = scanner.nextLine(); /** met num geef je het type gerecht aan(Pasta, Rijst, Deeg, Vegetarisch)**/

        if (num.equals("1")) {
            ArrayList<Gerecht> PastaGerechten = getGerechtenLijst("Pasta-gerecht");
            String opties = "";
            int teller = 0;
            for (Gerecht gerecht : PastaGerechten) {
                opties += (++teller + ". " + gerecht.getName() + " ");
            }
            System.out.println("[Pasta] Heeft u trek in " + opties);
            int pastaInput = scanner.nextInt();
            System.out.printf("%s%n", PastaGerechten.get(pastaInput - 1)); //aa
        }
        if (num.equals("2")) {
            ArrayList<Gerecht> RijstGerechten = getGerechtenLijst("Rijst-gerecht");
            String opties = "";
            int teller = 0;
            for (Gerecht gerecht : RijstGerechten) {
                opties += (++teller + ". " + gerecht.getName() + " ");
            }
            System.out.println("[Rijst] Heeft u trek in " + opties);
            int rijstInput = scanner.nextInt();
            System.out.printf("%s%n", RijstGerechten.get(rijstInput - 1));
        }
        if (num.equals("3")) {
            ArrayList<Gerecht> DeegGerechten = getGerechtenLijst("Deeg-gerecht");
            String opties = "";
            int teller = 0;
            for (Gerecht gerecht : DeegGerechten) {
                opties += (++teller + ". " + gerecht.getName() + " ");
            }
            System.out.println("[Deeg] Heeft u trek in " + opties);
            int DeegInput = scanner.nextInt();
            System.out.printf("%s%n", DeegGerechten.get(DeegInput - 1));
        }
        if (num.equals("4")) {
            ArrayList<Gerecht> VegetarischGerechten = getGerechtenLijst("Vegetarisch-gerecht");
            String opties = "";
            int teller = 0;
            for (Gerecht gerecht : VegetarischGerechten) {
                opties += (++teller + ". " + gerecht.getName() + " ");
            }
            System.out.println("[Vegetarisch] Heeft u trek in " + opties);
            int vegetarischInput = scanner.nextInt();
            System.out.printf("%s%n", VegetarischGerechten.get(vegetarischInput - 1));
        }

    }
    public ArrayList<Gerecht> getGerechtenLijst(String typeGerecht) {
        ArrayList<Gerecht> arrayToevoegen = new ArrayList<>();
        for (Gerecht gerecht : gerechten) {
            if (gerecht.getType().equals(typeGerecht)) {
                arrayToevoegen.add(gerecht);
            }
        }

        return arrayToevoegen;
    }
}





