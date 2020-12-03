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

	int N,L,K;
	cin >> N>>L>>K;
	int cnt = 0;
	int cntK = 0;
	vector <pair<int, int>> level(N);
	for (int i = 0; i < N; i++) {
		cin >> level[i].first >>level[i].second ;
	}

	for (int i = 0; i < N; i++) {

		if (level[i].second <= L && cntK < K) {
			cnt += 140;
			level[i].second = 0;
			cntK++;
		}
		
	}
	for (int i = 0; i < N; i++) {
		if (level[i].first <= L && cntK < K && level[i].second != 0) {
			cnt += 100;
			cntK++;
		}

	}
	cout << cnt;
}