package PizzaMenu;

public class PizzaKeuzemenuInputsVerwerken {
    private String grootte;
    private final String vleesOpPizza;
    private final String kaaskorst;
    private final String studentenpas;

    public PizzaKeuzemenuInputsVerwerken(String grootte, String vleesOpPizza, String kaaskorst, String studentenpas) {
        this.grootte = grootte;
        this.vleesOpPizza = vleesOpPizza;
        this.kaaskorst = kaaskorst;
        this.studentenpas = studentenpas;
    }

    public String pizzaSize() {
        switch (grootte) {
            case "1":  //optie 1. is small
                grootte = "small";
                break;
            case "2":  //optie 2. is medium
                grootte = "medium";
                break;
            case "3":  //optie 3 = large
                grootte = "large";
                break;
        }
        return grootte;
    }
    
    public boolean pizzaMeat() {
        return vleesOpPizza.equals("1");
    }//krijgt een input mee voor vlees op pizza

    public boolean pizzaCheeseCrust() {    //krijgt een input mee voor standaard deeg of deeg met kaaskorst
        return kaaskorst.equals("2");
    }


    public boolean studentpas() {//krijgt een input mee of de gebruiker een studentenpas heeft.
        return studentenpas.equals("1");
    }

    public void berekenPizzaPrijs(){
        Pizza pizza = new Pizza();
        System.out.printf("Bedankt voor het invullen van de lijst! Uw pizza kost: %.2f €%n", pizza.getPizzaPrijs(pizzaSize(), pizzaMeat(), pizzaCheeseCrust(), studentpas()));
    }
}
