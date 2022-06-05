package AbstractFactoryPattern;

public class Menu {
    private String name;
    private double prijs;
    private String specialeActie;

    public Menu(String name, double prijs, String specialeActie) {
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
