package AbstractFactoryPattern;

import java.util.Scanner;

public class FactoryKeuzemenu {
    public FactoryKeuzemenu() {
        Assortiment assortiment = new Assortiment();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Waar heeft u trek in? vul een van de getallen in t/m %d.%n", assortiment.getGerechten().size());
        int teller = 1;
        for (int i = 0; i < assortiment.getGerechten().size(); i++) {
            System.out.printf("%d. %s%n", teller++, assortiment.getGerechten().get(i).getName());
        }
        int input = scanner.nextInt();
        new printMenukeuze(input);

    }
}
