#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(vector<int> numbers, string hand) {
	string answer = "";
	int rpos=12, lpos = 10;
	int llength, rlength;
	for (int i = 0; i < numbers.size(); i++) {
		if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
			answer += "L";
			lpos = numbers[i];
		}
		else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
			answer += "R";
			rpos = numbers[i];

		}
		else if(numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
			if (lpos == 1 && numbers[i] == 2) {
				llength = 1;
			}
			else if (lpos == 1 && numbers[i] == 5) {
				llength = 2;
			}
			else if (lpos == 1 && numbers[i] == 8) {
				llength = 3;
			}
			else if (lpos == 1 && numbers[i] == 0) {
				llength = 4;
			}
			else if (lpos == 4 && numbers[i] == 2) {
				llength = 2;
			}
			else if (lpos == 4 && numbers[i] == 5) {
				llength = 1;
			}
			else if (lpos == 4 && numbers[i] == 8) {
				llength = 2;
			}
			else if (lpos == 4 && numbers[i] == 0) {
				llength = 3;
			}
			else if (lpos == 7 && numbers[i] == 2) {
				llength = 3;
			}
			else if (lpos == 7 && numbers[i] == 5) {
				llength = 2;
			}
			else if (lpos == 7 && numbers[i] == 8) {
				llength = 1;
			}
			else if (lpos == 7 && numbers[i] == 0) {
				llength = 2;
			}
			else if (lpos == 10 && numbers[i] == 2) {
				llength = 4;
			}
			else if (lpos == 10 && numbers[i] == 5) {
				llength = 3;
			}
			else if (lpos == 10 && numbers[i] == 8) {
				llength = 2;
			}
			else if (lpos == 10 && numbers[i] == 0) {
				llength = 1;
			}
			// 오른손
			if (rpos == 3 && numbers[i] == 2) {
				rlength = 1;
			}
			else if (rpos == 3 && numbers[i] == 5) {
				rlength = 2;
			}
			else if (rpos == 3 && numbers[i] == 8) {
				rlength = 3;
			}
			else if (rpos == 3 && numbers[i] == 0) {
				rlength = 4;
			}
			else if (rpos == 6 && numbers[i] == 2) {
				rlength = 2;
			}
			else if (rpos == 6 && numbers[i] == 5) {
				rlength = 1;
			}
			else if (rpos == 6 && numbers[i] == 8) {
				rlength = 2;
			}
			else if (rpos == 6 && numbers[i] == 0) {
				rlength = 3;
			}
			else if (rpos == 9 && numbers[i] == 2) {
				rlength = 3;
			}
			else if (rpos == 9 && numbers[i] == 5) {
				rlength = 2;
			}
			else if (rpos == 9 && numbers[i] == 8) {
				rlength = 1;
			}
			else if (rpos == 9 && numbers[i] == 0) {
				rlength = 2;
			}
			else if (rpos == 12 && numbers[i] == 2) {
				rlength = 4;
			}
			else if (rpos == 12 && numbers[i] == 5) {
				rlength = 3;
			}
			else if (rpos == 12 && numbers[i] == 8) {
				rlength = 2;
			}
			else if (rpos == 12 && numbers[i] == 0) {
				rlength = 1;
			}

			// 거리 계산
			if (llength < rlength) {
				answer += "L";
				lpos = numbers[i];
			}
			else if(llength > rlength) {
				answer += "R";
				rpos = numbers[i];
			}
			else if (llength == rlength) {
				
				if (hand == "right") {
					answer += "R";
					rpos = numbers[i];
				}

				else if (hand == "left") {
					answer += "L";
					lpos = numbers[i];
				}

			}
		}
			
	}
	return answer;
}
int main() {
	vector<int> a{ 7,0,8,2,8,3,1,5,7,6,2 };
	string h = "left";
	solution(a, h);
}