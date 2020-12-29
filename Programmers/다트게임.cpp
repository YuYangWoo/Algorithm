#include <string>
#include <vector>
#include <algorithm>
#include <math.h>
#include <iostream>
#include <sstream>
#include <cmath>
using namespace std;

int solution(string dartResult) {
	int answer = 0;
	int sum = 0;
	vector<int> now(3);
	int k = 0;
	string cn;
	for (int i = 0; i < dartResult.size(); i++) {
		if (dartResult[i] != '#' && dartResult[i] != '*' && dartResult[i] != 'S' && dartResult[i] != 'D' && dartResult[i] != 'T') {
			cn += dartResult[i];
		}
		else {
			int cnr = atoi(cn.c_str());
			cn = "";
			if (dartResult[i] == '*') {
				if (k > 1) {
					now[k - 1] = now[k - 1] * 2;
					now[k - 2] = now[k - 2] * 2;
				}
				else {
					now[k - 1] = now[k - 1] * 2;
				}
			}
			if (dartResult[i] == '#') {
				now[k - 1] *= -1;
				}
			if (dartResult[i] == 'S') {
				now[k] = pow(cnr, 1); k++;
				}
			if (dartResult[i] == 'D') {
				now[k] = pow(cnr, 2); k++;
}
			if (dartResult[i] == 'T') {
				now[k] = pow(cnr, 3); k++;
							}
		}
	}
	for (int i = 0; i < now.size(); i++) {
		answer += now[i];
	}
	cout << answer;
	return answer;
}
int main() {
	string a = "1D#2S*3S";
	solution(a);
}