import java.util.ArrayList;

public class Gerecht {
    private final String name;
    private final ArrayList<Ingredient> ingredienten;
    private static final ArrayList<Gerecht> alleGerechten = new ArrayList<>();

    public Gerecht(String name, ArrayList<Ingredient> ingredienten) {
        this.name = name;
        this.ingredienten = ingredienten;
        getAlleGerechten().add(this);
    }

    public static ArrayList<Gerecht> getAlleGerechten() {
        return alleGerechten;
    }

    public String getName(){
        return name;
    }
    public ArrayList<Ingredient> getIngredienten() {
        return ingredienten;
    }
}

