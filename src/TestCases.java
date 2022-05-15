import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

class TestClass {
    @Test
    public void TestGerechtenLijst() {
        String input = "1\n1\n1\n";
        ByteArrayInputStream byteStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(byteStream);
        Applicatie applicatie = new Applicatie();

        ArrayList<GerechtUitprinter> pastaGerechten = applicatie.getGerechtenLijst("Pasta-gerecht");
        String opties = "";
        int teller = 0;
        for (GerechtUitprinter gerechtUitprinter : pastaGerechten) {
            opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
        }
        String expected = "[Pasta] Heeft u trek in 1. Lasagne 2. Penne-alla-Vodka 3. Spaghetti 4. Tagliatelle 5. Macaroni ";
        String actual = "[Pasta] Heeft u trek in " + opties;

        assertEquals(expected, actual);
    }

    @Test
    public void testApplicatie() {
        String input = "1\n4\n3\n";
        ByteArrayInputStream byteStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(byteStream);
        Applicatie applicatie = new Applicatie();

        ArrayList<GerechtUitprinter> vegetarischGerechten = applicatie.getGerechtenLijst("Vegetarisch-gerecht");
        String opties = "";
        int teller = 0;
        for (GerechtUitprinter gerechtUitprinter : vegetarischGerechten) {
            opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
        }

        Integer number = Integer.valueOf(input.split("\n")[2]);
        GerechtUitprinter output = vegetarischGerechten.get(number - 1);

        String expected = "U koos voor Stamppot van het type Vegetarisch-gerecht. \n" +
                "dit gerecht zou rond de 2,59€ kosten om te bereiden.";

        //Aangezien output van het type Gerecht is vind assert het niet fijn om een object met een String te vergelijken
        String actual = String.valueOf(output);

        assertEquals(expected, actual);
    }

    @Test
    public void testPastaGerechtEnBTW() {
        PastaGerecht pastaGerecht = new PastaGerecht("testLasagne", "Pasta-gerecht", 1.00);
        String expected = "U koos voor testLasagne van het type Pasta-gerecht. \n" +
                "dit gerecht zou rond de 1,21€ kosten om te bereiden.";
        String actual = String.valueOf(pastaGerecht);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPizzaPrijsTest() {
        Pizza pizza = new Pizza();

        assertEquals(5.40, pizza.getPizzaPrijs("small", true, false, true), 0.001);
        assertEquals(6.00, pizza.getPizzaPrijs("small", false, true, false), 0.001);
        assertEquals(7.20, pizza.getPizzaPrijs("medium", true, true, true), 0.001);
        assertEquals(6.00, pizza.getPizzaPrijs("medium", false, false, false), 0.001);
        assertEquals(7.20, pizza.getPizzaPrijs("large", true, false, true), 0.001);
        assertEquals(8.00, pizza.getPizzaPrijs("large", false, true, false), 0.001);
    }


    @Test
    public void sportMaaltijdPrinterTest() {
        GerechtUitprinter gerechtUitprinter = new GerechtUitprinter();
        String expectedEiwittenLagerDan10 = "slechte maaltijd voor sporten!\nDit gerecht bevat nauwelijks proteïne.";
        String expectedEiwitten10OfHogerKleinerDan20 = "Standaard maaltijd voor eiwitten.\nNeem misschien nog een ander hapje om de proteïne op te bouwen.";
        String expectedEiwitten20OfHoger = "Sport maaltijd.\nRijk aan proteïne. Zeer goed voor de spieropbouw!";
        Assert.assertEquals(expectedEiwittenLagerDan10, gerechtUitprinter.sportMaaltijdPrinter(0));
        Assert.assertEquals(expectedEiwittenLagerDan10, gerechtUitprinter.sportMaaltijdPrinter(1));
        Assert.assertEquals(expectedEiwittenLagerDan10, gerechtUitprinter.sportMaaltijdPrinter(9));
        Assert.assertEquals(expectedEiwitten10OfHogerKleinerDan20, gerechtUitprinter.sportMaaltijdPrinter(10));
        Assert.assertEquals(expectedEiwitten10OfHogerKleinerDan20, gerechtUitprinter.sportMaaltijdPrinter(11));
        Assert.assertEquals(expectedEiwitten10OfHogerKleinerDan20, gerechtUitprinter.sportMaaltijdPrinter(19));
        Assert.assertEquals(expectedEiwitten20OfHoger, gerechtUitprinter.sportMaaltijdPrinter(20));
        Assert.assertEquals(expectedEiwitten20OfHoger, gerechtUitprinter.sportMaaltijdPrinter(21));
    }


    /**
     * Voorwaarden = ( A || B) && !C
     * A = Een gerecht bevat meer dan 30 gram vet
     * B = Een gerecht bevat meer dan 50 gram koolhydraten
     * C = Een gerecht bevat groente
     * D = Een gerecht is ongezond(D = 1) als het meer dan 30 gram vet bevat OF meer dan 50 koolhydraten EN het bevat geen groente
     **/
    @Test
    public void testControleerGerechtGezondOfOngezond() {
        GerechtUitprinter gerechtUitprinter = new GerechtUitprinter();
        String expectedGezond = "Dit gerecht is gezond!"; // Decision van formule = 0
        String expectedOngezond = "Dit gerecht is ongezond!"; // Decision van formule = 1
        Assert.assertEquals(expectedGezond, gerechtUitprinter.gezondOfOngezondPrinter(20, 30, false));
        Assert.assertEquals(expectedOngezond, gerechtUitprinter.gezondOfOngezondPrinter(40, 30, false));
        Assert.assertEquals(expectedOngezond, gerechtUitprinter.gezondOfOngezondPrinter(40, 60, false));
        Assert.assertEquals(expectedGezond, gerechtUitprinter.gezondOfOngezondPrinter(40, 60, true));
    }
}
