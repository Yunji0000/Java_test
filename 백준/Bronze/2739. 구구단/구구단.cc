#include <bits/stdc++.h>
using namespace std;

int main(){
    int N;
    int result;
    cin >> N;

    for(int i=1; i<=9; i++){
        result = N * i;

          cout << N << " " << "*" << " " << i << " " << "=" << " " << result << endl;
    }

}