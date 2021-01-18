#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
#include <math.h>

using namespace std;

vector<int> solution(vector<int> answers) {
	vector<int> answer;
	// 1번 수포자 12345 12345
	// 2번 수포자 21 23 24 25 21 23 24 25
	// 3번 수포자 3311224455 3311224455

	vector<int> v1{1,2,3,4,5};
	vector<int> v2{2,1,2,3,2,4,2,5};
	vector<int> v3{3,3,1,1,2,2,4,4,5,5};

	vector<int> count(3);



	for (int i = 0; i < answers.size(); i++) {
		if (v1[i%5] == answers[i]) count[0]++;
		if (v2[i%8] == answers[i]) count[1]++;
		if (v3[i%10] == answers[i]) count[2]++;
	}

	
	int s = max(max(count[0], count[1]), count[2]);
	

	for (int i = 0; i < count.size(); i++) {
		if (count[i] == s) {
			answer.push_back(i + 1);
		}
	}



	return answer;
}
