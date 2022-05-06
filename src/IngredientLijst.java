import java.util.ArrayList;


// ArrayList<Ingredient> ingredienten = new ArrayList();


/*    public ArrayList<Ingredienten> getIngredienten(String naam) {
        ArrayList<Ingredienten> arrayIngredientToevoegen = new ArrayList<>();
        for (Ingredient ingredient : Ingredienten) {
            if (Ingredient.naam.equals(naam)) {
                arrayIngredientToevoegen.add(ingredient);
            }
        }

        return arrayIngredientToevoegen;
    }
    }*/

class Ingredient {

    private String naam;
    private double gewicht;
    private double vet;
    private double koolhydraten;
    private double eiwitten;
    private boolean groente;
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> penneAllaVodka = new ArrayList<>();
    public ArrayList<Ingredient> spaghetti = new ArrayList<>();
    public ArrayList<Ingredient> tagliatelle = new ArrayList<>();
    public ArrayList<Ingredient> macaroni = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> lasagne = new ArrayList<>();

    //naam van het gerecht, type gerecht(pasta/rijst/etc), prijs van gerecht
    public Ingredient(String naam, double gewicht, double vet, double koolhydraten, double eiwitten, boolean groente) {
        this.naam = naam;
        this.gewicht = gewicht;
        this.vet = vet;
        this.koolhydraten = koolhydraten;
        this.eiwitten = eiwitten;
        this.groente = groente;
    }
public void ingredienten(){}
    Ingredient kip = new Ingredient("kip", 100, 14, 0, 20, false);
    Ingredient pasta = new Ingredient("pasta", 100, 1.1, 3.2, 10, false);
    Ingredient pastasaus = new Ingredient("pastasaus", 100, 61, 4.3, 2.2, false);
    Ingredient wortel = new Ingredient("wortel", 100, 0.2, 10, 4, false);
    Ingredient tomaat = new Ingredient("tomaat", 100, 0.2, 3.9, 3, true);
    Ingredient rijst = new Ingredient("rijst", 100, 0.3, 28, 10, false);
    Ingredient rundGehakt = new Ingredient("rundGehakt", 100, 30, 28, 24, false);
    Ingredient paprika = new Ingredient("paprika", 100, 0.3, 6, 1, true);
    Ingredient champignons = new Ingredient("champignons", 100, 0.5, 5, 2.2, false);
    Ingredient ui = new Ingredient("ui", 100, 0.1, 9, 1.1, true);
    Ingredient gember = new Ingredient("gember", 100, 0.8, 18, 1.8, false);
    Ingredient tarweBloem = new Ingredient("tarweBloem", 100, 1, 76, 10, false);
    Ingredient spinazie = new Ingredient("spinazie", 100, 0.6, 0.5, 2, true);
    Ingredient bladerdeeg = new Ingredient("bladerdeeg", 100, 39, 46, 7, false);
    Ingredient nierbonen = new Ingredient("nierbonen", 100, 1, 60, 24, true);
    Ingredient aardappel = new Ingredient("aardappel", 100, 0, 19, 2, false);
    Ingredient boter = new Ingredient("boter", 100, 81, 0.1, 1, false);
    Ingredient mozarella = new Ingredient("mozarella", 100, 17, 3.1, 28, false);
    Ingredient bleekselderij = new Ingredient("bleekselderij", 100, 17, 3.1, 28, true);
    Ingredient kaas = new Ingredient("kaas", 100, 17, 3.1, 28, false);
    Ingredient vodka = new Ingredient("vodka", 100, 0, 0, 0, false);
    Ingredient knoflook = new Ingredient("knoflook", 100, 0.1, 28, 6, false);


    public void gerechtenSamenstellen() {
        lasagne.add(pasta);
        lasagne.add(wortel);
        lasagne.add(tomaat);
        lasagne.add(rundGehakt);
        lasagne.add(bleekselderij);
        lasagne.add(mozarella);
        lasagne.add(kaas);

        penneAllaVodka.add(vodka);
        penneAllaVodka.add(ui);
        penneAllaVodka.add(knoflook);
        penneAllaVodka.add(kip);
        penneAllaVodka.add(tomaat);
        penneAllaVodka.add(pasta);




    }


    public void GerechtenVoedingswaarde(ArrayList<Ingredient> ingredienten) {
        double vetten = 0;
        double koolhydraten = 0;
        double eiwitten = 0;
        for (Ingredient ingredient : ingredienten){
            vetten += ingredient.vet;
            koolhydraten += ingredient.koolhydraten;
            eiwitten += ingredient.eiwitten;
            System.out.println(ingredient.naam);
        }
    }
}


/*
            ingredienten.add(new Ingredient("kip", 100, 14, 0, 20, false));
            ingredienten.add(new Ingredient("pasta", 100, 1.1, 3.2, 10, false));
            ingredienten.add(new Ingredient("pastasaus", 100, 61, 4.3, 2.2, false));
            ingredienten.add(new Ingredient("wortel", 100, 0.2, 10, 4, false));
            ingredienten.add(new Ingredient("tomaat", 100, 0.2, 3.9, 3, true));
            ingredienten.add(new Ingredient("rijst", 100, 0.3, 28, 10, false));
            ingredienten.add(new Ingredient("rundGehakt", 100, 30, 28, 24, false));
            ingredienten.add(new Ingredient("paprika", 100, 0.3, 6, 1, true));
            ingredienten.add(new Ingredient("champignons", 100, 0.5, 5, 2.2, false));
            ingredienten.add(new Ingredient("ui", 100, 0.1, 9, 1.1, true));
            ingredienten.add(new Ingredient("gember", 100, 0.8, 18, 1.8, false));
            ingredienten.add(new Ingredient("tarweBloem", 100, 1, 76, 10, false));
            ingredienten.add(new Ingredient("spinazie", 100, 0.6, 0.5, 2, true));
            ingredienten.add(new Ingredient("bladerdeeg", 100, 39, 46, 7, false));
            ingredienten.add(new Ingredient("nierbonen", 100, 1, 60, 24, true));
            ingredienten.add(new Ingredient("aardappel", 100, 0, 19, 2, false));
            ingredienten.add(new Ingredient("boter", 100, 81, 0.1, 1, false));
*/




