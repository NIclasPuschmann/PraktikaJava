import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ImgPanel2 extends Panel
{
 private Image Img;
 private int modvalues[];
 Random designer = new Random();
 private String Energie[] = { "Kernkraft", "Solarenergie", "Wasserkraft", "Braunkohle", "Erdgas", "Erdwärme", "Fernwärme" };
 
 
 

 
 ImgPanel2(Image Img, String truevalues[])
    {
    this.Img=Img;
    MediaTracker M=new MediaTracker(this);
    M.addImage(Img,1);
    try {M.waitForID(1);}catch (Exception e){} 
    modvalues = new int[(truevalues.length)-1];
    
    for(int i = 0; i<truevalues.length-1 ; i++)
        {
        modvalues[i]= Integer.parseInt(truevalues[i+1]);
        }
    }
    
 public void paint(Graphics g)
{   
    
    g.drawImage(Img,0,0,this);
    
    for(int x = 0; x<modvalues.length ; x++)
        {   
            int red = designer.nextInt(255);
            int green = designer.nextInt(255);
            int blue = designer.nextInt(255);
            Color randomColor = new Color(red, green, blue, 127);
            Color randomColorfull = new Color(red, green, blue, 255);
            g.setColor(randomColor);
            g.fillRect((Img.getWidth(this)/2)-(Img.getHeight(this)/4) + (x*(Img.getWidth(this)/14)),(Img.getHeight(this)/2)-(Img.getHeight(this)/4)-(Img.getHeight(this)/8), Img.getWidth(this)/20,(modvalues[x]/10)*(Img.getHeight(this)/20));
            g.setColor (Color.BLACK);
            g.fillRect((Img.getWidth(this)/2)-(Img.getHeight(this)/6)-30,(Img.getHeight(this)/2)-(Img.getHeight(this)/4)+(Img.getHeight(this)/2) + (x*25)-17, Img.getHeight(this)/3+70, 25);
            g.setColor (randomColorfull);
            g.drawString(Energie[x], (Img.getWidth(this)/2)-(Img.getHeight(this)/6)-20,(Img.getHeight(this)/2)-(Img.getHeight(this)/4)+(Img.getHeight(this)/2) + (x*25));
            g.drawString(modvalues[x] + "\t %", (Img.getWidth(this)/2)+(Img.getHeight(this)/6),(Img.getHeight(this)/2)-(Img.getHeight(this)/4)+(Img.getHeight(this)/2) + (x*25));
        }    
    
    
    
                                    
                                }
 
 
 public Dimension getPreferredSize()
{
 return new Dimension(Img.getWidth(this),Img.getHeight(this));
}
 


 public static void main(String args[])
 {
 Frame F=new Frame("Imagepanel");
 Image I=F.getToolkit().getImage(args[0]);
 ImgPanel2 P=new ImgPanel2(I,args);
 F.add(P);
 F.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){System.exit(0);}
    });
 F.pack();
 F.setVisible(true);
 }
}


