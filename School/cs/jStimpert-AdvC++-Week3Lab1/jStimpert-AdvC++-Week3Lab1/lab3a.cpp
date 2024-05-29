//Joshua Stimpert
//A struct example lab
//13/9/17
#include <iostream>
#include <string>
using namespace std;

struct Date{
	int year;
	int month;
	int day;
};

struct ObjInfo{
	string location;
	string information;
	Date thisDate;
};

void getObjInfo(ObjInfo& myObjInfo);
void getDate(Date& theDate);

void main(){
	ObjInfo myObjectInfo;
	cout<<"Joshua Stimpert - AdvC++ - Week3Lab1\n\n";
	cout<<"Please enter the following information required to make a new object.\n----------------------------------------------------------------------------\n";
	getObjInfo(myObjectInfo);
	cout<<"\nThis object was created on: "<<myObjectInfo.thisDate.day<<"/"<<myObjectInfo.thisDate.month<<"/"<<myObjectInfo.thisDate.year<<endl;
	cout<<"This object is currently at the location of: "<<myObjectInfo.location<<endl;
	cout<<"This object also holds this additional information about itself: "<<myObjectInfo.information<<endl;
}

void getDate(Date& theDate){
	cout<<"\nPlease enter the year this object was created: ";
	cin>>theDate.year;
	do{
		cout<<"Please enter the month this object was created: ";
		cin>>theDate.month;
		if(theDate.month < 13 && theDate.month > 0)
			break;
		else
			cout<<"Must enter a valid month, Please try again\n\n";
	}while(true);
	do{
		cout<<"Please enter the day this object was created: ";
		cin>>theDate.day;
		if(theDate.day < 32 && theDate.day > 0)
			break;
		else
			cout<<"Must enter a valid day, Please try agian.\n\n";
	}while(true);
}

void getObjInfo(ObjInfo& myObjInfo){
	cout<<"Please enter the location of the object: ";
	getline(cin, myObjInfo.location);
	cout<<"Please Describe the object: ";
	getline(cin, myObjInfo.information);
	getDate(myObjInfo.thisDate);
}