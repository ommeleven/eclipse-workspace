//============================================================================
// Name        : Scribble.cpp
// Author      : Om Dange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <limits>

using namespace std;

int main() {

// Getting Started section 1

	cout << "Hello World " << endl;

	int numberCats = 5;

	int numberDogs = 7;

	int numberAnimals = numberCats + numberDogs;

	cout  << "Number of Cats: "<< numberCats << endl;

    cout << "Number of Dogs:"  << numberDogs << endl;

    cout << "Total number of Animals: " << numberAnimals << endl;

    numberDogs = numberDogs + 1;

    cout << "New number of Dogs :" << numberDogs << endl;


// Section 2: Basic Syntax
     // Syntax learn t: String
    string text1 = "Morning";

    string text2 = "Evening";

    string text3 = text1 + text2;

    cout << text3 << endl;


    string input;
    cin >> input;

    cout << "You have entered: " << input << endl;


    cout << "Enter a Number: " << flush;
    int value ;
    cin >> value;



    cout << "Max int value: " <<  endl;
    cout << "Min int value: " <<  endl;

    cout << " You entered:" << value << endl;

    // Syntax learn t: Integer Types
    long int lValue = 123456789;
    short int sValue = 123;

    cout << sValue << endl;
    cout << lValue << endl;

    cout << "Size of in_t: " << sizeof(int) << endl;
    cout << "Size of short in_t: " << sizeof(short int) << endl;

    unsigned int uValue = 1232345678;
    cout << " uValue is :" << uValue << endl;

    signed int siValue = -1234;
    cout << "siValue is = " << siValue << endl;


    // Syntax Learn t: Floating Point Types
    float fValue = 76.4;

    cout << fValue << endl;














    	return 0;
}
