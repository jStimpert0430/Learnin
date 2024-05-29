//Joshua Stimpert
//Lab 4b
//Multiplication flash card program.
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

void main(){
	srand(time(NULL)); //seed random numbers
	int firstNum, secondNum, userIntInput, numCorrect = 0, numAttempts = 0;
	char userCharInput;

	cout<<"Welcome to the multiplication flash card program\n\n";//Program header

	do{ //Post test loop to run at least one attempt
		numAttempts++; //add one to total attempts
		firstNum = 0 + (rand() % 10); //generate single digit random numbers
		secondNum = 0 + (rand() % 10);

		do{ //Inner question loop
			cout<<"How much is "<<firstNum<<" times "<<secondNum<<"? : ";
			cin>>userIntInput;
			if(userIntInput == (firstNum * secondNum)){ //if statement to check if user's answer is correct
				cout<<"Correct, very good!"<<endl;
				numCorrect++;
			}
			else{
				cout<<"Incorrect, Please try the problem again.\n\n";
				numAttempts++;
			}
		}while(userIntInput != (firstNum * secondNum)); //When answer is incorrect, loop to retry problem

		//prompt for terminal value and loop on yes to generate a new problem
		cout<<"\nWould you like to try another? (Y/N) ";
		cin>>userCharInput;
		cout<<endl;
	}while(userCharInput == 'y' || userCharInput == 'Y');//check terminal value
	
	cout<<"You got "<<numCorrect<<"/"<<numAttempts<<" attempts correct.\n\nThank you for using this program.\n";//output final score

}//end class