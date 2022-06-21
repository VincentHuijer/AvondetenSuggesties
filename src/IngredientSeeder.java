import java.util.ArrayList;

public class IngredientSeeder {

    public static ArrayList<Ingredient> getIngredientenSeeder() {
        if (Ingredient.alleIngredienten.size() == 0) {
            Ingredient.alleIngredienten.add(new Ingredient("kip", 14, 0, 20, false));
            Ingredient.alleIngredienten.add(new Ingredient("pasta", 1.1, 3.2, 10, false));
            Ingredient.alleIngredienten.add(new Ingredient("pastaSlierten", 1.1, 3.2, 10, false));
            Ingredient.alleIngredienten.add(new Ingredient("pastasaus", 61, 4.3, 2.2, false));
            Ingredient.alleIngredienten.add(new Ingredient("wortel", 0.2, 10, 4, true));
            Ingredient.alleIngredienten.add(new Ingredient("tomaat", 0.2, 3.9, 3, true));
            Ingredient.alleIngredienten.add(new Ingredient("tomatenpuree", 0.2, 3.9, 3, true));
            Ingredient.alleIngredienten.add(new Ingredient("rijst", 0.3, 28, 10, false));
            Ingredient.alleIngredienten.add(new Ingredient("rundGehakt", 30, 28, 24, false));
            Ingredient.alleIngredienten.add(new Ingredient("paprika", 0.3, 6, 1, true));
            Ingredient.alleIngredienten.add(new Ingredient("champignons", 0.5, 5, 2.2, false));
            Ingredient.alleIngredienten.add(new Ingredient("ui", 0.1, 4, 1.1, true));
            Ingredient.alleIngredienten.add(new Ingredient("gember", 0.8, 18, 1.8, false));
            Ingredient.alleIngredienten.add(new Ingredient("tarweBloem", 1, 76, 10, false));
            Ingredient.alleIngredienten.add(new Ingredient("spinazie", 0.6, 0.5, 2, true));
            Ingredient.alleIngredienten.add(new Ingredient("deeg", 39, 46, 7, false));
            Ingredient.alleIngredienten.add(new Ingredient("bladerdeeg", 39, 46, 7, false));
            Ingredient.alleIngredienten.add(new Ingredient("nierbonen", 1, 60, 24, true));
            Ingredient.alleIngredienten.add(new Ingredient("aardappel", 0, 19, 2, false));
            Ingredient.alleIngredienten.add(new Ingredient("boter", 20, 0.1, 0.3, false));
            Ingredient.alleIngredienten.add(new Ingredient("mozzarella", 17, 3.1, 28, false));
            Ingredient.alleIngredienten.add(new Ingredient("bleekselderij", 17, 3.1, 28, true));
            Ingredient.alleIngredienten.add(new Ingredient("spek", 6, 1.5, 21, false));
            Ingredient.alleIngredienten.add(new Ingredient("kaas", 17, 3.1, 28, false));
            Ingredient.alleIngredienten.add(new Ingredient("vodka", 0, 0, 0, false));
            Ingredient.alleIngredienten.add(new Ingredient("knoflook", 0.1, 28, 6, false));
            Ingredient.alleIngredienten.add(new Ingredient("zout", 0, 0, 0, false));
            Ingredient.alleIngredienten.add(new Ingredient("peper", 0, 0, 0, false));
            Ingredient.alleIngredienten.add(new Ingredient("ham", 6, 1.5, 21, false));
            Ingredient.alleIngredienten.add(new Ingredient("bouillon", 14, 18, 17, false));
            Ingredient.alleIngredienten.add(new Ingredient("courgette", 0.3, 3.1, 1.2, true));
            Ingredient.alleIngredienten.add(new Ingredient("pompoen", 0.1, 7, 1, false));
            Ingredient.alleIngredienten.add(new Ingredient("sambal", 0.1, 1, 0.9, false));
            Ingredient.alleIngredienten.add(new Ingredient("olijfolie", 5, 0, 0, false));
            Ingredient.alleIngredienten.add(new Ingredient("ketjap", 4, 0, 0, false));
            Ingredient.alleIngredienten.add(new Ingredient("ei", 5, 0.5, 13, false));
            Ingredient.alleIngredienten.add(new Ingredient("sla", 0.2, 2.9, 1.4, true));
            Ingredient.alleIngredienten.add(new Ingredient("prei", 0.3, 14, 1.5, true));
        }
        return Ingredient.alleIngredienten;
    }
}
