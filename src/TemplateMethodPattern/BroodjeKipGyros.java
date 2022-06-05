package TemplateMethodPattern;

public class BroodjeKipGyros extends KipBroodjes {
    String[] vlees = {"kip Gyros"};
    String[] groente = {"sla", "augurk", "ui"};
    String[] saus = {"Knoflooksaus"};

    @Override
    public void addVlees() {
        System.out.println("Bevat het volgende vlees: ");
        for (String vlees : vlees) {
            System.out.println(vlees + " ");
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
        return "Broodje KipGyros";
    }
}