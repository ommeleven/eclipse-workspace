//============================================================================
// Name        : Do-While.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	const string password = "Hello";

	string input;

	do {
	    cout << "Enter your Password > "<< flush ;
	    cin >> input;

	    if(input != password) {
		    cout << "Access Denied !!" << endl;
		   }

    	} while(input == password);

	cout << "Password Accepted" << endl;



	return 0;
}
