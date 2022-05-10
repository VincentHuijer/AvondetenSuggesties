import java.util.ArrayList;
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
    private ArrayList<GerechtUitprinter> gerechten = new ArrayList<>();

    /**
     * Alle gerechten met het type en de prijs (exclusief btw)
     **/
    public void gerechten() {
        //pasta
        gerechten.add(new PastaGerecht("Lasagne", "Pasta-gerecht", 1.23));
        gerechten.add(new PastaGerecht("Penne alla Vodka", "Pasta-gerecht", 6.32));
        gerechten.add(new PastaGerecht("Spaghetti", "Pasta-gerecht", 1.54));
        gerechten.add(new PastaGerecht("Tagliatelle", "Pasta-gerecht", 1.01));
        gerechten.add(new PastaGerecht("Macaroni", "Pasta-gerecht", 0.77));
        //rijst
        gerechten.add(new RijstGerecht("Risotto", "Rijst-gerecht", 1.27));
        gerechten.add(new RijstGerecht("Kip Siam", "Rijst-gerecht", 0.65));
        gerechten.add(new RijstGerecht("Bulgoli", "Rijst-gerecht", 0.99));
        gerechten.add(new RijstGerecht("Nasi", "Rijst-gerecht", 7.32));
        gerechten.add(new RijstGerecht("Kip Tandoori", "Rijst-gerecht", 3.21));
        //deeg
        gerechten.add(new DeegGerecht("Pizza", "Deeg-gerecht", 2.43));
        gerechten.add(new DeegGerecht("Spinazietaart", "Deeg-gerecht", 2.41));
        gerechten.add(new DeegGerecht("Burritos", "Deeg-gerecht", 2.74));
        gerechten.add(new DeegGerecht("Quiche", "Deeg-gerecht", 3.53));
        gerechten.add(new DeegGerecht("Caprese Empanadas", "Deeg-gerecht", 3.33));
        //vegetarisch
        gerechten.add(new VegetarischGerecht("Salade", "Vegetarisch-gerecht", 2.13));
        gerechten.add(new VegetarischGerecht("Vega-taco's", "Vegetarisch-gerecht", 1.11));
        gerechten.add(new VegetarischGerecht("Stamppot", "Vegetarisch-gerecht", 2.38));
        gerechten.add(new VegetarischGerecht("Shakshuka", "Vegetarisch-gerecht", 1.06));
        gerechten.add(new VegetarischGerecht("Hutspot", "Vegetarisch-gerecht", 1.24));
    }


    /**
     * De de applicatie kan suggesties geven voor avondeten door middel van vragen waar je trek in hebt
     **/
    public Applicatie() {
        gerechten();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat wilt u doen? voer een optie in met de getallen 1 tot en met 2.");
        System.out.println("1. Geef mij een suggestie voor het avondeten");
        System.out.println("2. pizza berekenen.");
        String keuze = scanner.nextLine();

        if (keuze.equals("1")) {
            System.out.println("Waar heeft u trek in? Voer een optie in met de getallen 1 tot en met 4.");
            System.out.println("heeft u trek in 1. Pasta, 2. Rijst, 3. Deeg-recepten, 4. Vegetarisch");

            String num = scanner.nextLine(); // met num geef je het type gerecht aan(Pasta, Rijst, Deeg, Vegetarisch)
            //1. pasta keuze
            if (num.equals("1")) {
                ArrayList<GerechtUitprinter> pastaGerechten = getGerechtenLijst("Pasta-gerecht");
                String opties = "";
                int teller = 0;
                for (GerechtUitprinter gerechtUitprinter : pastaGerechten) {
                    opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
                }
                System.out.println("[Pasta] Heeft u trek in " + opties);
                String pastaInput = scanner.nextLine();
                Integer number = Integer.valueOf(pastaInput);
                System.out.printf("%s%n", pastaGerechten.get(number - 1));
            }

            //2. rijst keuze
            if (num.equals("2")) {
                ArrayList<GerechtUitprinter> rijstGerechten = getGerechtenLijst("Rijst-gerecht");
                String opties = "";
                int teller = 0;
                for (GerechtUitprinter gerechtUitprinter : rijstGerechten) {
                    opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
                }
                System.out.println("[Rijst] Heeft u trek in " + opties);
                String rijstInput = scanner.nextLine();
                Integer number = Integer.valueOf(rijstInput);
                System.out.printf("%s%n", rijstGerechten.get(number - 1));
            }
            // 3. deeg keuze
            if (num.equals("3")) {
                ArrayList<GerechtUitprinter> deegGerechten = getGerechtenLijst("Deeg-gerecht");
                String opties = "";
                int teller = 0;
                for (GerechtUitprinter gerechtUitprinter : deegGerechten) {
                    opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
                }
                System.out.println("[Deeg] Heeft u trek in " + opties);
                String DeegInput = scanner.nextLine();
                Integer number = Integer.valueOf(DeegInput);
                System.out.printf("%s%n", deegGerechten.get(number - 1));
            }

            // 4. vegetarisch keuze
            if (num.equals("4")) {
                ArrayList<GerechtUitprinter> vegetarischGerechten = getGerechtenLijst("Vegetarisch-gerecht");
                String opties = "";
                int teller = 0;
                for (GerechtUitprinter gerechtUitprinter : vegetarischGerechten) {
                    opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
                }
                System.out.println("[Vegetarisch] Heeft u trek in " + opties);
                int vegetarischInput = scanner.nextInt();
                Integer number = Integer.valueOf(vegetarischInput);
                System.out.printf("%s%n", vegetarischGerechten.get(number - 1));
            }

        }
        if (keuze.equals("2")) {
            new Pizzakeuzemenu();

        }
    }

    //Maakt de suggesties voor het avondeten dynamic. getGerechtenLijst stopt alle gerechten in de juiste locaties
    public ArrayList<GerechtUitprinter> getGerechtenLijst(String typeGerecht) {
        ArrayList<GerechtUitprinter> arrayToevoegen = new ArrayList<>();
        for (GerechtUitprinter gerechtUitprinter : gerechten) {
            if (gerechtUitprinter.getType().equals(typeGerecht)) {
                arrayToevoegen.add(gerechtUitprinter);
            }
        }

        return arrayToevoegen;
    }
}





