import java.awt.*;
import java.lang.Math.*;

public class Circle extends Figur
{
  int d;
  double pi = Math.PI;

  public Circle(int d)
  {
    this.d=d;
    this.height=d;
    this.d = (d>0) ? d : 0;
    
  }

  public Circle(){}

  double getCircumference(){return (2*pi*(d/2));}
  double getArea(){return ((pi*d*d)/4);}
  int getWidth() {return d;}
  int getHeight() {return d;}
  

  @Override
  public void paint(Graphics g)
  {
    super.paint(g);
    //g.setBackground(Color.WHITE);

    g.setColor(Color.RED);
    g.drawOval(1, 1, getWidth(), getWidth());
  }
}
