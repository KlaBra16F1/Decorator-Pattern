package Beverages;

import Shop.Getränk;

public class Kaffee implements Getränk{
    private static double preis = 2.20;
    private static int kalorien = 4;

    public int getKalorien() {
        return kalorien;
    }

    Getränk g;
    public static double preisInfo() {
        return preis;
    }

    public double getPreis() {
        return preis;
    }
}
