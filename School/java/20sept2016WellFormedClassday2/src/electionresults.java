// Joshua Stimpert
// Well-formed or fully formed class.
// 15 sept, 2016

public class electionresults {
	//1. characteristics
	//instance variables
	private int canidate1VoteTotal, canidate2VoteTotal, canidate3VoteTotal, electionYear;//vote totals
	private String canidate1Name, canidate2Name, canidate3Name;
	private final int MAXVOTES = 120000000;
	
	//2. constructor
	//default... a default constructor has no arguments.;
	public electionresults(){
		System.out.println("In constructor: Defualt");
		setElectionYear(1789);
		setCanidate1VoteTotal(0);
		setCanidate2VoteTotal(0);
		setCanidate3VoteTotal(0);
		setCanidate1Name("Null");
		setCanidate2Name("Null");
		setCanidate3Name("Null");
	}
	
	public electionresults(int year, int cand1, int cand2, int cand3, String name1, String name2, String name3){
		System.out.println("In constructor: Full arg");
		setElectionYear(year);
		setCanidate1VoteTotal(cand1);
		setCanidate2VoteTotal(cand2);
		setCanidate3VoteTotal(cand3);
		setCanidate1Name(name1);
		setCanidate2Name(name2);
		setCanidate3Name(name3);
	}
	
	//3. Accessor Methods (get)
	public int getElectionYear(){
		return electionYear;
	}
	
	public int getCanidate1VoteTotal(){
		return canidate1VoteTotal;
	}
	
	public int getCanidate2VoteTotal(){
		return canidate2VoteTotal;
	}
	
	public int getCanidate3VoteTotal(){
		return canidate3VoteTotal;
	}
	
	public String getCanidate1Name(){
		return canidate1Name;
	}
	
	public String getCanidate2Name(){
		return canidate2Name;
	}
	
	public String getCanidate3Name(){
		return canidate3Name;
	}
	//4. Mutator Methods (set)
	//put all data edit in the set methods where needed
	public void setElectionYear (int updateElectionYear){
		if(updateElectionYear > 1781){
			electionYear = updateElectionYear;
		}
		else{
			electionYear = -999;
		}
	}
	
	public void setCanidate1VoteTotal (int updateCanidate1VoteTotal){
		if(updateCanidate1VoteTotal > 0 && updateCanidate1VoteTotal <= MAXVOTES){
			canidate1VoteTotal = updateCanidate1VoteTotal;
		}
		else{
			canidate1VoteTotal = -13;
		}
	}
	
	public void setCanidate2VoteTotal (int updateCanidate2VoteTotal){
		if(updateCanidate2VoteTotal > 0 && updateCanidate2VoteTotal <= MAXVOTES){
			canidate2VoteTotal = updateCanidate2VoteTotal;
		}
		else{
			canidate2VoteTotal = -14;
		}
	}
	
	public void setCanidate3VoteTotal (int updateCanidate3VoteTotal){
		if(updateCanidate3VoteTotal > 0 && updateCanidate3VoteTotal <= MAXVOTES){
			canidate3VoteTotal = updateCanidate3VoteTotal;
		}
		else{
			canidate3VoteTotal = -15;
		}
	}
	
	public void setCanidate1Name(String updateCanidate1Name){
		canidate1Name = updateCanidate1Name;
	}
	
	public void setCanidate2Name(String updateCanidate2Name){
		canidate2Name = updateCanidate2Name;
	}
	
	public void setCanidate3Name(String updateCanidate3Name){
		canidate3Name = updateCanidate3Name;
	}
	//5. Methods as needed to desribe behavior
   //6. toString method to return the instance variables as a string with labels
	public String toString(){
		return "\nElection Year: " + electionYear
				+ "\n	Candidate 1: " + canidate1Name + " |Vote Total: " + canidate1VoteTotal
				+ "\n	Candidate 2: " + canidate2Name + " |Vote Total: " + canidate2VoteTotal
				+ "\n	Candidate 3: " + canidate3Name + " |Vote Total: " + canidate3VoteTotal;
	}
	
}//ends electionresults class
