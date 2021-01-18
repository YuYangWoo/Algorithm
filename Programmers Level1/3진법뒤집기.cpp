#include <string>
#include <vector>
#include <math.h>
using namespace std;

int solution(int n) {
	int answer = 0;
	vector<int> a; // 45를 3으로 나눠서 나머지값을 넣는다.
	while(n>=3){
	a.push_back(n % 3);
	n = n / 3;
	if (n < 3) {
		a.push_back(n);
		break;
	}
	}
	int sum = 0;
	for (int i = a.size()-1; i >= 0; i--) {
		answer += (pow(3, sum )*a[i]);
		sum++;
	}
	return answer;
}
int main() {
	int n = 45;
		solution(n);
}