class GerechtUitprinter {
    public double prijs;
    public String name;
    public String type;

    //naam van het gerecht, type gerecht(pasta/rijst/etc), prijs van gerecht
    public GerechtUitprinter(String name, String type, Double prijs) {
        this.name = name;
        this.prijs = prijs;
        this.type = type;
    }

    //Geeft een tekst terug met de naam, type en prijs inclusief BTW aan startKeuzemenu. Verschillende types gerechten hebben verschillende hoeveelheiden BTW.
    public String toString() {
        return String.format("" +
                "U koos voor %s van het type %s. \n" +
                "dit gerecht zou rond de %.2f€ kosten om te bereiden.", getName(), getType(), getPrijs());
    }

    public double getPrijs() {
        return prijs;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}