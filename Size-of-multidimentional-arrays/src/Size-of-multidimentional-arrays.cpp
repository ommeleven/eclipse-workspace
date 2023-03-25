//============================================================================
// Name        : Size-of-multidimentional-arrays.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	string animals[][3] = {
			{"monkey", "donkey", "cheetah"},
			{"tree","grass","savana"}

	};
	cout << sizeof(animals[0]) << endl;



	for(unsigned int i = 0; i <sizeof(animals)/sizeof(animals[0]); i++) {
		for(unsigned int j = 0; j < sizeof(animals[0])/sizeof(string); j++) {
			cout << animals[i][j] << " " << flush;

		}
	}


	return 0;
}
