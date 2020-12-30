#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> solution(int N, vector<int> stages) {
	vector<int> answer;
	vector<int> percent(N + 2);
	vector<int> pause(N + 2);
	vector<double> fail(N + 1);
	vector<double>cmp(N + 1);
	// 멈춘사람들의 배열
	for (int i = 0; i < stages.size(); i++) {
		pause[stages[i]]++;
	}
	// 스테이지 통과한 모든사람의 배열
	for (int i = 1; i <= pause.size(); i++) {
		for (int j = i; j < pause.size(); j++) {
			if (pause[j] == 0)percent[j] = 0;
			else percent[i] += pause[j];
		}
	}

	for (int i = 1; i <= N; i++) {
		if (pause[i] == 0 && percent[i] == 0) {
			fail[i] = 0;
		}else{
		fail[i] = (double(pause[i]) / double(percent[i]));
	}
	}

	for (int i = 0; i < fail.size(); i++) {
		cmp[i] = fail[i];
	}

	sort(cmp.begin(), cmp.end());
	for (int i = cmp.size() - 1; i >= 1; i--) {
		for (int j = 1; j < fail.size(); j++) {
			if (cmp[i] == fail[j]) {
				answer.push_back(j);
				fail[j] = -1;// fail[3] == cmp[4] fail[4] == cmp[5]
				break;
			}
		}
	}
		return answer;
	
}
int main() {

	vector<int> a{1,2,2,1,3};
	
	solution(5, a);
}