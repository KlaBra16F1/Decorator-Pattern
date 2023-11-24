package Beverages;

import Shop.Getränk;

public class Kakao implements Getränk{
    Getränk g;
    private static double preis = 2.50;
    private static int kalorien = 52;
    
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
