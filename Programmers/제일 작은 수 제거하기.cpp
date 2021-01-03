#include <string>
#include <vector>
#include <algorithm>
#include <math.h>
using namespace std;

vector<int> solution(vector<int> arr) {
	vector<int> answer;
	vector<int> cmp;
	for (int i = 0; i < arr.size(); i++) {
		cmp.push_back(arr[i]);
	}
	sort(arr.begin(), arr.end());
	reverse(arr.begin(), arr.end());
	int c = arr[arr.size() - 1];
	int cnt = 1;
	// 43211 1하나만 지워야한다.
	if (arr.size() == 1) {
		answer[0] = -1;
	}
	else {
	for (int i = 0; i < arr.size(); i++) {

		if (c != cmp[i] && cnt ==1) {
			answer.push_back(cmp[i]);
		}
		else if (c == cmp[i]) {
			cnt = 0;
		}
		cnt = 1;
	}
	}
	return answer;
}
int main() {
	vector<int>a{ 10 };
	solution(a);
}