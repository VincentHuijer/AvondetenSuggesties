import java.util.ArrayList;

class Ingredienten {
    public Ingredienten(String naam, double gewicht, double vet, double koolhydraten, double eiwitten, boolean groente) {
        ArrayList<Ingredient> ingredienten = new ArrayList();

        ingredienten.add(new Ingredient("kip",100, 14, 0, 20, false));
        ingredienten.add(new Ingredient("pasta",100, 1.1, 3.2, 10, false));
        ingredienten.add(new Ingredient("pastasaus",100, 61, 4.3, 2.2, false));
        ingredienten.add(new Ingredient("wortel",100, 0.2, 10, 4, false));
        ingredienten.add(new Ingredient("tomaat",100, 0.2, 3.9, 3, true));
        ingredienten.add(new Ingredient("rijst",100, 0.3, 28, 10, false));
        ingredienten.add(new Ingredient("rundGehakt",100, 30, 28, 24, false));
        ingredienten.add(new Ingredient("paprika", 100, 0.3, 6, 1, true));
        ingredienten.add(new Ingredient("champignons", 100, 0.5, 5, 2.2, false));
        ingredienten.add(new Ingredient("ui",100, 0.1, 9, 1.1, true));
        ingredienten.add(new Ingredient("gember",100, 0.8, 18, 1.8, false));
        ingredienten.add(new Ingredient("tarweBloem",100, 1, 76, 10, false));
        ingredienten.add(new Ingredient("spinazie",100, 0.6, 0.5, 2, true));
        ingredienten.add(new Ingredient("bladerdeeg",100, 39, 46, 7, false));
        ingredienten.add(new Ingredient("nierbonen",100, 1, 60, 24, true));
        ingredienten.add(new Ingredient("aardappel",100, 0, 19, 2, false));
        ingredienten.add(new Ingredient("boter", 100, 81, 0.1, 1, false));
    }
}

class Ingredient {

    private String naam;
    private double gewicht;
    private double vet;
    private double koolhydraten;
    private double eiwitten;
    private boolean groente;

    //naam van het gerecht, type gerecht(pasta/rijst/etc), prijs van gerecht
    public Ingredient(String naam, double gewicht, double vet, double koolhydraten, double eiwitten, boolean groente) {
        this.naam = naam;
        this.gewicht = gewicht;
        this.vet = vet;
        this.koolhydraten = koolhydraten;
        this.eiwitten = eiwitten;
        this.groente = groente;
    }


}


