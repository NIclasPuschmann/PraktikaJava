import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math.*;

public class Triangle extends Figur
{

  int a;
  int b;
  int c;
  int width;
  int height;
  
  //Konstruktor
  public Triangle(int a, int b)
  {
    this.a=a;
    this.b=b;
    super.width=a;
    super.height=b;
    this.a = (a>0) ? a : 0;
    this.b = (b>0) ? b : 0;
  }

  public Triangle(){}

  public double getCircumference() {return (getWidth()+getHeight()+calcC(getWidth(), getHeight()));}
  public double getArea() {return (0.5*getWidth()*getHeight());}
  public int getWidth() {return a;}
  public int getHeight() {return b;}

  public double calcC(int a, int b)
  {
    double res1 = Math.pow(getWidth(),2);
    double res2 = Math.pow(getHeight(),2);
    double res3 = Math.sqrt(res1 + res2);
    return res3;
  }

  @Override
  public void paint(Graphics g)
  {
    int xpoints[] = {0, getWidth(), getWidth()};
    int ypoints[] = {0, getHeight(), 0};
    int npoints = 3;

    g.setColor(Color.BLUE);
    g.drawPolygon(xpoints, ypoints, npoints);
  }
}
