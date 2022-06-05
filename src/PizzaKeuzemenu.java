import java.util.Scanner;

public class PizzaKeuzemenu {

    public String pizzaSizeInput;
    PizzaKeuzeInputsVerwerken pizzaKeuzeInputsVerwerken = new PizzaKeuzeInputsVerwerken();

    public PizzaKeuzemenu() {
        Pizza pizza = new Pizza();
        Scanner scanner = new Scanner(System.in);
        System.out.println("welke grootte wilt uw pizza?" +
                " Kies uit de nummers 1 t/m 3." +
                "\n1. Small 5,00€" +
                "\n2. Medium 6,00€" +
                "\n3. Large 7,00€");
        String pizzagrootteInput = scanner.nextLine();
        String grootte = pizzaKeuzeInputsVerwerken.pizzaSize(pizzagrootteInput);
        //input voor vlees op pizza
        System.out.println("wilt u vlees op uw pizza? " +
                "Dit kost +1,00€." +
                " Kies uit de nummers 1 t/m 2." +
                "\n1. ja" +
                "\n2. nee");
        String pizzaVleesInput = scanner.nextLine();
        boolean vleesOpPizza = pizzaKeuzeInputsVerwerken.pizzaMeat(pizzaVleesInput);
        //input voor kaaskorst van je pizza
        System.out.println("wilt u voor uw pizza standaard korst," +
                " of wilt u korst met kaas? +1,00€. " +
                "Kies uit de nummers 1 t/m 2." +
                "\n1. Standaard deeg" +
                "\n2. Kaasdeeg");
        String pizzadeegInput = scanner.nextLine();
        boolean kaaskorst = pizzaKeuzeInputsVerwerken.pizzaCheeseCrust(pizzadeegInput);
        //input voor studentenpas
        System.out.println("heeft u een studentenpas bij u? " +
                "Kies uit de nummers 1 t/m 2." +
                "\n1. ja, ik ben een student en heb een studentenpas" +
                "\n2. nee, ik heb geen studentenpas");
        String studentnummerInput = scanner.nextLine();
        boolean studentenpas = pizzaKeuzeInputsVerwerken.studentpas(studentnummerInput);

        System.out.printf("Bedankt voor het invullen van de lijst! Uw pizza kost: %.2f €%n", pizza.getPizzaPrijs(grootte, vleesOpPizza, kaaskorst, studentenpas));
    }
}

