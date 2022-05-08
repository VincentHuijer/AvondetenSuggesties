import java.math.RoundingMode;
import java.util.Scanner;

public class Pizzakeuzemenu {
    String grootte = "";
    boolean vleesOpPizza;
    boolean kaaskorst;
    boolean studentenpas;

    public Pizzakeuzemenu() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("welke grootte wilt uw pizza? Kies uit de nummers 1 t/m 3.");
        System.out.println("1. small 5,00€");
        System.out.println("2. medium 6,00€");
        System.out.println("3. large 7,00€");

        String pizzagrootte = scanner.nextLine();
        if (pizzagrootte.equals("1")) {
            grootte = "small";
        } else if (pizzagrootte.equals("2")) {
            grootte = "medium";
        } else if (pizzagrootte.equals("3")) {
            grootte = "large";
        }
        System.out.println("wilt u vlees op uw pizza? Dit kost +1,00€ Kies uit de nummers 1 t/m 2.");
        System.out.println("1. ja");
        System.out.println("2. nee");
        String pizzaVlees = scanner.nextLine();
        if (pizzaVlees.equals("1")) {
            vleesOpPizza = true;
        } else if (pizzaVlees.equals("2")) {
            vleesOpPizza = false;
        }
        /**Kaaskorst alleen mogelijk bij medium and large sized pizza's **/
        if (pizzagrootte.equals("2") || pizzagrootte.equals("3")) {
            System.out.println("wilt u voor uw pizza standaard korst of wilt u korst met kaas? +1,00€ Kies uit de nummers 1 t/m 2.");
            System.out.println("1. Standaard deeg");
            System.out.println("2. Kaasdeeg");
            String pizzadeeg = scanner.nextLine();
            if (pizzadeeg.equals("1")) {
                kaaskorst = false;
            } else if (pizzadeeg.equals("2")) {
                kaaskorst = true;
            }
        }
        /**Studentenkorting alleen mogelijk bij small sized pizza's **/
        if (pizzagrootte.equals("1")) {
            System.out.println("heeft u een studentenpas bij u?");
            System.out.println("1. ja, ik ben een student en heb een studentenpas");
            System.out.println("2. nee, ik ben geen student");
            String student = scanner.nextLine();
            if (student.equals("1")) {
                studentenpas = true;
            } else {
                studentenpas = false;
            }
        }

        Pizza pizza = new Pizza();

        System.out.printf("Bedankt voor het invullen van de lijst! Uw pizza kost: %.2f €", pizza.getPizzaPrijs(grootte, vleesOpPizza, kaaskorst, studentenpas));
        System.out.println();
        System.out.println("grootte: " + grootte);
        if (vleesOpPizza == true) {
            System.out.println("Met vlees");
        } else {
            System.out.println("zonder vlees");
        }
        if (kaaskorst == true) {
            System.out.println("Met kaaskorst");
        } else {
            System.out.println("zonder kaaskorst");
        }
        if (studentenpas == true) {
            System.out.println("Afgerekend met studentkorting");
        } else {
            System.out.println("U heeft geen studentkorting");
        }
    }
}
