import java.util.*;

    public class Prak2
    {
    
        private String Artikelname;
        private int Artikelnummer;
        private String Mengeneinheit;
        private int Packungsgroesse;
        private int Mindeststueckanzahl;
        private int Bestellmenge;
        private int Lagerbestand;
        
        
            Prak2()  // Konstruktoren
                {
                    this.Artikelname = "";
                    this.Artikelnummer = 0;
                    this.Mengeneinheit = "";
                    this.Packungsgroesse = 0;
                    this.Mindeststueckanzahl = 0;
                    this.Bestellmenge = 0;
                    this.Lagerbestand = 0;
                }
                
            Prak2(String Artikelname, int Artikelnummer, String Mengeneinheit, int Packungsgroesse, int Mindeststueckanzahl, int Bestellmenge, int Lagerbestand)
                {
                    this.Artikelname = Artikelname;
                    this.Artikelnummer = (Artikelnummer>0) ? Artikelnummer : 0;
                    this.Mengeneinheit = Mengeneinheit;
                    this.Packungsgroesse = (Packungsgroesse>0) ? Packungsgroesse : 0;
                    this.Mindeststueckanzahl = (Mindeststueckanzahl>0) ? Mindeststueckanzahl : 0;
                    this.Bestellmenge = (Bestellmenge>0) ? Bestellmenge : 0;
                    this.Lagerbestand = (Lagerbestand>0) ? Lagerbestand : 0;
                }
                
            
            public void setArtikelname(String Artikelname)      // setter
                {   this.Artikelname=Artikelname;
                }
                
            public void setArtikelnummer(int Atikelnummer)
                {  
                    this.Artikelnummer = (Artikelnummer>0) ? Artikelnummer : 0;
                }
                
            public void setMengeneinheit(String Mengeneinheit)
                {   this.Mengeneinheit=Mengeneinheit;
                }
                
            public void setPackungsgroesse(int Packungsgroesse)
                {   
                    this.Packungsgroesse = (Packungsgroesse>0) ? Packungsgroesse : 0;
                }
                
            public void setMindeststueckanzahl(int Mindeststueckanzahl)
                {   
                    this.Mindeststueckanzahl = (Mindeststueckanzahl>0) ? Mindeststueckanzahl : 0;
                }
                
            public void setBestellmenge(int Bestellmenge)
                {   
                    this.Bestellmenge = (Bestellmenge>0) ? Bestellmenge : 0;
                }
            
            public void setLagerbestand(int Lagerbestand)
                {   
                    this.Lagerbestand = (Lagerbestand>0) ? Lagerbestand : 0;
                }
            
            
           
           
            public String getArtikelname()    // getter
                {   return this.Artikelname;
                }
                
            public int getArtikelnummer()
                {   return this.Artikelnummer;
                }
            
            public String getMengeneinheit()
                {   return this.Mengeneinheit;
                }
                
            public int getPackungsgroesse()
                {   return this.Packungsgroesse;
                }
            
            public int getMindeststueckanzahl()
                {   return this.Mindeststueckanzahl;
                }
            
            public int getBestellmenge()
                {   return this.Bestellmenge;
                }
                
            public int getLagerbestand()
                {   return this.Lagerbestand;
                }
            
            @Override
            public String toString()
                {  
                    return "Artikelname:\t\t" + Artikelname + "\nArtikelnummer:\t\t" + Artikelnummer + "\nMengeneinheit:\t\t" + Mengeneinheit + "\nPackungsgroesse:\t" + Packungsgroesse + "\nMindeststueckanzahl:\t" + Mindeststueckanzahl+"\nBestellmenge:\t\t" + Bestellmenge + "\nLagerbestand:\t\t" + Lagerbestand;
                }
                
            public void Entnahme(int Materialentnahme)
                {
                    setLagerbestand(Lagerbestand-Materialentnahme);
                }

        
            public static void main(String[] args) // main
            
            {
            
            Prak2 Material=null;
            
            try
            {    
            int Artikelnummer=Integer.parseInt(args[1]);
            int Packungsgroesse=Integer.parseInt(args[3]);
            int Mindeststueckanzahl=Integer.parseInt(args[4]);
            int Bestellmenge=Integer.parseInt(args[5]);
            int Lagerbestand=Integer.parseInt(args[6]);
            
            Material = new Prak2(args[0], Artikelnummer, args[2], Packungsgroesse, Mindeststueckanzahl, Bestellmenge, Lagerbestand);
            }
            catch (Exception e)
            {   
                System.err.println("\nBenutzung: java Prak2 [Artikelname] [Artikelnummer] [Mengeneinheit] [Packungsgroesse] [Mindeststueckanzahl] [Bestellmenge] [Lagerbestand] ");
                System.err.println("Ohne Eingabe wird automaisch ein default Konstruktor verwendet.");
                Material=new Prak2();
            }
            
 
                    String choice = null;
                    Scanner scan = new Scanner(System.in);
                     if (Material.getLagerbestand() < Material.getMindeststueckanzahl())
                        {
                        
                        System.out.println("\nDa der Lagerbestand unter dem Mindestbestand ist, wird automatisch nachbestellt...");
                        Material.setLagerbestand(Material.Lagerbestand + Material.Bestellmenge);
                        }
                    do {
                    System.out.println("\nOptionen: ");
                    System.out.println("a: Anzeige der übernommenen Parameter");
                    System.out.println("m: Materialentnahme");
                    System.out.println("s: Schließen");
                        choice = scan.nextLine();
                        switch (choice) {
                        case "a":
                            System.out.println(Material.toString());
                            break;
                        case "m":
                            int Materialentnahme = 0;
                            System.out.println("\nDer aktuelle Lagerbestand beträgt: " + Material.getLagerbestand());
                            System.out.println("Wie viel Material moechten sie entnehmen ?");
                            Materialentnahme = scan.nextInt();
                            if (Material.getLagerbestand() < Materialentnahme)
                            {
                            System.out.println("\nEs ist zu wenig Material im Lager vorhanden...");
                            System.out.println("Es wird automatisch nachbestellt, wenn der Mindestbestand unterschritten ist...");
                            if (Material.getLagerbestand() < Material.getMindeststueckanzahl()) Material.setLagerbestand(Material.Lagerbestand + Material.Bestellmenge);
                            break;
                            }
                            else 
                            {
                            Material.Entnahme(Materialentnahme); 
                            System.out.println("\nMaterialentnahme erfolgreich");
                            System.out.println("Aktueller Lagerbestand beträgt: " + Material.getLagerbestand());
                            }
                            System.out.println("Wenn der aktuelle Lagerbestand unter dem Mindestbestand liegt, wird automatisch nachbestellt.");
                            if (Material.getLagerbestand() < Material.getMindeststueckanzahl()) Material.setLagerbestand(Material.Lagerbestand + Material.Bestellmenge);
                            break;
                                
                                }  }while (!choice.equals("s"));
        
                    
        
            }
}
