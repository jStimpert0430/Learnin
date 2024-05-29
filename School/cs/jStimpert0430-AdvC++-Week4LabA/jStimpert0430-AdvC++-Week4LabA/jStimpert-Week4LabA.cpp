//Joshua Stimpert
//Week 4 lab a
//23/09/17
#include <iostream>
#include <string>
using namespace std;

class Month{
private:
	int month;
public:
	Month();
	Month(int);
	Month(char, char, char);
	//I was a little confused here, the assignment said to make this an abstract data type, but never told me to create another class to inherit this one; So I just left this line in here commented out.
	//virtual ~Month() = 0;
	void setMonthWithNumber();
	void setMonthWithCharacter();
	void outputMonthNum();
	void outputMonthChar();
	int getMonth();
	int findMonthWithNumber(int);
	int findMonthWithCharacter(char, char, char);
	Month findNextMonth(Month thisMonth);
	string toString();
};
Month::Month(){
	month = 1;
}

Month::Month(int newMonth){
	month = findMonthWithNumber(newMonth);
}
Month::Month(char firstLetter, char secondLetter, char thirdLetter){
	month = findMonthWithCharacter(firstLetter, secondLetter, thirdLetter);
}

void Month::setMonthWithNumber(){
	int tempMonth;
	//loop to capture valid month via number
	do{
		cout<<"\nPlease enter the integer representing the desired month: ";
		cin>>tempMonth;
		if(findMonthWithNumber(tempMonth) != -1)
			break;
		else
			cout<<"This month is invalid, please try again.\n";
	}while(true);
	month = tempMonth;
	cout<<"The month you have entered is: "<<toString()<<endl;
}

void Month::setMonthWithCharacter(){
	char tempLetter1, tempLetter2, tempLetter3;
	//loop to capture valid month via characters with auto uppercase support
	do{
		cout<<"\nPlease enter the first letter of the desired month: ";
		cin>>tempLetter1;
		tempLetter1 = toupper(tempLetter1);
		cout<<"Please enter the second letter of the desired month: ";
		cin>>tempLetter2;
		tempLetter2 = toupper(tempLetter2);
		cout<<"Please enter the third letter of the desired month: ";
		cin>>tempLetter3;
		tempLetter3 = toupper(tempLetter3);
		if(findMonthWithCharacter(tempLetter1, tempLetter2, tempLetter3) != -1)
			break;
		else
			cout<<"This month is invalid, please try again.\n";
	}while(true);
	month = findMonthWithCharacter(tempLetter1,tempLetter2,tempLetter3);
	cout<<"\nThe month you have entered is: "<<toString()<<endl;
}
int Month::findMonthWithNumber(int newMonth){
	if(newMonth > 0 && newMonth < 13)
		return newMonth;
	else 
		return -1;
}

void Month::outputMonthNum(){
	cout<<"The number represented by this month is:  "<<month<<endl;
}
void Month::outputMonthChar(){
	string monthTemp = toString();
	cout<<"This month's 3 letter abbreviation is: "<<monthTemp[0]<<monthTemp[1]<<monthTemp[2]<<endl;
}
int Month::getMonth(){
	return month;
}

int Month::findMonthWithCharacter(char firstLetter, char secondLetter, char thirdLetter){
	//Check all J months
	if(firstLetter == 'J'){
		if(secondLetter == 'U'){
			if(thirdLetter == 'N')
				return 6;
			else
				return 7;
		}
		else if(secondLetter = 'A')
			return 1;
		else
			return -1;
	}
	//Check all M months
	else if(firstLetter == 'M'){
		if(thirdLetter == 'R')
			return 3;
		else if(thirdLetter = 'Y')
			return 5;
		else
			return -1;
	}
	//Check all A months
	else if(firstLetter == 'A'){
		if(secondLetter == 'P')
			return 4;
		else if(secondLetter =='U')
			return 8;
		else
			return -1;
	}
	//Check unique months
	else if(firstLetter == 'F')
		return 2;
	else if(firstLetter == 'S')
		return 9;
	else if(firstLetter == 'O')
		return 10;
	else if(firstLetter == 'N')
		return 11;
	else if(firstLetter == 'D')
		return 12;
	else
		return -1;
}

Month Month::findNextMonth(Month thisMonth){
	if(thisMonth.getMonth() == 12){
		Month nextMonth(1);
		return nextMonth;
	}
	else{
		Month nextMonth(thisMonth.getMonth() + 1);
		return nextMonth;
	}
	
}
string Month::toString(){
	switch (month){
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid";
	}
}
int main(void){
	cout<<"Joshua Stimpert\nWeek4 Lab A\n23/09/17\n\n";
	cout<<"Creating a test month with integer constructor set to 4...\n";
	Month testMonth(4);
	testMonth.outputMonthChar();
	testMonth.outputMonthNum();
	testMonth.setMonthWithCharacter();
	testMonth.outputMonthChar();
	testMonth.setMonthWithNumber();
	testMonth.outputMonthChar();
	cout<<"\nCreating next month from this month...\n";
	Month testNextMonth(testMonth.findNextMonth(testMonth));
	testNextMonth.outputMonthChar();
	cout<<endl;
	return 0;
}