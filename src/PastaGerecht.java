import org.junit.Assert;
import org.junit.jupiter.api.Test;


class PastaGerecht extends Gerecht {

    public PastaGerecht(String name, String type, Double prijs) {
        super(name, type, prijs);
    }

    @Override
    public double getPrijs() {
        return prijs * 1.21;
    }


}

