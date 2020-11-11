#include <iostream>
using namespace std;
int arr[2] = { 1,0 };
int main() {
	int k;
	cin >> k;
	int a;
	for (int i = 0; i < k; i++) {
		a = arr[0];
		arr[0] = arr[1];
		arr[1] = a + arr[1];
	}
	cout << arr[0] << " " << arr[1];
}