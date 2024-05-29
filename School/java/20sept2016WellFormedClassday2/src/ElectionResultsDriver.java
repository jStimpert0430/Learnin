//Joshua Stimpert
//this will test the election results class
//20 sept 2016

public class ElectionResultsDriver {

	public static void main(String[] args) {
		//electionresults election01;
		//election01 = new electionresults();
		
		electionresults election01 = new electionresults();
		electionresults election02 = new electionresults(1789, 1, 2, 3, "John", "Jim", "Joe");
		electionresults election03 = new electionresults(1770, 1, 2, 3, "John", "Jim", "Joe");
		electionresults election04 = new electionresults(1797, -200, 2, 3, "John", "Jim", "Joe");
		electionresults election05 = new electionresults(1797, 1, -200, 3, "John", "Jim", "Joe");
		electionresults election06 = new electionresults(1797, 1, 2, -200, "John", "Jim", "Joe");

		System.out.println(election01.toString());
		System.out.println(election02.toString());
		System.out.println(election03.toString());
		System.out.println(election04.toString());
		System.out.println(election05.toString());
		System.out.println(election06.toString());
		
		//election01.setCanidate1Name("Jumbo");
		//System.out.println(election01.toString());
	}

}
