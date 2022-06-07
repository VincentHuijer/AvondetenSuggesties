class PastaGerecht extends GerechtVerwerker {

    public PastaGerecht(String name, String type, Double prijs) {
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


