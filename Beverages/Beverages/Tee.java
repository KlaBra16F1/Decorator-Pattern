package Beverages;

import Shop.Getränk;

public class Tee implements Getränk{
    private static double preis = 2.50;
    Getränk g;
    public static double preisInfo() {
        return preis;
    }

    public double getPreis() {
        return preis;
    }
}
