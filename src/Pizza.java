public class Pizza {

   public double pizzaPrijs = 0.0;


    public double getPizzaPrijs(String grootte, boolean vlees, boolean Kaaskorst, boolean studentenpas) {

        //prijs van pizza gebaseerd op grootte
        if (grootte.equals("small")) {
            pizzaPrijs = 5.00;
        } else if (grootte.equals("medium")) {
            pizzaPrijs = 6.00;
        } else if (grootte.equals("large")) {
            pizzaPrijs = 7.00;
        }
        //vlees erbij kost 1 euro
        if (vlees) {
            pizzaPrijs = (pizzaPrijs + 1.00);
        }
        //kaaskorst erbij kost 1 euro
        if (Kaaskorst) {

            pizzaPrijs = (pizzaPrijs + 1.00);
        }
        //studentenpas heeft 10% korting
        if (studentenpas) {
            pizzaPrijs = (pizzaPrijs * 0.9);
        }

        return pizzaPrijs;
    }
}


