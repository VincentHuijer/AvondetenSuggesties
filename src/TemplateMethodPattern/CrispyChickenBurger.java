package TemplateMethodPattern;

public class CrispyChickenBurger extends Burger {
    String[] vlees = {"kip"};
    String[] kaas = {"Cheddar"};
    String[] groente = {"betavia sla", "ui", "witte kool"};
    String[] saus = {"Honing mosterd saus"};

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
        return "Crispy Chicken Burger";
    }
}