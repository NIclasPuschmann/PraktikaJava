import java.awt.*;
import java.awt.event.*;
public class Calculator1 extends Frame implements ActionListener
{
 private static final long serialVersionUID = 1L;
 int c,n;
 float n1;
 String s1,s2,s3,s4,s5;
    Button b[]=new Button[20];
    String[] s= {"7","8","9","+","4","5","6","-","1","2","3","*","C","0","%","/","=","√","x^y","1/x"};
    Panel p;
 TextField tf;
 GridLayout g;
    Calculator1()
    {
     setTitle("Calculator");
     p= new Panel();
     setLayout(new FlowLayout());
        tf=new TextField(30);
        for(int i=0;i<20;i++)
        {
         b[i]=new Button(s[i]);
         b[i].addActionListener(this);
        }
  tf=new TextField(22);
        GridLayout gl=new GridLayout(4,5);
        p.setLayout(gl);
        
        add(tf);
        for(int i=0;i<20;i++)
        {
            p.add(b[i]);
        }
        add(p);
        setSize(250,250);
  setVisible(true);
  setResizable(false);
  addWindowListener( new WindowAdapter()
  {
   public void windowClosing(WindowEvent windowEvent)
   {
   System.exit(0);
   }
  });
 }
    public static void main(String[] args) 
    {
     new Calculator1();
    }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b[0])
  {
   s3 = tf.getText();
   s4 = "7";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[1])
  {
   s3 = tf.getText();
   s4 = "8";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[2])
  {
   s3 = tf.getText();
   s4 = "9";
   s5 = s3+s4;
   tf.setText(s5);
  }if(e.getSource()==b[3])
  {
   s1 = tf.getText();
   tf.setText("");
   c=1;
  }
  if(e.getSource()==b[4])
  {
   s3 = tf.getText();
   s4 = "4";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[5])
  {
   s3 = tf.getText();
   s4 = "5";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[6])
  {
   s3 = tf.getText();
   s4 = "6";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[7])
  {
   s1 = tf.getText();
   tf.setText("");
   c=2;
  }
  if(e.getSource()==b[8])
  {
   s3 = tf.getText();
   s4 = "1";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[9])
  {
   s3 = tf.getText();
   s4 = "2";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[10])
  {
   s3 = tf.getText();
   s4 = "3";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[11])
  {
   s1 = tf.getText();
   tf.setText("");
   c=3;

   }
  if(e.getSource()==b[12])
  {
   tf.setText("");
  }
  if(e.getSource()==b[13])
  {
   s3 = tf.getText();
   s4 = "0";
   s5 = s3+s4;
   tf.setText(s5);
  }
  if(e.getSource()==b[14])
  {
   s1 = tf.getText();
   tf.setText("");
   c=4;
  }
  if(e.getSource()==b[15])
  {
   s1 = tf.getText();
   tf.setText("");
   c=5;
  }
  if(e.getSource()==b[17])
  {
   s1 = tf.getText();
   tf.setText("");
   c=6;
  }
  if(e.getSource()==b[18])
  {
   s1 = tf.getText();
   tf.setText("");
   c=7;
  }
  if(e.getSource()==b[19])
  {
   s1 = tf.getText();
   tf.setText("");
   c=8;
  }
  if(e.getSource()==b[16])
  {
   s2 = tf.getText();
   if(c==1)
   {
    n = Integer.parseInt(s1)+Integer.parseInt(s2);
    tf.setText(String.valueOf(n));
   }
   else
   if(c==2)
   {
    n = Integer.parseInt(s1)-Integer.parseInt(s2);
    tf.setText(String.valueOf(n));
   }
   else
   if(c==3)
   {
    n = Integer.parseInt(s1)*Integer.parseInt(s2);
    tf.setText(String.valueOf(n));
   }
   else
   if(c==4)
   {
    n1=Integer.parseInt(s1)%Integer.parseInt(s2);
    tf.setText(String.valueOf(n));
   }
   else
   if(c==5)
   {
       try
       {
           int p=Integer.parseInt(s2);
           if(p!=0)
                    {
                       n1=Integer.parseInt(s1)/Integer.parseInt(s2);
                       tf.setText(String.valueOf(n1));
                     }
                     else
                     {
                        tf.setText("infinite");
                     }
                }
                catch(Exception i){}
   }
   else 
   if(c==6)
   {
    n1=(float) Math.sqrt(Integer.parseInt(s1));
                tf.setText(String.valueOf(n1));
   }
   else
   if(c==7)
   {
    n=(int) Math.pow(Integer.parseInt(s1),Integer.parseInt(s2));
                tf.setText(String.valueOf(n1));
   }
   else
   if(c==8)
   {
    n1=1/Integer.parseInt(s1);
                tf.setText(String.valueOf(n1));
   }
  }
 }

}
