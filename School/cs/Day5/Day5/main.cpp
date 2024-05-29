#include <iostream>
#include <fstream>
#include <string>
#include <map>
using namespace std;

string getInputString();
void ScanPolymer(string&);

int main(){
	string inputString = getInputString();
	ScanPolymer(inputString);
	cout<<endl;
	system("pause");
}

string getInputString(){
	ifstream fs("input.txt");
	string inString;
	while(fs >> inString);
    fs.close();
	return inString;
}

void ScanPolymer(string &InString){
	char currentChar = ' ';
	char nextChar = ' ';
	cout<<"Scanning Polymer chain for matches..."<<endl;
	for(int i = 0; i < InString.length(); i++){
		currentChar = InString[i];
		if(i != InString.length()){
			nextChar = InString[i + 1];
			char lowCurrent = tolower(currentChar);
			char lowNext = tolower(nextChar);
			if(lowCurrent == lowNext){
				if(isupper(currentChar) && !isupper(nextChar) || !isupper(currentChar) && isupper(nextChar)){
					InString.erase(i, 2);
					i = -1;
				}
			}
		}
		else
			nextChar = ' ';
	}
	cout<<"Total remaining units after matching: "<<InString.length()<<endl;
}

void ScanExtraPolymer(string &InString){
	char CurrentChar = ' ';
	cout<<"Scanning Polymore for extra unit..."<<endl;
	for(int i = 0; i < InString.length(); i++){
		map<char, int>charCount;
	}

}