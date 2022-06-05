package TemplateMethodPattern;

public class BigMacBurger extends Burger {
    String[] vlees = {"Rundvlees"};
    String[] kaas = {"Cheddar"};
    String[] groente = {"sla", "augurk", "ui"};
    String[] saus = {"Big Mac Saus"};

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
        return "Big Mac Burger";
    }
}