package AbstractFactoryPattern;

public class printMenukeuze {

    public printMenukeuze(int input) {
        Assortiment assortiment = new Assortiment();
        System.out.printf("Bestelling:%nU koos voor: %s%n", assortiment.getGerechten().get(--input).getName());
        System.out.printf("Prijs: %.2f€%n", assortiment.getGerechten().get(input).getPrijs());
        if (assortiment.getGerechten().get(input).getSpecialeActie() != null) {
            System.out.printf("Actie: %s%n", assortiment.getGerechten().get(input).getSpecialeActie());
        }
    }
}
