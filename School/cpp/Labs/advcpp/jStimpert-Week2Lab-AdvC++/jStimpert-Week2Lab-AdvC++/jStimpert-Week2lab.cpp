//Joshua Stimpert
//A program which utilizes an additional class in order to play a game of tic tac toe
//05 Sept 2017
#include <iostream>
#include <stdlib.h>
using namespace std;

class TicTacToe{
	int xMove;
	int yMove;
	int currentPlayer;
	int turnNum;
	int gameBoard[3][3];
	bool gameOver;
public:
	TicTacToe(){
		currentPlayer = 1;
		turnNum = 1;
		gameOver = false;
		initializeGameBoard();
		outputGameBoard();
	}
	void gameLoop();
	void initializeGameBoard();
	void outputGameBoard();
	void addMove();
	void playerTurn();
	void checkWinCondition();
};

void TicTacToe::gameLoop(){//Main game loop
	do{
		playerTurn();
		if(gameOver)
			break;
		outputGameBoard();
	}while(true);
}
void TicTacToe::initializeGameBoard(){//Set game board to all 0's
	for (int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			gameBoard[i][j] = 0;
		}
	}
}

void TicTacToe::outputGameBoard(){//Method to clear screen and output updated gameboard depending on array values.
	system("cls");
	cout<<"Joshua Stimpert - Week2 Lab - AdvC++ Fall 2017\n\n";
	cout<<"  1 2 3\n";
	for (int i = 0; i < 3; i++){
		cout<<(i + 1);
		for(int j = 0; j < 3; j++){
			if(gameBoard[i][j] == 0)
				cout<<"| ";
			else if(gameBoard[i][j] == 1)
				cout<<"|X";
			else
				cout<<"|O";
		}
		cout<<"|"<<endl;
	}
	cout<<"\nPlayer "<<currentPlayer<<"\nCurrent Turn: "<<turnNum<<endl<<endl;
}

void TicTacToe::addMove(){
	gameBoard[yMove][xMove] = currentPlayer;
}

void TicTacToe::playerTurn(){//Method to capture a valid coordinate from the user, make sure that space isn't taken, increment the turn counter, switch player, and redraw the game board.
	if(turnNum > 9){
		cout<<"The game is a tie, nobody has won.\n\n";
		gameOver = true;
		return;
	}
	do{//Loop to ensure empty space

		do{//loop for X coord
			cout<<"Player "<<currentPlayer<<" Please enter the X coordinate for your move(Left to right): ";
			while(!(cin>>xMove)){//Catch non-int input here
				cin.clear();
				cin.ignore(numeric_limits<streamsize>::max(),'\n');
					cout<<"Must enter a number, Please try again\n\n";
					cout<<"Player "<<currentPlayer<<" Please enter the X coordinate for your move(Left to right): ";
			}
			if(xMove > 0 && xMove < 4){
				xMove -= 1;
				break;
			}
			else
				cout<<"Must enter a number between 1 and 3 for the X coordinate\n\n";
		}while(true);

		do{//Loop for Y coord
			cout<<"Player "<<currentPlayer<<" Please enter the Y coordinate for your move(Up to down): ";
			while(!(cin>>yMove)){//catch non-int input here
				cin.clear();
				cin.ignore(numeric_limits<streamsize>::max(),'\n');
					cout<<"Must enter a number, Please try again\n\n";
					cout<<"Player "<<currentPlayer<<" Please enter the Y coordinate for your move(Left to right): ";
			}
			if(yMove > 0 && yMove < 4){
				yMove -= 1;
				break;
			}
			else
				cout<<"Must enter a number between 1 and 3 for the Y coordinate\n\n";
		}while(true);

		if(gameBoard[yMove][xMove] == 0)
			break;//Finally break once a valid coordinate has been obtained and there isn't already a piece on that space
		else
			cout<<"This space is already occupied. Please enter another coordinate for your move\n\n";
	}while(true);

	addMove();
	turnNum++;
	checkWinCondition();
	if(currentPlayer == 1)
		currentPlayer = 2;
	else
		currentPlayer = 1;
}

void TicTacToe::checkWinCondition(){
	int consecutiveCounter = 0;

	for (int i = 0; i < 3; i++){//Loop to check for wins in rows
		for(int j = 0; j < 3; j++){
			if(gameBoard[i][j] == currentPlayer){
				consecutiveCounter++;
			}
			else
				consecutiveCounter = 0;
		}
		if(consecutiveCounter == 3){
			outputGameBoard();
			gameOver = true;
			cout<<"\n\nPlayer "<<currentPlayer<<" Wins!\n\n";
			return;//Game has finished, no need to check further. Return from function early.
		}
		consecutiveCounter = 0;
	}

	for (int i = 0; i < 3; i++){//Loop to check for wins in columns
		for(int j = 0; j < 3; j++){
			if(gameBoard[j][i] == currentPlayer){
				consecutiveCounter++;
			}
			else
				consecutiveCounter = 0;
		}
		if(consecutiveCounter == 3){
			outputGameBoard();
			gameOver = true;
			cout<<"\n\nPlayer "<<currentPlayer<<" Wins!\n\n";
			return;
		}
		consecutiveCounter = 0;
	}

	for(int i = 0; i <3; i++){//Loop to check for diagonal win left to right
		if(gameBoard[i][i] == currentPlayer)
			consecutiveCounter++;
		else
			consecutiveCounter = 0;
	}
	if(consecutiveCounter == 3){
		outputGameBoard();
		gameOver = true;
		cout<<"\n\nPlayer "<<currentPlayer<<" Wins!\n\n";
		return;
	}
	consecutiveCounter = 0;

	for(int i = 0,j = 2; i > 3, j >=0; i++, j--){//loop to check for diagonal win right to left
		if(gameBoard[j][i] == currentPlayer)
			consecutiveCounter++;
		else
			consecutiveCounter == 0;
	}
	if(consecutiveCounter == 3){
		outputGameBoard();
		gameOver = true;
		cout<<"\n\nPlayer "<<currentPlayer<<" Wins!\n\n";
		return;
	}
}

void main(){//program main
	TicTacToe game1;
	game1.gameLoop();
}