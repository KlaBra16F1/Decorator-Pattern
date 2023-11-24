package Toppings;
import Shop.Getränk;
public class Grappa implements Getränk{
    Getränk g;
    private static double preis = 1.90;
    public static double preisInfo() {
        return preis;
    }
    private static int kalorien = 221;
    
    public int getKalorien() {
        return kalorien + g.getKalorien();
    }

    public Grappa(Getränk g) {
        this.g = g;
    }

    public double getPreis() {
        return preis + g.getPreis();
    }
}
