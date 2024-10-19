#include <string>
#include <vector>
#include <algorithm> 

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer; 

    for (const auto& cmd : commands) {
        int i = cmd[0] - 1; // 시작 인덱스
        int j = cmd[1] - 1; // 끝 인덱스
        int k = cmd[2] - 1; // k번째

        vector<int> temp(array.begin() + i, array.begin() + j + 1); // 부분 배열 생성
        
        sort(temp.begin(), temp.end());
        
        answer.push_back(temp[k]); // k번째 수 추가 (0-indexed이므로 k 사용)
    }

    return answer; 
}
