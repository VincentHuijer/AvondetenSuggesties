import java.util.ArrayList;

public class Ingredient {

    private String naam;
    private double gewicht;
    private double vet;
    private double koolhydraten;
    private double eiwitten;
    private boolean groente;


    private static ArrayList<Ingredient> alleIngredienten = new ArrayList<>();

    Ingredient(String naam, double vet, double koolhydraten, double eiwitten, boolean groente) {
        this.naam = naam;
        this.vet = vet;
        this.koolhydraten = koolhydraten;
        this.eiwitten = eiwitten;
        this.groente = groente;
    }

    public static ArrayList<Ingredient> getIngredientenLijst() {
        if (alleIngredienten.size() == 0) {
            alleIngredienten.add(new Ingredient("kip", 14, 0, 20, false));
            alleIngredienten.add(new Ingredient("pasta", 1.1, 3.2, 10, false));
            alleIngredienten.add(new Ingredient("pastaSlierten", 1.1, 3.2, 10, false));
            alleIngredienten.add(new Ingredient("pastasaus", 61, 4.3, 2.2, false));
            alleIngredienten.add(new Ingredient("wortel", 0.2, 10, 4, true));
            alleIngredienten.add(new Ingredient("tomaat", 0.2, 3.9, 3, true));
            alleIngredienten.add(new Ingredient("tomatenpuree", 0.2, 3.9, 3, true));
            alleIngredienten.add(new Ingredient("rijst", 0.3, 28, 10, false));
            alleIngredienten.add(new Ingredient("rundGehakt", 30, 28, 24, false));
            alleIngredienten.add(new Ingredient("paprika", 0.3, 6, 1, true));
            alleIngredienten.add(new Ingredient("champignons", 0.5, 5, 2.2, false));
            alleIngredienten.add(new Ingredient("ui", 0.1, 4, 1.1, true));
            alleIngredienten.add(new Ingredient("gember", 0.8, 18, 1.8, false));
            alleIngredienten.add(new Ingredient("tarweBloem", 1, 76, 10, false));
            alleIngredienten.add(new Ingredient("spinazie", 0.6, 0.5, 2, true));
            alleIngredienten.add(new Ingredient("deeg", 39, 46, 7, false));
            alleIngredienten.add(new Ingredient("bladerdeeg", 39, 46, 7, false));
            alleIngredienten.add(new Ingredient("nierbonen", 1, 60, 24, true));
            alleIngredienten.add(new Ingredient("aardappel", 0, 19, 2, false));
            alleIngredienten.add(new Ingredient("boter", 20, 0.1, 0.3, false));
            alleIngredienten.add(new Ingredient("mozzarella", 17, 3.1, 28, false));
            alleIngredienten.add(new Ingredient("bleekselderij", 17, 3.1, 28, true));
            alleIngredienten.add(new Ingredient("spek", 6, 1.5, 21, false));
            alleIngredienten.add(new Ingredient("kaas", 17, 3.1, 28, false));
            alleIngredienten.add(new Ingredient("vodka", 0, 0, 0, false));
            alleIngredienten.add(new Ingredient("knoflook", 0.1, 28, 6, false));
            alleIngredienten.add(new Ingredient("zout", 0, 0, 0, false));
            alleIngredienten.add(new Ingredient("peper", 0, 0, 0, false));
            alleIngredienten.add(new Ingredient("ham", 6, 1.5, 21, false));
            alleIngredienten.add(new Ingredient("bouillon", 14, 18, 17, false));
            alleIngredienten.add(new Ingredient("courgette", 0.3, 3.1, 1.2, true));
            alleIngredienten.add(new Ingredient("pompoen", 0.1, 7, 1, false));
            alleIngredienten.add(new Ingredient("sambal", 0.1, 1, 0.9, false));
            alleIngredienten.add(new Ingredient("olijfolie", 5, 0, 0, false));
            alleIngredienten.add(new Ingredient("ketjap", 4, 0, 0, false));
            alleIngredienten.add(new Ingredient("ei", 5, 0.5, 13, false));
            alleIngredienten.add(new Ingredient("sla", 0.2, 2.9, 1.4, true));
            alleIngredienten.add(new Ingredient("prei", 0.3, 14, 1.5, true));
        }
        return alleIngredienten;
    }


    public static Ingredient zoekIngredient(String naam) {
        for (Ingredient ingredient : getIngredientenLijst()) {
            if (ingredient.getNaam().equals(naam)) {
                return ingredient;
            }
        }
        return null;
    }

    public String getNaam() {
        return naam;
    }

    public double getVet() {
        return vet;
    }

    public double getKoolhydraten() {
        return koolhydraten;
    }

    public double getEiwitten() {
        return eiwitten;
    }

    public boolean isGroente() {
        return groente;
    }
}



