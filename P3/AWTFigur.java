import java.awt.*;
import java.awt.event.*;
import java.util.Formatter;
import java.io.*;
import java.lang.Math.*;


public class AWTFigur extends Panel
{
  Figur f;

  AWTFigur (Figur f)
  {
    this.f=f;
  }

  public void paint(Graphics g)
  {
    f.paint(g);
  }

  public Dimension getPreferredSize()
  {
    return new Dimension (f.getWidth()+2, f.getHeight()+2);
  }

    public static void main(String args[])
    {
      Frame F = new Frame();
      F.setLayout(new FlowLayout());
      F.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
          System.exit(0);
        }
      });

      AWTFigur P1 = new AWTFigur (new Rectangle(100,150));
      F.add(P1);
      AWTFigur P2 = new AWTFigur (new Circle(150));
      F.add(P2);
      AWTFigur P3 = new AWTFigur (new Quadrat(150));
      F.add(P3);
      AWTFigur P4 = new AWTFigur (new Triangle(100, 150));
      F.add(P4);
      AWTFigur P5 = new AWTFigur (new Trapez(100, 150));
      F.add(P5);
      F.pack();
      F.setVisible(true);

      Circle k1 = new Circle(150);

      Rectangle r1 = new Rectangle(150,100);

      Quadrat q1 = new Quadrat(150);

      Triangle t1 = new Triangle(100,150);

      Trapez t2 = new Trapez(100,150);
      
      Figur fa[] = {k1,r1,q1,t1,t2};
      
    
     
      for (int i = 0;i < fa.length; i++)
      {
        System.out.format("\tFlaecheninhalt A: %.1f%n ",fa[i].getArea());
        System.out.format("\tUmfang U: %.1f%n ", fa[i].getCircumference());
        System.out.println("\tHoehe h: "+ fa[i].getHeight());
        System.out.println("\tWeite w: " + fa[i].getWidth());
      }
    }
}
