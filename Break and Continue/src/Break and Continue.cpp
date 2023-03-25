 //============================================================================
// Name        : Break.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

/*
	for(int i = 0; i <7; i++) {
		cout << "i is " << i << endl;


	if(i == 4) {
		break;
	}

     cout << " Looping....." << endl;

	}
 	cout<< "Program   Quitting....";





 	return 0;

}

*/

	const string password = "Hello";

	string input;

	do {
		cout << "Enter your Password -->" << flush;
		cin >> input;
		if(input == password) {
			break;

		}else {
			cout << "Password Denied" << endl;

		}
	} while(true);

	cout << "Password Accepted" << endl;

	cout <<  "Program Finished" << endl;


	return 0;

}
