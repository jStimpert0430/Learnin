import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class Dialog {

	public static void main(String[] args) {
		//1. A simple message fialog : Only an OK button.
		JOptionPane.showMessageDialog(null, "Hello! Welcome to Dialogs");
		
		//2 a simple inptDialog - returns a string or null
		String myName = JOptionPane.showInputDialog(null,"Please enter your name");
		JOptionPane.showMessageDialog(null, "Your name is " + myName);
		
		//3 An inputDialog with drop down choices
		String[] states = {"Illinois", "Indiana", "Ohio"};
		Object selected = JOptionPane.showInputDialog(null, "Please Choose a state", "Selection", JOptionPane.DEFAULT_OPTION, null, states, 0);
		JOptionPane.showMessageDialog(null,  "Your state is " + selected);
		
		//4 An input dialog with radio buttons
		JDialog dialog = null;
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("PLease select your sub-topic");//dialog box message
		
		JPanel panel = new JPanel(); //canvas for screen
		String[] buttonTxt = {"Civilians","Musicians","Lincoln"};
		JRadioButton[] button = new JRadioButton[buttonTxt.length];
		ButtonGroup group = new ButtonGroup();
		for(int i = 0; i<buttonTxt.length; i++){
			button[i] = new JRadioButton(buttonTxt[i]);
			panel.add(button[i]);//add button to panel
			group.add(button[i]);//add button to group
		}
		
		optionPane.add(panel);
		dialog = optionPane.createDialog(null,"US civil war research");
		dialog.setVisible(true);
		
		//A confirm Dialog Box
		String message = "There are commands in the output buffer = really quit?";
		String title = "Really Quit?";
		
		int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
		System.out.println(""+reply);
		if(reply == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Exiting...");
			System.exit(0);
		}
		else
			JOptionPane.showMessageDialog(null, "Resuming...");
		}

	}
