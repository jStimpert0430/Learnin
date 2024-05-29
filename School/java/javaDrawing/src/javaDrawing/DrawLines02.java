package javaDrawing;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLines02 extends JPanel {
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int fontSize = 20;
		//set text properties of jPanel
		g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
		g.setColor(Color.orange);
		g.drawString("Draw Lines 2", (getWidth()/2) - 47, 20);
		int width = getWidth();
		int height = getHeight();
		int xPosition = 0;
		int yPosition = 0;
		
		for(int count = 0; count < 300; count++){
			g.drawLine(0, yPosition, width, yPosition);
			yPosition += 10;
		}
	}

}
