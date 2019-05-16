import java.io.*;
import java.text.MessageFormat;

public class Artikel
{   
    //Eigenschaften
    private String artName;
    private String artNr;
    private int menge;
    private int size;
    private int minAnz;
    private int bestellAnz;
    private int bestand;
    private String hersteller;
    private String haendler;

    public void setArtName(String artName)
    {
        this.artName=artName;
    }

    public void setArtNr(String artNr)
    {
        this.artNr=artNr;
    }

    public void setMenge(int menge)
    {
        this.menge= (menge > 0) ? menge : 0;
    }

    public void setSize(int size)
    {
        this.size= (size > 0) ? size : 0;
    }

    public void setMinAnz(int minAnz)
    {
        this.minAnz = (minAnz > 0) ? minAnz : 0;
    }

    public void setBestellAnz(int bestellAnz)
    {
        this.bestellAnz = (bestellAnz > 0) ? bestellAnz : 0;
    }

    public void setBestand(int bestand)
    {
        this.bestand= (bestand > 0) ? bestand : 0;
    }

    public void setHersteller(String hersteller)
    {
        this.hersteller=hersteller;
    }

    public void setHaendler(String haendler)
    {
        this.haendler=haendler;
    }

    public String getArtName()
    {
        return artName;
    }

    public String getArtNr()
    {
        return artNr;
    }

    public int getMenge()
    {
        return menge;
    }

    public int getSize()
    {
        return size;
    }

    public int getMinAnz()
    {
        return minAnz;
    }

    public int getBestellAnz()
    {
        return bestellAnz;
    }

    public int getBestand()
    {
        return bestand;
    }

    public String getHersteller()
    {
        return hersteller;
    }

    public String getHaendler()
    {
        return haendler;
    }


    public Artikel(String artName, String artNr, int menge,
                    int size, int minAnz, int bestellAnz, 
                    int bestand, String hersteller, String haendler)
    {
        this.artName=artName;
        this.artNr=artNr;
        this.menge=(menge > 0) ? menge : 0;
        this.size=(size > 0) ? size : 0;
        this.minAnz=(minAnz > 0) ? minAnz : 0;
        this.bestellAnz=(bestellAnz > 0) ? bestellAnz : 0;
        this.bestand=(bestand > 0) ? bestand : 0;
        this.hersteller=hersteller;
        this.haendler=haendler;

    }

    public Artikel()
    {
        this.artName="";
        this.artNr="";
        this.menge=0;
        this.size=0;
        this.minAnz=0;
        this.bestellAnz=0;
        this.bestand=0;
        this.hersteller="";
        this.haendler="";
    }

    @Override
    public String toString()
    {
        return "\n\tArtikelname:\t\t " + artName + "\n\tArtikelnummer:\t\t " + artNr + "\n\tArtikelanzahl:\t\t " 
        + menge + "\n\tPackungsgroesse:\t " + size + "\n\tMindeststueckzahl:\t " + minAnz 
        + "\n\tBestellmenge:\t\t " + bestellAnz + "\n\tLagerbestand:\t\t " + getBestand() + "\n\tHersteller:\t\t "
        + hersteller + "\n\tLieferant:\t\t "  + haendler + "\n";
    }

    public void takeItem(int anzahlEntnahme)
    {
        if (getBestand() < anzahlEntnahme)
        {
        
                System.out.println("\n\t\tEs ist zu wenig Material vorhanden.");
        
        } else 
            {
                setBestand(getBestand()-anzahlEntnahme);
                System.out.println("\n\t\tDie Entnahme verlief erfolgreich.");
                orderItem();
            }
    }
    
    public void orderItem()
    {
        if (getBestand() < minAnz)
        {
            System.out.println("Die Mindeststuekzahl wurde unterboten.");
            setBestand(getBestand()+getBestellAnz());
            System.out.println(MessageFormat.format("Es wurden {0} von {1} nachbestellt." + getBestellAnz(), getArtName()));
        }
    }
}