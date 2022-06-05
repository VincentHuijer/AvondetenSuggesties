public class PizzaKeuzeInputsVerwerken {
    String grootte = "";
    boolean vleesOpPizza;
    boolean kaaskorst;
    boolean studentenpas;
    //krijgt een input mee voor de pizzagrootte
    public String pizzaSize(String pizzagrootte) {
        if (pizzagrootte.equals("1")) { //optie 1. is small
            grootte = "small";
        } else if (pizzagrootte.equals("2")) { //optie 2. is medium
            grootte = "medium";
        } else if (pizzagrootte.equals("3")) { //optie 3 = large
            grootte = "large";
        }
        return grootte;
    }

    //krijgt een input mee voor vlees op pizza
    public boolean pizzaMeat(String pizzaVlees) {
        if (pizzaVlees.equals("1")) {
            vleesOpPizza = true;
        }
        return vleesOpPizza;
    }

    //krijgt een input mee voor standaard deeg of deeg met kaaskorst
    public boolean pizzaCheeseCrust(String pizzadeeg) {
        if (pizzadeeg.equals("2")) {
            kaaskorst = true;
        }
        return kaaskorst;
    }

    //krijgt een input mee of de gebruiker een studentenpas heeft.
    public boolean studentpas(String student) {
        if (student.equals("1")) {
            studentenpas = true;
        }
        return studentenpas;
    }
}
