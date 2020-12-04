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
	long long arr[81];
	arr[0] = 1;
	arr[1] = 1;
	for (int i = 2; i <= 80; i++) {
		arr[i] = arr[i-1]+arr[i-2];
	
	}

	// 1 1 2 3 5 8 13
	long long length=0;
	length = (2 * arr[n]) + (2 * arr[n-1]);
	cout << length;

}