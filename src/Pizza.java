public class Pizza {
   public double pizzaPrijs = 0.0;
    public double getPizzaPrijs(String grootte, boolean vlees, boolean Kaaskorst, boolean studentenpas) {
        //prijs van pizza gebaseerd op grootte
        switch (grootte) {
            case "small":
                pizzaPrijs = 5.00;
                break;
            case "medium":
                pizzaPrijs = 6.00;
                break;
            case "large":
                pizzaPrijs = 7.00;
                break;
        }
        if (vlees) pizzaPrijs = (pizzaPrijs + 1.00);     //vlees erbij kost 1 euro
        if (Kaaskorst) pizzaPrijs = (pizzaPrijs + 1.00); //kaaskorst erbij kost 1 euro
        if (studentenpas) pizzaPrijs = (pizzaPrijs * 0.9); //studentenpas heeft 10% korting
        return pizzaPrijs;
    }
}