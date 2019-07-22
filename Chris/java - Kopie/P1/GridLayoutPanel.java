import java.awt.*;
import java.awt.event.*;

public class GridLayoutPanel extends Panel implements ActionListener
{
    int c,n;
    float n1;
    String s1,s2,s3,s4,s5;
    Button b[]=new Button[20];
    String[] s= {"M+","7","8","9","/","M-","4","5","6","*","MR","1","2","3","-","CE","0",".","=","+"};
  
  public GridLayoutPanel()
  {
  
    setFont(new Font("Hevetica",Font.PLAIN,20));
    setLayout(new GridLayout(4,5));
    
    for(int i=0;i<20;i++)
        {
         b[i]=new Button(s[i]);
         b[i].addActionListener(this);
         add(b[i]);
        }
  }
  
  
  public static void main(String args[])
  {
    Frame f=new Frame("GridLayoutPanel");
    GridLayoutPanel p=new GridLayoutPanel();
    BorderLayoutPanel q=new BorderLayoutPanel();
    f.add(p, BorderLayout.CENTER);
    f.add(q, BorderLayout.NORTH);
    f.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){System.exit(0);}
    });
    f.pack();
    f.setVisible(true);
  }
  
   @Override
    public void actionPerformed(ActionEvent e) 
    {
    if(e.getSource()==b[1])
    {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "7";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[2])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "8";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[3])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "9";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  
  if(e.getSource()==b[19])
  {
   s1 = BorderLayoutPanel.tf.getText();
   BorderLayoutPanel.tf.setText("");
   c=1;
  }
  if(e.getSource()==b[6])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "4";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[7])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "5";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[8])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "6";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[14])
  {
   s1 = BorderLayoutPanel.tf.getText();
   BorderLayoutPanel.tf.setText("");
   c=2;
  }
  if(e.getSource()==b[11])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "1";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[12])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "2";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[13])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "3";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[9])
  {
   s1 = BorderLayoutPanel.tf.getText();
   BorderLayoutPanel.tf.setText("");
   c=3;

   }
  if(e.getSource()==b[15])
  {
   BorderLayoutPanel.tf.setText("");
  }
  if(e.getSource()==b[16])
  {
   s3 = BorderLayoutPanel.tf.getText();
   s4 = "0";
   s5 = s3+s4;
   BorderLayoutPanel.tf.setText(s5);
  }
  if(e.getSource()==b[4])
  {
   s1 = BorderLayoutPanel.tf.getText();
   BorderLayoutPanel.tf.setText("");
   c=4;
  }
  if(e.getSource()==b[18])
  {
   s2 = BorderLayoutPanel.tf.getText();
   if(c==1)
   {
    n = Integer.parseInt(s1)+Integer.parseInt(s2);
    BorderLayoutPanel.tf.setText(String.valueOf(n));
   }
   else
   if(c==2)
   {
    n = Integer.parseInt(s1)-Integer.parseInt(s2);
    BorderLayoutPanel.tf.setText(String.valueOf(n));
   }
   else
   if(c==3)
   {
    n = Integer.parseInt(s1)*Integer.parseInt(s2);
    BorderLayoutPanel.tf.setText(String.valueOf(n));
   }
   else
   if(c==4)
   {
       try
       {
           int p=Integer.parseInt(s2);
           if(p!=0)
                    {
                       n1=Integer.parseInt(s1)/Integer.parseInt(s2);
                       BorderLayoutPanel.tf.setText(String.valueOf(n1));
                     }
                     else
                     {
                        BorderLayoutPanel.tf.setText("infinite");
                     }
                }
                catch(Exception i){}
   }
  }
  
 }
  
}
