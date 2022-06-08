public class GerechtInformatie {
    Gerecht gerecht = new Gerecht();

    public void gerechtGezondheid(String gerechtNaam) {
        VoedingswaardenCalculator voedingswaardenCalculator = new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam));
        double vetten = voedingswaardenCalculator.vetten();
        double koolhydraten = voedingswaardenCalculator.koolhydraten();
        boolean groente = voedingswaardenCalculator.bevatGroente();

        if (gerechtGezondOfOngezondControle(vetten, koolhydraten, groente))
            System.out.println("Dit gerecht is ongezond! Het gerecht bevat geen groente en bevat veel vetten of koolhydraten.");
        else
            System.out.println("Dit gerecht is gezond! Het gerecht bevat groente en bevat weinig vetten of koolhydraten.");
    }

    public boolean gerechtGezondOfOngezondControle(double vetten, double koolhydraten, boolean groente) {
        return (vetten > 30 || koolhydraten > 50) && !groente;//Als een gerecht meer dan 30 gram vet bevat OF meer dan 50 gram koolhydraten EN het bevat geen groente is het ongezond!
    }

    public void gerechtSportMaaltijd(String gerechtNaam) {
        VoedingswaardenCalculator voedingswaardenCalculator = new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam));
        System.out.println(sportMaaltijdOutput(voedingswaardenCalculator.eiwitten()));
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
        VoedingswaardenCalculator voedingswaardenCalculator = new VoedingswaardenCalculator(gerecht.zoekGerecht(gerechtNaam));
        System.out.printf("Eiwitten: %.2f%nVetten: %.2f%nKoolhydraten: %.2f%n", voedingswaardenCalculator.eiwitten(), voedingswaardenCalculator.vetten(), voedingswaardenCalculator.koolhydraten());
    }
}
