//Joshua Stimpert
//Lab 9
//A judge calculation program for dive scores
#include <iostream>
#include <string>
#include <iomanip>

using namespace std;
double calcScore(double myArray[], int &size, double difficulty);
double captureDouble(string,double,double);
void arraySort(double myArray[], int &size);
void removeHighLowScores(double myArray[], int &size);


void main(){
	cout.setf(ios::fixed);
	cout.setf(ios::showpoint);
	cout.precision(1);
	int size = 7;
	double difficulty, scores[7];

	difficulty = captureDouble("Please enter the difficulty of the dive: ", 1.1, 3.9);//set difficulty

	for(int i = 0; i < size; i++){//for loop to fill judge scores
		cout<<"\n-Judge "<<i + 1<<"-\n";
		scores[i] = captureDouble("Please enter a score for this dive: " , 0, 11);
	}

	arraySort(scores, size);//Sort Scores from largest to smallest
	cout<<"\nDegree of difficulty : "<<difficulty<<endl;
	cout<<"Judge's scores: ";

	for(int i = 0; i < size; i++){//Loop to output scores
		cout<<scores[i];
		if (i < 6)
			cout<<", ";
	}

	removeHighLowScores(scores, size);//Remove highest and lowest scores before calculation
	cout<<"\nScore: "<<calcScore(scores, size, difficulty)<<endl<<endl;
}

//Generic method to capture a double within a set range with a message
double captureDouble(string prompt, double validRangeMin, double validRangeMax){
	double input;
	do{//Loop to ensure valid input before continuing
		cout<<prompt;
		cin>>input;
		if(input > validRangeMin && input < validRangeMax)//if the input is in within the provided range, break out of loop and return the value
			break;
		else//Otherwise, print error and try again
			cout<<"Invalid input, please try again.\n";
	}while(true);
	return input;
}

//Method that takes the array of scores and the difficulty of the dive and returns the final score
double calcScore(double myArray[], int &size, double difficulty){
	double sum = 0;
	for(int i = 0; i < size; i++)
		sum += myArray[i];
	sum *= difficulty;
	sum *= 0.6;
	return sum;
}

//Method to sort values in an int array from largest to smallest by pushing all of the smallest values to the end in order
void arraySort(double myArray[], int &size){
	for(int end = size-1; end > 0; end--)//set the current push limit
		for(int mover = 0; mover < end; mover++)//loop to iterate through slots until it hits the numbers that have already been moved
			if(myArray[mover] < myArray[mover+1]){// if the selected number is smaller than the next number, swap values and move on
				int temp = myArray[mover+1];
				myArray[mover+1] = myArray[mover];
				myArray[mover] = temp;
			}
}

//Method to remove the Highest and the Lowest scores from the array before score calculation.
void removeHighLowScores(double myArray[], int &size){
		for(int i = 0; i < size; i++){//loop to move the index being manipulated
			myArray[i] = myArray[i + 1];//Move all indexes down one to delete highest value
		}
		size -= 2;//Once all indexes are moved, shrink the array by 2 to delete the blank space and lowest score
}