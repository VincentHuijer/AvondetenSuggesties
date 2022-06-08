package AbstractFactoryPattern;

public class Producten {
    private final String name;
    private final double prijs;
    private final String specialeActie;

    public Producten(String name, double prijs, String specialeActie) {
        this.name = name;
        this.prijs = prijs;
        this.specialeActie = specialeActie;
    }

    public String getName() {
        return name;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getSpecialeActie() {
        return specialeActie;
    }
}
