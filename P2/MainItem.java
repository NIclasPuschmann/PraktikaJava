import java.io.*;
import java.util.Scanner;


public class MainItem
{
    public static void main(String args[])
    {
        

        Artikel art = null;
        int ausw;
        Scanner sc = new Scanner(System.in);
        int anzahlEntnahme = 0;

        try 
        { 
            art = new Artikel(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]), 
            Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]), 
            args[7], args[8]); 
        } 
        catch (Exception e)
        {
            System.out.println("\n\t\tNutzungshinweise: [Artikelname] [Artikelnummer] [Artikelanzahl] [Packungsgroesse] " 
                                     + "[Mindeststueckzahl] [Bestellmenge] [Lagerbestand] [Lieferant] [Hersteller]\n\n");
            e.printStackTrace();
            return;
        }

        do {    
            System.out.println("\n\n\t\tWaehlen Sie eine der folgenden Optionen aus: ");
            System.out.println("\t\t1) eingegebenen Artikel anzeigen");
            System.out.println("\t\t2) Artikel entnehmen");
            System.out.println("\t\t3) Programm beenden");
            ausw = sc.nextInt();

                switch (ausw)
                {
                    case 1:
                        System.out.println("\n\t\t1) eingegebenen Artikel anzeigen");                   
                        System.out.println(art);
                        break;

                    case 2:
                        System.out.println("\n\t\tArtikel entnehmen");
                        System.out.println("aktueller lagerBestand: " + art.getBestand());
                        System.out.println("Wie viel wollen Sie entnehmen?");
                    
                        anzahlEntnahme = sc.nextInt();
            
                        art.takeItem(anzahlEntnahme);
                        
                        System.out.println("\n\t\taktueller lagerBestand: " + art.getBestand());
                    
                                    
                        if (art.getBestand() < art.getMinAnz())
                            {    
                                art.setBestand(art.getBestand()+ art.getBestellAnz());
                            } break;

                    case 3:
                        System.out.println("\t\tProgramm wurde beendet...\n");
                        break;
                    
                    
                    default: 
                        System.out.println("\n\t\tungueltige Eingabe...");
                        break;
                }
        } while(ausw != 3);
                 
    }
}
       