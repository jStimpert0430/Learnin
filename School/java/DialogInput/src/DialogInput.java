import javax.swing.JOptionPane;
import java.util.Scanner;
public class DialogInput {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello! Welcome to the voter survey");
		enterVoterAge(1);
		enterAffiliation(1);
		JOptionPane.showMessageDialog(null, "Thank you for participating");
	}
	
	public static int enterVoterAge(int currentVoter){
		String age;
		int voterAge = 0;
		try{
			age = JOptionPane.showInputDialog(null,"Please enter the age of the voter" + currentVoter);
			if(age == null){
				confirmCancel();
				voterAge = enterVoterAge(currentVoter);
			}
			else{
				voterAge = Integer.parseInt(age);
				if((voterAge<18)||(voterAge>34)){
					JOptionPane.showMessageDialog(null, "Sorry, this person is not eligible for this survery");
					voterAge = enterVoterAge(currentVoter);
				}
			}//end age
		}//end try
		catch(Exception ex){
			JOptionPane.showMessageDialog(null,"An error has occured " + ex);
			voterAge = enterVoterAge(currentVoter);
		}
		return voterAge;
	}
	
	public static void enterAffiliation(int currentVoter){
		String[] values = {"Democrat", "Independent", "Republican"};
		Object selected = JOptionPane.showInputDialog(null, "Political affiliation for voter number " + currentVoter, "selection",JOptionPane.DEFAULT_OPTION,null,values,null);
		if(selected == null){
			confirmCancel();
			enterAffiliation(currentVoter);
		}
		else
			JOptionPane.showMessageDialog(null, "Affiliation Voter #" +  currentVoter + ": " + selected.toString());
	}
	
	public static void confirmCancel(){
		String message = "Please confirm cancellation";
		String title = "Confirm Cancellation";
		int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
		if(reply == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Exiting...");
			System.exit(-1);
		}
		else{
			JOptionPane.showMessageDialog(null, "Resuming...");
		}
	}

}//endofclass
