#include <iostream>
using namespace std;

class CounterType{
private:
	int counter;
public: 
	CounterType(){counter = 0;}
	void incrementCount();
	void decrementCount();
	void setCount(int);
	void outputData();
	int returnCount();
};

void CounterType::incrementCount(){
	counter += 1;
	cout<<"Added one to this counter object. The current value is: "<<counter<<endl<<endl;
}

void CounterType::decrementCount(){
	if(counter > 0){
		counter -= 1;
		cout<<"Subtracted one to this counter object. The current value is: "<<counter<<endl<<endl;
	}
	else
		cout<<"ERROR:Cannot decrement count below 0\n\n";
}

void CounterType::setCount(int newCount){
	if(newCount >= 0)
		counter = newCount;
	else
		cout<<"Must enter a positive number to set count\n\n";
}

void CounterType::outputData(){
	cout<<"The current count of the counter variable within this object is: "<<counter<<endl<<endl;
}

int CounterType::returnCount(){
	return counter;
}

int main(){
	cout<<"Joshua Stimpert - Week 2 Homework - Fall 2017 AdvC++\n\n";
	CounterType counter1;
	cout<<"--------------------------------------------------\nCall to counter 1's increment function.\n--------------------------------------------------\n";
	counter1.incrementCount();
	cout<<"--------------------------------------------------\nCall to counter 1's decrement function.\n--------------------------------------------------\n";
	counter1.decrementCount();
	cout<<"--------------------------------------------------\nCall again to counter 1's decrement function and trigger an error.\n--------------------------------------------------\n";
	counter1.decrementCount();
	cout<<"--------------------------------------------------\nCall the counter's setCount function to set the count directly, then print with the data return function.\n--------------------------------------------------\n";
	counter1.setCount(12);
	cout<<"The current count in the object is: "<<counter1.returnCount()<<endl<<endl;
	cout<<"--------------------------------------------------\nThis is a test of the objects output function\n--------------------------------------------------\n";
	counter1.outputData();
}
