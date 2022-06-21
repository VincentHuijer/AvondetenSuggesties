import java.util.ArrayList;

public class Ingredient {
    private final String naam;
    private final double vet;
    private final double koolhydraten;
    private final double eiwitten;
    private final boolean groente;
    public static final ArrayList<Ingredient> alleIngredienten = new ArrayList<>();

    Ingredient(String naam, double vet, double koolhydraten, double eiwitten, boolean groente) {
        this.naam = naam;
        this.vet = vet;
        this.koolhydraten = koolhydraten;
        this.eiwitten = eiwitten;
        this.groente = groente;
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

    public static Ingredient zoekIngredient(String naam) {
        for (Ingredient ingredient : IngredientSeeder.getIngredientenSeeder()) {
            if (ingredient.getNaam().equals(naam)) {
                return ingredient;
            }
        }
        return null;
    }
}



