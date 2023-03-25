//============================================================================
// Name        : scribbleCode1.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;

int main() {

	// Basic Synatax: Strings

	string sValue1 = " This is string text. ";

	string sValue2 = " Thank you ";

	cout << sValue1 << endl;
	cout << sValue2 << endl;


	string  sValue3 = sValue1 + sValue2;
	cout << sValue1 << sValue2 << endl;


	cout << sValue3 << endl;


	// Basic Syntax: User Input (not UI)

	cout << " Enter User Input:  " << flush;

	string input;
	cin >> input;

	cout <<  " You Entered: " << input <<  endl;


	cout << " Enter A Number: " << endl;
    int value;
    cin >> value;
    cout << " You Entered :"<< value << endl;

//    Basic Syntax :boolean

    bool bValue = true;

    cout << bValue << endl;


    // check in ASCII
    char cValue = 44;
    cout << cValue << endl;

    char cValue1 = '7'; // Here 7 is represented as a symbol !!
    cout << cValue1 << endl;

    cout <<  " Size od char: " << sizeof(char) << endl;


    wchar_t wValue = 'i';
    cout << char(wValue) << endl;
    cout << "Size of wChar:" << sizeof(wchar_t) << endl;


    cout <<  " Today's date is 3/08/2021 " ;

    string password = "hello";
    cout <<" Enter your Password > "  << endl;



    cin >> input;

    cout << "  " << input << "  " << endl;
  // "if"
    if(input == password) {
    	cout << " Password Accepted !! " << endl;

    }


    if(input != password) {
    	cout << " Password declined ! " << endl;

    }

// if-else condition

    cout << "\t 1..Add new record:" << endl;
    cout << "\t 2..Delete record" << endl;
    cout << "\t 3..View record:" << endl;
    cout << "\t 4..Search record:" << endl;
    cout << "\t 5..Quit:" << endl;

    cout << "  Enter your Selection:  " << " " << flush;


    cin >> value;


    if(value < 3) {
		cout << " Insuffiecient priviliges to use these menu optiom" << endl;


    }

    else {
    	cout << " Previllige sufficient.  "<< endl;

    }
    if(value == 5) {
    	cout << " Quitting.... " << endl;

    }
    else {
    	cout <<  "Not Quiting....   " << endl;

    }
// " If-else If-else   condition  "

    if(value == 1) {
    	cout << " Adding new record " << endl;

    }

    else if(value == 2) {
    	cout << " Deleting record... " << endl;

    }
    else if(value == 3) {
        	cout << " Viewing record... " << endl;

        }
    else if(value == 4) {
        	cout << " Searching record... " << endl;

        }
    else if(value == 5) {
        	cout << " Quiting... " << endl;

        }
    else {
    	cout << " Invalid option.. " << endl;

    }

 // Comparing Floats


    float value1 = 1.1;
    if(value ==1.1) {
    	cout << "equals" << endl;

    }


    else {
    	cout << " not equal " << endl;

    }

    cout << value1 << endl;


 //  C++ Condiitons


    /*
     * == equality test
     * != not equal
     * < less than
     * > greater than
     * >= greater than equal to
     * <= less than equal to
     *
     */

    int value2 = 7;
    int value3 = 4;

    if (value2 >= 5) {
    	cout << "Condition 1:true"  << endl;

    }
    else {
    	cout << "Condition 1:false" << endl;

    }

    if (value2 == 7 && value3 < 5) {
    	cout << "Condition 2: true " << endl;

    }else {
    	cout << "Condition 2:false" << endl;

    }
    if(value2 == 7 || value3 > 3) {
    	cout << "Condition 3:true" << endl;

    }else {
    	cout << "Condition 3:false" << endl;

    }
    if( (value2 != 8 && value3 == 2*2) || value3 < 10) {
    	cout << " Condition 4:true " << endl;

    }else {
    	cout << "Condition4:false"<< endl;

    }

    bool condition1 = (value2 != 8) && (value3 == 10);
    cout << condition1 << endl;


    bool condition2 = (value3 <12);
    cout << condition2  << endl;

    if(condition1 || condition2) {
    	cout << "condition 5:false " << endl;

    }else {
    	cout <<  "Condition 5:false" << endl;

    }

    while(true) {
    	cout << "hello" << endl;

    }









	return 0;
 }
