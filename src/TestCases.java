import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

class TestClass {
    @Test
    public void TestGerechtenLijst() {
        String input = "1\n1\n";
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
        String output = "[Pasta] Heeft u trek in " + opties;

        Assert.assertEquals(expected, output);
    }
}