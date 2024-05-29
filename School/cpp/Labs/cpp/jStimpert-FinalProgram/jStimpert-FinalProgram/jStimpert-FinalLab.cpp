//Joshua Stimpert
//A human class program - take home exam 3
//12/07/16
#include <iostream>
#include <string>
using namespace std;

class Human{
public:
	Human();
	Human(int, int, int, string, string);
	void setAge(int);
	void setHeight(int);
	void setWeight(int);
	void setName(string);
	void setHairColor(string);
	int getAge();
	int getWeight();
	string getHeight();
	string getName();
	string getHairColor();
	string GoToSchool();
	string Sleep();
	string Eat();
	string Drive();
	void OutputDescription();
private:
	int age;
	int weight;
	string heightString;
	string name;
	string hairColor;

};

//Default constructor
Human::Human(){
	setAge(1);
	setHeight(1);
	setWeight(1);
	setName("Super Mario");
	setHairColor("Brown");
}

//Full arg constructor
Human::Human(int newAge, int newHeight, int newWeight, string newName, string newHairColor){
	setAge(newAge);
	setHeight(newHeight);
	setWeight(newWeight);
	setName(newName);
	setHairColor(newHairColor);
}

//Mutator methods
void Human::setAge(int newAge){
	age = newAge;
}

void Human::setHeight(int newHeight){
	if(newHeight > 72)
		heightString = "tall";
	else if(newHeight < 60)
		heightString = "short";
	else
		heightString = "average sized";
}

void Human::setWeight(int newWeight){
	weight = newWeight;
}

void Human::setName(string newName){
	name = newName;
}

void Human::setHairColor(string newHairColor){
	hairColor = newHairColor;
}

//Accessor methods
int Human::getAge(){
	return age;
}

string Human::getHeight(){
	return heightString;
}

int Human::getWeight(){
	return weight;
}

string Human::getName(){
	return name;
}

string Human::getHairColor(){
	return hairColor;
}

//additional methods the class can perform
string Human::GoToSchool(){
	return "go to school, ";
}

string Human::Sleep(){
	return "sleep, ";
}

string Human::Eat(){
	return "eat, ";
}

string Human::Drive(){
	return "drive";
}

//method to output description of the instance of the human
void Human::OutputDescription(){ 
	cout<<"The "<<getHeight()<<" human named "<<getName()<<" is "<<getAge()<<" years old, weighs "<<getWeight()<< " pounds, and has "<<getHairColor()<<" hair. \n\nThis human can "<<GoToSchool()<<Sleep()<<Eat()<<"and "<<Drive()<<"\n\n";
}

void main(){
	Human defaultHuman;
	Human newHuman(28,70,180,"Joshua Stimpert","blonde");
	cout<<"------------------------------------\nHuman made with default constructor: \n------------------------------------\n";
	defaultHuman.OutputDescription();
	cout<<"------------------------------------\nHuman made with full arg constructor: \n------------------------------------\n";
	newHuman.OutputDescription();
}