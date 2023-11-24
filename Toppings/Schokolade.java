package Toppings;
import Shop.Getränk;

public class Schokolade implements Getränk{
    Getränk g;
    private static double preis = 0.90;
    public static double preisInfo() {
        return preis;
    }
    public Schokolade(Getränk g) {
        this.g = g;
    }

    public double getPreis() {
        return preis + g.getPreis();
    }
}
