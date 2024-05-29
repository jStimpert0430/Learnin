#include <iostream>
using namespace std;

int qualityPoints();

int main(){
	cout<<"Score Average Calculator - Joshua Stimpert - Stark State AdvC++ Fall2017\n\n";
	cout<<"This average falls within score bracket #: "<<qualityPoints()<<endl<<endl;
}

int qualityPoints(){
	int input = 0;
	int scoreTotal = 0;
	int totalScores = 1;
	int scoreBracket;

	//Loop to prompt input, add to total, and increase count with minor validation. 
	do{
		cout<<"Please enter a score(0-100) for assignment # "<<totalScores<<" or input -1 to quit: ";
		cin>>input;
		if(input == -1){
				totalScores--;
				if(totalScores > 0)
					break;
				else
					cout<<"Must enter at least one score\n\n";
		}
		else if(input < 0 || input > 100){
			cout<<"\nMust enter a score between 0 and 100\n\n";
			totalScores--;
		}
		else
			scoreTotal += input;
	}
	while (++totalScores != -1);
	
	//print results and assign group based on average; Return group.
	double scoreAverage = (scoreTotal / totalScores);
	cout<<"Total Scores Entered: "<<totalScores << endl << endl;
	cout<<"The Average of the scores entered is: " << scoreAverage << endl;
	if(scoreAverage >= 90 && scoreAverage <= 100)
		scoreBracket = 4;
	else if(scoreAverage > 79)
		scoreBracket = 3;
	else if(scoreAverage > 69)
		scoreBracket = 2;
	else if(scoreAverage > 59)
		scoreBracket = 1;
	else
		scoreBracket = 0;
	return scoreBracket;
}
