
class RijstGerecht extends Gerecht {
    public RijstGerecht(String name, String type, double prijs) {
        super(name, type, prijs);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrijs() {
        return prijs * 1.21;
    }
}


