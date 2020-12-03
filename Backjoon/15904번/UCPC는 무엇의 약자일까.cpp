#include <iostream>
#include <algorithm>
#include <math.h>
#include <cstdio>
#include <string>
#include <vector>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);

	string input;

	getline(cin, input);


	int key = 0;
	// Union of Computer Programming Contest club contest
	
	for (int i = 0; i < input.size(); i++) {
		if (input[i] == 'U' && key == 0) {
			key = 1;
		}
		else if (input[i] == 'C' && key == 1) {
			key = 2;
		}
		else if (input[i] == 'P' && key == 2) {
			key = 3;
		}
		else if (input[i] == 'C' && key == 3) {
			key = 4;
		}

	}
	if (key == 4) {
		cout << "I love UCPC";
	}
	else {
		cout << "I hate UCPC";
	}
	}


