#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
	bool answer = true;
	string a = to_string(x);
	int sum = 0;
	for (int i = 0; i < a.size(); i++) {
		int b = a[i] - '0';
		sum += b;
	}
	if (x % sum == 0) return answer;
	else return false;

	return answer;
}