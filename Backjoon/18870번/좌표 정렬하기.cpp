#include <iostream>
#include <algorithm>
#include <math.h>
#include <cstdio>
#include <utility>
#include <vector>
using namespace std;
int arr[100000][2];

int main(void) {
	ios::sync_with_stdio(false);
	cin.tie(NULL);

	int n;
	cin >> n;
	vector <pair<int, int>> v(n);
	for (int i = 0; i < n; i++) {
		cin >> v[i].first>>v[i].second;
	}

	sort(v.begin(), v.end());
	
	for (int i = 0; i < n; i++) {
		cout << v[i].first << " " << v[i].second;
		cout << "\n";
	}
}
