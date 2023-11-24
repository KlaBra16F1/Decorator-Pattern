package Beverages;

import Shop.Getränk;

public class Tee implements Getränk{
    Getränk g;
    private static double preis = 2.50;
    private static int kalorien = 0;
    
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
