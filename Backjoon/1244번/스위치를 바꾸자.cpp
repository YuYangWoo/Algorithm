	#include <iostream>
	#include <algorithm>
	using namespace std;
	int switchArr[101];
	int gender[101], receive[101];
	int main() {
		int switchN;
		cin >> switchN;

		for (int i = 1; i <= switchN; i++) {
			cin >> switchArr[i];
		}

		int studentN;
		cin >> studentN;

		for (int i = 1; i <= studentN; i++) {
			cin >> gender[i] >> receive[i];
		}

		for(int a=1;a<=studentN;a++) {

		if(gender[a] == 1){
		// 우선 남학생이 받은 수의 몇배수 까지 있는지 구하기
			int cnt = switchN / receive[a]; // 3 6 9 12 15 18 
			for (int i = receive[a]; i <= switchN; i = i + receive[a]) { // switchArr의 receive의 배수를 바꾸기.
				switchArr[i] = 1 - switchArr[i];
			}
		}

		else if (gender[a] == 2) { // 1 0 1 0 1
			// 여학생이 받은수의 좌우 대칭 확인을 하자.
			for (int i = 1; i <= min(receive[a] - 1, switchN - receive[a]); i++) {
				if (switchArr[receive[a] - i] == switchArr[receive[a] + i]) { //좌우가 같으면 
					switchArr[receive[a] + i] = switchArr[receive[a] - i] = 1 - switchArr[receive[a] - i];
				}
			}
			switchArr[receive[a]] = 1 - switchArr[receive[a]];
		}

}

		for (int i = 1; i <= switchN; i++) {
				cout << switchArr[i] << " ";
				if (i % 20 == 0) {
					cout << "\n";
		}
	}
	

	}