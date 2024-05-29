#include <iostream>
#include <cstring>
using namespace std;
const int SIZE = 80;

void convertToPigLatin(char*);

void main(){
	char mySentance[SIZE];
	char *word;
	cout<<"Joshua Stimpert - Adv C++ - Week 7 Lab\n\n";
	cout<<"Please enter a sentance: ";
	cin.getline(mySentance, SIZE - 1);
	cout<<"\nYour input was: "<<mySentance<<endl<<endl;
	cout<<"Your sentance converted to pig latin is: \n'";
	word = strtok(mySentance, " ");
	while( word != NULL){
		convertToPigLatin(word);
		word = strtok(NULL, " ");
	}
	cout<<"'"<<endl<<endl;
	system("pause");
}

void convertToPigLatin(char *inputWord){
	char f = inputWord[0];
	if(f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u')
		cout<<inputWord<<"way ";
	else{
		int temp = inputWord[0];
		for(int i = 0; i < strlen(inputWord); i++){
			inputWord[i] = inputWord[i + 1];
		}
		inputWord[strlen(inputWord)] = temp;
		cout<<inputWord<<"ay ";
	}
}