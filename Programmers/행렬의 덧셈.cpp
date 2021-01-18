#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
	vector<vector<int>> answer;
	for (int i = 0; i < arr1.size(); i++) { //3
		vector<int> t;
		for (int j = 0; j < arr2[1].size(); j++) { //2
			t.push_back(arr1[i][j] + arr2[i][j]);

		}
		answer.push_back(t);
	}
	return answer;
}
