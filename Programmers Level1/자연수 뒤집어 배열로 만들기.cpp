#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(long long n) {
	vector<int> answer;
	// 12345
	string cnt = to_string(n);
	reverse(cnt.begin(), cnt.end());
	for (int i = 0; i < cnt.size(); i++) {
		answer.push_back(cnt[i] - '0');
	}
	return answer;
}