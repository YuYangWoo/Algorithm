#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
	long long answer = 0;
	if(a<b) { // 3,5
	for (int i = a; i <= b; i++) {
		answer += i;
	}
	}
	else if (a>b) { // 5,3
		for (int i = b; i <=a; i++) {
			answer += i;
		}
	}
	else if(a==b){
		answer = a;
	}
	
	return answer;
}