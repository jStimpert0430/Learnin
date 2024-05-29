//Joshua Stimpert
//Week 8 lab - A program to find the difference between 2 times
//Oct 25 2016
#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

int getDifferenceHours(int, int);
int getDifferenceMinutes(int, int, int&);
int captureInput(string);

void main() {
	int startTime, endTime, hours, minutes;
	cout<<"Welcome to the time difference calculation program\n\n";
	startTime = captureInput("Please enter the START time in military format(0000-2359): ");//Call capture input function to get a valid start time
	endTime = captureInput("Please enter the END time in military format(0000-2359): ");//Call capture input function to get a valid end time
	hours = getDifferenceHours(startTime, endTime);//Find difference in hours between start and end times
	minutes = getDifferenceMinutes(startTime, endTime, hours);//find difference in minutes between start and end times
	//output statements
	cout<<"\n\nStart Time: "<<setfill('0')<<setw(4)<<startTime<<endl;
	cout<<"End Time: "<<setw(4)<<endTime<<endl;
	cout<<"Difference: "<<setw(2)<<hours<<setw(2)<<minutes<<endl;
	cout<<"The difference between the two times is "<<hours<<" hours and "<<minutes<<" minutes.\n\n";
}


int getDifferenceHours(int startTime, int endTime){//Method to find difference between hours, a negative number means the time rolls over to the next day so add 24 hours to get difference
	int hours;
	if(startTime <= endTime)
		hours = (endTime / 100) - (startTime / 100);
	else
		hours = (endTime/ 100) - (startTime / 100) + 24;
	return hours;
}


int getDifferenceMinutes(int startTime, int endTime, int &hours){//Method to find the difference between minutes, if the number is negative, remove an hour and add 60 minutes to get correct difference
	int minutes;
	if((startTime % 100) <= (endTime % 100))
		minutes = (endTime % 100) - (startTime % 100);
	else{
		minutes = (endTime % 100) - (startTime % 100) + 60;
		hours--;
	}
	return minutes;
}


int captureInput(string msg){//Method to capture a valid number for the time with a prompt as a parameter
	int input;
	do{
		cout<<msg;
		cin>>input;
		if(input >= 0 && input <= 2359 && (input % 100) < 60){//Once a valid number is recieved, return and continue with main(), else output error and try again
			return input;
		}
		cout<<"Invalid time, please try again\n";
	}while(true);
}