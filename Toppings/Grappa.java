package Toppings;
import Shop.Getränk;
public class Grappa implements Getränk{
    Getränk g;
    private static double preis = 1.90;
    private static int kalorien = 221;
    public static double preisInfo() {
        return preis;
    }
    public Grappa(Getränk g) {
        this.g = g;
    }
    public int getKalorien() {
        return kalorien + g.getKalorien();
    }
    public double getPreis() {
        return preis + g.getPreis();
    }
}
