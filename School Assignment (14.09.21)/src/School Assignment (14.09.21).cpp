//============================================================================
// Name        : 21).cpp
// Author      : omdange
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


class fun_overloading
{
public:
	float b, h, a;

	void area(int m, int n) {

		b = m ;
		h = n ;
		a = 0.5 * b * h ;

		cout << "Area of the triangle whose base is " << b << " and Height " << h << " is "  << a << "." << endl;

	}

	void area() {
		cout << "Enter the Base And Height Of Triangle respectively: >>" << flush;
		cin >> b >> h ;
		a = 0.5 * b * h;

		cout << "Area of Triangle is " << a << endl;

	}


};

int main() {

	fun_overloading f;
	f.area(10,50);
	f.area();




	return 0;
}
