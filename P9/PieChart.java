import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class PieChart extends Panel
{

	private Image Img;
	private int[] percentages; // reine Werte (Prozente) ohne Bild von Kommandozeile
	private double[] degree ; // Double Werte: percentages *3.6 -> umwandlung von Prozente in Winkel
	private int degreeInt[]; // gerundete Winkel -> fillArc kennt nur int Werte
	private String percentageTag []; // Strings der Legende
// 	int alpha = 150; // 50% transparent
	Color myColor = new Color (255, 100, 100, 127);
	Random generator = new Random();



	// Konstruktor

	// commLineArgsTotal enthalten Bild

	PieChart (Image Img, String[] commLineArgsTotal) {

		this.Img=Img;
		MediaTracker M = new MediaTracker(this);
		M.addImage(Img, 1);
		try {M.waitForID(1);} catch (Exception e) {}

		percentages = new int[(commLineArgsTotal.length)-1];
		// Werte mit Bild deswegen ohne, deswegen -1

		for (int i=0; i<commLineArgsTotal.length-1; i++) {
				percentages[i] = Integer.parseInt(commLineArgsTotal[i+1]); // warum wird hier wieder eins drauf gerechnet????
//				System.out.println(percentages[i]);
		}
	}


	public void paint (Graphics g) {
		int xTag = 100;
		int xPercent = 300;
		int y = Img.getHeight(this) + 30;
		int yAdd = 30;
//		int width = 300;
//		int height = 300;
		int startAngle = 0;
		
		percentageTag = new String []{"Atom", "Kohle", "Gas", "Sonne/Wind", "Wasser", "Geothermie", "Sonstiges"};

		degree = new double[percentages.length];
		degreeInt = new int[percentages.length];


		g.drawImage(Img, 0, 0, this);
		g.setFont(new Font("Arial", Font.PLAIN, 18));

//     System.out.println(Img.getWidth(this)/2); // Ausblick 680
//     System.out.println(Img.getHeight(this)/2); // Ausblick 453


	for (int n = 0; n<percentages.length; n++)
		{
			int red = generator.nextInt(255);
			int green = generator.nextInt(255);
			int blue = generator.nextInt(255);
			Color randomColor = new Color(red, green, blue, 127);
			Color randomColorTag = new Color(red, green, blue, 255);
			degree[n] = 360.00 * (percentages[n]/100.00);
			degreeInt[n] = (int) degree[n];

			g.setColor(randomColor);
			g.fillArc((Img.getWidth(this)/2)-(Img.getWidth(this)/4), (Img.getHeight(this)/2)-(Img.getWidth(this)/4), Img.getWidth(this)/2, Img.getWidth(this)/2, startAngle, degreeInt[n]); 
			startAngle = startAngle + degreeInt[n];
			
			g.setColor(randomColorTag);
			g.drawString(percentageTag[n], (Img.getWidth(this)/2)-(Img.getWidth(this)/4), y);
			g.drawString(percentages[n] + "\t %", ((Img.getWidth(this)/2)-(Img.getWidth(this)/4)+Img.getWidth(this)/2)-25, y);
			y = y + yAdd;
		}
	}

	
	@Override
	public Dimension getPreferredSize()	{
		
		
		int frameHeight=0;
		int y = Img.getHeight(this) + 30;
		int yAdd = 30;
		
		for (int n=0; n<percentages.length; n++)
		{	
			y=y+yAdd;
			frameHeight = y;
		}
		
			return new Dimension(Img.getWidth(this), frameHeight);
		}

	public static void main(String[] args) {

		Frame F = new Frame("Kreisdiagramm");
		Image I = F.getToolkit().getImage(args[0]);
		PieChart P = new PieChart(I, args);
		F.add(P);
		F.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent we)
	      {System.exit(0);}});
		F.pack();
		F.setVisible(true);
	}
}
