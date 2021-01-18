#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
#include <math.h>
using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
	vector<int> temp(n);
	for (int i = 0; i < n; i++) {
		temp[i]++;
	}
	for (int i = 0; i < reserve.size(); i++) {
		temp[reserve[i] - 1]++;
	}
	for (int i = 0; i < lost.size(); i++) {
		temp[lost[i] - 1]--;
	}
	for (int i = 0; i < temp.size(); i++) {
		if (temp[i] == 0 && (temp[i - 1] > 1)) {
			temp[i]++; temp[i - 1]--;
		}

		else if (temp[i] == 0 && (temp[i + 1] > 1))
		{
			if (!((i + 1) == temp.size())) {
				temp[i]++; temp[i + 1]--;
			}
		}
	}

	int count = 0;
	for (int i = 0; i < temp.size(); i++) {
		if (temp[i] >= 1) {
			count++;
		}
	}
	return count;
}