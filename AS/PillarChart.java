import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Random;

class PillarChart extends Diagram
{

    PillarChart(Image a, String[] args)
    {
        super(a,args);
    }
    
    @Override
    public void paint(Graphics g)
    {   
    
        double x=img.getWidth(this);
        double y=img.getHeight(this);
        int z=werte.length;
        
        g.drawImage(img,0,0,this); //this ist der Image-Observer
        g.drawLine((int)(x/10),(int)(0.9*y),(int)(0.9*x),(int)(0.9*y));
        g.drawLine((int)(x/10),(int)(0.9*y),(int)(0.1*x),(int)(0.1*y));

        for(int i=0,j=(int)(0.1*x),k=20;i<werte.length;i++,j=j+(int)((0.8*x)/(z)),k+=20)
        {
            g.setColor(col[i]);		        
            g.drawRect(j,(int)((0.9*y)-(werte[i]/100)*(y*0.8)),(int)((0.8*x)/(2*z)),(int)((werte[i]/100)*(y*0.8)));
            g.fillRect(j,(int)((0.9*y)-(werte[i]/100)*(y*0.8)),(int)((0.8*x)/(2*z)),(int)((werte[i]/100)*(y*0.8)));
            g.drawString(beschriftung[i],20,k);
        }
    }

    public static void main(String[] args)
    {
    
        Frame f=new Frame();
        Image i=f.getToolkit().getImage(args[0]); //gibt mir Werkzeugkasten...der die Methode getImage enthält
        PillarChart p=new PillarChart(i,args);
        f.add(p);        
        f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
        f.pack();
        f.setVisible(true);
    }
}
