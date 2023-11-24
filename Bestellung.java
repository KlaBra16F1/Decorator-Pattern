import java.util.Scanner;
import Shop.Getränk;
import Beverages.*;
import Toppings.*;


public class Bestellung {
    boolean weiter = true;
    Scanner input = new Scanner(System.in);
    Getränk auswahl = null;
    String choice;
    String bestellung = "";
    public void bestellGetraenk() {
        do {
            System.out.printf("Bitte wählen Sie ein Getränk aus:\n"+
            "[Kaffee] EUR %.2f\n[Tee] EUR %.2f\n[Kakao] EUR %.2f\n"+
            "Ihre Auswahl: ", Kaffee.preisInfo() ,Tee.preisInfo(),Kakao.preisInfo());
            choice = input.nextLine();
            switch (choice.toLowerCase()) {
                case "kaffee":
                    auswahl = new Kaffee();
                    break;
                case "tee":
                    auswahl = new Tee();
                    break;
                case "kakao":
                    auswahl = new Kakao();
                    break;
            
                default:
                    System.out.println(choice+" haben wir leider nicht.");
                    break;
            }
            bestellung += auswahl.getClass().getSimpleName();
            
            if (auswahl != null ) {
                System.out.printf("Sie haben einen %s bestellt. Möchten sie noch eine etwas dazu? (j/n) ", bestellung);
                choice = input.nextLine();
                if (choice.equals("j")) {
                    
                    zusatzBestellung();
                } else {
                    weiter = false;
                }

            } else {
                System.out.println("Möchten sie weiter bestellen? (j/n)");
                weiter = (input.nextLine().equals("n")) ?  false :  true;
            }


        } while (weiter);
        System.out.printf("Ihr %s kostet %.2f Euro und hat %d Kalorien",bestellung, auswahl.getPreis(),auswahl.getKalorien());

    }

    private void zusatzBestellung() {
        int counter = 1;
        do {
            System.out.printf("Bitte wählen Sie zwischen\n[Milch] EUR %.2f\n[Schokolade] EUR %.2f\n" + //
                    "[Grappa] EUR %.2f\n" + //
                            "zu Ihrem %s: ",Milch.preisInfo(),Schokolade.preisInfo(),Grappa.preisInfo(), bestellung);
            bestellung += (counter < 2) ? " mit " :" und ";
            choice = input.nextLine();
            switch (choice.toLowerCase()) {
                case "milch":
                    auswahl = new Milch(auswahl);
                    counter++;
                    break;
                case "schokolade":
                    auswahl = new Schokolade(auswahl);
                    counter++;
                    break;
                case "grappa":
                    auswahl = new Grappa(auswahl);
                    counter++;
                    break;
                default:
                    System.out.println(choice+" haben wir leider nicht.");
                    break;
            }
            bestellung += auswahl.getClass().getSimpleName();
            System.out.println("Möchten sie eine weitere Zutat? (j/n)");
            weiter = (input.nextLine().equals("n")) ?  false :  true;
        } while (weiter);
    }
    
}
