import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

class TestClass {
    @Test
    public void TestGerechtenLijst() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        Applicatie applicatie = new Applicatie();

        ArrayList<Gerecht> PastaGerechten = applicatie.getGerechtenLijst("Pasta-gerecht");
        String opties = "";
        int teller = 0;
        for (Gerecht gerecht : PastaGerechten) {
            opties += (++teller + ". " + gerecht.getName() + " ");
        }
        String output = "[Pasta] Heeft u trek in " + opties;
        String expected = "[Pasta] Heeft u trek in 1. Lasagne 2. Penne alla Vodka 3. Spaghetti 4. Tagliatelle 5. Macaroni ";

        Assert.assertEquals(expected, output);
    }


}