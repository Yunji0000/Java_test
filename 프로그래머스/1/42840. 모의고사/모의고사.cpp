#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    int person1[] = {1, 2, 3, 4, 5};
    int person2[] = {2, 1, 2, 3, 2, 4, 2, 5};
    int person3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    vector<int> score(3, 0);
    
    for (int i = 0; i < answers.size(); i++) {
        if (answers[i] == person1[i % 5]) score[0]++; 
        if (answers[i] == person2[i % 8]) score[1]++; 
        if (answers[i] == person3[i % 10]) score[2]++;
    }

    int maxScore = max({score[0], score[1], score[2]});
    vector<int> result;
    for (int i = 0; i < 3; i++) {
        if (score[i] == maxScore) {
            result.push_back(i + 1); 
        }
    }
    
    return result;
}
