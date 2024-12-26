#include <bits/stdc++.h>
using namespace std;

int main(){
    int X;
    cin >> X;

    int count = 0; 

    while(X > 0){
        // X /= 2;

        if( X % 2 == 1){
            count++;
        }

        X /= 2;
    }
    cout << count << endl;

}