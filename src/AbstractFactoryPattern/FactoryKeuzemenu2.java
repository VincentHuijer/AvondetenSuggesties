package AbstractFactoryPattern;

import java.util.Scanner;

public class FactoryKeuzemenu2 {
    public FactoryKeuzemenu2() {
        Assortiment assortiment = new Assortiment();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Waar heeft u trek in? vul een van de getallen in t/m %d.%n", assortiment.getProducten().size());
        int teller = 1;
        for (int i = 0; i < assortiment.getProducten().size(); i++) {
            System.out.printf("%d. %s%n", teller++, assortiment.getProducten().get(i).getName());
        }
        int input = scanner.nextInt();

        new printMenukeuze(input);
    }
}
