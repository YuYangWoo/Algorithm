#include <iostream>
#include <algorithm>
#include <math.h>
#include <cstdio>
#include <string>
using namespace std;
string s;
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int n;
	cin >> n;
	cin >> s;
	int cnt = 1;
	int lCount = 0;
	// SLLLLSSLL
	// SSSS
	// SLSL
	for (int i = 0; i < s.size(); i++) {

		if (s[i] == 'S') {
			cnt += 1;
		}

		else {
			lCount += 1;
			if (lCount == 2) {
				cnt += 1;
				lCount = 0;
			}
			if(n==1){
				cnt += 1;
				continue;
			}

			if (s[i - 1] == 'S' && s[i + 1] == 'S') {
				cnt += 1;
			}
		}
	}
	cout << min(cnt,n);
}
