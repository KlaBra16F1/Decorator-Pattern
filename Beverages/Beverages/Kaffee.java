package Beverages;

import Shop.Getränk;

public class Kaffee implements Getränk{
    Getränk g;
    private static double preis = 2.20;
    private static int kalorien = 4;

    public static double preisInfo() {
        return preis;
    }
    public int getKalorien() {
        return kalorien;
    }
    public double getPreis() {
        return preis;
    }
}
