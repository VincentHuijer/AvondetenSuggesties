public class PizzaKeuzemenuInputsVerwerken {
    public String grootte = "";
    public String vleesOpPizza;
    public String kaaskorst;
    public String studentenpas;

    public PizzaKeuzemenuInputsVerwerken(String grootte, String vleesOpPizza, String kaaskorst, String studentenpas) {
        this.grootte = grootte;
        this.vleesOpPizza = vleesOpPizza;
        this.kaaskorst = kaaskorst;
        this.studentenpas = studentenpas;
    }

    public String pizzaSize() {
        if (grootte.equals("1")) { //optie 1. is small
            grootte = "small";
        } else if (grootte.equals("2")) { //optie 2. is medium
            grootte = "medium";
        } else if (grootte.equals("3")) { //optie 3 = large
            grootte = "large";
        }
        return grootte;
    }

    //krijgt een input mee voor vlees op pizza
    public boolean pizzaMeat() {
        if (vleesOpPizza.equals("1")) {
            return true;
        }
        return false;
    }

    //krijgt een input mee voor standaard deeg of deeg met kaaskorst
    public boolean pizzaCheeseCrust() {
        if (kaaskorst.equals("2")) {
            return true;
        }
        return false;
    }

    //krijgt een input mee of de gebruiker een studentenpas heeft.
    public boolean studentpas() {
        if (studentenpas.equals("1")) {
            return true;
        }
        return false;
    }

    public void berekenPizzaPrijs(){
        Pizza pizza = new Pizza();
        System.out.printf("Bedankt voor het invullen van de lijst! Uw pizza kost: %.2f €%n", pizza.getPizzaPrijs(pizzaSize(), pizzaMeat(), pizzaCheeseCrust(), studentpas()));

    }
}
