//============================================================================
// Name        : STL.cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<bits/stdc++.h>

using namespace std;

int main() {

    int a = 5, b = 9, maximum;
    //max value from a and b
    maximum = max(a, b);
    //swapping both values
    swap(a,b);
    //double pow (double base, double exponent);
    maximum();
    int number = 2;
    double cubicRoot;
    cubicRoot = pow((double) (number), 1.0/3);

	cout << cubicRoot << endl;
	cout << fixed << setprecision(10) << cubicRoot << "\n";

    cout << fixed << setprecision(3) << cubicRoot << "\n";





	return 0;
}
