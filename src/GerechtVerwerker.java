class GerechtVerwerker {
    public double prijs;
    public String name;
    public String type;

    public GerechtVerwerker(String name, String type, Double prijs) {    //naam van het gerecht, type gerecht(pasta/rijst/etc), prijs van gerecht
        this.name = name;
        this.prijs = prijs;
        this.type = type;
    }

    public String toString() {//Geeft een tekst terug met de naam, type en prijs inclusief BTW aan startKeuzemenu. Verschillende types gerechten hebben verschillende hoeveelheiden BTW.
        return String.format("U koos voor %s van het type %s. \ndit gerecht zou rond de %.2f€ kosten om te bereiden.", getName(), getType(), getPrijs());
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