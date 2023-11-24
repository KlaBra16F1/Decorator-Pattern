package Beverages;

import Shop.Getränk;

public class Kaffee implements Getränk{
    private static double preis = 2.20;
    Getränk g;
    public static double preisInfo() {
        return preis;
    }

    public double getPreis() {
        return preis;
    }
}
