package javaDrawing;
import javax.swing.JFrame;

public class drawLinesTest {

	public static void main(String[] args) {
		//create an instance of JFrame
		JFrame application = new JFrame("Java Graphics 1");
		//set size of the frame
		application.setLocationRelativeTo(null);
		application.setSize(300,300);
		//sets frame to center of screen
		application.setLocationRelativeTo(null);
		//create the panel
		DrawLines03 panel = new DrawLines03();
		//add the panel to the frame
		application.add(panel);
		application.setVisible(true);

	}

}
