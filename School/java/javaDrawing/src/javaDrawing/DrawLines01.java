package javaDrawing;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
						//VVVVV - extends the jPanel class, similar to imports.
public class DrawLines01 extends JPanel {
	// standard line to call the JPanel paintComponent
	public void paintComponent(Graphics g) {
		//call the super method for the paint panel method
		super.paintComponent(g);
		//set text font size
		int fontSize = 20;
		//set text properties of jPanel
		g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
		g.setColor(Color.blue);
		g.drawString("Draw Lines", (getWidth()/2) - 47, 20);
		
		//get the JFrame size
		int width = getWidth();
		int height = getHeight();
		
		//change drawing color
		g.setColor(Color.red);
		
		//draw the lines
		g.drawLine(0, height/2, width, height/2);
		
		//change drawing color
		g.setColor(Color.black);
		
		g.drawLine((width / 2), 0, (width / 2), height);
		
		/*for(int count = 0; count < 10; count++){
			g.drawLine(0, yPosition, width, yPosition);
			yPosition += 10;
		}*/
		
	}

}
