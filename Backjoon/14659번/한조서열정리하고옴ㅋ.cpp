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

	int n;
	cin >> n;
	vector <int> v(n);
	vector <int> count(n);
	for (int i = 0; i < n; i++) {
		cin >> v[i];
	}

	int cnt = v[0];
	for (int i = 0; i < n-1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (v[i] > v[j]) {
				count[i]++;
			}
			else {
				break;
			}
	}
	}
	sort(count.begin(), count.end());
	cout << count[n - 1];
}