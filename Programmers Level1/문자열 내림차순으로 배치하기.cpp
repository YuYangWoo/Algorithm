#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
#include <math.h>
using namespace std;

string solution(string s) {
	string answer = "";
	sort(s.begin(),s.end());
	reverse(s.begin(), s.end());
	return answer;
}
int main() {
	string a = "Zbcdefg";
	sort(a.begin(), a.end());
	reverse(a.begin(), a.end());

	cout << a;
}