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
      F.addWindowListener(new WindowAdapter() {public void windowCLosing(WindowEvent we) {System.exit(0);}});
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

      Figur f1;
      Circle k1 = new Circle(150);
      f1=k1;

      Figur f2;
      Rectangle r1 = new Rectangle(150,100);
      f2=r1;

      Figur f3;
      Quadrat q1 = new Quadrat(150);
      f3=q1;

      Figur f4;
      Triangle t1 = new Triangle(100,150);
      f4=t1;

      Figur f5;
      Trapez t2 = new Trapez(100,150);
      f5=t2;
      
      Figur fa[] = {k1,r1,q1,t1,t2};
      
    
     
      for (int i = 0;i < fa.length; i++)
      {
        System.out.format("\tFlaecheninhalt A: %.1f%n ",fa[i].getArea());
        System.out.format("\tUmfang U: %.1f%n ", fa[i].getCircumference());
        System.out.println("\tHoehe h: "+ fa[i].getHeight());
        System.out.println("\tWeite w: " + fa[i].getWidth());
      }
/*
  
      System.out.println("\n\tKreis:");
      System.out.format("\tFlaecheninhalt A: %.1f%n ",f1.getArea());
      System.out.format("\tUmfang U: %.1f%n ", f1.getCircumference());
      System.out.println("\tHoehe h: "+ f1.getHeight());
      System.out.println("\tWeite w: " + f1.getWidth());

      System.out.println("\n\tRechteck:");
      System.out.println("\tFlaecheninhalt A: " + f2.getArea());
      System.out.println("\tUmfang U: " + f2.getCircumference());
      System.out.println("\tHoehe h: "+ f2.getHeight());
      System.out.println("\tWeite w: " + f2.getWidth());

      System.out.println("\n\tQuadrat:");
      System.out.println("\tFlaecheninhalt A: " + f3.getArea());
      System.out.println("\tUmfang U: " + f3.getCircumference());
      System.out.println("\tHoehe h: "+ f3.getHeight());
      System.out.println("\tWeite w: " + f3.getWidth());

      System.out.println("\n\tDreieck:");
      System.out.format("\tFlaecheninhalt A: %.1f%n ", f4.getArea());
      System.out.format("\tUmfang U: %.1f%n ", f4.getCircumference());
      System.out.println("\tSeite a: " + f4.getWidth());
      System.out.println("\tSeite b: "+ f4.getHeight());
      //System.out.println("\tSeite c: "+ calC2(100,150));
      //f.calcC2 (100,150);

      System.out.println("\n\tTrapez:");
      System.out.format("\tFlaecheninhalt A: %.1f%n ", f5.getArea());
      System.out.format("\tUmfang U: %.1f%n ", f5.getCircumference());
      System.out.println("\tHoehe h: "+ f5.getHeight());
      System.out.println("\tWeite w: " + f5.getWidth());
*/
    }
}
