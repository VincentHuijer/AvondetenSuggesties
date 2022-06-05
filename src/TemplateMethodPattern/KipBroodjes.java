package TemplateMethodPattern;

public abstract class KipBroodjes {
    public void kipBroodjeSamenstellen() {
        addVlees();
        addGroente();
        addSaus();
    }

    abstract void addVlees();

    abstract void addGroente();

    abstract void addSaus();

    public abstract String getName();
}



