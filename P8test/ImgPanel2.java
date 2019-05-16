import java.awt.*;
import java.awt.event.*;
import java.awt.image.AreaAveragingScaleFilter;


public class ImgPanel2 extends Panel
{
	private Image Img;

	///Users/niclas/Documents/Studium/HTW/Sem2/P2/Java/Praktikum/P8/lok.gif 100

	int x = 100;
	int y = 100;
	int width = 300;
	int height = 300;
	int startAngle = 0;

	int [] arcAngle;

	int arcAngle2;

	int n;

	int[] values;

	public int getX() {
	return x;
}


public void setX(int x) {
	this.x = x;
}


public int getY() {
	return y;
}


public void setY(int y) {
	this.y = y;
}


public int getWidth() {
	return width;
}


public void setWidth(int width) {
	this.width = width;
}


public int getHeight() {
	return height;
}


public void setHeight(int height) {
	this.height = height;
}


public int getStartAngle() {
	return startAngle;
}


public void setStartAngle(int startAngle) {
	this.startAngle = startAngle;
}


public int[] getArcAngle() {
	return arcAngle;
}


public void setArcAngle(int[] arcAngle) {
	this.arcAngle = arcAngle;
}


public int getArcAngle2() {
	return arcAngle2;
}


public void setArcAngle2(int arcAngle2) {
	this.arcAngle2 = arcAngle2;
}


	ImgPanel2(Image Img, int arcAngle2) {
		this.Img=Img;
		this.values = values;

		setVisible(true);

//		setSize(Img.getWidth(this), Img.getHeight(this));

	}


	public void paint (Graphics g) {








		g.drawImage(Img, 0, 0, this);

		Graphics2D g2d = (Graphics2D) g;

		Graphics g2 = (Graphics) g;


		g2d.setColor(Color.RED);
				g2d.fillArc(getX(), getY(), getWidth(), getHeight(), getStartAngle(), getArcAngle2());


	}

	public static void main(String[] args) {


		int arcAngle2 = Integer.parseInt(args[1]);

		Frame F = new Frame("Image Panel");


		Image I = F.getToolkit().getImage(args[0]);


//		int [] arcAngle = new int[args.length];
//
//		for (int i = 1; i < args.length; i++)
//		{
//			arcAngle [i] = Integer.parseInt(args[i]);
//
//
//		}

		ImgPanel2 P = new ImgPanel2(I, arcAngle2);
		F.add(P);

		F.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent we)
	      {System.exit(0);}});

		F.pack();
		F.setSize(P.getWidth(), P.getHeight());
		F.setVisible(true);

	}



}
