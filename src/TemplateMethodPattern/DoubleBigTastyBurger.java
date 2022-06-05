package TemplateMethodPattern;

public class DoubleBigTastyBurger extends Burger {
    String[] vlees = {"Rundvlees", "bacon"};
    String[] kaas = {"Emmentaler"};
    String[] groente = {"sla", "Witte ui", "tomaat"};
    String[] saus = {"Big Tasty Saus"};

    @Override
    public void addVlees() {
        System.out.println("Bevat het volgende vlees: ");
        for (String vlees : vlees) {
            System.out.println(vlees + " ");
        }
    }

    @Override
    public void addKaas() {
        System.out.println("Bevat de volgende kaas: ");
        for (String kaas : kaas) {
            System.out.println(kaas + " ");
        }
    }

    @Override
    public void addGroente() {
        System.out.println("Bevat de volgende groente: ");
        for (String groentes : groente) {
            System.out.print(groentes + " ");
            System.out.println();
        }
    }

    @Override
    public void addSaus() {
        System.out.println("Bevat de volgende saus: ");
        for (String saus : saus) {
            System.out.println(saus + " ");
        }
    }

    @Override
    public String getName() {
        return "Double Big Tasty Burger";
    }
}