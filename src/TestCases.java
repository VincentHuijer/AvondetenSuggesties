import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

class TestClass {
    @Test
    public void TestGerechtenLijst() {
        String input = "1\n1\n1\n";
        ByteArrayInputStream byteStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(byteStream);
        Applicatie applicatie = new Applicatie();

        ArrayList<Gerecht> PastaGerechten = applicatie.getGerechtenLijst("Pasta-gerecht");
        String opties = "";
        int teller = 0;
        for (Gerecht gerecht : PastaGerechten) {
            opties += (++teller + ". " + gerecht.getName() + " ");
        }
        String expected = "[Pasta] Heeft u trek in 1. Lasagne 2. Penne alla Vodka 3. Spaghetti 4. Tagliatelle 5. Macaroni ";
        String actual = "[Pasta] Heeft u trek in " + opties;

        assertEquals(expected, actual);
    }

    @Test
    public void testApplicatie() {
        String input = "1\n4\n3\n";
        ByteArrayInputStream byteStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(byteStream);
        Applicatie applicatie = new Applicatie();

        ArrayList<Gerecht> VegetarischGerechten = applicatie.getGerechtenLijst("Vegetarisch-gerecht");
        String opties = "";
        int teller = 0;
        for (Gerecht gerecht : VegetarischGerechten) {
            opties += (++teller + ". " + gerecht.getName() + " ");
        }

        Integer number = Integer.valueOf(3);
        Gerecht output = VegetarischGerechten.get(number - 1);

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
        assertEquals(4.50, pizza.getPizzaPrijs("small", false, false, true), 0.001);
        assertEquals(6.00, pizza.getPizzaPrijs("small", true, false, false), 0.001);
        assertEquals(5.00, pizza.getPizzaPrijs("small", false, false, false), 0.001);
        assertEquals(8.00, pizza.getPizzaPrijs("medium", true, true, true), 0.001);
        assertEquals(7.00, pizza.getPizzaPrijs("medium", false, true, false), 0.001);
        assertEquals(7.00, pizza.getPizzaPrijs("medium", true, false, true), 0.001);
        assertEquals(6.00, pizza.getPizzaPrijs("medium", false, false, false), 0.001);
        assertEquals(8.00, pizza.getPizzaPrijs("large", true, false, true), 0.001);
        assertEquals(7.00, pizza.getPizzaPrijs("large", false, false, false), 0.001);
        assertEquals(9.00, pizza.getPizzaPrijs("large", true, true, true), 0.001);
        assertEquals(8.00, pizza.getPizzaPrijs("large", false, true, false), 0.001);
        assertEquals(-1.0, pizza.getPizzaPrijs("small", true, true, true), 0.001);
    }

}