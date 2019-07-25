import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Random;

class Diagram extends Panel
{
    protected Image img;
    protected double[] werte;
    protected String[] beschriftung;
    protected Color[] col;

    public Diagram(Image a,String[] args) //Constructor bekommt alle Kommandozeilenparameter
    {
        beschriftung=new String[(args.length-1)/2];
		werte=new double[(args.length-1)/2];
		col=new Color[(args.length-1)/2];
		Random rnd = new Random();

         for(int i=0,j=0;i<(args.length-1);i+=2,j++)
        {
            beschriftung[j]=new String(args[i+1]);
            werte[j]=Double.parseDouble(args[i+2]);
            col[j]=new Color((float)rnd.nextDouble(),(float)rnd.nextDouble(),(float)rnd.nextDouble(),0.5f); //r,g,b, alpha(durchsichtigkeit)
		 // col[i]=new Color((int)Math.random()*256,(int)Math.random()*256,(int)Math.random()*256,128); //r,g,b, alpha(durchsichtigkeit)
        }
        
        this.img=a;
        MediaTracker m = new MediaTracker(this); //brauch man, da die pixel erst beim erzeugen bekannt sind
        m.addImage(this.img,1);
        
        try
        {
            m.waitForID(1);
         // m.waitforAll();  //falls man ganz viele Bilder hat
        }
        catch (Exception e){}
    }
    
    @Override
    public void paint(Graphics g)
    {   
        g.drawImage(img,0,0,this); //this ist der Image-Observer
    }
    
    @Override
    public Dimension getPreferredSize() 
    {
        return new Dimension(img.getWidth(this)/*+200*/,img.getHeight(this)/*+200*/);
    }

    public static void main(String args[])
    {
        Frame f=new Frame();
        Image i=f.getToolkit().getImage(args[0]); //gibt mir Werkzeugkasten...der die Methode getImage enthält
        Diagram d=new Diagram(i,args);
        f.add(d);        
        f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
        f.pack();
        f.setVisible(true);
    }
}
