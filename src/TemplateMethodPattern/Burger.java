package TemplateMethodPattern;

public abstract class Burger {

    public void burgerSamenStellen() {
        addVlees();
        addKaas();
        addGroente();
        addSaus();
    }

    abstract void addVlees();

    abstract void addKaas();

    abstract void addGroente();

    abstract void addSaus();


    public abstract String getName();
    }



