import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class MovieScreening {
	private String title, showings, screens, ticketsSold, receiptTotal;
	private static Stack<MovieScreening> screenList = new Stack<>();
	
	public MovieScreening() {
		
	}
	
	public MovieScreening(String newTitle, String newShowings, String newScreens, String newTicketsSold, String newReceiptTotal) {
		title = newTitle;
		showings = newShowings;
		screens = newScreens;
		ticketsSold = newTicketsSold;
		receiptTotal = newReceiptTotal;
	}
	
	public static void CreateMovieScreeningsFromFile(String filepath) {
		try {
		File f1 = new File("src/" + filepath);
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine()) != null) {
			String[] words = s.split(",");
				screenList.push(new MovieScreening(words[0], words[1], words[2], words[3], words[4]));
		}
		br.close();
		
		}catch(IOException ex) {
			System.out.println("filename: " + filepath + " is invalid");
		}
	}
	
	public static boolean searchForMovieTitle(Statement stmt, String screeningTitle) throws SQLException {
		boolean movieFound; 

		String sqlStatement = "SELECT * FROM Movie WHERE Title = '" + screeningTitle + "'";

		ResultSet result = stmt.executeQuery(sqlStatement);

		if (result.next()) {
			movieFound = true;
		} 
		else {
			movieFound = false;
		}
		return movieFound;
	}


	public static void updateMovieTotals(Statement stmt) throws SQLException {
        for (MovieScreening screening: screenList) {
			if(searchForMovieTitle(stmt, screening.getTitle())) {
                String movieTotalQuery = "SELECT receiptTotal FROM Movie WHERE title = '" + screening.getTitle() + "'";
                ResultSet oldMovieTotal = stmt.executeQuery(movieTotalQuery);
                int newReceiptTotal = oldMovieTotal.getInt(1) + Integer.parseInt(screening.receiptTotal);
                
				String sqlStatement = "UPDATE Movie " + "SET receiptTotal = " + Integer.toString(newReceiptTotal) + "WHERE title = '" + screening.getTitle() + "'";
				int rows = stmt.executeUpdate(sqlStatement);
				System.out.println(rows + " row(s) updated.");
			}
			else {
				String sqlStatement = "INSERT INTO Movie VALUES" + "('" + screening.getTitle() + "', '" + screening.getScreens() +"'," + " '" + screening.getShowings() +"', '" + screening.getTicketsSold() + "', '" + screening.getReceiptTotal() + "')";;
				int rows = stmt.executeUpdate(sqlStatement);
				System.out.println(rows + " row(s) added to the table.");
			}
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getShowings() {
		return showings;
	}
	
	public String getScreens() {
		return screens;
	}
	
	public String getTicketsSold() {
		return ticketsSold;
	}
	
	public String getReceiptTotal() {
		return receiptTotal;
	}
	
	
}
