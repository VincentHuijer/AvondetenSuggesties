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

public class Ingredient {

    private String naam;
    private double gewicht;
    private double vet;
    private double koolhydraten;
    private double eiwitten;
    private boolean groente;
    //Pasta
    public ArrayList<Ingredient> lasagne = new ArrayList<>();
    public ArrayList<Ingredient> penneAllaVodka = new ArrayList<>();
    public ArrayList<Ingredient> spaghetti = new ArrayList<>();
    public ArrayList<Ingredient> tagliatelle = new ArrayList<>();
    public ArrayList<Ingredient> macaroni = new ArrayList<>();
    //Rijst
    public ArrayList<Ingredient> risotto = new ArrayList<>();
    public ArrayList<Ingredient> kipSiam = new ArrayList<>();
    public ArrayList<Ingredient> bulgoli = new ArrayList<>();
    public ArrayList<Ingredient> nasi = new ArrayList<>();
    public ArrayList<Ingredient> kipTandoori = new ArrayList<>();
    //deeg
    public ArrayList<Ingredient> pizza = new ArrayList<>();
    public ArrayList<Ingredient> spinazieTaart = new ArrayList<>();
    public ArrayList<Ingredient> burritos = new ArrayList<>();
    public ArrayList<Ingredient> quiche = new ArrayList<>();
    public ArrayList<Ingredient> capreseEmpanadas = new ArrayList<>();
    //vegetarisch
    public ArrayList<Ingredient> salade = new ArrayList<>();
    public ArrayList<Ingredient> vegaTaco = new ArrayList<>();
    public ArrayList<Ingredient> stamppot = new ArrayList<>();
    public ArrayList<Ingredient> shakshuka = new ArrayList<>();
    public ArrayList<Ingredient> hutspost = new ArrayList<>();



    //naam van het gerecht, type gerecht(pasta/rijst/etc), prijs van gerecht
     Ingredient(String naam, double vet, double koolhydraten, double eiwitten, boolean groente) {
        this.naam = naam;
        this.vet = vet;
        this.koolhydraten = koolhydraten;
        this.eiwitten = eiwitten;
        this.groente = groente;
    }


    Ingredient kip = new Ingredient("kip", 14, 0, 20, false);
    Ingredient pasta = new Ingredient("pasta", 1.1, 3.2, 10, false);
    Ingredient pastaSlierten = new Ingredient("pasta slierten", 1.1, 3.2, 10, false);
    Ingredient pastasaus = new Ingredient("pastasaus", 61, 4.3, 2.2, false);
    Ingredient wortel = new Ingredient("wortel", 0.2, 10, 4, true);
    Ingredient tomaat = new Ingredient("tomaat", 0.2, 3.9, 3, true);
    Ingredient tomatenpuree = new Ingredient("tomatenpuree", 0.2, 3.9, 3, true);
    Ingredient rijst = new Ingredient("rijst", 0.3, 28, 10, false);
    Ingredient rundGehakt = new Ingredient("rundGehakt", 30, 28, 24, false);
    Ingredient paprika = new Ingredient("paprika", 0.3, 6, 1, true);
    Ingredient champignons = new Ingredient("champignons", 0.5, 5, 2.2, false);
    Ingredient ui = new Ingredient("ui", 0.1, 4, 1.1, true);
    Ingredient gember = new Ingredient("gember", 0.8, 18, 1.8, false);
    Ingredient tarweBloem = new Ingredient("tarweBloem", 1, 76, 10, false);
    Ingredient spinazie = new Ingredient("spinazie", 0.6, 0.5, 2, true);
    Ingredient deeg = new Ingredient("deeg", 39, 46, 7, false);
    Ingredient bladerdeeg = new Ingredient("bladerdeeg", 39, 46, 7, false);
    Ingredient nierbonen = new Ingredient("nierbonen", 1, 60, 24, true);
    Ingredient aardappel = new Ingredient("aardappel", 0, 19, 2, false);
    Ingredient boter = new Ingredient("boter", 20, 0.1, 0.3, false);
    Ingredient mozzarella = new Ingredient("mozzarella", 17, 3.1, 28, false);
    Ingredient bleekselderij = new Ingredient("bleekselderij", 17, 3.1, 28, true);
    Ingredient spek = new Ingredient("spek", 6, 1.5, 21, false);
    Ingredient kaas = new Ingredient("kaas", 17, 3.1, 28, false);
    Ingredient vodka = new Ingredient("vodka", 0, 0, 0, false);
    Ingredient knoflook = new Ingredient("knoflook", 0.1, 28, 6, false);
    Ingredient zout = new Ingredient("zout", 0, 0, 0, false);
    Ingredient peper = new Ingredient("peper", 0, 0, 0, false);
    Ingredient ham = new Ingredient("ham", 6, 1.5, 21, false);
    Ingredient bouillon = new Ingredient("bouillon", 14, 18, 17, false);
    Ingredient courgette = new Ingredient("courgette", 0.3, 3.1, 1.2, true);
    Ingredient pompoen = new Ingredient("pompoen", 0.1, 7, 1, false);
    Ingredient sambal = new Ingredient("sambal", 0.1, 1, 0.9, false);
    Ingredient olijfolie = new Ingredient("olijfolie", 5, 0, 0, false);
    Ingredient ketjap = new Ingredient("ketjap", 4, 0, 0, false);
    Ingredient ei = new Ingredient("ei", 5, 0.5, 13, false);
    Ingredient sla = new Ingredient("sla", 0.2, 2.9, 1.4, true);
    Ingredient prei = new Ingredient("prei", 0.3, 14, 1.5, true);


    public void gerechtenSamenstellen() {
        lasagne.add(pasta);
        lasagne.add(wortel);
        lasagne.add(tomaat);
        lasagne.add(rundGehakt);
        lasagne.add(bleekselderij);
        lasagne.add(mozzarella);
        lasagne.add(kaas);
        lasagne.add(ui);

        penneAllaVodka.add(vodka);
        penneAllaVodka.add(ui);
        penneAllaVodka.add(knoflook);
        penneAllaVodka.add(ham);
        penneAllaVodka.add(tomaat);
        penneAllaVodka.add(pasta);

        spaghetti.add(pastaSlierten);
        spaghetti.add(ui);
        spaghetti.add(rundGehakt);
        spaghetti.add(tomatenpuree);
        spaghetti.add(bouillon);
        spaghetti.add(kaas);
        spaghetti.add(peper);
        spaghetti.add(zout);

        tagliatelle.add(spek);
        tagliatelle.add(ui);
        tagliatelle.add(rundGehakt);
        tagliatelle.add(pastasaus);
        tagliatelle.add(pastaSlierten);

        macaroni.add(pasta);
        macaroni.add(courgette);
        macaroni.add(champignons);
        macaroni.add(rundGehakt);
        macaroni.add(ui);
        macaroni.add(tomaat);
        macaroni.add(tomatenpuree);
        macaroni.add(kaas);
        macaroni.add(peper);

        //rijst
        risotto.add(rijst);
        risotto.add(ui);
        risotto.add(bouillon);
        risotto.add(kaas);
        risotto.add(boter);
        risotto.add(pompoen);

        kipSiam.add(kip);
        kipSiam.add(paprika);
        kipSiam.add(ui);
        kipSiam.add(knoflook);
        kipSiam.add(gember);
        kipSiam.add(ketjap);
        kipSiam.add(peper);
        kipSiam.add(zout);

        bulgoli.add(rundGehakt);
        bulgoli.add(ui);
        bulgoli.add(knoflook);
        bulgoli.add(gember);

        nasi.add(knoflook);
        nasi.add(ui);
        nasi.add(ham);
        nasi.add(olijfolie);
        nasi.add(sambal);
        nasi.add(ketjap);
        nasi.add(zout);
        nasi.add(peper);

        kipTandoori.add(kip);
        kipTandoori.add(ui);
        kipTandoori.add(rijst);
        kipTandoori.add(olijfolie);
        kipTandoori.add(gember);
        kipTandoori.add(tomatenpuree);
        kipTandoori.add(peper);
        kipTandoori.add(zout);

        //deeg
        pizza.add(deeg);
        pizza.add(tarweBloem);
        pizza.add(olijfolie);
        pizza.add(ui);
        pizza.add(tomaat);
        pizza.add(kaas);
        pizza.add(champignons);
        pizza.add(mozzarella);
        pizza.add(peper);
        pizza.add(zout);


        spinazieTaart.add(spinazie);
        spinazieTaart.add(bladerdeeg);
        spinazieTaart.add(olijfolie);
        spinazieTaart.add(knoflook);
        spinazieTaart.add(ui);
        spinazieTaart.add(ei);
        spinazieTaart.add(kaas);
        spinazieTaart.add(zout);
        spinazieTaart.add(peper);

        burritos.add(deeg);
        burritos.add(paprika);
        burritos.add(courgette);
        burritos.add(rijst);
        burritos.add(kaas);
        burritos.add(zout);
        burritos.add(peper);

        quiche.add(champignons);
        quiche.add(paprika);
        quiche.add(ei);
        quiche.add(peper);
        quiche.add(bladerdeeg);
        quiche.add(kaas);
        quiche.add(boter);

        capreseEmpanadas.add(deeg);
        capreseEmpanadas.add(tarweBloem);
        capreseEmpanadas.add(boter);
        capreseEmpanadas.add(ei);
        capreseEmpanadas.add(tomaat);
        capreseEmpanadas.add(mozzarella);
        capreseEmpanadas.add(peper);
        capreseEmpanadas.add(zout);

        //vegetarisch
        salade.add(sla);
        salade.add(tomaat);
        salade.add(ui);
        salade.add(boter);
        salade.add(gember);
        salade.add(olijfolie);
        salade.add(courgette);

        vegaTaco.add(ui);
        vegaTaco.add(paprika);
        vegaTaco.add(olijfolie);
        vegaTaco.add(nierbonen);
        vegaTaco.add(tomaat);
        vegaTaco.add(peper);
        vegaTaco.add(zout);

        stamppot.add(prei);
        stamppot.add(aardappel);
        stamppot.add(tomaat);
        stamppot.add(paprika);
        stamppot.add(boter);
        stamppot.add(olijfolie);
        stamppot.add(peper);
        stamppot.add(zout);

        shakshuka.add(tomaat);
        shakshuka.add(ei);
        shakshuka.add(ui);
        shakshuka.add(knoflook);
        shakshuka.add(paprika);
        shakshuka.add(olijfolie);
        shakshuka.add(peper);
        shakshuka.add(zout);

        hutspost.add(wortel);
        hutspost.add(ui);
        hutspost.add(tomaat);
        hutspost.add(boter);
        hutspost.add(tomaat);
        hutspost.add(peper);
        hutspost.add(zout);


    }


    public void GerechtenVoedingswaarde(ArrayList<Ingredient> ingredienten) {
        double vetten = 0;
        double koolhydraten = 0;
        double eiwitten = 0;
        for (Ingredient ingredient : ingredienten) {
            vetten += ingredient.vet;
            koolhydraten += ingredient.koolhydraten;
            eiwitten += ingredient.eiwitten;
            System.out.println(ingredient.naam);
        }
    }

    public void gerechtenLijst(ArrayList<Ingredient> GerechtenLijst){
        ArrayList<ArrayList> gerechtenlijst = new ArrayList<ArrayList>();
        //pasta
        gerechtenlijst.add(lasagne);
        gerechtenlijst.add(penneAllaVodka);
        gerechtenlijst.add(spaghetti);
        gerechtenlijst.add(tagliatelle);
        gerechtenlijst.add(macaroni);
        //rijst
        gerechtenlijst.add(risotto);
        gerechtenlijst.add(kipSiam);
        gerechtenlijst.add(bulgoli);
        gerechtenlijst.add(nasi);
        gerechtenlijst.add(kipTandoori);
        //deeg
        gerechtenlijst.add(pizza);
        gerechtenlijst.add(spinazieTaart);
        gerechtenlijst.add(burritos);
        gerechtenlijst.add(quiche);
        gerechtenlijst.add(capreseEmpanadas);
        //vegetarisch
        gerechtenlijst.add(salade);
        gerechtenlijst.add(vegaTaco);
        gerechtenlijst.add(stamppot);
        gerechtenlijst.add(shakshuka);
        gerechtenlijst.add(hutspost);
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




