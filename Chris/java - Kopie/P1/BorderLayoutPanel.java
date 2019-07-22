import java.awt.*;
import java.awt.event.*;

public class BorderLayoutPanel extends Panel
{
   public static TextField tf;
  
  public  BorderLayoutPanel()
  {
    tf=new TextField(20);
    setFont(new Font("Hevetica",Font.PLAIN,12));
    setLayout(new BorderLayout());
    add(tf,BorderLayout.CENTER);
  }
}
