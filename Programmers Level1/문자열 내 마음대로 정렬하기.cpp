#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<string> solution(vector<string> strings, int n) {
	vector<string> answer;
	vector<char> cmp;
	sort(strings.begin(), strings.end());
	for (int i = 0; i < strings.size(); i++) {
		cmp.push_back(strings[i].at(n));
	}

	//u e a
	sort(cmp.begin(), cmp.end());
	for (int i = 0; i < cmp.size(); i++) {
		for (int j = 0; j < strings.size(); j++) {
			if (cmp[i] == strings[j].at(n)) {
				answer.push_back(strings[j]);
				strings[j] = "####################################################################################################";
				break;
			}
		}
	}
	return answer;
}