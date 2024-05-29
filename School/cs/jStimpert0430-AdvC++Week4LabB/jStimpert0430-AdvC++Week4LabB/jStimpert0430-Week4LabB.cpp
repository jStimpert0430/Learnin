//Joshua Stimpert
//Week 4 lab B
//23/09/17
#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;

class HotDog{
private:
	int standID;
	int sales;
	static int totalSales;
public:
	HotDog();
	HotDog(int);
	void JustSold(int);
	int getSales();
	int getID();
	int getTotalSales();
};

int HotDog::totalSales = 0;

HotDog::HotDog(){
	standID = rand() % 100 + 1;
	sales = 0;
}

HotDog::HotDog(int newID){
	standID = newID;
	sales = 0;
}

void HotDog::JustSold(int hotDogsSold){
	sales += hotDogsSold;
	totalSales += hotDogsSold;
}

int HotDog::getSales(){
	return sales;
}

int HotDog::getID(){
	return standID;
}

int HotDog::getTotalSales(){
return totalSales;
}

int main(void){
	cout<<"Joshua Stimpert\nWeek4LabB\n23/09/17\n\n";
	srand(time(NULL));
	cout<<"Creating 2 Hot Dog Stands...\n\n";
	HotDog hotDogTest1(1);
	HotDog hotDogTest2(2);
	cout<<"Adding sales to each stand via sales method...\n\n";
	hotDogTest1.JustSold(2);
	hotDogTest2.JustSold(1);
	cout<<"Total sales for stand 1: "<<hotDogTest1.getSales()<<endl;
	cout<<"Total sales for stand 2: "<<hotDogTest2.getSales()<<endl;
	cout<<"Total sales for both stands is: "<<hotDogTest1.getTotalSales()<<endl<<endl;
	return 0;
}