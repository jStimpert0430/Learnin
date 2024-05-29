//Joshua Stimpert
//Exam 2 lab - Reverse Array
//Nov 7 2016
#include <iostream>
#include <time.h>
using namespace std;
void populateGrid(int gridArray[][20]);
void gridOutput(int gridArray[][20]);
void gridOutputMirror(int gridArray[][20]);

void main(){
	srand(time(NULL));
	int gridArray[20][20];
	populateGrid(gridArray);
	cout<<"Original Array--"<<endl;
	gridOutput(gridArray);
	cout<<endl<<endl;
	cout<<"Flipped Array--"<<endl;
	gridOutputMirror(gridArray);

}

//Method to output grid with X's and O's instead of int
void gridOutput(int gridArray[][20]){
	for(int i = 0; i < 20; i++){
		for(int j = 0; j < 20; j++){
			if(gridArray[i][j] == 0)//if index = 0, output a "O". Otherwise output "X".
				cout<<"O";
			else
				cout<<"X";
		}
		cout<<endl;
	}
}

//Reversed version of above method to output from the end of array to beggining
void gridOutputMirror(int gridArray[][20]){
	for(int i = 0; i < 20; i++){
		for(int j = 19; j > -1; j--){
			if(gridArray[i][j] == 0)//if index = 0, output a "O". Otherwise output "X".
				cout<<"O";
			else
				cout<<"X";
		}
		cout<<endl;
	}
}


//Method to randomly populate each index in the array between 0 and 1
void populateGrid(int gridArray[][20]){
	for(int i = 0; i < 20; i++)//column counter
		for(int j = 0; j < 20; j++)//row counter
			gridArray[i][j] = 0 + rand()%2;//randomize each index
}