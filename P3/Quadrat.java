import java.awt.*;

public class Quadrat extends Figur
{
  private int a; //height

  //Konstruktor
  public Quadrat(int a)
  {
    this.a=a;
    this.a = (a>0) ? a : 0;
  }

  public Quadrat(){}

  public double getCircumference() {return (4*a);}
  public double getArea() {return (a*a);}
  public int getWidth() {return a;}
  public int getHeight() {return a;}

  @Override
  public void paint(Graphics g)
  {
    super.paint(g);
    g.setColor(Color.BLUE);
    g.drawRect(0, 0, getWidth(), getHeight());
  }
}
