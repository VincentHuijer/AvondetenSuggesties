import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

class TestClass {
    @Test
    public void TestGerechtkeuzeOpties() {
        String input = "1\n1\n1\n";
        ByteArrayInputStream byteStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(byteStream);
        GerechtKeuzemenu gerechtKeuzemenu = new GerechtKeuzemenu();

        ArrayList<GerechtUitprinter> pastaGerechten = gerechtKeuzemenu.getGerechtOptiesLijst("Pasta-gerecht");
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
    public void testGerechtKeuzemenuGerechtKiezen() {
        String input = "1\n4\n3\n";
        ByteArrayInputStream byteStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(byteStream);
        GerechtKeuzemenu gerechtKeuzemenu = new GerechtKeuzemenu();
        ArrayList<GerechtUitprinter> vegetarischGerechten = gerechtKeuzemenu.getGerechtOptiesLijst("Vegetarisch-gerecht");
        String opties = "";
        int teller = 0;
        for (GerechtUitprinter gerechtUitprinter : vegetarischGerechten) {
            opties += (++teller + ". " + gerechtUitprinter.getName() + " ");
        }
        Integer number = Integer.valueOf(input.split("\n")[2]);
        GerechtUitprinter output = vegetarischGerechten.get(number - 1);

        String expected = "U koos voor Stamppot van het type Vegetarisch-gerecht. \n" +
                "dit gerecht zou rond de 2,59€ kosten om te bereiden.";
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
        Gerecht gerecht = new Gerecht();
        String expectedEiwittenLagerDan10 = "slechte maaltijd voor sporten. Dit gerecht bevat nauwelijks proteïne.";
        String expectedEiwitten10OfHogerKleinerDan20 = "Standaard maaltijd voor eiwitten. Neem misschien nog iets om de proteïne op te bouwen.";
        String expectedEiwitten20OfHoger = "Sport maaltijd, rijk aan proteïne. Zeer goed voor de spieropbouw!";
        assertEquals(expectedEiwittenLagerDan10, gerecht.sportMaaltijdOutput(0));
        assertEquals(expectedEiwittenLagerDan10, gerecht.sportMaaltijdOutput(1));
        assertEquals(expectedEiwittenLagerDan10, gerecht.sportMaaltijdOutput(9));
        assertEquals(expectedEiwitten10OfHogerKleinerDan20, gerecht.sportMaaltijdOutput(10));
        assertEquals(expectedEiwitten10OfHogerKleinerDan20, gerecht.sportMaaltijdOutput(11));
        assertEquals(expectedEiwitten10OfHogerKleinerDan20, gerecht.sportMaaltijdOutput(19));
        assertEquals(expectedEiwitten20OfHoger, gerecht.sportMaaltijdOutput(20));
        assertEquals(expectedEiwitten20OfHoger, gerecht.sportMaaltijdOutput(21));
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
        Gerecht gerecht = new Gerecht();
        Assert.assertFalse(gerecht.GerechtGezondOfOngezondControle(20, 30, false));
        Assert.assertTrue(gerecht.GerechtGezondOfOngezondControle(40, 30, false));
        Assert.assertTrue(gerecht.GerechtGezondOfOngezondControle(40, 60, false));
        Assert.assertFalse(gerecht.GerechtGezondOfOngezondControle(40, 60, true));
    }
}
