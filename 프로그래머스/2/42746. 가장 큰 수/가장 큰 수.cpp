
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(const string &x, const string &y) {
    return x + y > y + x; // 두 조합 중 더 큰 것을 앞에 오도록 정렬
}

string solution(vector<int> numbers) {
    vector<string> strNumbers;
    
    // 숫자를 문자열로 변환
    for (int num : numbers) {
        strNumbers.push_back(to_string(num));
    }
    
    sort(strNumbers.begin(), strNumbers.end(), compare);
    
    // 모든 숫자를 이어 붙임
    string answer = "";
    for (const string &s : strNumbers) {
        answer += s;
    }
    
    if (answer[0] == '0') {
        return "0";
    }
    
    return answer;
}
