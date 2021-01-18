#include <string>
#include <vector>

using namespace std;

double solution(vector<int> arr) {
	double answer = 0;
	for (int i = 0; i < arr.size(); i++) {
		answer += arr[i];
		if (i + 1 == arr.size()) {
			answer = (answer / (i + 1));
		}
	}
	return answer;
}
