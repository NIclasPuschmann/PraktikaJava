import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;


public  class BackgroundPanel extends Frame
  {
    Image i;

    public void myBackground()
    {
        try{
        i = ImageIO.read(new File("/Users/niclas/Documents/Studium/HTW/Sem2/P2/Java/Praktikum/P8/lok.gif"));
      } catch (Exception e){
      }

      setSize(500,500);
      setResizable(false);
      setVisible(true);
    }


    @Override
    public void paint(Graphics g)
    {
      super.paint(g);
      g.drawImage(i,0,0,getWidth(),getHeight(),null);
    }

  public static void main(String args[])
  {
    new BackgroundPanel().myBackground();
  }
}
