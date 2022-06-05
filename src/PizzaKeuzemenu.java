import java.util.Scanner;

public class PizzaKeuzemenu {
    public String grootte = "";
    public boolean vleesOpPizza;
    public boolean kaaskorst;
    public boolean studentenpas;

    public PizzaKeuzemenu() {
        Pizza pizza = new Pizza();
        Scanner scanner = new Scanner(System.in);
        System.out.println("welke grootte wilt uw pizza?" +
                " Kies uit de nummers 1 t/m 3." +
                "\n1. Small 5,00€" +
                "\n2. Medium 6,00€" +
                "\n3. Large 7,00€");
        String pizzagrootteInput = scanner.nextLine();
        pizzaSize(pizzagrootteInput);

        //input voor vlees op pizza
        System.out.println("wilt u vlees op uw pizza? " +
                "Dit kost +1,00€." +
                " Kies uit de nummers 1 t/m 2." +
                "\n1. ja" +
                "\n2. nee");
        String pizzaVleesInput = scanner.nextLine();
        pizzaMeat(pizzaVleesInput);
        //input voor kaaskorst van je pizza
        System.out.println("wilt u voor uw pizza standaard korst," +
                " of wilt u korst met kaas? +1,00€. " +
                "Kies uit de nummers 1 t/m 2." +
                "\n1. Standaard deeg" +
                "\n2. Kaasdeeg");
        String pizzadeegInput = scanner.nextLine();
        pizzaCheeseCrust(pizzadeegInput);


        //input voor studentenpas
        System.out.println("heeft u een studentenpas bij u? " +
                "Kies uit de nummers 1 t/m 2." +
                "\n1. ja, ik ben een student en heb een studentenpas" +
                "\n2. nee, ik heb geen studentenpas");
        String studentnummerInput = scanner.nextLine();
        studentpas(studentnummerInput);

        System.out.printf("Bedankt voor het invullen van de lijst! Uw pizza kost: %.2f €%n", pizza.getPizzaPrijs(grootte, vleesOpPizza, kaaskorst, studentenpas));
    }

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

