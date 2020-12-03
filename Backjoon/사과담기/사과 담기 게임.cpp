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

	int n, m, j;
	cin >> n >> m >> j;
	vector <int> pos(j);
	for (int i = 0; i < j; i++) {
		cin >> pos[i];
	}
	int start = 1;
	int end = m;
	int res = 0;

	for (int i = 0; i < j; i++) {
		if(end>=pos[i]&&start<=pos[i]){
			continue;
		}
		else if(pos[i]<start){
			res += abs(pos[i] - start);
			end -= abs(pos[i] - start);
			start -= abs(pos[i] - start);
		
		}
		else if (pos[i] > end) {
			res += abs(pos[i] - end);
			start += abs(pos[i] - end);
			end += abs(pos[i] - end);
		}
	}





	cout << res;
}