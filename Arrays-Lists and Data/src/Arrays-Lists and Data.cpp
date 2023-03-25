//============================================================================
// Name        : Arrays-Lists.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {


	cout << "Array of Integers >> " << endl;
	cout << "****************** " << endl;

	int values[3];

	values[0] = 10;
	values[1] = 11;
	values[2] = 6;

	cout << values[0] << endl;
	cout << values[1] << endl;
	cout << values[2] << endl;


	cout << "Array of Doubles >> " << endl;
		cout << "****************** " << endl;

	double numbers[3] = {3, 4, 5};

	cout << numbers[2] << endl;


	for(int i = 0; i< 4; i++) {
		numbers[i] = 77;
		cout << "Element at index " << i << numbers[i] << endl;

	}


	cout << "Initialising Zero Values " << endl;
    cout << "****************** " << endl;


    int numberarrays[0]= {};

	for(int i = 0; i< 7; i++) {

		cout << "Element at index " << i <<  ": "  << numberarrays[i] << endl;

	}

	string texts[]  =  {"hello " , "greetings !!" , "Cars"};


	for(int i = 0; i< 7; i++) {

			cout << "Element at index" << i <<  ": "  << texts[i] << endl;

		}




	return 0;
}
