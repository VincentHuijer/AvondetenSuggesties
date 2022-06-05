public class VoedingswaardenCalculator {
    private Gerecht gerecht;

    public VoedingswaardenCalculator(Gerecht gerecht) {
        this.gerecht = gerecht;
    }

    //telt eiwitten van alle ingredienten van een gerecht
    public double eiwitten() {
        double eiwittenTeller = 0;

        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            eiwittenTeller += gerecht.getIngredienten().get(i).getEiwitten();
        }
        return eiwittenTeller;
    }

    //telt koolhydraten van alle ingredienten van een gerecht
    public double koolhydraten() {
        double koolhydratenTeller = 0;

        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            koolhydratenTeller += gerecht.getIngredienten().get(i).getKoolhydraten();
        }
        return koolhydratenTeller;
    }

    //telt vetten van alle ingredienten van een gerecht
    public double vetten() {
        double vettenTeller = 0;

        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            vettenTeller += gerecht.getIngredienten().get(i).getVet();
        }
        return vettenTeller;
    }

    //controleert door de ingredienten van een gerecht of het groente bevat
    public boolean bevatGroente() {
        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            if (gerecht.getIngredienten().get(i).isGroente()) {
                return true;
            }
        }
        return false;
    }
}