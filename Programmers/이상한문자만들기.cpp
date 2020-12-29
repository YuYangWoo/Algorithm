#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
#include <math.h>

using namespace std;

string solution(string s) {
	string answer = "";
	int cmp = 1;
	for (int i = 0; i < s.size(); i++) {

		if (s[i] == ' ') {
			answer += ' ';
			cmp = 1;
		}

		else {
		//소문자 - 대문자로
		if (cmp==1) { 
			cmp = 0;
			answer += toupper(s[i]);
		}
		else  {
			cmp = 1;
			answer += tolower(s[i]);
		}
	}
		
	}

	return answer;
}
