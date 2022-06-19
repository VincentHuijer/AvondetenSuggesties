class VegetarischGerecht extends GerechtVerwerker {
    public VegetarischGerecht(String name, String Type, double prijs) {
        super(name, Type, prijs);
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
    public double getPrijs() { /**Vegetarische gerechten zijn gezond en hebben daarom minder BTW belasting! (9% ipv van 21%) **/
        return prijs * 1.09;
    }
}