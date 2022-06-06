public class GerechtInformatie {
    Gerecht gerecht = new Gerecht();
    public void gerechtGezondheid(String gerechtNaam) {
        double vetten = new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam)).vetten();
        double koolhydraten = new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam)).koolhydraten();
        boolean groente = new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam)).bevatGroente();

        if (gerechtGezondOfOngezondControle(vetten, koolhydraten, groente)) {
            System.out.println("Dit gerecht is ongezond! Het gerecht bevat geen groente en bevat veel vetten of koolhydraten.");
        } else {
            System.out.println("Dit gerecht is gezond! Het gerecht bevat groente en bevat weinig vetten of koolhydraten.");
        }
    }

    public boolean gerechtGezondOfOngezondControle(double vetten, double koolhydraten, boolean groente) {
        if ((vetten > 30 || koolhydraten > 50) && !groente) {
            //Als een gerecht meer dan 30 gram vet bevat OF meer dan 50 gram koolhydraten EN het bevat geen groente is het ongezond!
            return true;
        } else {
            //Als een gerecht minder dan 30 gram vet bevat OF minder dan 50 gram koolhydraten EN het bevat groente is het gezond!
            return false;
        }
    }

    public void gerechtSportMaaltijd(String gerechtNaam) {
        double eiwitten = new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam)).eiwitten();
        System.out.println(sportMaaltijdOutput(eiwitten));
    }

    public String sportMaaltijdOutput(double eiwitten) {
        if (eiwitten < 10) {
            return "slechte maaltijd voor sporten. Dit gerecht bevat nauwelijks proteïne.";
        }
        if (eiwitten >= 10 && eiwitten < 20) {
            return "Standaard maaltijd voor eiwitten. Neem misschien nog iets om de proteïne op te bouwen.";
        } else { //eiwitten >= 20
            return "Sport maaltijd, rijk aan proteïne. Zeer goed voor de spieropbouw!";
        }
    }

    public void voedingswaardesPrinter(String gerechtNaam) {
        System.out.printf("Eiwitten: %.2f%n" +
                        "Vetten: %.2f%n" +
                        "Koolhydraten: %.2f%n",
                new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam)).eiwitten(),
                new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam)).vetten(),
                new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam)).koolhydraten());
    }
}
