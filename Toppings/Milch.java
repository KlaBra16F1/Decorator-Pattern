package Toppings;
import Shop.Getränk;
public class Milch implements Getränk{
    Getränk g;
    private static double preis = 0.40;
    private static int kalorien = 42;
    public static double preisInfo() {
        return preis;
    }
    public Milch(Getränk g) {
        this.g = g;
    }
    public int getKalorien() {
        return kalorien + g.getKalorien();
    }
    public double getPreis() {
        return preis + g.getPreis();
    }
}
