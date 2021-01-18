#include <string>
#include <vector>

using namespace std;

int solution(string skill, vector<string> skill_trees) {
	int answer = 0;

	for (int k = 0; k < skill_trees.size(); k++) { //
		vector<char> index;
		int cnt = 0;
		string cmp = skill_trees[k];
		for (int i = 0; i < cmp.size(); i++) { //
			for (int j = 0; j < skill.size(); j++) { // 
				//cmp = BACDE skill = CBD
				if (cmp[i] == skill[j]) {
					index.push_back(skill[j]); //BCD가 index에 들어간다. skill하고 비교가 필요.(CBD)
				}
			}
		}
		for (int z = 0; z < index.size(); z++) {
			if (index[z] == cmp[z]) {
				cnt++;
			}
		}
		if (cnt == index.size()) {
			answer++;
		}
	}
	return answer;

}
int main() {
	vector <string> a{ {"BACDE"},{"CBADF"}, {"AECB"}, {"BDA"} };
	solution("CBD", a);
}