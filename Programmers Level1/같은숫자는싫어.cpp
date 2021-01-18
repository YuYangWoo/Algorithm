#include <vector>
#include <iostream>
#include <algorithm>
#include <math.h>

using namespace std;

vector<int> solution(vector<int> arr)
{
	vector<int> answer;

	arr.erase(unique(arr.begin(), arr.end()), arr.end());
	for (int i = 0; i < arr.size(); i++) {
		answer.push_back(arr[i]);
	}
	return answer;
}
