#include <iostream>
#include <string>
using namespace std;

int captureInput(string msg);
string timeConvert(int inputTime, char &specifier);
void printOutput(string timeString);

int main(){
	cout<<"Joshua Stimpert - AdvC++ - Week1b lab\n\n";
	char specifier;
	int time;
	do{
		time = captureInput("Please enter the time in 24 hour notation to be converted (00:00 - 23:59) or enter any non-integer character to quit: ");
		string timeString = timeConvert(time, specifier);
		printOutput(timeString);
	}
	while(true);
}

int captureInput(string msg){//Method to capture a valid number for the time with the message prompt as a parameter
	int input;
	
	do{
		cout<<endl<<msg;
		while (!(cin >> input)){//Catch bad int input and use as an escape command and quit program early.
			cin.clear();
			cin.ignore(numeric_limits<streamsize>::max(),'\n');
			exit(1);
		}
		if(input >= 0 && input <= 2359 && (input % 100) < 60)//Once a valid number is recieved, return and continue with main(), else output error and try again.
			return input;
		cout<<"\nInvalid time, please try again\n";
	}while(true);
}

string timeConvert(int inputTime, char &specifier){//Convert time and build string based on results; Add leading 0 to minutes if less than 10.
	string convertedTime;
	//char specifier;
	if(inputTime>1200){
		specifier = 'P';
		if(inputTime>1259)
			inputTime -= 1200;
	}
	else{
		specifier = 'A';
		if(inputTime<100){
			if(inputTime == 0)
				specifier = 'P';
			inputTime += 1200;
		}
	}
	if(inputTime % 100 < 10)//if minutes is under 10, manually add leading 0 to string being built.
		convertedTime = to_string(inputTime / 100) + ":0"  + to_string(inputTime % 100) + specifier;
	else
		convertedTime = to_string(inputTime / 100) + ":"  + to_string(inputTime % 100)  + specifier;
	return convertedTime;
}

void printOutput(string timeString){//output aggregated data
	cout<<"\n\nConverted to a 12 hour scale, the time input equals: "<<timeString<<endl<<endl;
}