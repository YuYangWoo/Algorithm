#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> numbers) {
	vector<int> answer;
	int result = 0;
	for (int i = 0; i < numbers.size() - 1; i++) {
		for (int j = i + 1; j < numbers.size(); j++) {
			result = numbers[i] + numbers[j];
			answer.push_back(result);
		}
	}

	sort(answer.begin(), answer.end());
	answer.erase(unique(answer.begin(), answer.end()), answer.end());

	return answer;
}
int main() {
	vector<int> a{2,1,3,4,1 };
	solution(a);
}