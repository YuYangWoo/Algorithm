#include <string>
#include <vector>
#include<iostream>
#include <math.h>
using namespace std;

int solution(int n) {
	int answer = 0;
	vector<int> arr(n+1);
	// n=10 1 2 3 4 5 6 7 8 9 10
	
	//10 
	for (int i = 2; i <= sqrt(n); i++) {
		for (int j = i+i; j <= n; j+=i) {
			arr[j] = 1;
		}
	}


	for (int i = 2; i <= n; i++) {
		if (arr[i] == 0) answer++;
	}
	return answer;
}
int main() {
	int a = 10;
	solution(a);
	cout << sqrt(a);
}