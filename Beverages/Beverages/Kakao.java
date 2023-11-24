package Beverages;

import Shop.Getränk;

public class Kakao implements Getränk{
    private static double preis = 2.50;
    Getränk g;
    private static int kalorien = 52;
    
    public int getKalorien() {
        return kalorien;
    }
    
    public static double preisInfo() {
        return preis;
    }

    public double getPreis() {
        return preis;
    }
}
