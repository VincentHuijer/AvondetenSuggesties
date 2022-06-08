import java.util.ArrayList;
import java.util.Collections;

public class Gerecht {
    private String naam;
    private ArrayList<Ingredient> ingredienten;
    public static ArrayList<Gerecht> alleGerechten = new ArrayList<>();

    public Gerecht(String naam, ArrayList<Ingredient> ingredienten) {
        this.naam = naam;
        this.ingredienten = ingredienten;
        alleGerechten.add(this);
    }

    public Gerecht() {
    }

    public String getNaam() {
        return this.naam;
    }

    //Als je een naam bv. lasagne meegeeft kijkt zoekGerecht in alleGerechten naar een match.
    public Gerecht zoekGerecht(String naam) {
        for (Gerecht gerecht : getAlleGerechten()) {
            if (gerecht.getNaam().equals(naam)) {
                return gerecht;
            }
        }
        return null;
    }
    public ArrayList<Ingredient> getIngredienten() {
        return ingredienten;
    }

    //Bevat alle gerechten en gebruikt de methode zoekIngredient om uit de ingredienten ArrayList een match te vinden om aan het gerecht toe te voegen.
    public ArrayList<Gerecht> getAlleGerechten() {
        if (alleGerechten.size() == 0) {
            //Collections is voor het beheren van lijsten
            //pasta gerechten
            Collections.addAll(new Gerecht("Lasagne", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("pasta"),
                    Ingredient.zoekIngredient("wortel"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("rundGehakt"),
                    Ingredient.zoekIngredient("bleekselderij"),
                    Ingredient.zoekIngredient("mozzarella"),
                    Ingredient.zoekIngredient("kaas"),
                    Ingredient.zoekIngredient("ui"));
            Collections.addAll(new Gerecht("Penne-alla-Vodka", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("vodka"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("knoflook"),
                    Ingredient.zoekIngredient("ham"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("pasta"));
            Collections.addAll(new Gerecht("Spaghetti", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("pastaSlierten"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("rundGehakt"),
                    Ingredient.zoekIngredient("tomatenpuree"),
                    Ingredient.zoekIngredient("bouillon"),
                    Ingredient.zoekIngredient("kaas"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("zout"));
            Collections.addAll(new Gerecht("Tagliatelle", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("spek"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("rundGehakt"),
                    Ingredient.zoekIngredient("pastasaus"),
                    Ingredient.zoekIngredient("pastaSlierten"));
            Collections.addAll(new Gerecht("Macaroni", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("pasta"),
                    Ingredient.zoekIngredient("courgette"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("rundGehakt"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("kaas"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("tomatenpuree"));
            //rijst gerechten
            Collections.addAll(new Gerecht("Risotto", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("rijst"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("bouillon"),
                    Ingredient.zoekIngredient("kaas"),
                    Ingredient.zoekIngredient("boter"),
                    Ingredient.zoekIngredient("pompoen"));
            Collections.addAll(new Gerecht("kipSiam", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("kip"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("paprika"),
                    Ingredient.zoekIngredient("knoflook"),
                    Ingredient.zoekIngredient("gember"),
                    Ingredient.zoekIngredient("ketjap"),
                    Ingredient.zoekIngredient("zout"));
            Collections.addAll(new Gerecht("Bulgoli", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("rundGehakt"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("knoflook"),
                    Ingredient.zoekIngredient("gember"));
            Collections.addAll(new Gerecht("Nasi", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("knoflook"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("ham"),
                    Ingredient.zoekIngredient("olijfolie"),
                    Ingredient.zoekIngredient("sambal"),
                    Ingredient.zoekIngredient("ketjap"),
                    Ingredient.zoekIngredient("zout"),
                    Ingredient.zoekIngredient("peper"));
            Collections.addAll(new Gerecht("Kip-Tandoori", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("kip"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("rijst"),
                    Ingredient.zoekIngredient("olijfolie"),
                    Ingredient.zoekIngredient("gember"),
                    Ingredient.zoekIngredient("tomatenpuree"),
                    Ingredient.zoekIngredient("zout"),
                    Ingredient.zoekIngredient("peper"));
            //deeg
            Collections.addAll(new Gerecht("Pizza", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("deeg"),
                    Ingredient.zoekIngredient("tarweBloem"),
                    Ingredient.zoekIngredient("olijfolie"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("kaas"),
                    Ingredient.zoekIngredient("champignons"),
                    Ingredient.zoekIngredient("mozzarella"),
                    Ingredient.zoekIngredient("zout"),
                    Ingredient.zoekIngredient("peper"));
            Collections.addAll(new Gerecht("Spinazietaart", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("spinazie"),
                    Ingredient.zoekIngredient("bladerdeeg"),
                    Ingredient.zoekIngredient("olijfolie"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("ei"),
                    Ingredient.zoekIngredient("kaas"),
                    Ingredient.zoekIngredient("zout"),
                    Ingredient.zoekIngredient("peper"));
            Collections.addAll(new Gerecht("Burritos", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("deeg"),
                    Ingredient.zoekIngredient("paprika"),
                    Ingredient.zoekIngredient("courgette"),
                    Ingredient.zoekIngredient("champignons"),
                    Ingredient.zoekIngredient("kaas"),
                    Ingredient.zoekIngredient("zout"),
                    Ingredient.zoekIngredient("peper"));
            Collections.addAll(new Gerecht("Quiche", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("champignons"),
                    Ingredient.zoekIngredient("paprika"),
                    Ingredient.zoekIngredient("ei"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("bladerdeeg"),
                    Ingredient.zoekIngredient("boter"),
                    Ingredient.zoekIngredient("kaas"));
            Collections.addAll(new Gerecht("Caprese-Empanadas", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("deeg"),
                    Ingredient.zoekIngredient("tarweBloem"),
                    Ingredient.zoekIngredient("boter"),
                    Ingredient.zoekIngredient("ei"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("mozzarella"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("zout"));
            //vegetarisch
            Collections.addAll(new Gerecht("Salade", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("sla"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("boter"),
                    Ingredient.zoekIngredient("gember"),
                    Ingredient.zoekIngredient("olijfolie"),
                    Ingredient.zoekIngredient("courgette"));
            Collections.addAll(new Gerecht("Vega-taco's", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("paprika"),
                    Ingredient.zoekIngredient("olijfolie"),
                    Ingredient.zoekIngredient("nierbonen"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("zout"));
            Collections.addAll(new Gerecht("Stamppot", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("prei"),
                    Ingredient.zoekIngredient("aardappel"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("paprika"),
                    Ingredient.zoekIngredient("boter"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("zout"));
            Collections.addAll(new Gerecht("Shakshuka", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("ei"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("knoflook"),
                    Ingredient.zoekIngredient("paprika"),
                    Ingredient.zoekIngredient("olijfolie"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("zout"));
            Collections.addAll(new Gerecht("Hutspot", new ArrayList<>()).getIngredienten(),
                    Ingredient.zoekIngredient("wortel"),
                    Ingredient.zoekIngredient("tomaat"),
                    Ingredient.zoekIngredient("ui"),
                    Ingredient.zoekIngredient("boter"),
                    Ingredient.zoekIngredient("peper"),
                    Ingredient.zoekIngredient("zout"));
        }
        return alleGerechten;
    }
}

