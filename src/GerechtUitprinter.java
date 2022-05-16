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

    public GerechtUitprinter() {
    }


    /**
     * Geeft een tekst terug met de naam, type en prijs inclusief BTW aan Applicatie
     **/
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

    public String sportMaaltijdPrinter(double eiwitten) {
        if (eiwitten < 10) {
            return "slechte maaltijd voor sporten!\nDit gerecht bevat nauwelijks proteïne.";
        }
        if (eiwitten >= 10 && eiwitten < 20) {
            return "Standaard maaltijd voor eiwitten.\nNeem misschien nog een ander hapje om de proteïne op te bouwen.";
        }
        else{ //eiwitten >= 20
            return "Sport maaltijd.\nRijk aan proteïne. Zeer goed voor de spieropbouw!";
        }

    }



    public void voedingswaardesPrinter(double vetten, double koolhydraten, double eiwitten) {
        System.out.printf("Dit gerecht bevat %.2f vetten, %.2f koolhydraten, %.2f eiwitten\n", vetten, koolhydraten, eiwitten);
    }
}








