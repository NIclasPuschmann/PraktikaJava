import java.awt.*;
import java.awt.event.*;

public class Tabelle extends Panel {

	GridBagConstraints C = new GridBagConstraints();
	
	//string[][] werte = new string[][];
	public Tabelle(String[][] Werte){
		
		//string[][] werte = new string[Werte.lenght][];
		//Werte = werte;
		int z=0;
		Label[] labels=new Label[Werte.length*3];
            
            for(int i = 3; z<Werte.length;i=i+3){
       
       
			labels[i-3]=new Label(Werte[z][0]);
			labels[i-2]=new Label(Werte[z][1]);
			labels[i-1]=new Label(Werte[z][2]);
			z++;
		}	
		
		z=0;
		
		setLayout((new GridBagLayout()));
		
		for(int i =3; z<Werte.length; i=i+3){
			
			C.gridy=z;
			C.gridx=0;
			add(labels[i-3],C);
			C.gridx=1;
			add(labels[i-2],C);
			C.gridx=2;
			add(labels[i-1],C);
			z++;
			
		}
	}
	
	
		
	public static void main(String args[])
	{
		String[][] werte = new String[3][3];
		werte[0][0] = "FR 12.03";
		werte[0][1] = "14";
		werte[0][2] = "Sonnenstunden";
		werte[1][0] = "SA 13.03";
		werte[1][1] = "10";
		werte[1][2] = "Sonnenstunden";
		werte[2][0] = "SO 14.03";
		werte[2][1] = "7";
		werte[2][2] = "Sonnenstunden";
		
		Tabelle t = new Tabelle(werte);
		

		Frame f=new Frame("Coole Tabelle");
	
		
		f.setLayout(new BorderLayout());
		
		f.add(t);
		
	
		
		
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
