//Joshua Stimpert
//lab3b
//A program that tells if a number is a multiple of another number
#include <iostream>
using namespace std;
int multiple(int,int);

void main(){
	int num1,num2;
	//prompts for user input
	cout<<"A program that tells if a number is a multiple of another number"<<endl<<endl;
	cout<<"Enter in the first of two integers: ";
	cin>>num1;
	cout<<"Enter in the second of two integers: ";
	cin>>num2;
	multiple(num1,num2); //call to multiple function
}


//Function that tests if a number modulo a number equals zero and print a message accordingly
int multiple(int num1, int num2){
	if((num1 % num2) == 0){
		cout<<endl<<num1<<" is a multiple of "<<num2<<endl<<endl;
	}
	else{
		cout<<endl<<num1<<" is NOT a multiple of "<<num2<<endl<<endl;
	}

	return 0;//nothing to return so return 0
}