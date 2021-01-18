#include <string>
#include <vector>
#include <iostream>
using namespace std;

bool solution(string s) {
	bool answer = true;
	int cnt = 0;
	int b = atoi(s.c_str());
	if (b == 0) {
		answer = false;
	}

	return answer;
}
int main() {
	string a = "absbs1sbsd23";
	int b = atoi(a.c_str());
	cout << b;
}