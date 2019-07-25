import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Random;

class CirclePieChart extends Diagram
{
	//Constructor
    public CirclePieChart(Image a, String[] args)
    {
        super(a,args);
    }
    
    @Override
    public void paint(Graphics g)
    {   
        System.out.println("Höhe Bild: "+img.getWidth(this)+"\n Breite Bild: "+img.getWidth(this)+"\nAnzahl werte: "+werte.length+"Anzahl Beschriftung: "+beschriftung.length);
        
        for(int i=0;i<werte.length;i++)
        {
            System.out.println("Werte["+i+"]:"+werte[i]);
            System.out.println("Beschriftung["+i+"]:"+beschriftung[i]);
                        System.out.println("Color["+i+"]:"+col[i]);

        }
    
        g.drawImage(img,0,0,this); //this ist der Image-Observer
        g.drawOval((img.getWidth(this)/4),img.getHeight(this)/4,img.getWidth(this)/2,img.getWidth(this)/2); //this ist der Image-Observer
        int j=0,k=20;
        for(int i=0;i<werte.length;i++)
        {
            g.setColor(col[i]);			
            g.fillArc(img.getWidth(this)/4,img.getHeight(this)/4, img.getWidth(this)/2,img.getWidth(this)/2, j, (int)(werte[i]*3.6));
            g.drawString(beschriftung[i],20,k);
            System.out.println("i: "+i+"j: "+j);
            j+=(int)(werte[i]*3.6);
            k+=20;
        }
    }
    
    public static void main(String[] args)
    {
        Frame f=new Frame();
        Image i=f.getToolkit().getImage(args[0]); //gibt mir Werkzeugkasten...der die Methode getImage enthält
        CirclePieChart p=new CirclePieChart(i,args);
        f.add(p);        
        f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
        f.pack();
        f.setVisible(true);
    }
}
