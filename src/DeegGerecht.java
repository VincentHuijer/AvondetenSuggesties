import static java.lang.Math.random;

class DeegGerecht extends Gerecht {
    public DeegGerecht(String name, String type, double prijs) {
        super(name, type, prijs);
    }

    @Override
    public double getPrijs() {
        return prijs * 1.21;
    }


}