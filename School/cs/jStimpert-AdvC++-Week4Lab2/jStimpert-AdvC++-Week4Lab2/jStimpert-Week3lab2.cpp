#include <iostream>
#include <string>
using namespace std;

//----------------------------------------------------------------------------
//                           Base parent class
//----------------------------------------------------------------------------
class StarFleetMember{
	private:
		string name;
		string assignment;
		int age;
	public:
		StarFleetMember(){
			name = "Empty Member";
			assignment = "No Assignment";
			age = 0;
		}
		StarFleetMember(string newName, string newAssign, int newAge){
			name = newName;
			assignment = newAssign;
			age = newAge;
		}
		void AccessComputer(string);
		void ContactBridge(string, string);
		string getName();
		string getAssign();
		int getAge();
		void setName(string);
		void setAssign(string);
		void setAge(int);
};

void StarFleetMember::AccessComputer(string command){
	cout<<"\nComputer: bleepbloopbloop\n";
}

void StarFleetMember::ContactBridge(string officer, string message){
	cout<<name<<" to bridge: "<<officer<<", "<<message<<endl;
}

string StarFleetMember::getName(){
	return name;
}

string StarFleetMember::getAssign(){
	return assignment;
}

int StarFleetMember::getAge(){
	return age;
}

void StarFleetMember::setName(string newName){
	name = newName;
}

void StarFleetMember::setAssign(string newAssign){
	assignment = newAssign;
}

void StarFleetMember::setAge(int newAge){
	age = newAge;
}
//----------------------------------------------------------------------
//                          1st Child Class
//----------------------------------------------------------------------
class Ensign : public StarFleetMember {
private:
	bool isSpeaking;
public:
	Ensign(string newName, string newAssign, int newAge) : StarFleetMember(newName, newAssign, newAge){
		isSpeaking = false;
	}
	bool getIsSpeaking();
	void setIsSpeaking(bool newSpeaking);
	void Complain();
};

bool Ensign::getIsSpeaking(){
	return isSpeaking;
}

void Ensign::setIsSpeaking(bool newSpeaking){
	isSpeaking = newSpeaking;
}

void Ensign::Complain(){
	cout<<getName()<<": I know this may finish me as acting ensign--\n";
	isSpeaking = true;
}

//----------------------------------------------------------------------
//                        2nd Child Class
//----------------------------------------------------------------------

class Captain : public StarFleetMember {
public:
	Captain(string newName, string newAssign, int newAge) : StarFleetMember(newName, newAssign, newAge){
	}
	void IssueNewHeading(int direction, int mark);
	void ShutUp(Ensign);
};

void Captain::IssueNewHeading(int direction, int mark){
	cout<<getName()<<": Helm, new heading: "<<direction<<" - Mark "<<mark<<endl;
}

void Captain::ShutUp(Ensign target){
	if(target.getIsSpeaking()){
		cout<<getName()<<": Shut up, "<<target.getName()<<"!\n";
		target.setIsSpeaking(false);
	}
}


//-----------------------------------------------------------------------
//                         Program Main
//-----------------------------------------------------------------------
int main(void){
	cout<<"Joshua Stimpert - Lab3b - Star Trek: TNG bridge simulator\n";
	cout<<"-------------------------------------------------------------\n";
	Captain picard = Captain("Picard", "U.S.S. Enterprise", 58);
	Ensign wesely = Ensign("Wesely", "Starfleet Academy", 17);
	picard.IssueNewHeading(210,550);
	wesely.Complain();
	picard.ShutUp(wesely);
	cout<<endl;
	return 0;
}

//It's funny to me.....


