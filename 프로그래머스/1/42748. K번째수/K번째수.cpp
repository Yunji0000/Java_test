#include <string>
#include <algorithm> 

using namespace std;

struct Command {
    int i; 
    int j; 
    int k; 
};

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer; 
    vector<Command> commandList; 

  
    for (int cmdIndex = 0; cmdIndex < commands.size(); cmdIndex++) {
        commandList.push_back({commands[cmdIndex][0] - 1, commands[cmdIndex][1] - 1, commands[cmdIndex][2] - 1});
    }

    for (int commandIndex = 0; commandIndex < commandList.size(); commandIndex++) {
        vector<int> temp;


        for (int index = commandList[commandIndex].i; index <= commandList[commandIndex].j; index++) {
            temp.push_back(array[index]);
        }

        sort(temp.begin(), temp.end());

        answer.push_back(temp[commandList[commandIndex].k]);
    }

    return answer; 
}
