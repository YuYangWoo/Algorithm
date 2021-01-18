#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

long long solution(long long n) {
	long long answer = 0;
	string a = to_string(n);
	sort(a.begin(), a.end());
	reverse(a.begin(), a.end());
	answer = stoi(a);
	cout << answer;
	return answer;
}
int main() {
	solution(7211119999);
}