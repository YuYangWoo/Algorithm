#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(int num) {
	int answer = 0;
	unsigned long long n;
	n = num;
	if (n == 1) return answer;
	for(int i=0; i<=500;i++) {
	if (n % 2 == 0) {
		n /= 2;
	}
	else {
		n = (3 * n) + 1;
	}
	answer++;
	if (n == 1) return answer;

	}
	if (n != 1) {
		return -1;
	}
	
}
