import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Rectangle extends Figur
{
  int a; //height
  int b; //width

  public Rectangle(int a, int b)
  {
    this.a=a;
    this.b=b;
    super.height=a;
    super.width=b;
    this.a = (a>0) ? a : 0;
    this.b = (b>0) ? b : 0;
  }

  public Rectangle(){}

  double getCircumference(){return (2*(a+b));}
  double getArea(){return (a*b);}
  int getWidth() {return a;}
  int getHeight() {return b;}

  @Override
  public void paint(Graphics g)
  {
    super.paint(g);

    g.setColor(Color.BLACK);
    g.drawRect(0, 0, getWidth(), getHeight());
  }

}
