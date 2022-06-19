public class VoedingswaardenCalculator {
    private final Gerecht gerecht;

    public VoedingswaardenCalculator(Gerecht gerecht) {
        this.gerecht = gerecht;
    }

    public double eiwitten() {    //telt eiwitten van alle ingredienten van een gerecht
        double eiwittenTeller = 0;

        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            eiwittenTeller += gerecht.getIngredienten().get(i).getEiwitten();
        }
        return eiwittenTeller;
    }

    public double koolhydraten() {//telt koolhydraten van alle ingredienten van een gerecht
        double koolhydratenTeller = 0;

        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            koolhydratenTeller += gerecht.getIngredienten().get(i).getKoolhydraten();
        }
        return koolhydratenTeller;
    }

    public double vetten() { //telt vetten van alle ingredienten van een gerecht
        double vettenTeller = 0;

        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            vettenTeller += gerecht.getIngredienten().get(i).getVet();
        }
        return vettenTeller;
    }

    public boolean bevatGroente() { //controleert door de ingredienten van een gerecht of het groente bevat
        for (int i = 0; i < gerecht.getIngredienten().size(); i++) {
            if (gerecht.getIngredienten().get(i).isGroente()) {
                return true;
            }
        }
        return false;
    }
}