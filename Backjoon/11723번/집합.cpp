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
	int m;
	int bit = 0, x;
	cin >> m;

	while (1) {
		if (m == 0) {
			break;
		}
		cin >> input;
		if (input == "add") {
			cin >> x;
			bit = (bit | (1 << x));
		}
		else if (input == "remove") {
			cin >> x;
			bit = (bit & ~(1 << x));
		}
		else if (input == "check") {
			cin >> x;

			if ((bit & (1 << x)))
			{
				cout << "1\n";
			}
			else { cout << "0\n"; }

		}
		else if (input == "toggle") {
			cin >> x;
			bit = bit ^ (1 << x);
		}
		else if (input == "all") {
			bit = (1 << 21) - 1;
		}
		else if (input == "empty") {
			bit = 0;
		}
		m--;
	}

}