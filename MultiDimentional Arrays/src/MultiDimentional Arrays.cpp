//============================================================================
// Name        : MultiDimentional.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {


	string animals[][3]= {
			{"fox","dog","cat"},
			{"mouse","grapes","bone"}
	};

	for(int i = 0;i < 2;i++) {
		for(int j = 0;j <3;j++) {
			cout << animals[i][j] << " " << flush;

		}
		cout << endl;
	}
	cout << animals << endl;

	return 0;
}
