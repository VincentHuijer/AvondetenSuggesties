import java.util.ArrayList;
import java.util.Collections;

public class Gerecht {
    private String naam;
    private ArrayList<Ingredient> ingredienten;
    public static ArrayList<Gerecht> alleGerechten = new ArrayList<Gerecht>();

    public Gerecht(String naam, ArrayList<Ingredient> ingredienten) {
        this.naam = naam;
        this.ingredienten = ingredienten;
        alleGerechten.add(this);
    }


    public String getNaam() {
        return this.naam;
    }

    public ArrayList<Ingredient> getIngredienten() {

        return ingredienten;
    }


    public ArrayList<Gerecht> getAlleGerechten() {
        if (alleGerechten.size() == 0) {
            //Collections is voor het beheren van lijsten
            Collections.addAll(
                    new Gerecht("pasta", new ArrayList<Ingredient>()).getIngredienten(),
                    Ingredient.zoekIngredient("wortel")
            );
        }
        return alleGerechten;
    }


               /**
            gerechtenlijst.add(zoekIngredient());
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


        }return alleGerechten;
    }
**/

    public void GerechtenVoedingswaarde() {
            double vetten = 0;
            double koolhydraten = 0;
            double eiwitten = 0;
            for (Ingredient ingredient : ingredienten) {
                vetten += ingredient.getVet();
                koolhydraten += ingredient.getKoolhydraten();
                eiwitten += ingredient.getEiwitten();
                System.out.println(ingredient.getNaam());
            }
        }
    }
    //        public void gerechtenSamenstellen (ArrayList) {
//                lasagne.add(pasta);
//        lasagne.add(wortel);
//        lasagne.add(tomaat);
//        lasagne.add(rundGehakt);
//        lasagne.add(bleekselderij);
//        lasagne.add(mozzarella);
//        lasagne.add(kaas);
//        lasagne.add(ui);
//
//        penneAllaVodka.add(vodka);
//        penneAllaVodka.add(ui);
//        penneAllaVodka.add(knoflook);
//        penneAllaVodka.add(ham);
//        penneAllaVodka.add(tomaat);
//        penneAllaVodka.add(pasta);
//
//        spaghetti.add(pastaSlierten);
//        spaghetti.add(ui);
//        spaghetti.add(rundGehakt);
//        spaghetti.add(tomatenpuree);
//        spaghetti.add(bouillon);
//        spaghetti.add(kaas);
//        spaghetti.add(peper);
//        spaghetti.add(zout);
//
//        tagliatelle.add(spek);
//        tagliatelle.add(ui);
//        tagliatelle.add(rundGehakt);
//        tagliatelle.add(pastasaus);
//        tagliatelle.add(pastaSlierten);
//
//        macaroni.add(pasta);
//        macaroni.add(courgette);
//        macaroni.add(champignons);
//        macaroni.add(rundGehakt);
//        macaroni.add(ui);
//        macaroni.add(tomaat);
//        macaroni.add(tomatenpuree);
//        macaroni.add(kaas);
//        macaroni.add(peper);
//
//        //rijst
//        risotto.add(rijst);
//        risotto.add(ui);
//        risotto.add(bouillon);
//        risotto.add(kaas);
//        risotto.add(boter);
//        risotto.add(pompoen);
//
//        kipSiam.add(kip);
//        kipSiam.add(paprika);
//        kipSiam.add(ui);
//        kipSiam.add(knoflook);
//        kipSiam.add(gember);
//        kipSiam.add(ketjap);
//        kipSiam.add(peper);
//        kipSiam.add(zout);
//
//        bulgoli.add(rundGehakt);
//        bulgoli.add(ui);
//        bulgoli.add(knoflook);
//        bulgoli.add(gember);
//
//        nasi.add(knoflook);
//        nasi.add(ui);
//        nasi.add(ham);
//        nasi.add(olijfolie);
//        nasi.add(sambal);
//        nasi.add(ketjap);
//        nasi.add(zout);
//        nasi.add(peper);
//
//        kipTandoori.add(kip);
//        kipTandoori.add(ui);
//        kipTandoori.add(rijst);
//        kipTandoori.add(olijfolie);
//        kipTandoori.add(gember);
//        kipTandoori.add(tomatenpuree);
//        kipTandoori.add(peper);
//        kipTandoori.add(zout);
//
//        //deeg
//        pizza.add(deeg);
//        pizza.add(tarweBloem);
//        pizza.add(olijfolie);
//        pizza.add(ui);
//        pizza.add(tomaat);
//        pizza.add(kaas);
//        pizza.add(champignons);
//        pizza.add(mozzarella);
//        pizza.add(peper);
//        pizza.add(zout);
//
//
//        spinazieTaart.add(spinazie);
//        spinazieTaart.add(bladerdeeg);
//        spinazieTaart.add(olijfolie);
//        spinazieTaart.add(knoflook);
//        spinazieTaart.add(ui);
//        spinazieTaart.add(ei);
//        spinazieTaart.add(kaas);
//        spinazieTaart.add(zout);
//        spinazieTaart.add(peper);
//
//        burritos.add(deeg);
//        burritos.add(paprika);
//        burritos.add(courgette);
//        burritos.add(rijst);
//        burritos.add(kaas);
//        burritos.add(zout);
//        burritos.add(peper);
//
//        quiche.add(champignons);
//        quiche.add(paprika);
//        quiche.add(ei);
//        quiche.add(peper);
//        quiche.add(bladerdeeg);
//        quiche.add(kaas);
//        quiche.add(boter);
//
//        capreseEmpanadas.add(deeg);
//        capreseEmpanadas.add(tarweBloem);
//        capreseEmpanadas.add(boter);
//        capreseEmpanadas.add(ei);
//        capreseEmpanadas.add(tomaat);
//        capreseEmpanadas.add(mozzarella);
//        capreseEmpanadas.add(peper);
//        capreseEmpanadas.add(zout);
//
//        //vegetarisch
//        salade.add(sla);
//        salade.add(tomaat);
//        salade.add(ui);
//        salade.add(boter);
//        salade.add(gember);
//        salade.add(olijfolie);
//        salade.add(courgette);
//
//        vegaTaco.add(ui);
//        vegaTaco.add(paprika);
//        vegaTaco.add(olijfolie);
//        vegaTaco.add(nierbonen);
//        vegaTaco.add(tomaat);
//        vegaTaco.add(peper);
//        vegaTaco.add(zout);
//
//        stamppot.add(prei);
//        stamppot.add(aardappel);
//        stamppot.add(tomaat);
//        stamppot.add(paprika);
//        stamppot.add(boter);
//        stamppot.add(olijfolie);
//        stamppot.add(peper);
//        stamppot.add(zout);
//
//        shakshuka.add(tomaat);
//        shakshuka.add(ei);
//        shakshuka.add(ui);
//        shakshuka.add(knoflook);
//        shakshuka.add(paprika);
//        shakshuka.add(olijfolie);
//        shakshuka.add(peper);
//        shakshuka.add(zout);
//
//        hutspost.add(wortel);
//        hutspost.add(ui);
//        hutspost.add(tomaat);
//        hutspost.add(boter);
//        hutspost.add(tomaat);
//        hutspost.add(peper);
//        hutspost.add(zout);
//            }
//    }

