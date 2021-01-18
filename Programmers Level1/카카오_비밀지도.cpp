#include <string>
#include <vector>
#include <bitset>
#include <iostream>
#include <algorithm>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
	vector<string> answer;

	for (int i = 0; i < n; i++) {
		string str = "";
		int bit = arr1[i] | arr2[i];
		for (int k = 0; k < n; k++) {
			if ((bit & (1 << k)) == (1 << k)) {
				str += '#';
			}
			else {
				str+=' ';
			}
		}
		reverse(str.begin(), str.end());
		answer.push_back(str);
	}


	return answer;
}

int main() {
	vector<int> arr1(5);
	vector<int> arr2(5);
	arr1[0] = 9; arr1[1] = 20; arr1[2] = 28; arr1[3] = 18; arr1[4] = 11;
	arr2[0] = 30; arr2[1] = 1; arr2[2] = 21; arr2[3] = 17; arr2[4] = 28;

	solution(5, arr1, arr2);
}

