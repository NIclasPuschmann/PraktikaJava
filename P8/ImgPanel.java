import java.awt.*;
import java.awt.event.*;


public class ImgPanel extends Panel
{


	private Image Img;

	int [] allValues; // reine Werte ohne Bild

	double [] degree ; // double Werte
	int degreeInt []; // Winkel in int umrechnen, weil fillArc nur int Werte annimmt


//	int[] allValues =





	// Konstruktor

	// convertedValues enthalten Bild
	ImgPanel(Image Img, String [] convertedValues) {


		this.Img=Img;
		MediaTracker M = new MediaTracker(this);
		M.addImage(Img, 1);
		try {M.waitForID(1);} catch (Exception e) {}



		allValues = new int[convertedValues.length-1];

		// Werte mit Bild deswegen ohne, deswegen -1

		for (int i=1; i<convertedValues.length-1; i++)
		{
			allValues [i] = Integer.parseInt(convertedValues[i]);

				System.out.println(convertedValues[i]);
		}
//		this.values = values;



//		setSize(Img.getWidth(this), Img.getHeight(this));

	}


	public void paint (Graphics g) {


		int x = 100;
		int y = 100;
		int width = 300;
		int height = 300;
		int startAngle = 0;
		int arcAngle;

		g.drawImage(Img, 0, 0, this);


		degree = new double[allValues.length];
		degreeInt = new int[allValues.length];








	for (int n = 0; n<allValues.length; n++)
		{
			degree[n] = 3.6 * allValues[n];

			degreeInt[n] = (int) degree[n];

			g.setColor(Color.RED);
			g.fillArc(100, 100, 300, 300, 0, degreeInt[n]);

			startAngle = startAngle + degreeInt[n];

		}



	}


	public Dimension getPreferredSize()
	{
		return new Dimension(Img.getWidth(this), Img.getHeight(this));
	}

	public static void main(String[] args) {

		Frame F = new Frame("Image Panel");


		Image I = F.getToolkit().getImage(args[0]);




		ImgPanel P = new ImgPanel(I, args);
		F.add(P);

		F.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent we)
	      {System.exit(0);}});

		F.pack();
		F.setVisible(true);


//		int [] values = new int[args.length];
//
//		for (int i = 1; i < args.length; i++)
//		{
//			values [i] = Integer.parseInt(args[i]);
//
//
//		}

	}



}

 
