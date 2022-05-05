
class VegetarischGerecht extends Gerecht {
    public VegetarischGerecht(String name, String Type, double prijs) {
        super(name, Type, prijs);


    }
    /**Vegetarische gerechten zijn gezond en hebben daarom minder BTW belasting! **/
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
        return prijs * 1.09;
    }
}









