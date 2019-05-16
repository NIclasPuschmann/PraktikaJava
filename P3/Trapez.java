import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math.*;

public class Trapez extends Figur
{

  int a;
  int b;
  int c;
  int d;
  int h;
  int width;
  int height;

  //Konstruktor1
  public Trapez(int a, int h)
  {
    this.a=a;
    this.h=h;
    super.width=a;
    super.height=h;
    this.a = (a>0) ? a : 0;
    this.b = (b>0) ? b : 0;
    this.h = (h>0) ? h : 0;
  }

  //Konstruktor2
  public Trapez(int a, int b, int c, int d, int h)
  {
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    this.h=h;
    super.width=a;
    super.height=h;
    
    this.a = (a>0) ? a : 0;
    this.b = (b>0) ? b : 0;
    this.h = (h>0) ? h : 0;
  }

  //Konstruktor3
  public Trapez(){}

  public double getCircumference() {return (getWidth()+ c + calcC(getHeight(), ((getWidth()-c)/2)) + calcC(getHeight(), ((getWidth()-c)/2)));}
  public double getArea() {return ((0.5*getWidth()+c)*getHeight());}
  public int getWidth() {return a;}
  public int getHeight() {return h;}

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
    int xpoints[] = {30, 70, 100, 0 };
    int ypoints[] = {0, 0, 150, 150};
    int npoints = 4;

    g.setColor(Color.BLUE);
    g.drawPolygon(xpoints, ypoints, npoints);
  }
}
