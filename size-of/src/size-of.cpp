//============================================================================
// Name        : size-of.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	int value[] = {4, 2, 5 ,4 ,7};

	for(unsigned int i=0;i < sizeof(value)/sizeof(int); i++) {
		cout << value[i] << "  "<< endl;
	}


	cout << endl;

	return 0;
}
