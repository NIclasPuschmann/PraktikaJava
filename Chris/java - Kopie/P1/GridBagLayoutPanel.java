import java.awt.*;
import java.awt.event.*;
public class GridBagLayoutPanel extends Panel 
{
GridBagConstraints C=new  GridBagConstraints();
Button b1=new Button("M+");
Button b2=new Button("7");
Button b3=new Button("8");
Button b4=new Button("9");
Button b5=new Button("/");

Button c1=new Button("M-");
Button c2=new Button("4");
Button c3=new Button("5");
Button c4=new Button("6");
Button c5=new Button("*");

Button d1=new Button("MR");
Button d2=new Button("1");
Button d3=new Button("2");
Button d4=new Button("3");
Button d5=new Button("-");

Button e1=new Button("CE");
Button e2=new Button("0");
Button e3=new Button(".");
Button e4=new Button("=");
Button e5=new Button("+");


TextField tf=new TextField(25);
public GridBagLayoutPanel()
{
 setLayout((new GridBagLayout()));
 C.weightx=1.0;C.weighty=1.0;
 C.fill=GridBagConstraints.BOTH;
 C.gridx=0; C.gridy=0;
 C.gridx=1;
 C.gridwidth=GridBagConstraints.REMAINDER;
 add(tf,C);

 C.gridwidth=1;
 C.gridy=2;
 add(b1,C);
 C.gridx=GridBagConstraints.RELATIVE;
 add(b2,C);
 add(b3,C);
 add(b4,C);
 add(b5,C); 

 C.gridx=1;
 C.gridy=3;
 C.gridwidth=1;
 add(c1,C);
 C.gridx=GridBagConstraints.RELATIVE;
 add(c2,C);
 add(c3,C);
 add(c4,C);
 add(c5,C);

 C.gridx=1;
 C.gridy=4;
 C.gridwidth=1;
 add(d1,C);
 C.gridx=GridBagConstraints.RELATIVE;
 add(d2,C);
 add(d3,C);
 add(d4,C);
 add(d5,C);

 C.gridx=1;
 C.gridy=5;
 C.gridwidth=1;
 add(e1,C);
 C.gridx=GridBagConstraints.RELATIVE;
 add(e2,C);
 add(e3,C);
 add(e4,C);
 add(e5,C);
 }

public static void main(String args[])
 {
  GridBagLayoutPanel p=new GridBagLayoutPanel();
  Frame f=new Frame("GridBagLayoutPanel");
  f.setLayout(new BorderLayout());
  f.add(p, BorderLayout.CENTER);
  f.addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent e)
   {
      System.exit(0); 
   }
   }
  );
  f.pack();
  f.setVisible(true);
 }
 
}
