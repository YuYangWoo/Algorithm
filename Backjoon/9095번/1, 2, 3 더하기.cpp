#include <iostream>
using namespace std;
int dp[11];
int main() {
	// 1은 하나 2는 1+1, 2 3은 1+1+1/ 1+2 / 2+1 / 3 4는 7   1 2 4 7 x x 44 x x 274
	dp[0] = 1;
	dp[1] = 2;
	dp[2] = 4;
	dp[3] = 7;
	for (int i = 4; i <= 10; i++) {
		dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
	}
	int T,n;
	cin >> T;
	for (int i = 0; i < T; i++) {
		cin >> n;
		cout << dp[n - 1]<<"\n";
	}
}
