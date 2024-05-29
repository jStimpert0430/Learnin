// Joshua Stimpert
// Well-formed or fully formed class.
// 15 sept, 2016

public class electionresults {
	//characteristics
	//instance variables
	int canidate1, canidate2, canidate3, electionYear;//vote totals
	String canidate1Name, canidate2Name, canidate3Name;
	
	//constructor
	//default... a default constructor has no arguments.;
	public electionresults(){
		System.out.println("In constructor: Defualt");
		electionYear = 1781;
		canidate1 = 0;
		canidate2 = 0;
		canidate3 = 0;
		canidate1Name = "";
		canidate2Name = "";
		canidate3Name = "";
	}
	public electionresults(int year, int cand1, int cand2, int cand3, String name1, String name2, String name3){
		System.out.println("In constructor: Full arg");
		electionYear = year;
		canidate1 = cand1;
		canidate2 = cand2;
		canidate3 = cand3;
		canidate1Name = name1;
		canidate2Name = name2;
		canidate3Name = name3;
	}
	
}
