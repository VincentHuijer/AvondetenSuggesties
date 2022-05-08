public class Pizza {

    double pizzaPrijs = 0.0;


    public double getPizzaPrijs(String grootte, boolean vlees, boolean Kaaskorst, boolean studentenpas) {


        if (grootte.equals("small")) {
            pizzaPrijs = 5.00;
        } else if (grootte.equals("medium")) {
            pizzaPrijs = 6.00;
        } else if (grootte.equals("large")) {
            pizzaPrijs = 7.00;
        }

        if (vlees == true) {
            pizzaPrijs = (pizzaPrijs + 1.00);
        }

        if (Kaaskorst == true) {
            if (grootte.equals("small")) { //Kaaskorsten zijn alleen toegestaan voor medium en large pizza's!
                return pizzaPrijs = -1.00;
            } else {
                pizzaPrijs = (pizzaPrijs + 1.00);
            }
        }
        //Studentenpassen werken niet voor medium of large pizza's. Er word geen korting gebruikt in dit geval.
        if (studentenpas == true) {
            if (grootte.equals("small")) {
                pizzaPrijs = (pizzaPrijs * 0.9);
            }
        }
        return pizzaPrijs;
    }
}


